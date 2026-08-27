import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fxn {
   Codec<fxn> a = ayz.a(fxn.a::values).dispatch(fxn::a, fxn.a::a);

   fxn.a a();

   public static enum a implements ayz {
      a("player", () -> fxo.a.b),
      b("system", () -> fxo.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fxn>> d;

      private a(String $$0, Supplier<MapCodec<? extends fxn>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fxn> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
