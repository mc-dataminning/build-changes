public class ggl extends ghm<cgw, fnn<cgw>> {
   private static final ajh a = new ajh("textures/entity/breeze/breeze_wind.png");
   private static final fnn<cgw> b = new fnn<>(fnn.a(128, 128).a());

   public ggl(gew<cgw, fnn<cgw>> $$0) {
      super($$0);
   }

   public void a(eub $$0, fxs $$1, int $$2, cgw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      euf $$11 = $$1.getBuffer(fya.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gch.a(b, b.e()).a($$0, $$11, $$2, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
