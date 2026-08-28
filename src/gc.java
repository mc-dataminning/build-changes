import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gc implements Predicate<ebu> {
   private final ebq a;
   private final Set<ect<?>> b;
   @Nullable
   private final ua c;

   public gc(ebq $$0, Set<ect<?>> $$1, @Nullable ua $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ebq a() {
      return this.a;
   }

   public Set<ect<?>> b() {
      return this.b;
   }

   public boolean a(ebu $$0) {
      ebq $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (ect<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dyo $$3 = $$0.b();
            return $$3 != null && up.a(this.c, $$3.b($$0.c().J_()), true);
         }
      }
   }

   public boolean a(asb $$0, iw $$1) {
      return this.a(new ebu($$0, $$1, false));
   }

   public boolean a(asb $$0, iw $$1, int $$2) {
      ebq $$3 = ($$2 & 16) != 0 ? this.a : dno.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dyo $$5 = $$0.c_($$1);
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

   private ebq a(ebq $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (ect<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> ebq a(ebq $$0, ebq $$1, ect<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
