import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gcd {
   Codec<gcd> a = azz.a(gcd.a::values).dispatch(gcd::a, gcd.a::a);

   gcd.a a();

   public static enum a implements azz {
      a("player", () -> gce.a.b),
      b("system", () -> gce.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gcd>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gcd>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gcd> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
