import javax.annotation.Nullable;

public class ghq extends gjt<cis, fsv> {
   public static final alb a = new alb("textures/entity/armorstand/wood.png");

   public ghq(gis.a $$0) {
      super($$0, new fsw($$0.a(fwu.c)), 0.0F);
      this.a(new gmu<>(this, new fsv($$0.a(fwu.d)), new fsv($$0.a(fwu.e)), $$0.g()));
      this.a(new gmx<>(this, $$0.d()));
      this.a(new gmn<>(this, $$0.f()));
      this.a(new gmj<>(this, $$0.f(), $$0.d()));
   }

   public alb a(cis $$0) {
      return a;
   }

   protected void a(cis $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayu.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cis $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdr a(cis $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alb $$4 = this.a($$0);
         if ($$2) {
            return gdr.c($$4, false);
         } else {
            return $$1 ? gdr.a($$4, false) : null;
         }
      }
   }
}
