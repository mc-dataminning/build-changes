public class gnq extends gnn<coi, gts> {
   private static final ale a = ale.b("textures/entity/illager/evoker_fangs.png");
   private final fxp b;

   public gnq(gno.a $$0) {
      super($$0);
      this.b = new fxp($$0.a(gap.ay));
   }

   public void a(gts $$0, fdi $$1, ghl $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fdm $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gwx.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gts a() {
      return new gts();
   }

   public void a(coi $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dI();
      $$1.b = $$0.a($$2);
   }
}
