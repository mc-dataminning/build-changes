import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fys {
   Codec<fys> a = azu.a(fys.a::values).dispatch(fys::a, fys.a::a);

   fys.a a();

   public static enum a implements azu {
      a("player", () -> fyt.a.b),
      b("system", () -> fyt.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fys>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fys>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fys> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
