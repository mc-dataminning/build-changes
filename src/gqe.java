public class gqe extends gqg<clu, gwz, fzq> {
   private static final all a = all.b("textures/entity/slime/magmacube.png");

   public gqe(gpa.a $$0) {
      super($$0, new fzq($$0.a(gcb.bh)), 0.25F);
   }

   protected int a(clu $$0, jh $$1) {
      return 15;
   }

   public all a(gwz $$0) {
      return a;
   }

   public gwz c() {
      return new gwz();
   }

   public void a(clu $$0, gwz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azn.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gw();
   }

   public void a(gwz $$0, fek $$1, gix $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gwz $$0, fek $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
