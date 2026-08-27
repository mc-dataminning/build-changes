import javax.annotation.Nullable;

public class fuk extends fwl<bzv, fge> {
   public static final agg a = new agg("textures/entity/armorstand/wood.png");

   public fuk(fvk.a $$0) {
      super($$0, new fgf($$0.a(fka.b)), 0.0F);
      this.a(new fzi<>(this, new fge($$0.a(fka.c)), new fge($$0.a(fka.d)), $$0.g()));
      this.a(new fzl<>(this, $$0.d()));
      this.a(new fzb<>(this, $$0.f()));
      this.a(new fyx<>(this, $$0.f(), $$0.d()));
   }

   public agg a(bzv $$0) {
      return a;
   }

   protected void a(bzv $$0, enk $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ati.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bzv $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected fqp a(bzv $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         agg $$4 = this.a($$0);
         if ($$2) {
            return fqp.c($$4, false);
         } else {
            return $$1 ? fqp.a($$4, false) : null;
         }
      }
   }
}
