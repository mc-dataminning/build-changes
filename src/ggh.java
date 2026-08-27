public class ggh extends gfh<cfx> {
   private static final ajt a = new ajt("textures/entity/lead_knot.png");
   private final frd<cfx> f;

   public ggh(gfi.a $$0) {
      super($$0);
      this.f = new frd<>($$0.a(ftl.aw));
   }

   public void a(cfx $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      ewm $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(cfx $$0) {
      return a;
   }
}
