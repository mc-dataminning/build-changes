import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface giw {
   Codec<giw> a = bag.a(giw.a::values).dispatch(giw::a, giw.a::a);

   giw.a a();

   public static enum a implements bag {
      a("player", () -> gix.a.b),
      b("system", () -> gix.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends giw>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends giw>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends giw> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
