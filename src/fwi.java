import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fwi {
   Codec<fwi> a = ayq.a(fwi.a::values).dispatch(fwi::a, fwi.a::a);

   fwi.a a();

   public static enum a implements ayq {
      a("player", () -> fwj.a.b),
      b("system", () -> fwj.b.b);

      private final String c;
      private final Supplier<Codec<? extends fwi>> d;

      private a(String $$0, Supplier<Codec<? extends fwi>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fwi> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
