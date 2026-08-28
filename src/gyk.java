public class gyk extends gyh<csk, her> {
   private static final ali a = ali.b("textures/entity/illager/evoker_fangs.png");
   private final gic g;

   public gyk(gyi.a $$0) {
      super($$0);
      this.g = new gic($$0.a(gld.aW));
   }

   public void a(her $$0, flo $$1, gsa $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         flr $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hkq.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public her a() {
      return new her();
   }

   public void a(csk $$0, her $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
