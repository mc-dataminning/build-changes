import org.joml.Vector3f;

public class fve extends fuj {
   public static final float c = 4.5F;
   private static final Vector3f d = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int s = 16;
   private static final int u = 16;
   private final alp v = alp.b("textures/gui/hanging_signs/" + this.b.b() + ".png");

   public fve(dwd $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, xk.c("hanging_sign.edit"));
   }

   @Override
   protected void a(fnl $$0, dxo $$1) {
      $$0.c().a((float)this.n / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void c(fnl $$0) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(glq::H, this.v, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f l() {
      return d;
   }
}
