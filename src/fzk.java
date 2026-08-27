public class fzk extends fyk<cbn> {
   private static final ahg a = new ahg("textures/entity/lead_knot.png");
   private final fkm<cbn> f;

   public fzk(fyl.a $$0) {
      super($$0);
      this.f = new fkm<>($$0.a(fmu.at));
   }

   public void a(cbn $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eqd $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cbn $$0) {
      return a;
   }
}
