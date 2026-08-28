import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gy implements gr {
   private final gx a;
   private final gx b;
   private final gx c;

   public gy(gx $$0, gx $$1, gx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exa a(et $$0) {
      exa $$1 = $$0.d();
      return new exa(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ewz b(et $$0) {
      ewz $$1 = $$0.k();
      return new ewz((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gy $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gy a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gx $$2 = gx.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gx $$3 = gx.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gx $$4 = gx.a($$0);
            return new gy($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gw.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gw.a.createWithContext($$0);
      }
   }

   public static gy a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gx $$3 = gx.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gx $$4 = gx.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gx $$5 = gx.a($$0, $$1);
            return new gy($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gw.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gw.a.createWithContext($$0);
      }
   }

   public static gy a(double $$0, double $$1, double $$2) {
      return new gy(new gx(false, $$0), new gx(false, $$1), new gx(false, $$2));
   }

   public static gy a(ewz $$0) {
      return new gy(new gx(false, (double)$$0.i), new gx(false, (double)$$0.j), new gx(true, 0.0));
   }

   public static gy d() {
      return new gy(new gx(true, 0.0), new gx(true, 0.0), new gx(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
