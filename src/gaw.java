public class gaw extends gcg<ceh, fmg<ceh>> {
   private static final aiy a = new aiy("textures/entity/enderman/enderman.png");
   private final awp i = awp.a();

   public gaw(gba.a $$0) {
      super($$0, new fmg<>($$0.a(fpi.T)), 0.5F);
      this.a(new gev<>(this));
      this.a(new gem(this, $$0.c()));
   }

   public void a(ceh $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      dlj $$6 = $$0.gg();
      fmg<ceh> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gh();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public enz a(ceh $$0, float $$1) {
      if ($$0.gh()) {
         double $$2 = 0.02 * (double)$$0.ea();
         return new enz(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aiy a(ceh $$0) {
      return a;
   }
}
