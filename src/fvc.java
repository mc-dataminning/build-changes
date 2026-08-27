import javax.annotation.Nullable;

public class fvc extends fxd<cai, fgw> {
   public static final agm a = new agm("textures/entity/armorstand/wood.png");

   public fvc(fwc.a $$0) {
      super($$0, new fgx($$0.a(fks.b)), 0.0F);
      this.a(new gaa<>(this, new fgw($$0.a(fks.c)), new fgw($$0.a(fks.d)), $$0.g()));
      this.a(new gad<>(this, $$0.d()));
      this.a(new fzt<>(this, $$0.f()));
      this.a(new fzp<>(this, $$0.f(), $$0.d()));
   }

   public agm a(cai $$0) {
      return a;
   }

   protected void a(cai $$0, eob $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dN().W() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(atq.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cai $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected frh a(cai $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         agm $$4 = this.a($$0);
         if ($$2) {
            return frh.c($$4, false);
         } else {
            return $$1 ? frh.a($$4, false) : null;
         }
      }
   }
}
