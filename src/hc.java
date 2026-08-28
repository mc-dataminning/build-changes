import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class hc implements gv {
   private final hb a;
   private final hb b;
   private final hb c;

   public hc(hb $$0, hb $$1, hb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbx a(ex $$0) {
      fbx $$1 = $$0.d();
      return new fbx(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public fbw b(ex $$0) {
      fbw $$1 = $$0.k();
      return new fbw((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof hc $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static hc a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      hb $$2 = hb.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         hb $$3 = hb.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hb $$4 = hb.a($$0);
            return new hc($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw ha.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw ha.a.createWithContext($$0);
      }
   }

   public static hc a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      hb $$3 = hb.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         hb $$4 = hb.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hb $$5 = hb.a($$0, $$1);
            return new hc($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw ha.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw ha.a.createWithContext($$0);
      }
   }

   public static hc a(double $$0, double $$1, double $$2) {
      return new hc(new hb(false, $$0), new hb(false, $$1), new hb(false, $$2));
   }

   public static hc a(fbw $$0) {
      return new hc(new hb(false, (double)$$0.i), new hb(false, (double)$$0.j), new hb(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
