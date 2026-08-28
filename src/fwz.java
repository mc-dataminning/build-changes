import java.util.Set;

public class fwz extends fxk<gtd> {
   public static final String a = "red_thing";
   public static final gau b = new fwm(Set.of("head", "beak", "red_thing"));
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;
   private final gal j;
   private final gal k;

   public fwz(gal $$0) {
      this.c = $$0;
      this.d = $$0.b("head");
      this.j = $$0.b("beak");
      this.k = $$0.b("red_thing");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("right_wing");
      this.i = $$0.b("left_wing");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", gaq.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gan.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", gaq.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gan.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", gaq.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gan.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", gaq.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gan.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gaq $$3 = gaq.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gan.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gan.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gaq.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gan.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gaq.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gan.a(4.0F, 13.0F, 0.0F));
      return gar.a($$0, 64, 32);
   }

   @Override
   public gal a() {
      return this.c;
   }

   public void a(gtd $$0) {
      float $$1 = (azd.a($$0.a) + 1.0F) * $$0.b;
      this.d.e = $$0.V * (float) (Math.PI / 180.0);
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      this.j.e = this.d.e;
      this.j.f = this.d.f;
      this.k.e = this.d.e;
      this.k.f = this.d.f;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      this.e.e = azd.b($$3 * 0.6662F) * 1.4F * $$2;
      this.f.e = azd.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.g = $$1;
      this.i.g = -$$1;
   }
}
