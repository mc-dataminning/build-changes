import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gc implements Predicate<ebk> {
   private final ebg a;
   private final Set<ecj<?>> b;
   @Nullable
   private final ua c;

   public gc(ebg $$0, Set<ecj<?>> $$1, @Nullable ua $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ebg a() {
      return this.a;
   }

   public Set<ecj<?>> b() {
      return this.b;
   }

   public boolean a(ebk $$0) {
      ebg $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (ecj<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dye $$3 = $$0.b();
            return $$3 != null && up.a(this.c, $$3.b($$0.c().J_()), true);
         }
      }
   }

   public boolean a(aru $$0, iw $$1) {
      return this.a(new ebk($$0, $$1, false));
   }

   public boolean a(aru $$0, iw $$1, int $$2) {
      ebg $$3 = ($$2 & 16) != 0 ? this.a : dne.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dye $$5 = $$0.c_($$1);
         if ($$5 != null) {
            ua $$6 = $$5.d($$0.J_());
            $$5.c(this.c, $$0.J_());
            ua $$7 = $$5.d($$0.J_());
            if (!$$7.equals($$6)) {
               $$4 = true;
               $$5.e();
               $$0.m().a($$1);
            }
         }
      }

      return $$4;
   }

   private ebg a(ebg $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (ecj<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> ebg a(ebg $$0, ebg $$1, ecj<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
