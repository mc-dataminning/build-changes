public class gqt extends gpf<cma, gwj, gaj> {
   private static final alh a = alh.b("textures/entity/illager/vex.png");
   private static final alh b = alh.b("textures/entity/illager/vex_charging.png");

   public gqt(gnz.a $$0) {
      super($$0, new gaj($$0.a(gba.cS)), 0.3F);
      this.a(new gsf<>(this, $$0.b()));
   }

   protected int a(cma $$0, jg $$1) {
      return 15;
   }

   public alh a(gwj $$0) {
      return $$0.a ? b : a;
   }

   public gwj c() {
      return new gwj();
   }

   public void a(cma $$0, gwj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}
