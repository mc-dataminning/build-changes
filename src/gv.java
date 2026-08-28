import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gv implements go {
   private final gu a;
   private final gu b;
   private final gu c;

   public gv(gu $$0, gu $$1, gu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewh a(eq $$0) {
      ewh $$1 = $$0.d();
      return new ewh(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ewg b(eq $$0) {
      ewg $$1 = $$0.k();
      return new ewg((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gv $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gv a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gu $$2 = gu.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gu $$3 = gu.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gu $$4 = gu.a($$0);
            return new gv($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gt.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gt.a.createWithContext($$0);
      }
   }

   public static gv a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gu $$3 = gu.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gu $$4 = gu.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gu $$5 = gu.a($$0, $$1);
            return new gv($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gt.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gt.a.createWithContext($$0);
      }
   }

   public static gv a(double $$0, double $$1, double $$2) {
      return new gv(new gu(false, $$0), new gu(false, $$1), new gu(false, $$2));
   }

   public static gv a(ewg $$0) {
      return new gv(new gu(false, (double)$$0.i), new gu(false, (double)$$0.j), new gu(true, 0.0));
   }

   public static gv d() {
      return new gv(new gu(true, 0.0), new gu(true, 0.0), new gu(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
