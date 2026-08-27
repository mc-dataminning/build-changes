import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface gaj {
   Codec<gaj> a = azg.a(gaj.a::values).dispatch(gaj::a, gaj.a::a);

   gaj.a a();

   public static enum a implements azg {
      a("player", () -> gak.a.b),
      b("system", () -> gak.b.b);

      private final String c;
      private final Supplier<Codec<? extends gaj>> d;

      private a(String $$0, Supplier<Codec<? extends gaj>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends gaj> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
