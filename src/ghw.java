public class ghw extends ggw<chl> {
   private static final akh a = new akh("textures/entity/lead_knot.png");
   private final fss<chl> f;

   public ghw(ggx.a $$0) {
      super($$0);
      this.f = new fss<>($$0.a(fva.aw));
   }

   public void a(chl $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eyb $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(chl $$0) {
      return a;
   }
}
