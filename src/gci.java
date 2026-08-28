import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gci {
   Codec<gci> a = bab.a(gci.a::values).dispatch(gci::a, gci.a::a);

   gci.a a();

   public static enum a implements bab {
      a("player", () -> gcj.a.b),
      b("system", () -> gcj.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gci>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gci>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gci> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
