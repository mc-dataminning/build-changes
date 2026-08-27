import javax.annotation.Nullable;

public class fxz extends gab<cbr, fjk> {
   public static final ahh a = new ahh("textures/entity/armorstand/wood.png");

   public fxz(fza.a $$0) {
      super($$0, new fjl($$0.a(fni.c)), 0.0F);
      this.a(new gdb<>(this, new fjk($$0.a(fni.d)), new fjk($$0.a(fni.e)), $$0.g()));
      this.a(new gde<>(this, $$0.d()));
      this.a(new gcu<>(this, $$0.f()));
      this.a(new gcq<>(this, $$0.f(), $$0.d()));
   }

   public ahh a(cbr $$0) {
      return a;
   }

   protected void a(cbr $$0, eqk $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().X() - $$0.bK) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aup.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cbr $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fub a(cbr $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.B()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ahh $$4 = this.a($$0);
         if ($$2) {
            return fub.c($$4, false);
         } else {
            return $$1 ? fub.a($$4, false) : null;
         }
      }
   }
}
