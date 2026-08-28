public class gob extends gny<cot, gue> {
   private static final alh a = alh.b("textures/entity/illager/evoker_fangs.png");
   private final fya b;

   public gob(gnz.a $$0) {
      super($$0);
      this.b = new fya($$0.a(gba.ay));
   }

   public void a(gue $$0, fdt $$1, ghw $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fdx $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gxj.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gue a() {
      return new gue();
   }

   public void a(cot $$0, gue $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dN();
      $$1.b = $$0.a($$2);
   }
}
