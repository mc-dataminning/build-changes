public class gfe extends ggo<cgp, fqk<cgp>> {
   private static final ajt a = new ajt("textures/entity/enderman/enderman.png");
   private final axr i = axr.a();

   public gfe(gfi.a $$0) {
      super($$0, new fqk<>($$0.a(ftl.X)), 0.5F);
      this.a(new gjd<>(this));
      this.a(new giu(this, $$0.c()));
   }

   public void a(cgp $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      doz $$6 = $$0.gn();
      fqk<cgp> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public esa a(cgp $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new esa(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajt a(cgp $$0) {
      return a;
   }
}
