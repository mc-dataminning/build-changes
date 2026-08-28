public class gvf extends gse<cqh, gyl> {
   private static final akv a = akv.b("textures/entity/projectiles/wind_charge.png");
   private final geq b;

   public gvf(gsf.a $$0) {
      super($$0);
      this.b = new geq($$0.a(gfd.dy));
   }

   @Override
   public void a(gyl $$0, ffv $$1, glz $$2, int $$3) {
      ffz $$4 = $$2.getBuffer(gmj.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hej.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gyl d() {
      return new gyl();
   }
}
