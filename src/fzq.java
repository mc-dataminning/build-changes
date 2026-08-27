public class fzq extends fym<cfz> {
   private static final ahg a = new ahg("textures/entity/llama/spit.png");
   private final fkr<cfz> f;

   public fzq(fyn.a $$0) {
      super($$0);
      this.f = new fkr<>($$0.a(fmw.aw));
   }

   public void a(cfz $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(auo.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(auo.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eqf $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cfz $$0) {
      return a;
   }
}
