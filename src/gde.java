import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gde {
   Codec<gde> a = bag.a(gde.a::values).dispatch(gde::a, gde.a::a);

   gde.a a();

   public static enum a implements bag {
      a("player", () -> gdf.a.b),
      b("system", () -> gdf.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gde>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gde>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gde> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
