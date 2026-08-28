import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gk implements Predicate<dus> {
   private final duo a;
   private final Set<dvr<?>> b;
   @Nullable
   private final uf c;

   public gk(duo $$0, Set<dvr<?>> $$1, @Nullable uf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public duo a() {
      return this.a;
   }

   public Set<dvr<?>> b() {
      return this.b;
   }

   public boolean a(dus $$0) {
      duo $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dvr<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            drs $$3 = $$0.b();
            return $$3 != null && uu.a(this.c, $$3.b($$0.c().F_()), true);
         }
      }
   }

   public boolean a(arh $$0, je $$1) {
      return this.a(new dus($$0, $$1, false));
   }

   public boolean a(arh $$0, je $$1, int $$2) {
      duo $$3 = dhj.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            drs $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.F_());
            }
         }

         return true;
      }
   }
}
