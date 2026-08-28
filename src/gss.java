import java.util.List;

public abstract class gss implements gsy<dza> {
   private static final int a = -988212;
   private static final int b = azm.h(16);
   private final fsf c;

   public gss(gsz.a $$0) {
      this.c = $$0.g();
   }

   protected abstract ghg a(eao var1, ecc var2);

   protected abstract hlq a(ecc var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fex c();

   protected abstract void a(fjy var1, float var2, eao var3);

   public void a(dza $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      eao $$7 = $$0.m();
      dtw $$8 = (dtw)$$7.b();
      ghg $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(dza $$0, fjy $$1, gqm $$2, int $$3, int $$4, eao $$5, dtw $$6, ecc $$7, ghg $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.ax_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.ax_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fjy $$0, gqm $$1, int $$2, int $$3, ecc $$4, ghg $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hlq $$7 = this.a($$4);
      fkc $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iv $$0, dzb $$1, fjy $$2, gqm $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayy[] $$10 = $$1.a(fpo.Q().aT(), $$1x -> {
         List<ayy> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? ayy.a : $$2x.get(0);
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
         ayy $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fsf.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fjy $$0, boolean $$1, fex $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iv $$0, int $$1) {
      if ($$1 == cyi.p.g()) {
         return true;
      } else {
         fpo $$2 = fpo.Q();
         gpj $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gG()) {
            return true;
         } else {
            bwi $$4 = $$2.ao();
            return $$4 != null && $$4.g(fex.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dzb $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cyi.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axw.b($$1) * 0.4);
         int $$4 = (int)((double)axw.c($$1) * 0.4);
         int $$5 = (int)((double)axw.d($$1) * 0.4);
         return axw.a(0, $$3, $$4, $$5);
      }
   }
}
