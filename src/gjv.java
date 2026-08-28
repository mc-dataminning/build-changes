public class gjv extends giv<cja> {
   private static final ale a = new ale("textures/entity/lead_knot.png");
   private final fuq<cja> f;

   public gjv(giw.a $$0) {
      super($$0);
      this.f = new fuq<>($$0.a(fwy.aw));
   }

   public void a(cja $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fab $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cja $$0) {
      return a;
   }
}
