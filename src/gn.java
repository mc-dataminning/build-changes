import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dvn> {
   private final dvj a;
   private final Set<dwm<?>> b;
   @Nullable
   private final uk c;

   public gn(dvj $$0, Set<dwm<?>> $$1, @Nullable uk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dvj a() {
      return this.a;
   }

   public Set<dwm<?>> b() {
      return this.b;
   }

   public boolean a(dvn $$0) {
      dvj $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dwm<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dsm $$3 = $$0.b();
            return $$3 != null && uz.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(arn $$0, jh $$1) {
      return this.a(new dvn($$0, $$1, false));
   }

   public boolean a(arn $$0, jh $$1, int $$2) {
      dvj $$3 = die.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dsm $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
