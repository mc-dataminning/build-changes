import java.util.List;

public abstract class goe implements gok<dvm> {
   private static final int a = -988212;
   private static final int b = ayz.h(16);
   private final foc c;

   public goe(gol.a $$0) {
      this.c = $$0.g();
   }

   protected abstract gcw a(dwx var1, dyj var2);

   protected abstract hgz a(dyj var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fba c();

   protected abstract void a(ffu var1, float var2, dwx var3);

   public void a(dvm $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      dwx $$6 = $$0.m();
      dqr $$7 = (dqr)$$6.b();
      gcw $$8 = this.a($$6, $$7.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$7.d(), $$8);
   }

   private void a(dvm $$0, ffu $$1, gly $$2, int $$3, int $$4, dwx $$5, dqr $$6, dyj $$7, gcw $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   protected void a(ffu $$0, gly $$1, int $$2, int $$3, dyj $$4, gcw $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hgz $$7 = this.a($$4);
      ffy $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(ji $$0, dvn $$1, ffu $$2, gly $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayl[] $$10 = $$1.a(flj.Q().aT(), $$1x -> {
         List<ayl> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? ayl.a : $$2x.get(0);
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
         ayl $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, foc.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ffu $$0, boolean $$1, fba $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(ji $$0, int $$1) {
      if ($$1 == cvm.p.g()) {
         return true;
      } else {
         flj $$2 = flj.Q();
         gkw $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bul $$4 = $$2.ao();
            return $$4 != null && $$4.g(fba.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dvn $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cvm.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axk.b($$1) * 0.4);
         int $$4 = (int)((double)axk.c($$1) * 0.4);
         int $$5 = (int)((double)axk.d($$1) * 0.4);
         return axk.a(0, $$3, $$4, $$5);
      }
   }
}
