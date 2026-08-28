import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class go implements Predicate<dxc> {
   private final dwy a;
   private final Set<dya<?>> b;
   @Nullable
   private final tq c;

   public go(dwy $$0, Set<dya<?>> $$1, @Nullable tq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dwy a() {
      return this.a;
   }

   public Set<dya<?>> b() {
      return this.b;
   }

   public boolean a(dxc $$0) {
      dwy $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dya<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dua $$3 = $$0.b();
            return $$3 != null && uf.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(ard $$0, ji $$1) {
      return this.a(new dxc($$0, $$1, false));
   }

   public boolean a(ard $$0, ji $$1, int $$2) {
      dwy $$3 = djn.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dua $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }

   private dwy a(dwy $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dya<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dwy a(dwy $$0, dwy $$1, dya<T> $$2) {
      return $$0.b($$2, $$1.c($$2));
   }
}
