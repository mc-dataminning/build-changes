import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fyt {
   Codec<fyt> a = azu.a(fyt.a::values).dispatch(fyt::a, fyt.a::a);

   fyt.a a();

   public static enum a implements azu {
      a("player", () -> fyu.a.b),
      b("system", () -> fyu.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fyt>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fyt>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fyt> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
