public class gkz extends gkm<cfh, fui<cfh>> {
   private static final akk a = new akk("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fui<cfh> j;
   private final fui<cfh> k;
   private final fui<cfh> l = this.a();

   public gkz(gjg.a $$0) {
      super($$0, new fvp<>($$0.a(fxh.bb)), 0.2F);
      this.k = new fvq<>($$0.a(fxh.bc));
      this.j = new fvr<>($$0.a(fxh.bd));
   }

   public akk a(cfh $$0) {
      return a;
   }

   public void a(cfh $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
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

   protected void a(cfh $$0, fag $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, aye.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
