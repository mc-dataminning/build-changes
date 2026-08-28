import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggh {
   Codec<ggh> a = bba.a(ggh.a::values).dispatch(ggh::a, ggh.a::a);

   ggh.a a();

   public static enum a implements bba {
      a("player", () -> ggi.a.b),
      b("system", () -> ggi.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggh>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggh>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggh> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
