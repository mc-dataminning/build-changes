import javax.annotation.Nullable;

public class gjb extends gle<ciu, fue> {
   public static final akq a = akq.b("textures/entity/armorstand/wood.png");

   public gjb(gkd.a $$0) {
      super($$0, new fuf($$0.a(fyd.c)), 0.0F);
      this.a(new gof<>(this, new fue($$0.a(fyd.d)), new fue($$0.a(fyd.e)), $$0.g()));
      this.a(new goi<>(this, $$0.d()));
      this.a(new gny<>(this, $$0.f()));
      this.a(new gnu<>(this, $$0.f(), $$0.d()));
   }

   public akq a(ciu $$0) {
      return a;
   }

   protected void a(ciu $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dQ().Z() - $$0.bO) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayn.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciu $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.cb() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cF();
   }

   @Nullable
   protected gfb a(ciu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akq $$4 = this.a($$0);
         if ($$2) {
            return gfb.c($$4, false);
         } else {
            return $$1 ? gfb.a($$4, false) : null;
         }
      }
   }
}
