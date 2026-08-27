import javax.annotation.Nullable;

public class fzs extends gbu<cdi, flc> {
   public static final aiy a = new aiy("textures/entity/armorstand/wood.png");

   public fzs(gat.a $$0) {
      super($$0, new fld($$0.a(fpb.c)), 0.0F);
      this.a(new geu<>(this, new flc($$0.a(fpb.d)), new flc($$0.a(fpb.e)), $$0.g()));
      this.a(new gex<>(this, $$0.d()));
      this.a(new gen<>(this, $$0.f()));
      this.a(new gej<>(this, $$0.f(), $$0.d()));
   }

   public aiy a(cdi $$0) {
      return a;
   }

   protected void a(cdi $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().X() - $$0.bJ) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(awh.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cdi $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fvu a(cdi $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.B()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aiy $$4 = this.a($$0);
         if ($$2) {
            return fvu.c($$4, false);
         } else {
            return $$1 ? fvu.a($$4, false) : null;
         }
      }
   }
}
