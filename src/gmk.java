import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gmk implements bax {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gmk> d = bax.a(gmk::values);
   private final String e;

   private gmk(final String $$0) {
      this.e = $$0;
   }

   public static gmk a(xw $$0, xg $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xw $$0, xg $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xg $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xg $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yd.a).orElse(false);
   }

   private static boolean a(yd $$0) {
      return !$$0.l().equals(yd.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fqk a(xw $$0) {
      return switch (this) {
         case b -> fqk.a($$0.c());
         case c -> fqk.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
