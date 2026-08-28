import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggw {
   Codec<ggw> a = azv.a(ggw.a::values).dispatch(ggw::a, ggw.a::a);

   ggw.a a();

   public static enum a implements azv {
      a("player", () -> ggx.a.b),
      b("system", () -> ggx.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggw>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggw>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggw> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
