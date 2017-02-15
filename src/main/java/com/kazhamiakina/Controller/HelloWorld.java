package com.kazhamiakina.Controller;
import com.kazhamiakina.Model.Entity.Price;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Created by alisa on 31.01.2017.
 */

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{

  @WebMethod String getHelloWorldImpl();

  @WebMethod Price[] getAllPriceOfLens();
  @WebMethod Price createPriceOfLens(@WebParam(name = "obj") Price obj);
  @WebMethod void deletePriceOfLens(@WebParam(name = "id") int id);
  @WebMethod void updatePriceOfLens(@WebParam(name = "object") Price object);
  @WebMethod Price getByPKPriceOfLens(@WebParam(name = "id") int id);

  @WebMethod Price[] getAllPriceOfVideo();
  @WebMethod Price createPriceOfVideo(@WebParam(name = "obj") Price obj);
  @WebMethod void deletePriceOfVideo(@WebParam(name = "id") int id);
  @WebMethod void updatePriceOfVideo(@WebParam(name = "object") Price object);
  @WebMethod Price getByPKPriceOfVideo(@WebParam(name = "id") int id);


  @WebMethod Price[] getAllPriceOfPhoto();
  @WebMethod Price createPriceOfPhoto(@WebParam(name = "obj") Price obj);
  @WebMethod void deletePriceOfPhoto(@WebParam(name = "id") int id);
  @WebMethod void updatePriceOfPhoto(@WebParam(name = "object") Price object);
  @WebMethod Price getByPKPriceOfPhoto(@WebParam(name = "id") int id);

}
