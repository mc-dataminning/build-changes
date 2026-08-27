import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fv implements fo {
   private final fu a;
   private final fu b;
   private final fu c;

   public fv(fu $$0, fu $$1, fu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eif a(du $$0) {
      eif $$1 = $$0.e();
      return new eif(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public eie b(du $$0) {
      eie $$1 = $$0.l();
      return new eie((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.b.a();
   }

   @Override
   public boolean c() {
      return this.c.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof fv $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static fv a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fu $$2 = fu.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fu $$3 = fu.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fu $$4 = fu.a($$0);
            return new fv($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw ft.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw ft.a.createWithContext($$0);
      }
   }

   public static fv a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fu $$3 = fu.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fu $$4 = fu.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fu $$5 = fu.a($$0, $$1);
            return new fv($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw ft.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw ft.a.createWithContext($$0);
      }
   }

   public static fv a(double $$0, double $$1, double $$2) {
      return new fv(new fu(false, $$0), new fu(false, $$1), new fu(false, $$2));
   }

   public static fv a(eie $$0) {
      return new fv(new fu(false, (double)$$0.i), new fu(false, (double)$$0.j), new fu(true, 0.0));
   }

   public static fv d() {
      return new fv(new fu(true, 0.0), new fu(true, 0.0), new fu(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
