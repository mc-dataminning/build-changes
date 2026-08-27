import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class ga implements fz {
   public static final char a = '^';
   private final double b;
   private final double c;
   private final double d;

   public ga(double $$0, double $$1, double $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public etf a(ec $$0) {
      ete $$1 = $$0.k();
      etf $$2 = $$0.m().a($$0);
      float $$3 = axw.b(($$1.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$4 = axw.a(($$1.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$5 = axw.b(-$$1.i * (float) (Math.PI / 180.0));
      float $$6 = axw.a(-$$1.i * (float) (Math.PI / 180.0));
      float $$7 = axw.b((-$$1.i + 90.0F) * (float) (Math.PI / 180.0));
      float $$8 = axw.a((-$$1.i + 90.0F) * (float) (Math.PI / 180.0));
      etf $$9 = new etf((double)($$3 * $$5), (double)$$6, (double)($$4 * $$5));
      etf $$10 = new etf((double)($$3 * $$7), (double)$$8, (double)($$4 * $$7));
      etf $$11 = $$9.c($$10).a(-1.0);
      double $$12 = $$9.c * this.d + $$10.c * this.c + $$11.c * this.b;
      double $$13 = $$9.d * this.d + $$10.d * this.c + $$11.d * this.b;
      double $$14 = $$9.e * this.d + $$10.e * this.c + $$11.e * this.b;
      return new etf($$2.c + $$12, $$2.d + $$13, $$2.e + $$14);
   }

   @Override
   public ete b(ec $$0) {
      return ete.a;
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean c() {
      return true;
   }

   public static ga a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      double $$2 = a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         double $$3 = a($$0, $$1);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            double $$4 = a($$0, $$1);
            return new ga($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw ge.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw ge.a.createWithContext($$0);
      }
   }

   private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw gf.a.createWithContext($$0);
      } else if ($$0.peek() != '^') {
         $$0.setCursor($$1);
         throw ge.b.createWithContext($$0);
      } else {
         $$0.skip();
         return $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ga $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c, this.d);
   }
}
