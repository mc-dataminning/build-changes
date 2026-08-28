import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class go implements gh {
   private final gn a;
   private final gn b;
   private final gn c;

   public go(gn $$0, gn $$1, gn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fei a(ei $$0) {
      fei $$1 = $$0.d();
      return new fei(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public feh b(ei $$0) {
      feh $$1 = $$0.k();
      return new feh((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof go $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static go a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gn $$2 = gn.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gn $$3 = gn.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gn $$4 = gn.a($$0);
            return new go($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gm.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gm.a.createWithContext($$0);
      }
   }

   public static go a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gn $$3 = gn.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gn $$4 = gn.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gn $$5 = gn.a($$0, $$1);
            return new go($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gm.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gm.a.createWithContext($$0);
      }
   }

   public static go a(double $$0, double $$1, double $$2) {
      return new go(new gn(false, $$0), new gn(false, $$1), new gn(false, $$2));
   }

   public static go a(feh $$0) {
      return new go(new gn(false, (double)$$0.i), new gn(false, (double)$$0.j), new gn(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
