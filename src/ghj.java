public class ghj extends ggx<cdb, fqv<cdb>> {
   private static final ajv a = new ajv("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fqv<cdb> j;
   private final fqv<cdb> k;
   private final fqv<cdb> l = this.a();

   public ghj(gfr.a $$0) {
      super($$0, new fsc<>($$0.a(ftu.bb)), 0.2F);
      this.k = new fsd<>($$0.a(ftu.bc));
      this.j = new fse<>($$0.a(ftu.bd));
   }

   public ajv a(cdb $$0) {
      return a;
   }

   public void a(cdb $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      int $$6 = $$0.gp();
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

   protected void a(cdb $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, axm.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
