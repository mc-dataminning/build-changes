public class gjw extends giw<cjb> {
   private static final alf a = new alf("textures/entity/lead_knot.png");
   private final fur<cjb> f;

   public gjw(gix.a $$0) {
      super($$0);
      this.f = new fur<>($$0.a(fwz.aw));
   }

   public void a(cjb $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fac $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cjb $$0) {
      return a;
   }
}
