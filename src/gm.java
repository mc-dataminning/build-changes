import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gm implements gf {
   private final gl a;
   private final gl b;
   private final gl c;

   public gm(gl $$0, gl $$1, gl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewu a(eh $$0) {
      ewu $$1 = $$0.d();
      return new ewu(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ewt b(eh $$0) {
      ewt $$1 = $$0.k();
      return new ewt((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gm $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gm a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gl $$2 = gl.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gl $$3 = gl.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gl $$4 = gl.a($$0);
            return new gm($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gk.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gk.a.createWithContext($$0);
      }
   }

   public static gm a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gl $$3 = gl.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gl $$4 = gl.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gl $$5 = gl.a($$0, $$1);
            return new gm($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gk.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gk.a.createWithContext($$0);
      }
   }

   public static gm a(double $$0, double $$1, double $$2) {
      return new gm(new gl(false, $$0), new gl(false, $$1), new gl(false, $$2));
   }

   public static gm a(ewt $$0) {
      return new gm(new gl(false, (double)$$0.i), new gl(false, (double)$$0.j), new gl(true, 0.0));
   }

   public static gm d() {
      return new gm(new gl(true, 0.0), new gl(true, 0.0), new gl(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
