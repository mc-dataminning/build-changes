public class gll extends gix<cod> {
   public static final alf a = new alf("textures/entity/trident.png");
   private final fwg f;

   public gll(giy.a $$0) {
      super($$0);
      this.f = new fwg($$0.a(fxa.bI));
   }

   public void a(cod $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayz.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayz.i($$2, $$0.P, $$0.dH()) + 90.0F));
      fad $$6 = gjw.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cod $$0) {
      return a;
   }
}
