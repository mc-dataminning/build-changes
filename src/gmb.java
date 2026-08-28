public class gmb extends gkm<clu, fwt<clu>> {
   private static final akk a = new akk("textures/entity/villager/villager.png");

   public gmb(gjg.a $$0) {
      super($$0, new fwt<>($$0.a(fxh.bP)), 0.5F);
      this.a(new gmx<>(this, $$0.f(), $$0.d()));
      this.a(new god<>(this, $$0.e(), "villager"));
      this.a(new gmw<>(this, $$0.d()));
   }

   public akk a(clu $$0) {
      return a;
   }

   protected void a(clu $$0, fag $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(clu $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
