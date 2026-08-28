public class gla<T extends ciy> extends gkc<T> {
   private static final gsn g = gsn.d("item_frame", "map=false");
   private static final gsn h = gsn.d("item_frame", "map=true");
   private static final gsn i = gsn.d("glow_item_frame", "map=false");
   private static final gsn j = gsn.d("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final glb k;
   private final gfn l;

   public gla(gkd.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, jd $$1) {
      return $$0.am() == bsw.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ji $$6 = $$0.cI();
      eww $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dI()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dG()));
      boolean $$9 = $$0.ci();
      cuo $$10 = $$0.D();
      if (!$$9) {
         gsm $$11 = this.l.a().a();
         gsn $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(gfi.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gpw.d);
         $$3.b();
      }

      if (!$$10.e()) {
         eql $$13 = $$0.E();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13 != null ? $$0.H() % 4 * 2 : $$0.H();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13 != null) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            eqn $$16 = cva.a($$13, $$0.dQ());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               fgi.Q().j.i().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cul.i, $$18, gpw.d, $$3, $$4, $$0.dQ(), $$0.an());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.am() == bsw.V ? $$1 : $$2;
   }

   private gsn a(T $$0, cuo $$1) {
      boolean $$2 = $$0.am() == bsw.V;
      if ($$1.a(cur.rU)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public eww a(T $$0, float $$1) {
      return new eww((double)((float)$$0.cI().j() * 0.3F), -0.25, (double)((float)$$0.cI().l() * 0.3F));
   }

   public akq a(T $$0) {
      return gqe.e;
   }

   protected boolean b(T $$0) {
      if (fgi.M() && !$$0.D().e() && $$0.D().b(kq.g) && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bZ() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, wy $$1, fbc $$2, get $$3, int $$4, float $$5) {
      super.a($$0, $$0.D().w(), $$2, $$3, $$4, $$5);
   }
}
