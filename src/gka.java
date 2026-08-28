import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gka {
   Codec<gka> a = bai.a(gka.a::values).dispatch(gka::a, gka.a::a);

   gka.a a();

   public static enum a implements bai {
      a("player", () -> gkb.a.b),
      b("system", () -> gkb.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gka>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gka>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gka> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
