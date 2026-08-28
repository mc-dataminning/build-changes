import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gdu {
   Codec<gdu> a = baj.a(gdu.a::values).dispatch(gdu::a, gdu.a::a);

   gdu.a a();

   public static enum a implements baj {
      a("player", () -> gdv.a.b),
      b("system", () -> gdv.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gdu>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gdu>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gdu> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
