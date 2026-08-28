import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fyq {
   Codec<fyq> a = azt.a(fyq.a::values).dispatch(fyq::a, fyq.a::a);

   fyq.a a();

   public static enum a implements azt {
      a("player", () -> fyr.a.b),
      b("system", () -> fyr.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fyq>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fyq>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fyq> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
