public class fxk extends fyu<cbp, fiw<cbp>> {
   private static final agt a = new agt("textures/entity/enderman/enderman.png");
   private final auf i = auf.a();

   public fxk(fxo.a $$0) {
      super($$0, new fiw<>($$0.a(flx.U)), 0.5F);
      this.a(new gbj<>(this));
      this.a(new gba(this, $$0.c()));
   }

   public void a(cbp $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      dip $$6 = $$0.ge();
      fiw<cbp> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elb a(cbp $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new elb(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public agt a(cbp $$0) {
      return a;
   }
}
