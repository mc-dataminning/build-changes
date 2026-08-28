import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gjz implements bai {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gjz> d = bai.a(gjz::values);
   private final String e;

   private gjz(final String $$0) {
      this.e = $$0;
   }

   public static gjz a(xm $$0, ww $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xm $$0, ww $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         ww $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(ww $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xt.a).orElse(false);
   }

   private static boolean a(xt $$0) {
      return !$$0.l().equals(xt.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fnz a(xm $$0) {
      return switch (this) {
         case b -> fnz.a($$0.c());
         case c -> fnz.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
