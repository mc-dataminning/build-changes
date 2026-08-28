import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gac {
   Codec<gac> a = azk.a(gac.a::values).dispatch(gac::a, gac.a::a);

   gac.a a();

   public static enum a implements azk {
      a("player", () -> gad.a.b),
      b("system", () -> gad.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gac>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gac>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gac> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
