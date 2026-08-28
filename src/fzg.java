import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fzg {
   Codec<fzg> a = azc.a(fzg.a::values).dispatch(fzg::a, fzg.a::a);

   fzg.a a();

   public static enum a implements azc {
      a("player", () -> fzh.a.b),
      b("system", () -> fzh.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fzg>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fzg>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fzg> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
