public class gvm extends gvj<cre, hbr> {
   private static final ale a = ale.b("textures/entity/illager/evoker_fangs.png");
   private final gff g;

   public gvm(gvk.a $$0) {
      super($$0);
      this.g = new gff($$0.a(gif.aS));
   }

   public void a(hbr $$0, fiq $$1, gpd $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fiu $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hhp.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hbr a() {
      return new hbr();
   }

   public void a(cre $$0, hbr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
