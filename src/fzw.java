import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface fzw {
   Codec<fzw> a = azj.a(fzw.a::values).dispatch(fzw::a, fzw.a::a);

   fzw.a a();

   public static enum a implements azj {
      a("player", () -> fzx.a.b),
      b("system", () -> fzx.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends fzw>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends fzw>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends fzw> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
