import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fvc implements aye {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fvc> d = aye.a(fvc::values);
   private final String e;

   private fvc(String $$0) {
      this.e = $$0;
   }

   public static fvc a(ww $$0, wg $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(ww $$0, wg $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wg $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wg $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xd.a).orElse(false);
   }

   private static boolean a(xd $$0) {
      return !$$0.k().equals(xd.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fbk a(ww $$0) {
      return switch (this) {
         case b -> fbk.a($$0.c());
         case c -> fbk.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
