import javax.annotation.Nullable;

public class gep extends ggs<cga, fpv> {
   public static final ajv a = new ajv("textures/entity/armorstand/wood.png");

   public gep(gfr.a $$0) {
      super($$0, new fpw($$0.a(ftu.c)), 0.0F);
      this.a(new gjs<>(this, new fpv($$0.a(ftu.d)), new fpv($$0.a(ftu.e)), $$0.g()));
      this.a(new gjv<>(this, $$0.d()));
      this.a(new gjl<>(this, $$0.f()));
      this.a(new gjh<>(this, $$0.f(), $$0.d()));
   }

   public ajv a(cga $$0) {
      return a;
   }

   protected void a(cga $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().Y() - $$0.bM) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(axm.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cga $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected gaq a(cga $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ajv $$4 = this.a($$0);
         if ($$2) {
            return gaq.c($$4, false);
         } else {
            return $$1 ? gaq.a($$4, false) : null;
         }
      }
   }
}
