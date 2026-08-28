public class gsu extends gsw<cmw, gzr, gcc> {
   private static final alz a = alz.b("textures/entity/slime/magmacube.png");

   public gsu(grq.a $$0) {
      super($$0, new gcc($$0.a(gen.bu)), 0.25F);
   }

   protected int a(cmw $$0, jh $$1) {
      return 15;
   }

   public alz a(gzr $$0) {
      return a;
   }

   public gzr b() {
      return new gzr();
   }

   public void a(cmw $$0, gzr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.go();
   }

   public void a(gzr $$0, fgs $$1, gll $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gzr $$0, fgs $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
