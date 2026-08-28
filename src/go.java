import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class go implements Predicate<dxu> {
   private final dxq a;
   private final Set<dyt<?>> b;
   @Nullable
   private final tq c;

   public go(dxq $$0, Set<dyt<?>> $$1, @Nullable tq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dxq a() {
      return this.a;
   }

   public Set<dyt<?>> b() {
      return this.b;
   }

   public boolean a(dxu $$0) {
      dxq $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dyt<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dus $$3 = $$0.b();
            return $$3 != null && uf.a(this.c, $$3.b($$0.c().F_()), true);
         }
      }
   }

   public boolean a(ard $$0, ji $$1) {
      return this.a(new dxu($$0, $$1, false));
   }

   public boolean a(ard $$0, ji $$1, int $$2) {
      dxq $$3 = ($$2 & 16) != 0 ? this.a : dke.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dus $$5 = $$0.c_($$1);
         if ($$5 != null) {
            tq $$6 = $$5.d($$0.F_());
            $$5.c(this.c, $$0.F_());
            tq $$7 = $$5.d($$0.F_());
            if (!$$7.equals($$6)) {
               $$4 = true;
            }
         }
      }

      return $$4;
   }

   private dxq a(dxq $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dyt<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dxq a(dxq $$0, dxq $$1, dyt<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
