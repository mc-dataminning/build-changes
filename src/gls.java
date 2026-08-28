public class gls extends gkd<cmk, fwl<cmk>> {
   private static final alf a = new alf("textures/entity/villager/villager.png");

   public gls(gix.a $$0) {
      super($$0, new fwl<>($$0.a(fwz.bP)), 0.5F);
      this.a(new gmo<>(this, $$0.f(), $$0.d()));
      this.a(new gnu<>(this, $$0.e(), "villager"));
      this.a(new gmn<>(this, $$0.d()));
   }

   public alf a(cmk $$0) {
      return a;
   }

   protected void a(cmk $$0, ezy $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmk $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
