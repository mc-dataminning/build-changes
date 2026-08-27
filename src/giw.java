public class giw extends ghs<cmp> {
   private static final akn a = new akn("textures/entity/llama/spit.png");
   private final ftq<cmp> f;

   public giw(ght.a $$0) {
      super($$0);
      this.f = new ftq<>($$0.a(fvv.az));
   }

   public void a(cmp $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayf.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayf.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eyy $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akn a(cmp $$0) {
      return a;
   }
}
