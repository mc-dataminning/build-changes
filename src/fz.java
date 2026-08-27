import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fz implements fs {
   private final fy a;
   private final fy b;
   private final fy c;

   public fz(fy $$0, fy $$1, fy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esj a(dv $$0) {
      esj $$1 = $$0.d();
      return new esj(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public esi b(dv $$0) {
      esi $$1 = $$0.k();
      return new esi((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof fz $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static fz a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fy $$2 = fy.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fy $$3 = fy.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fy $$4 = fy.a($$0);
            return new fz($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fx.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fx.a.createWithContext($$0);
      }
   }

   public static fz a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fy $$3 = fy.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fy $$4 = fy.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fy $$5 = fy.a($$0, $$1);
            return new fz($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fx.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fx.a.createWithContext($$0);
      }
   }

   public static fz a(double $$0, double $$1, double $$2) {
      return new fz(new fy(false, $$0), new fy(false, $$1), new fy(false, $$2));
   }

   public static fz a(esi $$0) {
      return new fz(new fy(false, (double)$$0.i), new fy(false, (double)$$0.j), new fy(true, 0.0));
   }

   public static fz d() {
      return new fz(new fy(true, 0.0), new fy(true, 0.0), new fy(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
