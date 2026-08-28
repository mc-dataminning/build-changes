import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fyr {
   Codec<fyr> a = azu.a(fyr.a::values).dispatch(fyr::a, fyr.a::a);

   fyr.a a();

   public static enum a implements azu {
      a("player", () -> fys.a.b),
      b("system", () -> fys.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fyr>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fyr>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fyr> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
