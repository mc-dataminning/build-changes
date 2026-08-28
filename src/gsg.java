import java.util.List;

public abstract class gsg implements gsm<dyt> {
   private static final int a = -988212;
   private static final int b = azm.h(16);
   private final frt c;

   public gsg(gsn.a $$0) {
      this.c = $$0.g();
   }

   protected abstract ggu a(eah var1, ebv var2);

   protected abstract hle a(ebv var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract feq c();

   protected abstract void a(fjj var1, float var2, eah var3);

   public void a(dyt $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      eah $$7 = $$0.m();
      dtp $$8 = (dtp)$$7.b();
      ggu $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(dyt $$0, fjj $$1, gqa $$2, int $$3, int $$4, eah $$5, dtp $$6, ebv $$7, ggu $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.ax_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.ax_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fjj $$0, gqa $$1, int $$2, int $$3, ebv $$4, ggu $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hle $$7 = this.a($$4);
      fjn $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iu $$0, dyu $$1, fjj $$2, gqa $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayy[] $$10 = $$1.a(foz.Q().aT(), $$1x -> {
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
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, frt.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fjj $$0, boolean $$1, feq $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iu $$0, int $$1) {
      if ($$1 == cyb.p.g()) {
         return true;
      } else {
         foz $$2 = foz.Q();
         gox $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bwf $$4 = $$2.ao();
            return $$4 != null && $$4.g(feq.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dyu $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cyb.p.g() && $$0.a()) {
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
