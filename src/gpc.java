public class gpc extends gny<cpa, gvc> {
   private static final alh a = alh.b("textures/entity/llama/spit.png");
   private final fys b;

   public gpc(gnz.a $$0) {
      super($$0);
      this.b = new fys($$0.a(gba.bg));
   }

   public void a(gvc $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fdx $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gxj.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvc a() {
      return new gvc();
   }

   public void a(cpa $$0, gvc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
