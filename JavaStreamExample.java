package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
      
		/*
		     List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
		  
		  */
        
        List<Float> collect = productsList.stream().filter(p->p.price>= 30000).map(p->p.price).collect(Collectors.toList());
        System.out.println(collect);
        //System.out.println(productPriceList2);  
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

      //get list of unique squares
      List<Integer> squaresList = numbers.stream().map( i -> i).distinct().collect(Collectors.toList());
      Integer integer = numbers.stream().map( i -> i).max(Integer::compareTo).get();
      
      System.out.println(squaresList);
      
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      int counter=0;
      for(int i=0;i<strings.size();i++) {
    	  if(strings.get(i)!= "") 
    		  counter++;
      }
      System.out.println(counter);
    //get count of empty string
    long count = strings.stream().filter(xyx -> xyx.isEmpty()).count();
    System.out.println("empty estring count::"+count);
        
    }  
}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  