public class gsx extends gty<gvd, fyu> {
   private static final alj a = alj.b("textures/entity/breeze/breeze_wind.png");
   private final fyu b;

   public gsx(gpk.a $$0, grh<gvd, fyu> $$1) {
      super($$1);
      this.b = new fyu($$0.a(gck.I));
   }

   public void a(fer $$0, gjg $$1, int $$2, gvd $$3, float $$4, float $$5) {
      fev $$6 = $$1.getBuffer(gjq.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      goq.a(this.b, this.b.d()).a($$0, $$6, $$2, gyv.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
