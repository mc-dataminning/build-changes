public class fzg extends fyu<byb, fiy<byb>> {
   private static final agt a = new agt("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fiy<byb> j;
   private final fiy<byb> k;
   private final fiy<byb> l = this.a();

   public fzg(fxo.a $$0) {
      super($$0, new fkf<>($$0.a(flx.aY)), 0.2F);
      this.k = new fkg<>($$0.a(flx.aZ));
      this.j = new fkh<>($$0.a(flx.ba));
   }

   public agt a(byb $$0) {
      return a;
   }

   public void a(byb $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      int $$6 = $$0.gg();
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

   protected void a(byb $$0, epd $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aty.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
