import javax.annotation.Nullable;

public class fux extends fwy<cad, fgr> {
   public static final agi a = new agi("textures/entity/armorstand/wood.png");

   public fux(fvx.a $$0) {
      super($$0, new fgs($$0.a(fkn.b)), 0.0F);
      this.a(new fzv<>(this, new fgr($$0.a(fkn.c)), new fgr($$0.a(fkn.d)), $$0.g()));
      this.a(new fzy<>(this, $$0.d()));
      this.a(new fzo<>(this, $$0.f()));
      this.a(new fzk<>(this, $$0.f(), $$0.d()));
   }

   public agi a(cad $$0) {
      return a;
   }

   protected void a(cad $$0, enw $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dN().W() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(atm.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cad $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected frc a(cad $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         agi $$4 = this.a($$0);
         if ($$2) {
            return frc.c($$4, false);
         } else {
            return $$1 ? frc.a($$4, false) : null;
         }
      }
   }
}
