public class gdv<T extends cew> extends gcx<T> {
   private static final glg g = glg.c("item_frame", "map=false");
   private static final glg h = glg.c("item_frame", "map=true");
   private static final glg i = glg.c("glow_item_frame", "map=false");
   private static final glg j = glg.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final gdw k;
   private final fyk l;

   public gdv(gcy.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, ib $$1) {
      return $$0.ai() == bpc.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ih $$6 = $$0.cE();
      epr $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dE()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dC()));
      boolean $$9 = $$0.ce();
      cqk $$10 = $$0.E();
      if (!$$9) {
         glf $$11 = this.l.a().a();
         glg $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fyf.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, giq.d);
         $$3.b();
      }

      if (!$$10.b()) {
         ejw $$13 = $$0.G();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13 != null ? $$0.I() % 4 * 2 : $$0.I();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13 != null) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            ejy $$16 = cqr.a($$13, $$0.dM());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               ezg.Q().j.j().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cqh.i, $$18, giq.d, $$3, $$4, $$0.dM(), $$0.aj());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ai() == bpc.V ? $$1 : $$2;
   }

   private glg a(T $$0, cqk $$1) {
      boolean $$2 = $$0.ai() == bpc.V;
      if ($$1.a(cqn.rT)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public epr a(T $$0, float $$1) {
      return new epr((double)((float)$$0.cE().j() * 0.3F), -0.25, (double)((float)$$0.cE().l() * 0.3F));
   }

   public ajh a(T $$0) {
      return giy.e;
   }

   protected boolean b(T $$0) {
      if (ezg.M() && !$$0.E().b() && $$0.E().B() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bV() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, vu $$1, etz $$2, fxq $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().z(), $$2, $$3, $$4, $$5);
   }
}
