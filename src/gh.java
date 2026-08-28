import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gh implements Predicate<dsl> {
   private final dsh a;
   private final Set<dtk<?>> b;
   @Nullable
   private final tx c;

   public gh(dsh $$0, Set<dtk<?>> $$1, @Nullable tx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dsh a() {
      return this.a;
   }

   public Set<dtk<?>> b() {
      return this.b;
   }

   public boolean a(dsl $$0) {
      dsh $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dtk<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dpn $$3 = $$0.b();
            return $$3 != null && um.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqk $$0, ja $$1) {
      return this.a(new dsl($$0, $$1, false));
   }

   public boolean a(aqk $$0, ja $$1, int $$2) {
      dsh $$3 = dff.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dpn $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
