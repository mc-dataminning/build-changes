import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gct {
   Codec<gct> a = baf.a(gct.a::values).dispatch(gct::a, gct.a::a);

   gct.a a();

   public static enum a implements baf {
      a("player", () -> gcu.a.b),
      b("system", () -> gcu.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gct>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gct>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gct> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
