public class glg extends gkg<cjb> {
   private static final akr a = akr.b("textures/entity/lead_knot.png");
   private final fvz<cjb> g;

   public glg(gkh.a $$0) {
      super($$0);
      this.g = new fvz<>($$0.a(fyh.ax));
   }

   public void a(cjb $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fbk $$6 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$6, $$5, gqa.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cjb $$0) {
      return a;
   }
}
