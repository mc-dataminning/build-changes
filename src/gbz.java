import javax.annotation.Nullable;

public class gbz extends gec<ceu, fnf> {
   public static final ajh a = new ajh("textures/entity/armorstand/wood.png");

   public gbz(gdb.a $$0) {
      super($$0, new fng($$0.a(fre.c)), 0.0F);
      this.a(new ghc<>(this, new fnf($$0.a(fre.d)), new fnf($$0.a(fre.e)), $$0.g()));
      this.a(new ghf<>(this, $$0.d()));
      this.a(new ggv<>(this, $$0.f()));
      this.a(new ggr<>(this, $$0.f(), $$0.d()));
   }

   public ajh a(ceu $$0) {
      return a;
   }

   protected void a(ceu $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().X() - $$0.bM) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aww.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ceu $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fya a(ceu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ajh $$4 = this.a($$0);
         if ($$2) {
            return fya.c($$4, false);
         } else {
            return $$1 ? fya.a($$4, false) : null;
         }
      }
   }
}
