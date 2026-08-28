import org.joml.Quaternionf;

public class gbx extends gca<gyf> {
   private static final String e = "outer_glass";
   private static final String f = "inner_glass";
   private static final String g = "base";
   private static final float i = (float)Math.sin(Math.PI / 4);
   public final gfc a;
   public final gfc b;
   public final gfc c;
   public final gfc d;

   public gbx(gfc $$0) {
      super($$0);
      this.a = $$0.b("base");
      this.b = $$0.b("outer_glass");
      this.c = this.b.b("inner_glass");
      this.d = this.c.b("cube");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = 0.875F;
      gfh $$3 = gfh.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      gfm $$4 = $$1.a("outer_glass", $$3, gfe.a(0.0F, 24.0F, 0.0F));
      gfm $$5 = $$4.a("inner_glass", $$3, gfe.a.a(0.875F));
      $$5.a("cube", gfh.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfe.a.a(0.765625F));
      $$1.a("base", gfh.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), gfe.a);
      return gfi.a($$0, 64, 32);
   }

   public void a(gyf $$0) {
      super.a($$0);
      this.a.k = $$0.a;
      float $$1 = $$0.u * 3.0F;
      float $$2 = grw.a($$0.u) * 16.0F;
      this.b.c += $$2 / 2.0F;
      this.b.a(a.d.rotationDegrees($$1).rotateAxis((float) (Math.PI / 3), i, 0.0F, i));
      this.c.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
      this.d.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
   }
}
