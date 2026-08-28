public class gwj extends gwg<crp, hcp> {
   private static final alg a = alg.b("textures/entity/illager/evoker_fangs.png");
   private final gga g;

   public gwj(gwh.a $$0) {
      super($$0);
      this.g = new gga($$0.a(gjb.aW));
   }

   public void a(hcp $$0, fjj $$1, gqa $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fjn $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hin.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hcp a() {
      return new hcp();
   }

   public void a(crp $$0, hcp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
