public class glg<T extends cja> extends gki<T> {
   private static final gsu h = gsu.a("item_frame", "map=false");
   private static final gsu i = gsu.a("item_frame", "map=true");
   private static final gsu j = gsu.a("glow_item_frame", "map=false");
   private static final gsu k = gsu.a("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int g = 30;
   private final glh l;
   private final gft m;

   public glg(gkj.a $$0) {
      super($$0);
      this.l = $$0.b();
      this.m = $$0.c();
   }

   protected int a(T $$0, jd $$1) {
      return $$0.am() == bsx.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ji $$6 = $$0.cH();
      exc $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dG()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dE()));
      boolean $$9 = $$0.ci();
      cuq $$10 = $$0.D();
      if (!$$9) {
         gst $$11 = this.m.a().a();
         gsu $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.m.b().a($$3.c(), $$4.getBuffer(gfo.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gqc.d);
         $$3.b();
      }

      if (!$$10.e()) {
         eqr $$13 = $$0.a($$10);
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13 != null ? $$0.F() % 4 * 2 : $$0.F();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13 != null) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            eqt $$16 = cvc.a($$13, $$0.dO());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               fgo.Q().j.i().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.l.a($$10, cun.i, $$18, gqc.d, $$3, $$4, $$0.dO(), $$0.an());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.am() == bsx.V ? $$1 : $$2;
   }

   private gsu a(T $$0, cuq $$1) {
      boolean $$2 = $$0.am() == bsx.V;
      if ($$1.a(cut.rU)) {
         return $$2 ? k : i;
      } else {
         return $$2 ? j : h;
      }
   }

   public exc a(T $$0, float $$1) {
      return new exc((double)((float)$$0.cH().j() * 0.3F), -0.25, (double)((float)$$0.cH().l() * 0.3F));
   }

   public akr a(T $$0) {
      return gqk.e;
   }

   protected boolean b(T $$0) {
      if (fgo.M() && !$$0.D().e() && $$0.D().b(kq.g) && this.d.c == $$0) {
         double $$1 = this.d.b($$0);
         float $$2 = $$0.bZ() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, wz $$1, fbi $$2, gez $$3, int $$4, float $$5) {
      super.a($$0, $$0.D().w(), $$2, $$3, $$4, $$5);
   }
}
