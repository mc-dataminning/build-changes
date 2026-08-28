public class gsg extends gsd<cpi, gym> {
   private static final akv a = akv.b("textures/entity/illager/evoker_fangs.png");
   private final gcc b;

   public gsg(gse.a $$0) {
      super($$0);
      this.b = new gcc($$0.a(gfc.aM));
   }

   public void a(gym $$0, ffu $$1, gly $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         ffy $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hei.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gym a() {
      return new gym();
   }

   public void a(cpi $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
