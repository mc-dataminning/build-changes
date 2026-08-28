public class gxv extends gue<cog, hdp, ghi> {
   private static final ale a = ale.b("textures/entity/strider/strider.png");
   private static final ale j = ale.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gxv(gvk.a $$0) {
      super($$0, new ghi($$0.a(gif.dp)), new ghi($$0.a(gif.dr)), 0.5F);
      this.a(new haa<>(this, $$0.h(), hkf.d.h, $$0x -> $$0x.a, new ghi($$0.a(gif.dq)), new ghi($$0.a(gif.ds))));
   }

   public ale a(hdp $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hdp $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hdp b() {
      return new hdp();
   }

   public void a(cog $$0, hdp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwk.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.ca();
   }

   protected boolean c(hdp $$0) {
      return super.a($$0) || $$0.b;
   }
}
