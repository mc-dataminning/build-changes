public class gbx extends gbz<cem, fmr<cem>> {
   private static final aiy a = new aiy("textures/entity/slime/magmacube.png");

   public gbx(gat.a $$0) {
      super($$0, new fmr<>($$0.a(fpb.aw)), 0.25F);
   }

   protected int a(cem $$0, hz $$1) {
      return 15;
   }

   public aiy a(cem $$0) {
      return a;
   }

   public void a(cem $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gh();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cem $$0, esa $$1, float $$2) {
      int $$3 = $$0.gh();
      float $$4 = awh.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
