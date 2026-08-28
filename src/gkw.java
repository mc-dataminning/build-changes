import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gkw {
   Codec<gkw> a = bak.a(gkw.a::values).dispatch(gkw::a, gkw.a::a);

   gkw.a a();

   public static enum a implements bak {
      a("player", () -> gkx.a.b),
      b("system", () -> gkx.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gkw>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gkw>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gkw> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
