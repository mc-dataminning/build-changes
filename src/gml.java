import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gml {
   Codec<gml> a = bax.a(gml.a::values).dispatch(gml::a, gml.a::a);

   gml.a a();

   public static enum a implements bax {
      a("player", () -> gmm.a.b),
      b("system", () -> gmm.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gml>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gml>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gml> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
