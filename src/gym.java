public class gym extends gyj<csm, het> {
   private static final alk a = alk.b("textures/entity/illager/evoker_fangs.png");
   private final gie g;

   public gym(gyk.a $$0) {
      super($$0);
      this.g = new gie($$0.a(glf.aW));
   }

   public void a(het $$0, flq $$1, gsc $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         flt $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hks.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public het a() {
      return new het();
   }

   public void a(csm $$0, het $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
