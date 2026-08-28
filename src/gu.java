import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class gu implements gt {
   public static final char a = '^';
   private final double b;
   private final double c;
   private final double d;

   public gu(double $$0, double $$1, double $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ezh a(ev $$0, boolean $$1) {
      ezg $$2 = $$0.k();
      ezh $$3 = $$0.m().a($$0);
      float $$4 = azj.b(($$2.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$5 = azj.a(($$2.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$6 = azj.b(-$$2.i * (float) (Math.PI / 180.0));
      float $$7 = azj.a(-$$2.i * (float) (Math.PI / 180.0));
      float $$8 = azj.b((-$$2.i + 90.0F) * (float) (Math.PI / 180.0));
      float $$9 = azj.a((-$$2.i + 90.0F) * (float) (Math.PI / 180.0));
      ezh $$10 = new ezh((double)($$4 * $$6), (double)$$7, (double)($$5 * $$6));
      ezh $$11 = new ezh((double)($$4 * $$8), (double)$$9, (double)($$5 * $$8));
      ezh $$12 = $$10.c($$11).c(-1.0);
      double $$13 = $$10.d * this.d + $$11.d * this.c + $$12.d * this.b;
      double $$14 = $$10.e * this.d + $$11.e * this.c + $$12.e * this.b;
      double $$15 = $$10.f * this.d + $$11.f * this.c + $$12.f * this.b;
      double $$16 = $$1 ? 0.0 : $$3.d;
      double $$17 = $$1 ? 0.0 : $$3.e;
      double $$18 = $$1 ? 0.0 : $$3.f;
      return new ezh($$16 + $$13, $$17 + $$14, $$18 + $$15);
   }

   @Override
   public ezg b(ev $$0, boolean $$1) {
      return !$$1 ? ezg.a : new ezg(this.a() ? -$$0.k().i : 0.0F, this.b() ? -$$0.k().j : 0.0F);
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

   public static gu a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      double $$2 = a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         double $$3 = a($$0, $$1);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            double $$4 = a($$0, $$1);
            return new gu($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gy.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gy.a.createWithContext($$0);
      }
   }

   private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw gz.a.createWithContext($$0);
      } else if ($$0.peek() != '^') {
         $$0.setCursor($$1);
         throw gy.b.createWithContext($$0);
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
         return !($$0 instanceof gu $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c, this.d);
   }
}
