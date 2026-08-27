import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fvd {
   Codec<fvd> a = aye.a(fvd.a::values).dispatch(fvd::a, fvd.a::a);

   fvd.a a();

   public static enum a implements aye {
      a("player", () -> fve.a.b),
      b("system", () -> fve.b.b);

      private final String c;
      private final Supplier<Codec<? extends fvd>> d;

      private a(String $$0, Supplier<Codec<? extends fvd>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fvd> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
