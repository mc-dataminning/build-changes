public class gaz extends fym<cgm> {
   public static final ahg a = new ahg("textures/entity/trident.png");
   private final fmc f;

   public gaz(fyn.a $$0) {
      super($$0);
      this.f = new fmc($$0.a(fmw.bF));
   }

   public void a(cgm $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(auo.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(auo.i($$2, $$0.O, $$0.dE()) + 90.0F));
      eqf $$6 = fzl.c($$4, this.f.a(this.a($$0)), false, $$0.I());
      this.f.a($$3, $$6, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgm $$0) {
      return a;
   }
}
