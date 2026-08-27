public class gif extends ght<cdm, frr<cdm>> {
   private static final akf a = new akf("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final frr<cdm> j;
   private final frr<cdm> k;
   private final frr<cdm> l = this.a();

   public gif(ggn.a $$0) {
      super($$0, new fsy<>($$0.a(fuq.bb)), 0.2F);
      this.k = new fsz<>($$0.a(fuq.bc));
      this.j = new fta<>($$0.a(fuq.bd));
   }

   public akf a(cdm $$0) {
      return a;
   }

   public void a(cdm $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      int $$6 = $$0.gr();
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

   protected void a(cdm $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, axw.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
