public class gjv<T extends cjb> extends gix<T> {
   private static final gri g = gri.c("item_frame", "map=false");
   private static final gri h = gri.c("item_frame", "map=true");
   private static final gri i = gri.c("glow_item_frame", "map=false");
   private static final gri j = gri.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final gjw k;
   private final gej l;

   public gjv(giy.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, iz $$1) {
      return $$0.ak() == btb.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      je $$6 = $$0.cH();
      evs $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dH()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dF()));
      boolean $$9 = $$0.ch();
      cuq $$10 = $$0.E();
      if (!$$9) {
         grh $$11 = this.l.a().a();
         gri $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(gee.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gor.d);
         $$3.b();
      }

      if (!$$10.e()) {
         epj $$13 = $$0.G();
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
            epl $$16 = cuy.a($$13, $$0.dP());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               ffg.Q().j.i().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cun.i, $$18, gor.d, $$3, $$4, $$0.dP(), $$0.al());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ak() == btb.V ? $$1 : $$2;
   }

   private gri a(T $$0, cuq $$1) {
      boolean $$2 = $$0.ak() == btb.V;
      if ($$1.a(cut.rU)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public evs a(T $$0, float $$1) {
      return new evs((double)((float)$$0.cH().j() * 0.3F), -0.25, (double)((float)$$0.cH().l() * 0.3F));
   }

   public alf a(T $$0) {
      return goz.e;
   }

   protected boolean b(T $$0) {
      if (ffg.M() && !$$0.E().e() && $$0.E().b(km.g) && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bY() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, xp $$1, ezz $$2, gdp $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().x(), $$2, $$3, $$4, $$5);
   }
}
