public class glc extends gkc<ciz> {
   private static final akq a = akq.b("textures/entity/lead_knot.png");
   private final fvv<ciz> f;

   public glc(gkd.a $$0) {
      super($$0);
      this.f = new fvv<>($$0.a(fyd.ax));
   }

   public void a(ciz $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fbg $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gpw.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(ciz $$0) {
      return a;
   }
}
