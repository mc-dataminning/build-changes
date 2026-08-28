public class gxs extends gyt<gzy, gdi> {
   private static final ald a = ald.b("textures/entity/breeze/breeze_wind.png");
   private final gdi b;

   public gxs(guf.a $$0, gwc<gzy, gdi> $$1) {
      super($$1);
      this.b = new gdi($$0.a(ghc.L));
   }

   public void a(fho $$0, gny $$1, int $$2, gzy $$3, float $$4, float $$5) {
      fhs $$6 = $$1.getBuffer(goi.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gtk.a(this.b, this.b.d()).a($$0, $$6, $$2, hgi.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
