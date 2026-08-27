public class fvi extends ftu<cba, fgz<cba>> {
   private static final aer a = new aer("textures/entity/villager/villager.png");

   public fvi(fso.a $$0) {
      super($$0, new fgz<>($$0.a(fhm.bJ)), 0.5F);
      this.a(new fwb<>(this, $$0.f(), $$0.d()));
      this.a(new fxh<>(this, $$0.e(), "villager"));
      this.a(new fwa<>(this, $$0.d()));
   }

   public aer a(cba $$0) {
      return a;
   }

   protected void a(cba $$0, elg $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.i_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
