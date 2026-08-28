import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gz implements gs {
   private final gy a;
   private final gy b;
   private final gy c;

   public gz(gy $$0, gy $$1, gy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyw a(eu $$0) {
      eyw $$1 = $$0.d();
      return new eyw(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public eyv b(eu $$0) {
      eyv $$1 = $$0.k();
      return new eyv((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gz $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gz a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gy $$2 = gy.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gy $$3 = gy.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gy $$4 = gy.a($$0);
            return new gz($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gx.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gx.a.createWithContext($$0);
      }
   }

   public static gz a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gy $$3 = gy.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gy $$4 = gy.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gy $$5 = gy.a($$0, $$1);
            return new gz($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gx.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gx.a.createWithContext($$0);
      }
   }

   public static gz a(double $$0, double $$1, double $$2) {
      return new gz(new gy(false, $$0), new gy(false, $$1), new gy(false, $$2));
   }

   public static gz a(eyv $$0) {
      return new gz(new gy(false, (double)$$0.i), new gy(false, (double)$$0.j), new gy(true, 0.0));
   }

   public static gz d() {
      return new gz(new gy(true, 0.0), new gy(true, 0.0), new gy(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
