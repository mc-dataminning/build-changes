public class gli extends gki<cjb> {
   private static final akr a = akr.b("textures/entity/lead_knot.png");
   private final fwb<cjb> g;

   public gli(gkj.a $$0) {
      super($$0);
      this.g = new fwb<>($$0.a(fyj.ax));
   }

   public void a(cjb $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fbm $$6 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$6, $$5, gqc.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cjb $$0) {
      return a;
   }
}
