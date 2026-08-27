public class gck extends gby<cam, fmb<cam>> {
   private static final aiy a = new aiy("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fmb<cam> j;
   private final fmb<cam> k;
   private final fmb<cam> l = this.a();

   public gck(gas.a $$0) {
      super($$0, new fni<>($$0.a(fpb.aX)), 0.2F);
      this.k = new fnj<>($$0.a(fpb.aY));
      this.j = new fnk<>($$0.a(fpb.aZ));
   }

   public aiy a(cam $$0) {
      return a;
   }

   public void a(cam $$0, float $$1, float $$2, esa $$3, fvl $$4, int $$5) {
      int $$6 = $$0.gi();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cam $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, awh.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
