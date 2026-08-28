import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gh implements Predicate<dsp> {
   private final dsl a;
   private final Set<dto<?>> b;
   @Nullable
   private final tx c;

   public gh(dsl $$0, Set<dto<?>> $$1, @Nullable tx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dsl a() {
      return this.a;
   }

   public Set<dto<?>> b() {
      return this.b;
   }

   public boolean a(dsp $$0) {
      dsl $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dto<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dpq $$3 = $$0.b();
            return $$3 != null && um.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqm $$0, ja $$1) {
      return this.a(new dsp($$0, $$1, false));
   }

   public boolean a(aqm $$0, ja $$1, int $$2) {
      dsl $$3 = dfi.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dpq $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
