public class gvb extends gsa<cqe, gyh> {
   private static final aku a = aku.b("textures/entity/projectiles/wind_charge.png");
   private final gem b;

   public gvb(gsb.a $$0) {
      super($$0);
      this.b = new gem($$0.a(gez.dy));
   }

   @Override
   public void a(gyh $$0, ffs $$1, glv $$2, int $$3) {
      ffw $$4 = $$2.getBuffer(gmf.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hec.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gyh d() {
      return new gyh();
   }
}
