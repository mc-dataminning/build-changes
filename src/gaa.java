import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gaa {
   Codec<gaa> a = azk.a(gaa.a::values).dispatch(gaa::a, gaa.a::a);

   gaa.a a();

   public static enum a implements azk {
      a("player", () -> gab.a.b),
      b("system", () -> gab.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gaa>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gaa>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gaa> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
