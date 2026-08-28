import org.joml.Quaternionf;

public class fwx extends fxa<gsr> {
   private static final String e = "outer_glass";
   private static final String f = "inner_glass";
   private static final String g = "base";
   private static final float i = (float)Math.sin(Math.PI / 4);
   private final gab j;
   public final gab a;
   public final gab b;
   public final gab c;
   public final gab d;

   public fwx(gab $$0) {
      this.j = $$0;
      this.a = $$0.b("base");
      this.b = $$0.b("outer_glass");
      this.c = this.b.b("inner_glass");
      this.d = this.c.b("cube");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = 0.875F;
      gag $$3 = gag.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      gal $$4 = $$1.a("outer_glass", $$3, gad.a(0.0F, 24.0F, 0.0F).a(0.875F));
      gal $$5 = $$4.a("inner_glass", $$3, gad.a.a(0.765625F));
      $$5.a("cube", gag.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gad.a);
      $$1.a("base", gag.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), gad.a);
      return gah.a($$0, 64, 32);
   }

   public void a(gsr $$0) {
      this.j.e().forEach(gab::c);
      this.a.k = $$0.a;
      float $$1 = $$0.p * 3.0F;
      float $$2 = gmm.a($$0.p) * 16.0F;
      this.b.c += $$2 / 2.0F;
      this.b.a(a.d.rotationDegrees($$1).rotateAxis((float) (Math.PI / 3), i, 0.0F, i));
      this.c.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
      this.d.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), i, 0.0F, i).rotateY($$1 * (float) (Math.PI / 180.0)));
   }

   @Override
   public gab a() {
      return this.j;
   }
}
