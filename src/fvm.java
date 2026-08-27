import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fvm {
   Codec<fvm> a = ayg.a(fvm.a::values).dispatch(fvm::a, fvm.a::a);

   fvm.a a();

   public static enum a implements ayg {
      a("player", () -> fvn.a.b),
      b("system", () -> fvn.b.b);

      private final String c;
      private final Supplier<Codec<? extends fvm>> d;

      private a(String $$0, Supplier<Codec<? extends fvm>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fvm> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
