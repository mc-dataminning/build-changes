import javax.annotation.Nullable;

public class gjn extends glt<chw, fup> {
   public static final akt a = new akt("textures/entity/armorstand/wood.png");

   public gjn(gkq.a $$0) {
      super($$0, new fuq($$0.a(fyr.c)), 0.0F);
      this.a(new gov<>(this, new fup($$0.a(fyr.d)), new fup($$0.a(fyr.e)), $$0.g()));
      this.a(new goy<>(this, $$0.d()));
      this.a(new goo<>(this, $$0.f()));
      this.a(new gph<>(this, $$0.f()));
      this.a(new gok<>(this, $$0.f(), $$0.d()));
   }

   public akt a(chw $$0) {
      return a;
   }

   protected void a(chw $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dU().Z() - $$0.bW) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aym.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(chw $$0) {
      double $$1 = this.d.b($$0);
      float $$2 = $$0.cf() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cJ();
   }

   @Nullable
   protected gfo a(chw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akt $$4 = this.a($$0);
         if ($$2) {
            return gfo.c($$4, false);
         } else {
            return $$1 ? gfo.a($$4, false) : null;
         }
      }
   }
}
