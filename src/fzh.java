import org.joml.Vector3f;

public class fzh extends fym {
   public static final float c = 4.5F;
   private static final Vector3f d = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int s = 16;
   private static final int u = 16;
   private final alg v = alg.b("textures/gui/hanging_signs/" + this.b.b() + ".png");

   public fzh(dyl $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, wy.c("hanging_sign.edit"));
   }

   @Override
   protected void a(fro $$0, dzz $$1) {
      $$0.c().a((float)this.n / 2.0F, 125.0F, 50.0F);
   }

   @Override
   protected void c(fro $$0) {
      $$0.c().a(0.0F, -13.0F, 0.0F);
      $$0.c().b(4.5F, 4.5F, 1.0F);
      $$0.a(gqc::H, this.v, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
