import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gg implements Predicate<dsf> {
   private final dsb a;
   private final Set<dte<?>> b;
   @Nullable
   private final ur c;

   public gg(dsb $$0, Set<dte<?>> $$1, @Nullable ur $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dsb a() {
      return this.a;
   }

   public Set<dte<?>> b() {
      return this.b;
   }

   public boolean a(dsf $$0) {
      dsb $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dte<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dpg $$3 = $$0.b();
            return $$3 != null && vg.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(are $$0, iz $$1) {
      return this.a(new dsf($$0, $$1, false));
   }

   public boolean a(are $$0, iz $$1, int $$2) {
      dsb $$3 = dey.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dpg $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
