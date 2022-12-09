/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temporarylate file, choose Tools | Templates
 * and open the temporarylate in the editor.
 */
package Business.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SuperMarketEnterprise;
import Business.Enterprise.DistributorEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import java.util.HashMap;

/**
 *
 * @author vidyavathipuli
 */
public class NetworkAnalytics {
    
        private EcoSystem system;
        
        public NetworkAnalytics(EcoSystem system){
            this.system = system;
        }
    
        public HashMap<String,HashMap<String,Integer>> getAllUsersInNetWorkByOrganization(String SelNetwork){
            String temporary;
            HashMap<String,HashMap<String,Integer>> enterprise_ = null;
            for(Network network:system.getNetworkList()){
                enterprise_= new HashMap<String,HashMap<String,Integer>>();
                if(SelNetwork==null)
                    temporary=system.getNetworkList().get(0).getNetworkName();
                else
                    temporary=SelNetwork;
                
                for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Manager",ent.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getOrganizationName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                    enterprise_.put(ent.getEnterpriseType().getValue(),org);
                }

                if(temporary==network.getNetworkName())
                    return enterprise_;
            }
            return enterprise_;
        }
        
        public HashMap<String,Integer> getFundsRaised(String SelNetwork){
            String temporary=SelNetwork;
            HashMap<String,Integer> ent = null;
            for(Network network:system.getNetworkList()){
                ent = new HashMap<String,Integer>();
                int superMarketProductCount = 0;
                int distributorProductCount = 0;
                for(Enterprise entp:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(entp instanceof SuperMarketEnterprise){
                        for(Product product:entp.getProductList()){
                            superMarketProductCount+=product.getQuantity();
                        }
                    }
                    if(entp instanceof DistributorEnterprise){
                        for(Product product:entp.getProductList()){
                            distributorProductCount+=product.getQuantity();
                        }
                    }
                }
                ent.put("SuperMarket Product Count", superMarketProductCount);
                ent.put("Distributor Product Count", distributorProductCount);
                

                if(temporary==network.getNetworkName())
                    return ent;
                }
                return ent;
        }

}
