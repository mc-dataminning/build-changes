public class gfn extends ggx<cgw, fqt<cgw>> {
   private static final ajv a = new ajv("textures/entity/enderman/enderman.png");
   private final axt i = axt.a();

   public gfn(gfr.a $$0) {
      super($$0, new fqt<>($$0.a(ftu.X)), 0.5F);
      this.a(new gjm<>(this));
      this.a(new gjd(this, $$0.c()));
   }

   public void a(cgw $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      dpi $$6 = $$0.gn();
      fqt<cgw> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public esj a(cgw $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new esj(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajv a(cgw $$0) {
      return a;
   }
}
