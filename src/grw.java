public class grw extends gsx<guc, fxv> {
   private static final ali a = ali.b("textures/entity/breeze/breeze_wind.png");
   private final fxv b;

   public grw(gok.a $$0, gqg<guc, fxv> $$1) {
      super($$1);
      this.b = new fxv($$0.a(gbl.C));
   }

   public void a(feb $$0, gih $$1, int $$2, guc $$3, float $$4, float $$5) {
      fef $$6 = $$1.getBuffer(gir.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gnq.a(this.b, this.b.d()).a($$0, $$6, $$2, gxu.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
