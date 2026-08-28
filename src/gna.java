import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gna {
   Codec<gna> a = bao.a(gna.a::values).dispatch(gna::a, gna.a::a);

   gna.a a();

   public static enum a implements bao {
      a("player", () -> gnb.a.b),
      b("system", () -> gnb.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gna>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gna>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gna> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
