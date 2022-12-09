 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ArrayList<Product> productList;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        SuperMarket("SuperMarket"),
        Distributor("Distributor"),
        Supplier("Supplier"),
        Customer("Customer"),
        Orphanage("Orphanage");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        productList = new ArrayList<Product>();
    }
    
    public void restoreProducts(Order order){
        for(Product prod:order.getProductList()){
            for(Product product:this.getProductList()){
                if(product.getProductName().equals(prod.getProductName())){
                    product.setQuantity(product.getQuantity()+prod.getQuantity());
                }
            }
        }
    }
}
