import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gg implements Predicate<dsg> {
   private final dsc a;
   private final Set<dtf<?>> b;
   @Nullable
   private final us c;

   public gg(dsc $$0, Set<dtf<?>> $$1, @Nullable us $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dsc a() {
      return this.a;
   }

   public Set<dtf<?>> b() {
      return this.b;
   }

   public boolean a(dsg $$0) {
      dsc $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dtf<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dph $$3 = $$0.b();
            return $$3 != null && vh.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(arf $$0, iz $$1) {
      return this.a(new dsg($$0, $$1, false));
   }

   public boolean a(arf $$0, iz $$1, int $$2) {
      dsc $$3 = dez.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dph $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
