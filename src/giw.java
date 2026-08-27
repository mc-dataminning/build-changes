public class giw extends ghs<cmn> {
   private static final akm a = new akm("textures/entity/llama/spit.png");
   private final ftq<cmn> f;

   public giw(ght.a $$0) {
      super($$0);
      this.f = new ftq<>($$0.a(fvv.az));
   }

   public void a(cmn $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayd.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayd.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eyw $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akm a(cmn $$0) {
      return a;
   }
}
