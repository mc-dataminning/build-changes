import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gp implements gi {
   private final go a;
   private final go b;
   private final go c;

   public gp(go $$0, go $$1, go $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ffq a(ej $$0) {
      ffq $$1 = $$0.d();
      return new ffq(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public ffp b(ej $$0) {
      ffp $$1 = $$0.k();
      return new ffp((float)this.a.a((double)$$1.j), (float)this.b.a((double)$$1.k));
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
      } else if (!($$0 instanceof gp $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gp a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      go $$2 = go.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         go $$3 = go.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            go $$4 = go.a($$0);
            return new gp($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gn.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gn.a.createWithContext($$0);
      }
   }

   public static gp a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      go $$3 = go.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         go $$4 = go.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            go $$5 = go.a($$0, $$1);
            return new gp($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gn.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gn.a.createWithContext($$0);
      }
   }

   public static gp a(double $$0, double $$1, double $$2) {
      return new gp(new go(false, $$0), new go(false, $$1), new go(false, $$2));
   }

   public static gp a(ffp $$0) {
      return new gp(new go(false, (double)$$0.j), new go(false, (double)$$0.k), new go(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
