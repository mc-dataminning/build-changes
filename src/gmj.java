public class gmj extends gku<cly, fxb<cly>> {
   private static final akk a = new akk("textures/entity/villager/villager.png");

   public gmj(gjo.a $$0) {
      super($$0, new fxb<>($$0.a(fxp.bP)), 0.5F);
      this.a(new gnf<>(this, $$0.f(), $$0.d()));
      this.a(new gol<>(this, $$0.e(), "villager"));
      this.a(new gne<>(this, $$0.d()));
   }

   public akk a(cly $$0) {
      return a;
   }

   protected void a(cly $$0, fao $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ec();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cly $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
