public class gwb extends gvy<crk, hch> {
   private static final alg a = alg.b("textures/entity/illager/evoker_fangs.png");
   private final gfs g;

   public gwb(gvz.a $$0) {
      super($$0);
      this.g = new gfs($$0.a(git.aU));
   }

   public void a(hch $$0, fjc $$1, gps $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fjg $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hif.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hch a() {
      return new hch();
   }

   public void a(crk $$0, hch $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
