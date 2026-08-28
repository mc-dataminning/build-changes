import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fym {
   Codec<fym> a = azp.a(fym.a::values).dispatch(fym::a, fym.a::a);

   fym.a a();

   public static enum a implements azp {
      a("player", () -> fyn.a.b),
      b("system", () -> fyn.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fym>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fym>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fym> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
