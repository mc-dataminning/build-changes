import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fzi {
   Codec<fzi> a = azc.a(fzi.a::values).dispatch(fzi::a, fzi.a::a);

   fzi.a a();

   public static enum a implements azc {
      a("player", () -> fzj.a.b),
      b("system", () -> fzj.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fzi>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fzi>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fzi> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
