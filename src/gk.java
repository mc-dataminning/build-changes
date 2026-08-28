import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class gk implements gj {
   public static final char a = '^';
   private final double b;
   private final double c;
   private final double d;

   public gk(double $$0, double $$1, double $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ffs a(ek $$0) {
      ffr $$1 = $$0.k();
      ffs $$2 = $$0.m().a($$0);
      float $$3 = azq.b(($$1.k + 90.0F) * (float) (Math.PI / 180.0));
      float $$4 = azq.a(($$1.k + 90.0F) * (float) (Math.PI / 180.0));
      float $$5 = azq.b(-$$1.j * (float) (Math.PI / 180.0));
      float $$6 = azq.a(-$$1.j * (float) (Math.PI / 180.0));
      float $$7 = azq.b((-$$1.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$8 = azq.a((-$$1.j + 90.0F) * (float) (Math.PI / 180.0));
      ffs $$9 = new ffs((double)($$3 * $$5), (double)$$6, (double)($$4 * $$5));
      ffs $$10 = new ffs((double)($$3 * $$7), (double)$$8, (double)($$4 * $$7));
      ffs $$11 = $$9.c($$10).c(-1.0);
      double $$12 = $$9.d * this.d + $$10.d * this.c + $$11.d * this.b;
      double $$13 = $$9.e * this.d + $$10.e * this.c + $$11.e * this.b;
      double $$14 = $$9.f * this.d + $$10.f * this.c + $$11.f * this.b;
      return new ffs($$2.d + $$12, $$2.e + $$13, $$2.f + $$14);
   }

   @Override
   public ffr b(ek $$0) {
      return ffr.a;
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

   public static gk a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      double $$2 = a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         double $$3 = a($$0, $$1);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            double $$4 = a($$0, $$1);
            return new gk($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw go.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw go.a.createWithContext($$0);
      }
   }

   private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw gp.a.createWithContext($$0);
      } else if ($$0.peek() != '^') {
         $$0.setCursor($$1);
         throw go.b.createWithContext($$0);
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
         return !($$0 instanceof gk $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c, this.d);
   }
}
