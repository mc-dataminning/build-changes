public class ggf<T extends cfw> extends gfh<T> {
   private static final gnq g = gnq.c("item_frame", "map=false");
   private static final gnq h = gnq.c("item_frame", "map=true");
   private static final gnq i = gnq.c("glow_item_frame", "map=false");
   private static final gnq j = gnq.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final ggg k;
   private final gat l;

   public ggf(gfi.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, ib $$1) {
      return $$0.ai() == bqb.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ih $$6 = $$0.cE();
      esa $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dE()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dC()));
      boolean $$9 = $$0.ce();
      crj $$10 = $$0.E();
      if (!$$9) {
         gnp $$11 = this.l.a().a();
         gnq $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(gao.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gla.d);
         $$3.b();
      }

      if (!$$10.d()) {
         emd $$13 = $$0.G();
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
            emf $$16 = crq.a($$13, $$0.dM());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               fbp.Q().j.k().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, crg.i, $$18, gla.d, $$3, $$4, $$0.dM(), $$0.aj());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ai() == bqb.V ? $$1 : $$2;
   }

   private gnq a(T $$0, crj $$1) {
      boolean $$2 = $$0.ai() == bqb.V;
      if ($$1.a(crm.rT)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public esa a(T $$0, float $$1) {
      return new esa((double)((float)$$0.cE().j() * 0.3F), -0.25, (double)((float)$$0.cE().l() * 0.3F));
   }

   public ajt a(T $$0) {
      return gli.e;
   }

   protected boolean b(T $$0) {
      if (fbp.M() && !$$0.E().d() && $$0.E().b(jp.d) && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bV() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, wg $$1, ewi $$2, fzz $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().w(), $$2, $$3, $$4, $$5);
   }
}
