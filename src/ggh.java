import org.joml.Quaternionf;

public class ggh extends ggk<hcw> {
   private static final String e = "outer_glass";
   private static final String f = "inner_glass";
   private static final String g = "base";
   private static final float i = (float)Math.sin(Math.PI / 4);
   public final gjo a;
   public final gjo b;
   public final gjo c;
   public final gjo d;

   public ggh(gjo $$0) {
      super($$0);
      this.a = $$0.b("base");
      this.b = $$0.b("outer_glass");
      this.c = this.b.b("inner_glass");
      this.d = this.c.b("cube");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      float $$2 = 0.875F;
      gjt $$3 = gjt.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      gjy $$4 = $$1.a("outer_glass", $$3, gjq.a(0.0F, 24.0F, 0.0F));
      gjy $$5 = $$4.a("inner_glass", $$3, gjq.a.a(0.875F));
      $$5.a("cube", gjt.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjq.a.a(0.765625F));
      $$1.a("base", gjt.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), gjq.a);
      return gju.a($$0, 64, 32);
   }

   public void a(hcw $$0) {
      super.a($$0);
      this.a.k = $$0.a;
      float $$1 = $$0.u * 3.0F;
      float $$2 = gwn.a($$0.u) * 16.0F;
      this.b.c += $$2 / 2.0F;
      this.b.a(a.d.rotationDegrees($$1).rotateAxis((float) (Math.PI / 3), i, 0.0F, i));
      this.c.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
      this.d.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
   }
}
