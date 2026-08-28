import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class hb implements gu {
   private final ha a;
   private final ha b;
   private final ha c;

   public hb(ha $$0, ha $$1, ha $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ezr a(ew $$0) {
      ezr $$1 = $$0.d();
      return new ezr(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public ezq b(ew $$0) {
      ezq $$1 = $$0.k();
      return new ezq((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof hb $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static hb a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      ha $$2 = ha.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         ha $$3 = ha.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            ha $$4 = ha.a($$0);
            return new hb($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gz.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gz.a.createWithContext($$0);
      }
   }

   public static hb a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      ha $$3 = ha.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         ha $$4 = ha.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            ha $$5 = ha.a($$0, $$1);
            return new hb($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gz.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gz.a.createWithContext($$0);
      }
   }

   public static hb a(double $$0, double $$1, double $$2) {
      return new hb(new ha(false, $$0), new ha(false, $$1), new ha(false, $$2));
   }

   public static hb a(ezq $$0) {
      return new hb(new ha(false, (double)$$0.i), new ha(false, (double)$$0.j), new ha(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
