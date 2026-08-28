import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fyp {
   Codec<fyp> a = azs.a(fyp.a::values).dispatch(fyp::a, fyp.a::a);

   fyp.a a();

   public static enum a implements azs {
      a("player", () -> fyq.a.b),
      b("system", () -> fyq.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fyp>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fyp>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fyp> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
