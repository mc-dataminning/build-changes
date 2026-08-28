import javax.annotation.Nullable;

public class ghx extends gka<ciz, ftc> {
   public static final alf a = new alf("textures/entity/armorstand/wood.png");

   public ghx(giz.a $$0) {
      super($$0, new ftd($$0.a(fxb.c)), 0.0F);
      this.a(new gnb<>(this, new ftc($$0.a(fxb.d)), new ftc($$0.a(fxb.e)), $$0.g()));
      this.a(new gne<>(this, $$0.d()));
      this.a(new gmu<>(this, $$0.f()));
      this.a(new gmq<>(this, $$0.f(), $$0.d()));
   }

   public alf a(ciz $$0) {
      return a;
   }

   protected void a(ciz $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciz $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdy a(ciz $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alf $$4 = this.a($$0);
         if ($$2) {
            return gdy.c($$4, false);
         } else {
            return $$1 ? gdy.a($$4, false) : null;
         }
      }
   }
}
