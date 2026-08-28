import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gg implements Predicate<dsi> {
   private final dse a;
   private final Set<dth<?>> b;
   @Nullable
   private final us c;

   public gg(dse $$0, Set<dth<?>> $$1, @Nullable us $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dse a() {
      return this.a;
   }

   public Set<dth<?>> b() {
      return this.b;
   }

   public boolean a(dsi $$0) {
      dse $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dth<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dpj $$3 = $$0.b();
            return $$3 != null && vh.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(arf $$0, iz $$1) {
      return this.a(new dsi($$0, $$1, false));
   }

   public boolean a(arf $$0, iz $$1, int $$2) {
      dse $$3 = dfb.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dpj $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
