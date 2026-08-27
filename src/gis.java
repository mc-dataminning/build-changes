public class gis extends ghs<cic> {
   private static final akn a = new akn("textures/entity/lead_knot.png");
   private final ftn<cic> f;

   public gis(ght.a $$0) {
      super($$0);
      this.f = new ftn<>($$0.a(fvv.aw));
   }

   public void a(cic $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eyy $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akn a(cic $$0) {
      return a;
   }
}
