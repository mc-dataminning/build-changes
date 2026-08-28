import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggv {
   Codec<ggv> a = azv.a(ggv.a::values).dispatch(ggv::a, ggv.a::a);

   ggv.a a();

   public static enum a implements azv {
      a("player", () -> ggw.a.b),
      b("system", () -> ggw.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggv>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggv>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggv> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
