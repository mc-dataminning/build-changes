import javax.annotation.Nullable;

public class gjh extends glk<ciw, fuk> {
   public static final akr a = akr.b("textures/entity/armorstand/wood.png");

   public gjh(gkj.a $$0) {
      super($$0, new ful($$0.a(fyj.c)), 0.0F);
      this.a(new gol<>(this, new fuk($$0.a(fyj.d)), new fuk($$0.a(fyj.e)), $$0.g()));
      this.a(new goo<>(this, $$0.d()));
      this.a(new goe<>(this, $$0.f()));
      this.a(new goa<>(this, $$0.f(), $$0.d()));
   }

   public akr a(ciw $$0) {
      return a;
   }

   protected void a(ciw $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dO().Z() - $$0.bO) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayo.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciw $$0) {
      double $$1 = this.d.b($$0);
      float $$2 = $$0.cb() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gfh a(ciw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akr $$4 = this.a($$0);
         if ($$2) {
            return gfh.c($$4, false);
         } else {
            return $$1 ? gfh.a($$4, false) : null;
         }
      }
   }
}
