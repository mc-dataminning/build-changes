import javax.annotation.Nullable;

public class gfl extends gho<cgl, fqr> {
   public static final akf a = new akf("textures/entity/armorstand/wood.png");

   public gfl(ggn.a $$0) {
      super($$0, new fqs($$0.a(fuq.c)), 0.0F);
      this.a(new gko<>(this, new fqr($$0.a(fuq.d)), new fqr($$0.a(fuq.e)), $$0.g()));
      this.a(new gkr<>(this, $$0.d()));
      this.a(new gkh<>(this, $$0.f()));
      this.a(new gkd<>(this, $$0.f(), $$0.d()));
   }

   public akf a(cgl $$0) {
      return a;
   }

   protected void a(cgl $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dN().Y() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(axw.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cgl $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bY() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cC();
   }

   @Nullable
   protected gbm a(cgl $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akf $$4 = this.a($$0);
         if ($$2) {
            return gbm.c($$4, false);
         } else {
            return $$1 ? gbm.a($$4, false) : null;
         }
      }
   }
}
