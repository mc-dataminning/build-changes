public class gvs extends gwu<gxz, gbm> {
   private static final akv a = akv.b("textures/entity/breeze/breeze_wind.png");
   private final gbm b;

   public gvs(gsf.a $$0, guc<gxz, gbm> $$1) {
      super($$1);
      this.b = new gbm($$0.a(gfd.L));
   }

   public void a(ffv $$0, glz $$1, int $$2, gxz $$3, float $$4, float $$5) {
      ffz $$6 = $$1.getBuffer(gmj.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      grk.a(this.b, this.b.d()).a($$0, $$6, $$2, hej.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
