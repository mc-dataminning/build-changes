import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gec implements bai {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gec> d = bai.a(gec::values);
   private final String e;

   private gec(final String $$0) {
      this.e = $$0;
   }

   public static gec a(xz $$0, xj $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xz $$0, xj $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xj $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xj $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yg.a).orElse(false);
   }

   private static boolean a(yg $$0) {
      return !$$0.k().equals(yg.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fjy a(xz $$0) {
      return switch (this) {
         case b -> fjy.a($$0.c());
         case c -> fjy.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
