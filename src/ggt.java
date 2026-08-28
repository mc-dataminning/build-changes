import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggt {
   Codec<ggt> a = azu.a(ggt.a::values).dispatch(ggt::a, ggt.a::a);

   ggt.a a();

   public static enum a implements azu {
      a("player", () -> ggu.a.b),
      b("system", () -> ggu.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggt>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggt>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggt> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
