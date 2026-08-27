public class gap extends gbz<ced, flz<ced>> {
   private static final aiy a = new aiy("textures/entity/enderman/enderman.png");
   private final awo i = awo.a();

   public gap(gat.a $$0) {
      super($$0, new flz<>($$0.a(fpb.T)), 0.5F);
      this.a(new geo<>(this));
      this.a(new gef(this, $$0.c()));
   }

   public void a(ced $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      dlf $$6 = $$0.gg();
      flz<ced> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gh();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ens a(ced $$0, float $$1) {
      if ($$0.gh()) {
         double $$2 = 0.02 * (double)$$0.ea();
         return new ens(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aiy a(ced $$0) {
      return a;
   }
}
