public class gju<T extends cja> extends giw<T> {
   private static final grh g = grh.c("item_frame", "map=false");
   private static final grh h = grh.c("item_frame", "map=true");
   private static final grh i = grh.c("glow_item_frame", "map=false");
   private static final grh j = grh.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final gjv k;
   private final gei l;

   public gju(gix.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, iz $$1) {
      return $$0.ak() == bta.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      je $$6 = $$0.cH();
      evr $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dH()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dF()));
      boolean $$9 = $$0.ch();
      cup $$10 = $$0.E();
      if (!$$9) {
         grg $$11 = this.l.a().a();
         grh $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(ged.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, goq.d);
         $$3.b();
      }

      if (!$$10.e()) {
         epi $$13 = $$0.G();
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
            epk $$16 = cux.a($$13, $$0.dP());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               fff.Q().j.i().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cum.i, $$18, goq.d, $$3, $$4, $$0.dP(), $$0.al());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ak() == bta.V ? $$1 : $$2;
   }

   private grh a(T $$0, cup $$1) {
      boolean $$2 = $$0.ak() == bta.V;
      if ($$1.a(cus.rU)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public evr a(T $$0, float $$1) {
      return new evr((double)((float)$$0.cH().j() * 0.3F), -0.25, (double)((float)$$0.cH().l() * 0.3F));
   }

   public alf a(T $$0) {
      return goy.e;
   }

   protected boolean b(T $$0) {
      if (fff.M() && !$$0.E().e() && $$0.E().b(km.g) && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bY() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, xp $$1, ezy $$2, gdo $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().x(), $$2, $$3, $$4, $$5);
   }
}
