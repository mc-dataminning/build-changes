public class gjz extends giv<cnn> {
   private static final ale a = new ale("textures/entity/llama/spit.png");
   private final fut<cnn> f;

   public gjz(giw.a $$0) {
      super($$0);
      this.f = new fut<>($$0.a(fwy.az));
   }

   public void a(cnn $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayy.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayy.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fab $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cnn $$0) {
      return a;
   }
}
