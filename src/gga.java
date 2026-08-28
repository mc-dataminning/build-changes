import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gga {
   Codec<gga> a = bba.a(gga.a::values).dispatch(gga::a, gga.a::a);

   gga.a a();

   public static enum a implements bba {
      a("player", () -> ggb.a.b),
      b("system", () -> ggb.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gga>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gga>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gga> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
