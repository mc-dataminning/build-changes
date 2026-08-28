import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gk implements Predicate<dte> {
   private final dta a;
   private final Set<dud<?>> b;
   @Nullable
   private final ua c;

   public gk(dta $$0, Set<dud<?>> $$1, @Nullable ua $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dta a() {
      return this.a;
   }

   public Set<dud<?>> b() {
      return this.b;
   }

   public boolean a(dte $$0) {
      dta $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dud<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dqf $$3 = $$0.b();
            return $$3 != null && up.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqt $$0, jd $$1) {
      return this.a(new dte($$0, $$1, false));
   }

   public boolean a(aqt $$0, jd $$1, int $$2) {
      dta $$3 = dfw.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dqf $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
