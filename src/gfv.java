import javax.annotation.Nullable;

public class gfv extends ghy<chh, frb> {
   public static final akh a = new akh("textures/entity/armorstand/wood.png");

   public gfv(ggx.a $$0) {
      super($$0, new frc($$0.a(fva.c)), 0.0F);
      this.a(new gky<>(this, new frb($$0.a(fva.d)), new frb($$0.a(fva.e)), $$0.g()));
      this.a(new glb<>(this, $$0.d()));
      this.a(new gkr<>(this, $$0.f()));
      this.a(new gkn<>(this, $$0.f(), $$0.d()));
   }

   public akh a(chh $$0) {
      return a;
   }

   protected void a(chh $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dN().Y() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(axz.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(chh $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bY() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cC();
   }

   @Nullable
   protected gbw a(chh $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akh $$4 = this.a($$0);
         if ($$2) {
            return gbw.c($$4, false);
         } else {
            return $$1 ? gbw.a($$4, false) : null;
         }
      }
   }
}
