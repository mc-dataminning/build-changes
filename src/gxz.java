public class gxz extends gxe<cjz, hem, ghv> {
   private static final alk a = alk.b("textures/entity/dolphin.png");

   public gxz(gyk.a $$0) {
      super($$0, new ghv($$0.a(glf.ax)), new ghv($$0.a(glf.ay)), 0.7F);
      this.a(new hcf(this));
   }

   public alk a(hem $$0) {
      return a;
   }

   public hem a() {
      return new hem();
   }

   public void a(cjz $$0, hem $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfg.a($$0, $$1, this.h);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}
