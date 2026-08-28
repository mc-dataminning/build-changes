import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class hd implements gw {
   private final hc a;
   private final hc b;
   private final hc c;

   public hd(hc $$0, hc $$1, hc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fcu a(ex $$0) {
      fcu $$1 = $$0.d();
      return new fcu(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public fct b(ex $$0) {
      fct $$1 = $$0.k();
      return new fct((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof hd $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static hd a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      hc $$2 = hc.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         hc $$3 = hc.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hc $$4 = hc.a($$0);
            return new hd($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw hb.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw hb.a.createWithContext($$0);
      }
   }

   public static hd a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      hc $$3 = hc.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         hc $$4 = hc.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hc $$5 = hc.a($$0, $$1);
            return new hd($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw hb.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw hb.a.createWithContext($$0);
      }
   }

   public static hd a(double $$0, double $$1, double $$2) {
      return new hd(new hc(false, $$0), new hc(false, $$1), new hc(false, $$2));
   }

   public static hd a(fct $$0) {
      return new hd(new hc(false, (double)$$0.i), new hc(false, (double)$$0.j), new hc(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
