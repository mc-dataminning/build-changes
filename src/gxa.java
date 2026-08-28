public class gxa extends gwx<crz, hdh> {
   private static final alg a = alg.b("textures/entity/illager/evoker_fangs.png");
   private final ggr g;

   public gxa(gwy.a $$0) {
      super($$0);
      this.g = new ggr($$0.a(gjs.aW));
   }

   public void a(hdh $$0, fkd $$1, gqr $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fkh $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hjg.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hdh a() {
      return new hdh();
   }

   public void a(crz $$0, hdh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dK();
      $$1.b = $$0.a($$2);
   }
}
