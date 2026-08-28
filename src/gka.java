public class gka extends giw<cno> {
   private static final alf a = new alf("textures/entity/llama/spit.png");
   private final fuu<cno> f;

   public gka(gix.a $$0) {
      super($$0);
      this.f = new fuu<>($$0.a(fwz.az));
   }

   public void a(cno $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayz.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayz.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fac $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cno $$0) {
      return a;
   }
}
