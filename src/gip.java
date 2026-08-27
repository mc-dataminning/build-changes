public class gip extends gid<cei, fsb<cei>> {
   private static final akh a = new akh("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fsb<cei> j;
   private final fsb<cei> k;
   private final fsb<cei> l = this.a();

   public gip(ggx.a $$0) {
      super($$0, new fti<>($$0.a(fva.bb)), 0.2F);
      this.k = new ftj<>($$0.a(fva.bc));
      this.j = new ftk<>($$0.a(fva.bd));
   }

   public akh a(cei $$0) {
      return a;
   }

   public void a(cei $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
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

   protected void a(cei $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, axz.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
