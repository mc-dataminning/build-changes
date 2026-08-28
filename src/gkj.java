public class gkj extends gjf<cmy> {
   private static final akk a = new akk("textures/entity/llama/spit.png");
   private final fvc<cmy> f;

   public gkj(gjg.a $$0) {
      super($$0);
      this.f = new fvc<>($$0.a(fxh.az));
   }

   public void a(cmy $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aye.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aye.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fak $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cmy $$0) {
      return a;
   }
}
