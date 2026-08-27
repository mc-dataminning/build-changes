import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fv implements Predicate<drh> {
   private final drd a;
   private final Set<dsg<?>> b;
   @Nullable
   private final ud c;

   public fv(drd $$0, Set<dsg<?>> $$1, @Nullable ud $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public drd a() {
      return this.a;
   }

   public Set<dsg<?>> b() {
      return this.b;
   }

   public boolean a(drh $$0) {
      drd $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dsg<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            doi $$3 = $$0.b();
            return $$3 != null && us.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqn $$0, io $$1) {
      return this.a(new drh($$0, $$1, false));
   }

   public boolean a(aqn $$0, io $$1, int $$2) {
      drd $$3 = dea.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            doi $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
