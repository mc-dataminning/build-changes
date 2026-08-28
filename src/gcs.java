import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gcs implements baf {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gcs> d = baf.a(gcs::values);
   private final String e;

   private gcs(final String $$0) {
      this.e = $$0;
   }

   public static gcs a(xx $$0, xh $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xx $$0, xh $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xh $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xh $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ye.a).orElse(false);
   }

   private static boolean a(ye $$0) {
      return !$$0.k().equals(ye.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fiu a(xx $$0) {
      return switch (this) {
         case b -> fiu.a($$0.c());
         case c -> fiu.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
