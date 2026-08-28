public class gpt extends gop<cln, gvk, fzn> {
   private static final alc a = alc.b("textures/entity/strider/strider.png");
   private static final alc b = alc.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gpt(gnj.a $$0) {
      super($$0, new fzn($$0.a(gak.cF)), 0.5F);
      this.a(new grx<>(this, new fzn($$0.a(gak.cG)), alc.b("textures/entity/strider/strider_saddle.png")));
   }

   public alc a(gvk $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gvk $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gvk c() {
      return new gvk();
   }

   public void a(cln $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.bX();
   }

   protected void a(gvk $$0, fde $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gvk $$0) {
      return super.a($$0) || $$0.b;
   }
}
