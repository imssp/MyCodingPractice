package com.satya;
import java.util.ArrayList;
public class GroceryList {
    private  ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " intems in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryitem(String currentItem ,String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryitem(position, newItem);
        }
    }
    private void modifyGroceryitem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryitem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryitem(position);
        }
    }
    private void removeGroceryitem(int position){
        groceryList.remove(position);
    }
    private int findItem(String searchitem){
        return groceryList.indexOf(searchitem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }


}
