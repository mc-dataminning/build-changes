import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggf {
   Codec<ggf> a = bba.a(ggf.a::values).dispatch(ggf::a, ggf.a::a);

   ggf.a a();

   public static enum a implements bba {
      a("player", () -> ggg.a.b),
      b("system", () -> ggg.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggf>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggf>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggf> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
