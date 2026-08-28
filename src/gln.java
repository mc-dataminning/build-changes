public class gln extends gjy<cmf, fwg<cmf>> {
   private static final alb a = new alb("textures/entity/villager/villager.png");

   public gln(gis.a $$0) {
      super($$0, new fwg<>($$0.a(fwu.bP)), 0.5F);
      this.a(new gmj<>(this, $$0.f(), $$0.d()));
      this.a(new gnp<>(this, $$0.e(), "villager"));
      this.a(new gmi<>(this, $$0.d()));
   }

   public alb a(cmf $$0) {
      return a;
   }

   protected void a(cmf $$0, ezt $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ed();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cmf $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
