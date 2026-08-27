public class fzp extends fyl<cfy> {
   private static final ahg a = new ahg("textures/entity/llama/spit.png");
   private final fkq<cfy> f;

   public fzp(fym.a $$0) {
      super($$0);
      this.f = new fkq<>($$0.a(fmv.aw));
   }

   public void a(cfy $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aun.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aun.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eqe $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cfy $$0) {
      return a;
   }
}
