import org.joml.Quaternionf;

public class fyh extends fyk<guk> {
   private static final String e = "outer_glass";
   private static final String f = "inner_glass";
   private static final String g = "base";
   private static final float i = (float)Math.sin(Math.PI / 4);
   public final gbm a;
   public final gbm b;
   public final gbm c;
   public final gbm d;

   public fyh(gbm $$0) {
      super($$0);
      this.a = $$0.b("base");
      this.b = $$0.b("outer_glass");
      this.c = this.b.b("inner_glass");
      this.d = this.c.b("cube");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      float $$2 = 0.875F;
      gbr $$3 = gbr.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      gbw $$4 = $$1.a("outer_glass", $$3, gbo.a(0.0F, 24.0F, 0.0F));
      gbw $$5 = $$4.a("inner_glass", $$3, gbo.a.a(0.875F));
      $$5.a("cube", gbr.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gbo.a.a(0.765625F));
      $$1.a("base", gbr.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), gbo.a);
      return gbs.a($$0, 64, 32);
   }

   public void a(guk $$0) {
      super.a($$0);
      this.a.k = $$0.a;
      float $$1 = $$0.p * 3.0F;
      float $$2 = goe.a($$0.p) * 16.0F;
      this.b.c += $$2 / 2.0F;
      this.b.a(a.d.rotationDegrees($$1).rotateAxis((float) (Math.PI / 3), i, 0.0F, i));
      this.c.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
      this.d.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
   }
}
