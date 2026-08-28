import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gen {
   private final gmw a;
   private final gne b;
   private final Predicate<gmz.a> c;
   @Nullable
   private xv d = null;
   private int e;
   private int f;
   @Nullable
   private xq g;

   public gen(gnk $$0, Predicate<gmz.a> $$1) {
      this.a = $$0.b();
      this.b = new gne($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, gen.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         gmy $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof gmz.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(xa.a("gui.chatSelection.fold", this.f));
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

   private boolean a(gen.a $$0, gmz.a $$1) {
      xq $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(xa.a("gui.chatSelection.join", $$1.f().getName()).a(o.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, gmz.a var2);

      void a(xa var1);
   }
}
