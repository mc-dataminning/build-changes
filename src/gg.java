import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gg implements fz {
   private final gf a;
   private final gf b;
   private final gf c;

   public gg(gf $$0, gf $$1, gf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etf a(ec $$0) {
      etf $$1 = $$0.d();
      return new etf(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ete b(ec $$0) {
      ete $$1 = $$0.k();
      return new ete((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gg $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gg a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gf $$2 = gf.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gf $$3 = gf.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gf $$4 = gf.a($$0);
            return new gg($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw ge.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw ge.a.createWithContext($$0);
      }
   }

   public static gg a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gf $$3 = gf.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gf $$4 = gf.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gf $$5 = gf.a($$0, $$1);
            return new gg($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw ge.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw ge.a.createWithContext($$0);
      }
   }

   public static gg a(double $$0, double $$1, double $$2) {
      return new gg(new gf(false, $$0), new gf(false, $$1), new gf(false, $$2));
   }

   public static gg a(ete $$0) {
      return new gg(new gf(false, (double)$$0.i), new gf(false, (double)$$0.j), new gf(true, 0.0));
   }

   public static gg d() {
      return new gg(new gf(true, 0.0), new gf(true, 0.0), new gf(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
