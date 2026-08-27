import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fvl implements ayg {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fvl> d = ayg.a(fvl::values);
   private final String e;

   private fvl(String $$0) {
      this.e = $$0;
   }

   public static fvl a(wy $$0, wi $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(wy $$0, wi $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wi $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wi $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xf.a).orElse(false);
   }

   private static boolean a(xf $$0) {
      return !$$0.k().equals(xf.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fbt a(wy $$0) {
      return switch (this) {
         case b -> fbt.a($$0.c());
         case c -> fbt.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
