public class gas extends gag<byv, fkj<byv>> {
   private static final ahh a = new ahh("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fkj<byv> j;
   private final fkj<byv> k;
   private final fkj<byv> l = this.a();

   public gas(fza.a $$0) {
      super($$0, new flq<>($$0.a(fni.aX)), 0.2F);
      this.k = new flr<>($$0.a(fni.aY));
      this.j = new fls<>($$0.a(fni.aZ));
   }

   public ahh a(byv $$0) {
      return a;
   }

   public void a(byv $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      int $$6 = $$0.gh();
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

   protected void a(byv $$0, eqk $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aup.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
