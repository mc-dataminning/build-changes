public class gcv extends gbz<cew, fnz<cew>> {
   private static final aiy a = new aiy("textures/entity/slime/slime.png");

   public gcv(gat.a $$0) {
      super($$0, new fnz<>($$0.a(fpb.bo)), 0.25F);
      this.a(new gfi<>(this, $$0.f()));
   }

   public void a(cew $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gh();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cew $$0, esa $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gh();
      float $$5 = awh.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public aiy a(cew $$0) {
      return a;
   }
}
