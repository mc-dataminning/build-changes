public class gsd implements grp<dya> {
   private final gsd.a a;

   public gsd(grq.a $$0) {
      this($$0.f());
   }

   public gsd(gic $$0) {
      this.a = new gsd.a($$0.a(gif.cP));
   }

   public void a(dya $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      ja $$6 = $$0.m().a(dsz.c, ja.b);
      cxq $$7 = $$0.s();
      hkg $$8;
      if ($$7 == null) {
         $$8 = gpy.s;
      } else {
         $$8 = gpy.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(fiq $$0, gpd $$1, int $$2, int $$3, ja $$4, float $$5, hkg $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fiu $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gfz {
      private final gig a;

      public a(gig $$0) {
         super($$0, gpn::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
