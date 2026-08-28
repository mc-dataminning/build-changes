import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class go implements Predicate<dxb> {
   private final dwx a;
   private final Set<dxz<?>> b;
   @Nullable
   private final tq c;

   public go(dwx $$0, Set<dxz<?>> $$1, @Nullable tq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dwx a() {
      return this.a;
   }

   public Set<dxz<?>> b() {
      return this.b;
   }

   public boolean a(dxb $$0) {
      dwx $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dxz<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dtz $$3 = $$0.b();
            return $$3 != null && uf.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(arc $$0, ji $$1) {
      return this.a(new dxb($$0, $$1, false));
   }

   public boolean a(arc $$0, ji $$1, int $$2) {
      dwx $$3 = djm.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dtz $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }

   private dwx a(dwx $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dxz<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dwx a(dwx $$0, dwx $$1, dxz<T> $$2) {
      return $$0.b($$2, $$1.c($$2));
   }
}
