import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gu implements gn {
   private final gt a;
   private final gt b;
   private final gt c;

   public gu(gt $$0, gt $$1, gt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evs a(ep $$0) {
      evs $$1 = $$0.d();
      return new evs(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public evr b(ep $$0) {
      evr $$1 = $$0.k();
      return new evr((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gu $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gu a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gt $$2 = gt.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gt $$3 = gt.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gt $$4 = gt.a($$0);
            return new gu($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gs.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gs.a.createWithContext($$0);
      }
   }

   public static gu a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gt $$3 = gt.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gt $$4 = gt.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gt $$5 = gt.a($$0, $$1);
            return new gu($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gs.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gs.a.createWithContext($$0);
      }
   }

   public static gu a(double $$0, double $$1, double $$2) {
      return new gu(new gt(false, $$0), new gt(false, $$1), new gt(false, $$2));
   }

   public static gu a(evr $$0) {
      return new gu(new gt(false, (double)$$0.i), new gt(false, (double)$$0.j), new gt(true, 0.0));
   }

   public static gu d() {
      return new gu(new gt(true, 0.0), new gt(true, 0.0), new gt(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
