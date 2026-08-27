public class fvc extends fuc<bzk> {
   private static final afw a = new afw("textures/entity/lead_knot.png");
   private final fgo<bzk> f;

   public fvc(fud.a $$0) {
      super($$0);
      this.f = new fgo<>($$0.a(fiv.aq));
   }

   public void a(bzk $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eml $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(bzk $$0) {
      return a;
   }
}
