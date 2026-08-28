import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gq implements gj {
   private final gp a;
   private final gp b;
   private final gp c;

   public gq(gp $$0, gp $$1, gp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fgc a(ek $$0) {
      fgc $$1 = $$0.d();
      return new fgc(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public fgb b(ek $$0) {
      fgb $$1 = $$0.k();
      return new fgb((float)this.a.a((double)$$1.j), (float)this.b.a((double)$$1.k));
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
      } else if (!($$0 instanceof gq $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gq a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gp $$2 = gp.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gp $$3 = gp.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gp $$4 = gp.a($$0);
            return new gq($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw go.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw go.a.createWithContext($$0);
      }
   }

   public static gq a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gp $$3 = gp.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gp $$4 = gp.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gp $$5 = gp.a($$0, $$1);
            return new gq($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw go.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw go.a.createWithContext($$0);
      }
   }

   public static gq a(double $$0, double $$1, double $$2) {
      return new gq(new gp(false, $$0), new gp(false, $$1), new gp(false, $$2));
   }

   public static gq a(fgb $$0) {
      return new gq(new gp(false, (double)$$0.j), new gp(false, (double)$$0.k), new gp(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
