import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gap {
   private final giu a;
   private final gjc b;
   private final Predicate<gix.a> c;
   @Nullable
   private xq d = null;
   private int e;
   private int f;
   @Nullable
   private xl g;

   public gap(gji $$0, Predicate<gix.a> $$1) {
      this.a = $$0.b();
      this.b = new gjc($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, gap.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         giw $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof gix.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(wv.a("gui.chatSelection.fold", this.f));
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

   private boolean a(gap.a $$0, gix.a $$1) {
      xl $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(wv.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, gix.a var2);

      void a(wv var1);
   }
}
