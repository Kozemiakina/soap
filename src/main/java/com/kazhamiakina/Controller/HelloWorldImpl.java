package com.kazhamiakina.Controller;

import com.kazhamiakina.Model.DAO.Price.PriceLens;
import com.kazhamiakina.Model.DAO.Price.PricePhoto;
import com.kazhamiakina.Model.DAO.Price.PriceVideo;
import com.kazhamiakina.Model.Entity.Price;

import javax.jws.WebService;

//Service Implementation Bean

@WebService(endpointInterface = "com.kazhamiakina.Controller.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    PriceLens priceLens = new PriceLens();
    PricePhoto pricePhoto = new PricePhoto();
    PriceVideo priceVideo = new PriceVideo();

    @Override
    public String getHelloWorldImpl() {
        return null;
    }

    @Override
    public Price[] getAllPriceOfLens() {
        return  priceLens.getAll().toArray(new Price[]{});
    }

    @Override
    public Price createPriceOfLens(Price object) {
        return priceLens.create(object);
    }

    @Override
    public void deletePriceOfLens(int id) {
        priceLens.delete(id);

    }

    @Override
    public void updatePriceOfLens(Price object) {
        priceLens.update(object);

    }

    @Override
    public Price getByPKPriceOfLens(int id) {
        return priceLens.getByPK(id);
    }

    @Override
    public Price[] getAllPriceOfVideo() {
        return  priceVideo.getAll().toArray(new Price[]{});
    }

    @Override
    public Price createPriceOfVideo(Price obj) {
        return priceVideo.create(obj);
    }

    @Override
    public void deletePriceOfVideo(int id) {
        priceVideo.delete(id);
    }

    @Override
    public void updatePriceOfVideo(Price object) {
        priceVideo.update(object);
    }

    @Override
    public Price getByPKPriceOfVideo(int id) {
        return priceVideo.getByPK(id);
    }

    @Override
    public Price[] getAllPriceOfPhoto() {
        return pricePhoto.getAll().toArray(new Price[]{});
    }

    @Override
    public Price createPriceOfPhoto(Price obj) {
        return pricePhoto.create(obj);
    }

    @Override
    public void deletePriceOfPhoto(int id) {
        pricePhoto.delete(id);
    }

    @Override
    public void updatePriceOfPhoto(Price object) {
        pricePhoto.update(object);
    }

    @Override
    public Price getByPKPriceOfPhoto(int id) {
        return pricePhoto.getByPK(id);
    }
}
