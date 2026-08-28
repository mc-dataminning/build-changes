import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbs() implements hbu {
   public static final MapCodec<hbs> a = MapCodec.unit(new hbs());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return cvc.g($$0);
   }

   @Override
   public MapCodec<hbs> a() {
      return a;
   }
}
