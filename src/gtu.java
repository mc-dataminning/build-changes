import java.util.List;

public abstract class gtu implements gua<eac> {
   private static final int a = -988212;
   private static final int b = azz.h(16);
   private final fti c;

   public gtu(gub.a $$0) {
      this.c = $$0.g();
   }

   protected abstract gij a(ebq var1, ede var2);

   protected abstract hmx a(ede var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fgc c();

   protected abstract void a(fld var1, float var2, ebq var3);

   public void a(eac $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      ebq $$7 = $$0.m();
      duy $$8 = (duy)$$7.b();
      gij $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(eac $$0, fld $$1, grn $$2, int $$3, int $$4, ebq $$5, duy $$6, ede $$7, gij $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.ax_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.ax_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fld $$0, grn $$1, int $$2, int $$3, ede $$4, gij $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hmx $$7 = this.a($$4);
      flg $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iw $$0, ead $$1, fld $$2, grn $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azk[] $$10 = $$1.a(fqq.Q().aT(), $$1x -> {
         List<azk> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? azk.a : $$2x.get(0);
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
         azk $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fti.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fld $$0, boolean $$1, fgc $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iw $$0, int $$1) {
      if ($$1 == czi.p.g()) {
         return true;
      } else {
         fqq $$2 = fqq.Q();
         gqm $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gI()) {
            return true;
         } else {
            bxe $$4 = $$2.ao();
            return $$4 != null && $$4.g(fgc.b($$0)) < (double)b;
         }
      }
   }

   public static int a(ead $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == czi.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayh.b($$1) * 0.4);
         int $$4 = (int)((double)ayh.c($$1) * 0.4);
         int $$5 = (int)((double)ayh.d($$1) * 0.4);
         return ayh.a(0, $$3, $$4, $$5);
      }
   }
}
