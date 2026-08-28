public class gkr extends glp<cfo, fvm<cfo>> {
   private static final akr a = akr.b("textures/entity/fox/fox.png");
   private static final akr i = akr.b("textures/entity/fox/fox_sleep.png");
   private static final akr j = akr.b("textures/entity/fox/snow_fox.png");
   private static final akr k = akr.b("textures/entity/fox/snow_fox_sleep.png");

   public gkr(gkj.a $$0) {
      super($$0, new fvm<>($$0.a(fyj.ae)), 0.4F);
      this.a(new goi(this, $$0.d()));
   }

   protected void a(cfo $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl() || $$0.gk()) {
         float $$6 = -ayo.i($$4, $$0.P, $$0.dG());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akr a(cfo $$0) {
      if ($$0.t() == cfo.v.a) {
         return $$0.fH() ? i : a;
      } else {
         return $$0.fH() ? k : j;
      }
   }
}
