public class gwv extends gws<crw, hdb> {
   private static final alg a = alg.b("textures/entity/illager/evoker_fangs.png");
   private final ggm g;

   public gwv(gwt.a $$0) {
      super($$0);
      this.g = new ggm($$0.a(gjn.aW));
   }

   public void a(hdb $$0, fjy $$1, gqm $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fkc $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hja.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hdb a() {
      return new hdb();
   }

   public void a(crw $$0, hdb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dK();
      $$1.b = $$0.a($$2);
   }
}
