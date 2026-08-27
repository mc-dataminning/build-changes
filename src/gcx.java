public class gcx extends geh<cfq, foc<cfq>> {
   private static final ajh a = new ajh("textures/entity/enderman/enderman.png");
   private final axd i = axd.a();

   public gcx(gdb.a $$0) {
      super($$0, new foc<>($$0.a(fre.X)), 0.5F);
      this.a(new ggw<>(this));
      this.a(new ggn(this, $$0.c()));
   }

   public void a(cfq $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      dnb $$6 = $$0.gn();
      foc<cfq> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ept a(cfq $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new ept(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajh a(cfq $$0) {
      return a;
   }
}
