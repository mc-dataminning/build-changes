import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gln {
   Codec<gln> a = bak.a(gln.a::values).dispatch(gln::a, gln.a::a);

   gln.a a();

   public static enum a implements bak {
      a("player", () -> glo.a.b),
      b("system", () -> glo.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gln>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gln>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gln> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
