public class glq extends gkb<cmi, fwj<cmi>> {
   private static final ale a = new ale("textures/entity/villager/villager.png");

   public glq(giv.a $$0) {
      super($$0, new fwj<>($$0.a(fwx.bP)), 0.5F);
      this.a(new gmm<>(this, $$0.f(), $$0.d()));
      this.a(new gns<>(this, $$0.e(), "villager"));
      this.a(new gml<>(this, $$0.d()));
   }

   public ale a(cmi $$0) {
      return a;
   }

   protected void a(cmi $$0, ezw $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmi $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
