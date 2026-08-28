import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum ggb implements baq {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<ggb> d = baq.a(ggb::values);
   private final String e;

   private ggb(final String $$0) {
      this.e = $$0;
   }

   public static ggb a(ya $$0, xk $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(ya $$0, xk $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xk $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xk $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yh.a).orElse(false);
   }

   private static boolean a(yh $$0) {
      return !$$0.l().equals(yh.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public flt a(ya $$0) {
      return switch (this) {
         case b -> flt.a($$0.c());
         case c -> flt.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
