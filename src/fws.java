import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fws {
   Codec<fws> a = ayt.a(fws.a::values).dispatch(fws::a, fws.a::a);

   fws.a a();

   public static enum a implements ayt {
      a("player", () -> fwt.a.b),
      b("system", () -> fwt.b.b);

      private final String c;
      private final Supplier<Codec<? extends fws>> d;

      private a(String $$0, Supplier<Codec<? extends fws>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fws> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
