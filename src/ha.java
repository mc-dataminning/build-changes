import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class ha implements gt {
   private final gz a;
   private final gz b;
   private final gz c;

   public ha(gz $$0, gz $$1, gz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ezh a(ev $$0, boolean $$1) {
      double $$2 = this.a.a() && $$1 ? 0.0 : $$0.d().d;
      double $$3 = this.b.a() && $$1 ? 0.0 : $$0.d().e;
      double $$4 = this.c.a() && $$1 ? 0.0 : $$0.d().f;
      return new ezh(this.a.a($$2), this.b.a($$3), this.c.a($$4));
   }

   @Override
   public ezg b(ev $$0, boolean $$1) {
      double $$2 = this.a.a() && $$1 ? 0.0 : (double)$$0.k().i;
      double $$3 = this.b.a() && $$1 ? 0.0 : (double)$$0.k().j;
      return new ezg((float)this.a.a($$2), (float)this.b.a($$3));
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
      } else if (!($$0 instanceof ha $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static ha a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gz $$2 = gz.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gz $$3 = gz.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gz $$4 = gz.a($$0);
            return new ha($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gy.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gy.a.createWithContext($$0);
      }
   }

   public static ha a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gz $$3 = gz.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gz $$4 = gz.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gz $$5 = gz.a($$0, $$1);
            return new ha($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gy.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gy.a.createWithContext($$0);
      }
   }

   public static ha a(double $$0, double $$1, double $$2) {
      return new ha(new gz(false, $$0), new gz(false, $$1), new gz(false, $$2));
   }

   public static ha a(ezg $$0) {
      return new ha(new gz(false, (double)$$0.i), new gz(false, (double)$$0.j), new gz(true, 0.0));
   }

   public static ha d() {
      return new ha(new gz(true, 0.0), new gz(true, 0.0), new gz(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
