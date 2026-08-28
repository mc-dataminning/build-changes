import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gmx implements bam {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gmx> d = bam.a(gmx::values);
   private final String e;

   private gmx(final String $$0) {
      this.e = $$0;
   }

   public static gmx a(xq $$0, xa $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xq $$0, xa $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xa $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xa $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xx.a).orElse(false);
   }

   private static boolean a(xx $$0) {
      return !$$0.l().equals(xx.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fqx a(xq $$0) {
      return switch (this) {
         case b -> fqx.a($$0.c());
         case c -> fqx.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
