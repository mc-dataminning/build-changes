import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gko {
   Codec<gko> a = bak.a(gko.a::values).dispatch(gko::a, gko.a::a);

   gko.a a();

   public static enum a implements bak {
      a("player", () -> gkp.a.b),
      b("system", () -> gkp.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gko>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gko>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gko> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
