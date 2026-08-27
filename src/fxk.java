import javax.annotation.Nullable;

public class fxk extends fzm<cbj, fiw> {
   public static final ahg a = new ahg("textures/entity/armorstand/wood.png");

   public fxk(fyl.a $$0) {
      super($$0, new fix($$0.a(fmu.b)), 0.0F);
      this.a(new gcm<>(this, new fiw($$0.a(fmu.c)), new fiw($$0.a(fmu.d)), $$0.g()));
      this.a(new gcp<>(this, $$0.d()));
      this.a(new gcf<>(this, $$0.f()));
      this.a(new gcb<>(this, $$0.f(), $$0.d()));
   }

   public ahg a(cbj $$0) {
      return a;
   }

   protected void a(cbj $$0, epz $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dM().X() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aun.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cbj $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected ftn a(cbj $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ahg $$4 = this.a($$0);
         if ($$2) {
            return ftn.c($$4, false);
         } else {
            return $$1 ? ftn.a($$4, false) : null;
         }
      }
   }
}
