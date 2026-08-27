public class gib extends giz<ceo, fsy<ceo>> {
   private static final akm a = new akm("textures/entity/fox/fox.png");
   private static final akm i = new akm("textures/entity/fox/fox_sleep.png");
   private static final akm j = new akm("textures/entity/fox/snow_fox.png");
   private static final akm k = new akm("textures/entity/fox/snow_fox_sleep.png");

   public gib(ght.a $$0) {
      super($$0, new fsy<>($$0.a(fvv.ad)), 0.4F);
      this.a(new gls(this, $$0.d()));
   }

   protected void a(ceo $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gv() || $$0.gp()) {
         float $$6 = -ayd.i($$4, $$0.P, $$0.dH());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akm a(ceo $$0) {
      if ($$0.u() == ceo.v.a) {
         return $$0.fL() ? i : a;
      } else {
         return $$0.fL() ? k : j;
      }
   }
}
