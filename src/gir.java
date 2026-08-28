public class gir extends gkb<cjr, ftw<cjr>> {
   private static final ale a = new ale("textures/entity/enderman/enderman.png");
   private final azf i = azf.a();

   public gir(giv.a $$0) {
      super($$0, new ftw<>($$0.a(fwx.X)), 0.5F);
      this.a(new gmr<>(this));
      this.a(new gmi(this, $$0.c()));
   }

   public void a(cjr $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      dsa $$6 = $$0.gq();
      ftw<cjr> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evp a(cjr $$0, float $$1) {
      if ($$0.gr()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new evp(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ale a(cjr $$0) {
      return a;
   }
}
