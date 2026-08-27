public class gib extends giz<ceq, fsy<ceq>> {
   private static final akn a = new akn("textures/entity/fox/fox.png");
   private static final akn i = new akn("textures/entity/fox/fox_sleep.png");
   private static final akn j = new akn("textures/entity/fox/snow_fox.png");
   private static final akn k = new akn("textures/entity/fox/snow_fox_sleep.png");

   public gib(ght.a $$0) {
      super($$0, new fsy<>($$0.a(fvv.ad)), 0.4F);
      this.a(new gls(this, $$0.d()));
   }

   protected void a(ceq $$0, eyu $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gv() || $$0.gp()) {
         float $$6 = -ayf.i($$4, $$0.P, $$0.dH());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akn a(ceq $$0) {
      if ($$0.u() == ceq.v.a) {
         return $$0.fL() ? i : a;
      } else {
         return $$0.fL() ? k : j;
      }
   }
}
