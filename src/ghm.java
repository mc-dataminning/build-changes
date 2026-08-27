public class ghm extends ggm<cgp> {
   private static final akf a = new akf("textures/entity/lead_knot.png");
   private final fsi<cgp> f;

   public ghm(ggn.a $$0) {
      super($$0);
      this.f = new fsi<>($$0.a(fuq.aw));
   }

   public void a(cgp $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      exr $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(cgp $$0) {
      return a;
   }
}
