import javax.annotation.Nullable;

public class gbx extends gdz<cet, fnd> {
   public static final ajh a = new ajh("textures/entity/armorstand/wood.png");

   public gbx(gcy.a $$0) {
      super($$0, new fne($$0.a(frc.c)), 0.0F);
      this.a(new ggz<>(this, new fnd($$0.a(frc.d)), new fnd($$0.a(frc.e)), $$0.g()));
      this.a(new ghc<>(this, $$0.d()));
      this.a(new ggs<>(this, $$0.f()));
      this.a(new ggo<>(this, $$0.f(), $$0.d()));
   }

   public ajh a(cet $$0) {
      return a;
   }

   protected void a(cet $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().X() - $$0.bM) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aww.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cet $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fxy a(cet $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ajh $$4 = this.a($$0);
         if ($$2) {
            return fxy.c($$4, false);
         } else {
            return $$1 ? fxy.a($$4, false) : null;
         }
      }
   }
}
