public class gko extends giz<cll, fvh<cll>> {
   private static final akn a = new akn("textures/entity/villager/villager.png");

   public gko(ght.a $$0) {
      super($$0, new fvh<>($$0.a(fvv.bP)), 0.5F);
      this.a(new glk<>(this, $$0.f(), $$0.d()));
      this.a(new gmq<>(this, $$0.e(), "villager"));
      this.a(new glj<>(this, $$0.d()));
   }

   public akn a(cll $$0) {
      return a;
   }

   protected void a(cll $$0, eyu $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cll $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
