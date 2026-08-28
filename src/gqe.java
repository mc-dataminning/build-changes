import java.util.List;

public abstract class gqe implements gqk<dwz> {
   private static final int a = -988212;
   private static final int b = azk.h(16);
   private final fpx c;

   public gqe(gql.a $$0) {
      this.c = $$0.g();
   }

   protected abstract gew a(dym var1, eaa var2);

   protected abstract hiz a(eaa var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fcu c();

   protected abstract void a(fho var1, float var2, dym var3);

   public void a(dwz $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dym $$6 = $$0.m();
      dsa $$7 = (dsa)$$6.b();
      gew $$8 = this.a($$6, $$7.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$7.d(), $$8);
   }

   private void a(dwz $$0, fho $$1, gny $$2, int $$3, int $$4, dym $$5, dsa $$6, eaa $$7, gew $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aw_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.aw_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fho $$0, gny $$1, int $$2, int $$3, eaa $$4, gew $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hiz $$7 = this.a($$4);
      fhs $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(jj $$0, dxa $$1, fho $$2, gny $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayw[] $$10 = $$1.a(fnd.Q().aT(), $$1x -> {
         List<ayw> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? ayw.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         ayw $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fpx.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fho $$0, boolean $$1, fcu $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(jj $$0, int $$1) {
      if ($$1 == cwv.p.g()) {
         return true;
      } else {
         fnd $$2 = fnd.Q();
         gmw $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gG()) {
            return true;
         } else {
            bvs $$4 = $$2.ao();
            return $$4 != null && $$4.g(fcu.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dxa $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cwv.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axu.b($$1) * 0.4);
         int $$4 = (int)((double)axu.c($$1) * 0.4);
         int $$5 = (int)((double)axu.d($$1) * 0.4);
         return axu.a(0, $$3, $$4, $$5);
      }
   }
}
