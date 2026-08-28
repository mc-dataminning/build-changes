public class gkl extends glj<cfm, fvg<cfm>> {
   private static final akq a = akq.b("textures/entity/fox/fox.png");
   private static final akq i = akq.b("textures/entity/fox/fox_sleep.png");
   private static final akq j = akq.b("textures/entity/fox/snow_fox.png");
   private static final akq k = akq.b("textures/entity/fox/snow_fox_sleep.png");

   public gkl(gkd.a $$0) {
      super($$0, new fvg<>($$0.a(fyd.ae)), 0.4F);
      this.a(new goc(this, $$0.d()));
   }

   protected void a(cfm $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gn() || $$0.gm()) {
         float $$6 = -ayn.i($$4, $$0.P, $$0.dI());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akq a(cfm $$0) {
      if ($$0.t() == cfm.v.a) {
         return $$0.fI() ? i : a;
      } else {
         return $$0.fI() ? k : j;
      }
   }
}
