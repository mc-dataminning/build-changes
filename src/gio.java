public class gio extends gjy<cjo, ftt<cjo>> {
   private static final alb a = new alb("textures/entity/enderman/enderman.png");
   private final azc i = azc.a();

   public gio(gis.a $$0) {
      super($$0, new ftt<>($$0.a(fwu.X)), 0.5F);
      this.a(new gmo<>(this));
      this.a(new gmf(this, $$0.c()));
   }

   public void a(cjo $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      drx $$6 = $$0.gq();
      ftt<cjo> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evm a(cjo $$0, float $$1) {
      if ($$0.gr()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new evm(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public alb a(cjo $$0) {
      return a;
   }
}
