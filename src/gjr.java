public class gjr extends gid<cku, fum<cku>> {
   private static final akh a = new akh("textures/entity/villager/villager.png");

   public gjr(ggx.a $$0) {
      super($$0, new fum<>($$0.a(fva.bP)), 0.5F);
      this.a(new gkn<>(this, $$0.f(), $$0.d()));
      this.a(new glt<>(this, $$0.e(), "villager"));
      this.a(new gkm<>(this, $$0.d()));
   }

   public akh a(cku $$0) {
      return a;
   }

   protected void a(cku $$0, exx $$1, float $$2) {
      float $$3 = 0.9375F * $$0.eb();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cku $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
