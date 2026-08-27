public class fyj extends fzt<ccf, fjv<ccf>> {
   private static final ahg a = new ahg("textures/entity/enderman/enderman.png");
   private final auv i = auv.a();

   public fyj(fyn.a $$0) {
      super($$0, new fjv<>($$0.a(fmw.U)), 0.5F);
      this.a(new gci<>(this));
      this.a(new gbz(this, $$0.c()));
   }

   public void a(ccf $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      djh $$6 = $$0.ge();
      fjv<ccf> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elt a(ccf $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new elt(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ahg a(ccf $$0) {
      return a;
   }
}
