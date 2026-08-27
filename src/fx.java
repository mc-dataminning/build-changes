import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fx implements fq {
   private final fw a;
   private final fw b;
   private final fw c;

   public fx(fw $$0, fw $$1, fw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esa a(du $$0) {
      esa $$1 = $$0.d();
      return new esa(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public erz b(du $$0) {
      erz $$1 = $$0.k();
      return new erz((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof fx $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static fx a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fw $$2 = fw.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fw $$3 = fw.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fw $$4 = fw.a($$0);
            return new fx($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fv.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fv.a.createWithContext($$0);
      }
   }

   public static fx a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fw $$3 = fw.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fw $$4 = fw.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fw $$5 = fw.a($$0, $$1);
            return new fx($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fv.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fv.a.createWithContext($$0);
      }
   }

   public static fx a(double $$0, double $$1, double $$2) {
      return new fx(new fw(false, $$0), new fw(false, $$1), new fw(false, $$2));
   }

   public static fx a(erz $$0) {
      return new fx(new fw(false, (double)$$0.i), new fw(false, (double)$$0.j), new fw(true, 0.0));
   }

   public static fx d() {
      return new fx(new fw(true, 0.0), new fw(true, 0.0), new fw(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
