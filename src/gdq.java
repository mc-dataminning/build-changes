public class gdq extends gde<cbf, fne<cbf>> {
   private static final ajc a = new ajc("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fne<cbf> j;
   private final fne<cbf> k;
   private final fne<cbf> l = this.a();

   public gdq(gby.a $$0) {
      super($$0, new fol<>($$0.a(fqe.aX)), 0.2F);
      this.k = new fom<>($$0.a(fqe.aY));
      this.j = new fon<>($$0.a(fqe.aZ));
   }

   public ajc a(cbf $$0) {
      return a;
   }

   public void a(cbf $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      int $$6 = $$0.gn();
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

   protected void a(cbf $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, awm.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
