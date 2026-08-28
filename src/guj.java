import java.util.List;

public abstract class guj implements gup<dzs> {
   private static final int a = -988212;
   private static final int b = azq.h(16);
   private final ftx c;

   public guj(guq.a $$0) {
      this.c = $$0.g();
   }

   protected abstract giy a(ebg var1, ecu var2);

   protected abstract hnj a(ecu var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract ffs c();

   protected abstract void a(flq var1, float var2, ebg var3);

   public void a(dzs $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      ebg $$7 = $$0.m();
      duo $$8 = (duo)$$7.b();
      giy $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(dzs $$0, flq $$1, gsc $$2, int $$3, int $$4, ebg $$5, duo $$6, ecu $$7, giy $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(flq $$0, gsc $$1, int $$2, int $$3, ecu $$4, giy $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hnj $$7 = this.a($$4);
      flt $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iw $$0, dzt $$1, flq $$2, gsc $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azc[] $$10 = $$1.a(frf.Q().aT(), $$1x -> {
         List<azc> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? azc.a : $$2x.get(0);
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
         azc $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ftx.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(flq $$0, boolean $$1, ffs $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iw $$0, int $$1) {
      if ($$1 == cyy.p.g()) {
         return true;
      } else {
         frf $$2 = frf.Q();
         grb $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bwv $$4 = $$2.ao();
            return $$4 != null && $$4.g(ffs.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dzt $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cyy.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)aya.b($$1) * 0.4);
         int $$4 = (int)((double)aya.c($$1) * 0.4);
         int $$5 = (int)((double)aya.d($$1) * 0.4);
         return aya.a(0, $$3, $$4, $$5);
      }
   }
}
