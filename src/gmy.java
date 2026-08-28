import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gmy {
   Codec<gmy> a = bam.a(gmy.a::values).dispatch(gmy::a, gmy.a::a);

   gmy.a a();

   public static enum a implements bam {
      a("player", () -> gmz.a.b),
      b("system", () -> gmz.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gmy>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gmy>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gmy> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
