public class gmh extends gks<clx, fwz<clx>> {
   private static final akk a = new akk("textures/entity/villager/villager.png");

   public gmh(gjm.a $$0) {
      super($$0, new fwz<>($$0.a(fxn.bP)), 0.5F);
      this.a(new gnd<>(this, $$0.f(), $$0.d()));
      this.a(new goj<>(this, $$0.e(), "villager"));
      this.a(new gnc<>(this, $$0.d()));
   }

   public akk a(clx $$0) {
      return a;
   }

   protected void a(clx $$0, fam $$1, float $$2) {
      float $$3 = 0.9375F * $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(clx $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
