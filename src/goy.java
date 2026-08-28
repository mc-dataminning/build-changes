public class goy extends gny<ckk, guc> {
   private static final alh a = alh.b("textures/entity/lead_knot.png");
   private final fyq b;

   public goy(gnz.a $$0) {
      super($$0);
      this.b = new fyq($$0.a(gba.bb));
   }

   @Override
   public void a(guc $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fdx $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gxj.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public guc b() {
      return new guc();
   }
}
