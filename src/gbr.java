public class gbr extends gar<cdm> {
   private static final aiy a = new aiy("textures/entity/lead_knot.png");
   private final fms<cdm> f;

   public gbr(gas.a $$0) {
      super($$0);
      this.f = new fms<>($$0.a(fpb.as));
   }

   public void a(cdm $$0, float $$1, float $$2, esa $$3, fvl $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      ese $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ggk.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cdm $$0) {
      return a;
   }
}
