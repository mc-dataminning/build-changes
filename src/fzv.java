import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fzv implements azj {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fzv> d = azj.a(fzv::values);
   private final String e;

   private fzv(final String $$0) {
      this.e = $$0;
   }

   public static fzv a(xo $$0, wy $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xo $$0, wy $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wy $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wy $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xv.a).orElse(false);
   }

   private static boolean a(xv $$0) {
      return !$$0.k().equals(xv.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fgd a(xo $$0) {
      return switch (this) {
         case b -> fgd.a($$0.c());
         case c -> fgd.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
