import java.util.List;

public abstract class gry implements gse<dyl> {
   private static final int a = -988212;
   private static final int b = azm.h(16);
   private final frm c;

   public gry(gsf.a $$0) {
      this.c = $$0.g();
   }

   protected abstract ggm a(dzz var1, ebn var2);

   protected abstract hkw a(ebn var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fei c();

   protected abstract void a(fjc var1, float var2, dzz var3);

   public void a(dyl $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      dzz $$7 = $$0.m();
      dti $$8 = (dti)$$7.b();
      ggm $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(dyl $$0, fjc $$1, gps $$2, int $$3, int $$4, dzz $$5, dti $$6, ebn $$7, ggm $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aw_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.aw_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fjc $$0, gps $$1, int $$2, int $$3, ebn $$4, ggm $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hkw $$7 = this.a($$4);
      fjg $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iu $$0, dym $$1, fjc $$2, gps $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayy[] $$10 = $$1.a(fos.Q().aT(), $$1x -> {
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
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, frm.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fjc $$0, boolean $$1, fei $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iu $$0, int $$1) {
      if ($$1 == cxw.p.g()) {
         return true;
      } else {
         fos $$2 = fos.Q();
         gop $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gG()) {
            return true;
         } else {
            bwd $$4 = $$2.ao();
            return $$4 != null && $$4.g(fei.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dym $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cxw.p.g() && $$0.a()) {
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
