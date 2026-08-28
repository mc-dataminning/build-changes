import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fvw {
   private final gds a;
   private final gea b;
   private final Predicate<gdv.a> c;
   @Nullable
   private yg d = null;
   private int e;
   private int f;
   @Nullable
   private yb g;

   public fvw(geg $$0, Predicate<gdv.a> $$1) {
      this.a = $$0.b();
      this.b = new gea($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fvw.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         gdu $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof gdv.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(xl.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fvw.a $$0, gdv.a $$1) {
      yb $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(xl.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, gdv.a var2);

      void a(xl var1);
   }
}
