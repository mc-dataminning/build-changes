import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface ghv {
   Codec<ghv> a = azv.a(ghv.a::values).dispatch(ghv::a, ghv.a::a);

   ghv.a a();

   public static enum a implements azv {
      a("player", () -> ghw.a.b),
      b("system", () -> ghw.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends ghv>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends ghv>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends ghv> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
