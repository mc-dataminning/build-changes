public class gvo extends gwq<gxv, gbi> {
   private static final aku a = aku.b("textures/entity/breeze/breeze_wind.png");
   private final gbi b;

   public gvo(gsb.a $$0, gty<gxv, gbi> $$1) {
      super($$1);
      this.b = new gbi($$0.a(gez.L));
   }

   public void a(ffs $$0, glv $$1, int $$2, gxv $$3, float $$4, float $$5) {
      ffw $$6 = $$1.getBuffer(gmf.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      grg.a(this.b, this.b.d()).a($$0, $$6, $$2, hec.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
