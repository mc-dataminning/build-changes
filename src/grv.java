public class grv extends gqq<cml, gxn, gbn> {
   private static final alj a = alj.b("textures/entity/strider/strider.png");
   private static final alj b = alj.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public grv(gpk.a $$0) {
      super($$0, new gbn($$0.a(gck.cX)), 0.5F);
      this.a(new gtz<>(this, new gbn($$0.a(gck.cY)), alj.b("textures/entity/strider/strider_saddle.png")));
   }

   public alj a(gxn $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gxn $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gxn b() {
      return new gxn();
   }

   public void a(cml $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.n();
      $$1.c = $$0.ca();
   }

   protected void a(gxn $$0, fer $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gxn $$0) {
      return super.a($$0) || $$0.b;
   }
}
