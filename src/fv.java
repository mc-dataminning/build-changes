import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fv implements Predicate<drf> {
   private final drb a;
   private final Set<dse<?>> b;
   @Nullable
   private final ud c;

   public fv(drb $$0, Set<dse<?>> $$1, @Nullable ud $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public drb a() {
      return this.a;
   }

   public Set<dse<?>> b() {
      return this.b;
   }

   public boolean a(drf $$0) {
      drb $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dse<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dog $$3 = $$0.b();
            return $$3 != null && us.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqm $$0, io $$1) {
      return this.a(new drf($$0, $$1, false));
   }

   public boolean a(aqm $$0, io $$1, int $$2) {
      drb $$3 = ddy.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dog $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
