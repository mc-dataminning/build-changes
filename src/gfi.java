public class gfi extends ggj<cgc, fmn<cgc>> {
   private static final ajc a = new ajc("textures/entity/breeze/breeze_wind.png");
   private static final fmn<cgc> b = new fmn<>(fmn.a(128, 128).a());

   public gfi(gdt<cgc, fmn<cgc>> $$0) {
      super($$0);
   }

   public void a(etd $$0, fwq $$1, int $$2, cgc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ag + $$6;
      eth $$11 = $$1.getBuffer(fwy.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gbe.a(b, b.e()).a($$0, $$11, $$2, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
