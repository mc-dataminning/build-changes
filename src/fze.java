public class fze extends fye<cbi> {
   private static final ahd a = new ahd("textures/entity/lead_knot.png");
   private final fkg<cbi> f;

   public fze(fyf.a $$0) {
      super($$0);
      this.f = new fkg<>($$0.a(fmo.at));
   }

   public void a(cbi $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      epx $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cbi $$0) {
      return a;
   }
}
