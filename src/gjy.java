public class gjy extends giy<cjd> {
   private static final alf a = new alf("textures/entity/lead_knot.png");
   private final fut<cjd> f;

   public gjy(giz.a $$0) {
      super($$0);
      this.f = new fut<>($$0.a(fxb.aw));
   }

   public void a(cjd $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fae $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cjd $$0) {
      return a;
   }
}
