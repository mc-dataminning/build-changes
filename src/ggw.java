import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum ggw implements azv {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<ggw> d = azv.a(ggw::values);
   private final String e;

   private ggw(final String $$0) {
      this.e = $$0;
   }

   public static ggw a(xf $$0, wp $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xf $$0, wp $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wp $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wp $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xm.a).orElse(false);
   }

   private static boolean a(xm $$0) {
      return !$$0.l().equals(xm.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fle a(xf $$0) {
      return switch (this) {
         case b -> fle.a($$0.c());
         case c -> fle.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
