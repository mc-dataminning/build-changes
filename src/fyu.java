import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fyu {
   private final ggv a;
   private final ghd b;
   private final Predicate<ggy.a> c;
   @Nullable
   private xk d = null;
   private int e;
   private int f;
   @Nullable
   private xf g;

   public fyu(ghj $$0, Predicate<ggy.a> $$1) {
      this.a = $$0.b();
      this.b = new ghd($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fyu.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         ggx $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof ggy.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(wp.a("gui.chatSelection.fold", this.f));
                  this.f = 0;
               }

               $$1.a($$4, $$5);
               $$2++;
            } else {
               this.f++;
            }

            this.g = $$5.g();
         }
      }
   }

   private boolean a(fyu.a $$0, ggy.a $$1) {
      xf $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(wp.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, ggy.a var2);

      void a(wp var1);
   }
}
