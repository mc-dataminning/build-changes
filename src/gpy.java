public class gpy extends gou<clq, gvp, fzs> {
   private static final ale a = ale.b("textures/entity/strider/strider.png");
   private static final ale b = ale.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gpy(gno.a $$0) {
      super($$0, new fzs($$0.a(gap.cF)), 0.5F);
      this.a(new gsc<>(this, new fzs($$0.a(gap.cG)), ale.b("textures/entity/strider/strider_saddle.png")));
   }

   public ale a(gvp $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gvp $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gvp c() {
      return new gvp();
   }

   public void a(clq $$0, gvp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.bX();
   }

   protected void a(gvp $$0, fdi $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gvp $$0) {
      return super.a($$0) || $$0.b;
   }
}
