import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fyo implements azs {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fyo> d = azs.a(fyo::values);
   private final String e;

   private fyo(final String $$0) {
      this.e = $$0;
   }

   public static fyo a(ye $$0, xo $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(ye $$0, xo $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xo $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xo $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yl.a).orElse(false);
   }

   private static boolean a(yl $$0) {
      return !$$0.k().equals(yl.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fey a(ye $$0) {
      return switch (this) {
         case b -> fey.a($$0.c());
         case c -> fey.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
