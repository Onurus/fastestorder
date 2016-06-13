package com.fastestorder.microservices.restaurantmenu;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fastestorder.model.menu.FOLanguage;
import com.fastestorder.model.menu.FOMenu;
import com.fastestorder.model.menu.FOMenuCategory;
import com.fastestorder.model.menu.FOMenuItem;
import com.fastestorder.model.menu.FORestaurant;

/**
 * Root resource (exposed at "rm" path)
 */
@Path("rm")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class RMResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/getRestaurantByCode/{code}")
    public FORestaurant getRestaurantByCode(@PathParam("code") String code) {
	System.err.println(code);
	FORestaurant result = new FORestaurant();
	result.setAddress("AdressŞŞĞĞÇÇ");
	result.setId(12);
	Currency baseCurrency = Currency.getInstance("TRY");
	List<FOMenuCategory> calegories = new ArrayList<>();
	List<FOMenuItem> items = new ArrayList<>();
	items.add(new FOMenuItem(1, "süpangüle", 12.4));
	items.add(new FOMenuItem(2, "keşkül", 1.442332));
	FOMenuCategory categoriTatlilar = new FOMenuCategory(2, "Tatlılar", items);
	calegories.add(categoriTatlilar);
	items = new ArrayList<>();
	items.add(new FOMenuItem(1, "yayla", 9012.6784));
	items.add(new FOMenuItem(2, "tarhana", 1213123.442332));
	FOMenuCategory categoriÇorbalar = new FOMenuCategory(1, "Çorbalar", items);
	calegories.add(categoriÇorbalar);
	FOMenu menu = new FOMenu(baseCurrency, calegories);
	result.setMenu(menu);
	result.setName("Ramazan Ustanın Yeri");
	List<FOLanguage> supportedLanguages = new ArrayList<>();
	supportedLanguages.add(FOLanguage.English);
	supportedLanguages.add(FOLanguage.Turkish);
	result.setSupportedLanguages(supportedLanguages);
	return result;
    }

}
