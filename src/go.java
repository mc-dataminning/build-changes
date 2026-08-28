import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class go implements Predicate<dwz> {
   private final dwv a;
   private final Set<dxx<?>> b;
   @Nullable
   private final tq c;

   public go(dwv $$0, Set<dxx<?>> $$1, @Nullable tq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dwv a() {
      return this.a;
   }

   public Set<dxx<?>> b() {
      return this.b;
   }

   public boolean a(dwz $$0) {
      dwv $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dxx<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dtx $$3 = $$0.b();
            return $$3 != null && uf.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(arc $$0, ji $$1) {
      return this.a(new dwz($$0, $$1, false));
   }

   public boolean a(arc $$0, ji $$1, int $$2) {
      dwv $$3 = djk.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dtx $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }

   private dwv a(dwv $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dxx<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dwv a(dwv $$0, dwv $$1, dxx<T> $$2) {
      return $$0.b($$2, $$1.c($$2));
   }
}
