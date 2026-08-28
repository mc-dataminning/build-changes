public class gju extends giu<ciz> {
   private static final ale a = new ale("textures/entity/lead_knot.png");
   private final fup<ciz> f;

   public gju(giv.a $$0) {
      super($$0);
      this.f = new fup<>($$0.a(fwx.aw));
   }

   public void a(ciz $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      faa $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(ciz $$0) {
      return a;
   }
}
