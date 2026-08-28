public class gjx extends gix<cjc> {
   private static final alf a = new alf("textures/entity/lead_knot.png");
   private final fus<cjc> f;

   public gjx(giy.a $$0) {
      super($$0);
      this.f = new fus<>($$0.a(fxa.aw));
   }

   public void a(cjc $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fad $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cjc $$0) {
      return a;
   }
}
