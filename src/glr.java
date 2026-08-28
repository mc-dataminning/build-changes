public class glr extends gkc<cmj, fwk<cmj>> {
   private static final ale a = new ale("textures/entity/villager/villager.png");

   public glr(giw.a $$0) {
      super($$0, new fwk<>($$0.a(fwy.bP)), 0.5F);
      this.a(new gmn<>(this, $$0.f(), $$0.d()));
      this.a(new gnt<>(this, $$0.e(), "villager"));
      this.a(new gmm<>(this, $$0.d()));
   }

   public ale a(cmj $$0) {
      return a;
   }

   protected void a(cmj $$0, ezx $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmj $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
