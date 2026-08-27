public class fzm extends fym<cbo> {
   private static final ahg a = new ahg("textures/entity/lead_knot.png");
   private final fko<cbo> f;

   public fzm(fyn.a $$0) {
      super($$0);
      this.f = new fko<>($$0.a(fmw.at));
   }

   public void a(cbo $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eqf $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cbo $$0) {
      return a;
   }
}
