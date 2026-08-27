public class gbu extends gde<cew, fnc<cew>> {
   private static final ajc a = new ajc("textures/entity/enderman/enderman.png");
   private final awt i = awt.a();

   public gbu(gby.a $$0) {
      super($$0, new fnc<>($$0.a(fqe.T)), 0.5F);
      this.a(new gft<>(this));
      this.a(new gfk(this, $$0.c()));
   }

   public void a(cew $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      dme $$6 = $$0.gl();
      fnc<cew> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eov a(cew $$0, float $$1) {
      if ($$0.gm()) {
         double $$2 = 0.02 * (double)$$0.dY();
         return new eov(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajc a(cew $$0) {
      return a;
   }
}
