import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggx {
   Codec<ggx> a = azv.a(ggx.a::values).dispatch(ggx::a, ggx.a::a);

   ggx.a a();

   public static enum a implements azv {
      a("player", () -> ggy.a.b),
      b("system", () -> ggy.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggx>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggx>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggx> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
