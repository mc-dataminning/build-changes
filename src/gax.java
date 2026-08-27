import javax.annotation.Nullable;

public class gax extends gcz<ceb, fmf> {
   public static final ajc a = new ajc("textures/entity/armorstand/wood.png");

   public gax(gby.a $$0) {
      super($$0, new fmg($$0.a(fqe.c)), 0.0F);
      this.a(new gfz<>(this, new fmf($$0.a(fqe.d)), new fmf($$0.a(fqe.e)), $$0.g()));
      this.a(new ggc<>(this, $$0.d()));
      this.a(new gfs<>(this, $$0.f()));
      this.a(new gfo<>(this, $$0.f(), $$0.d()));
   }

   public ajc a(ceb $$0) {
      return a;
   }

   protected void a(ceb $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dJ().X() - $$0.bK) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(awm.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ceb $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bU() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cy();
   }

   @Nullable
   protected fwy a(ceb $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.B()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ajc $$4 = this.a($$0);
         if ($$2) {
            return fwy.c($$4, false);
         } else {
            return $$1 ? fwy.a($$4, false) : null;
         }
      }
   }
}
