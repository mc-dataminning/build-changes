public class gcu extends gee<cfo, foa<cfo>> {
   private static final ajh a = new ajh("textures/entity/enderman/enderman.png");
   private final axd i = axd.a();

   public gcu(gcy.a $$0) {
      super($$0, new foa<>($$0.a(frc.T)), 0.5F);
      this.a(new ggt<>(this));
      this.a(new ggk(this, $$0.c()));
   }

   public void a(cfo $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      dmz $$6 = $$0.gn();
      foa<cfo> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public epr a(cfo $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new epr(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajh a(cfo $$0) {
      return a;
   }
}
