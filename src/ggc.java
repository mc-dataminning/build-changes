import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ggc {
   Codec<ggc> a = baq.a(ggc.a::values).dispatch(ggc::a, ggc.a::a);

   ggc.a a();

   public static enum a implements baq {
      a("player", () -> ggd.a.b),
      b("system", () -> ggd.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ggc>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ggc>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ggc> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
