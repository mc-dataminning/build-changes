public class gwq extends gxs<gyx, gcj> {
   private static final aku a = aku.b("textures/entity/breeze/breeze_wind.png");
   private final gcj b;

   public gwq(gtd.a $$0, gva<gyx, gcj> $$1) {
      super($$1);
      this.b = new gcj($$0.a(ggb.L));
   }

   public void a(fgr $$0, gmx $$1, int $$2, gyx $$3, float $$4, float $$5) {
      fgv $$6 = $$1.getBuffer(gnh.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gsi.a(this.b, this.b.d()).a($$0, $$6, $$2, hfh.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
