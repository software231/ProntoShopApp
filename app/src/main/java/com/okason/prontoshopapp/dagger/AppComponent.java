package com.okason.prontoshopapp.dagger;

import com.okason.prontoshopapp.MainActivity;
import com.okason.prontoshopapp.ProductListener;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class
        }
)
public interface AppComponent {
    void inject(ProductListener presenter);

    void inject(MainActivity activity);

}
