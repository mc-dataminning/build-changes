import javax.annotation.Nullable;

public class geg extends ggj<cft, fpm> {
   public static final ajt a = new ajt("textures/entity/armorstand/wood.png");

   public geg(gfi.a $$0) {
      super($$0, new fpn($$0.a(ftl.c)), 0.0F);
      this.a(new gjj<>(this, new fpm($$0.a(ftl.d)), new fpm($$0.a(ftl.e)), $$0.g()));
      this.a(new gjm<>(this, $$0.d()));
      this.a(new gjc<>(this, $$0.f()));
      this.a(new giy<>(this, $$0.f(), $$0.d()));
   }

   public ajt a(cft $$0) {
      return a;
   }

   protected void a(cft $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().Y() - $$0.bM) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(axk.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cft $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected gah a(cft $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ajt $$4 = this.a($$0);
         if ($$2) {
            return gah.c($$4, false);
         } else {
            return $$1 ? gah.a($$4, false) : null;
         }
      }
   }
}
