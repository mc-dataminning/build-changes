import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gbt {
   Codec<gbt> a = azy.a(gbt.a::values).dispatch(gbt::a, gbt.a::a);

   gbt.a a();

   public static enum a implements azy {
      a("player", () -> gbu.a.b),
      b("system", () -> gbu.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gbt>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gbt>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gbt> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
