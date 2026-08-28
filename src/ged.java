import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ged {
   Codec<ged> a = bai.a(ged.a::values).dispatch(ged::a, ged.a::a);

   ged.a a();

   public static enum a implements bai {
      a("player", () -> gee.a.b),
      b("system", () -> gee.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ged>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ged>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ged> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
