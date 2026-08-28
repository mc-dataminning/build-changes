import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggg {
   Codec<ggg> a = bba.a(ggg.a::values).dispatch(ggg::a, ggg.a::a);

   ggg.a a();

   public static enum a implements bba {
      a("player", () -> ggh.a.b),
      b("system", () -> ggh.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggg>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggg>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggg> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
