import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fza {
   Codec<fza> a = ayz.a(fza.a::values).dispatch(fza::a, fza.a::a);

   fza.a a();

   public static enum a implements ayz {
      a("player", () -> fzb.a.b),
      b("system", () -> fzb.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fza>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fza>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fza> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
