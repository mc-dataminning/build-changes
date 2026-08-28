import java.util.Set;

public class fxo extends fxz<gtu> {
   public static final String a = "red_thing";
   public static final gbk b = new fxb(Set.of("head", "beak", "red_thing"));
   private final gbb c;
   private final gbb d;
   private final gbb e;
   private final gbb f;
   private final gbb g;
   private final gbb i;
   private final gbb j;

   public fxo(gbb $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.i = $$0.b("beak");
      this.j = $$0.b("red_thing");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
      this.f = $$0.b("right_wing");
      this.g = $$0.b("left_wing");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", gbg.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gbd.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", gbg.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gbd.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", gbg.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gbd.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", gbg.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gbd.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gbg $$3 = gbg.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gbd.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gbd.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gbg.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gbd.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gbg.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gbd.a(4.0F, 13.0F, 0.0F));
      return gbh.a($$0, 64, 32);
   }

   public void a(gtu $$0) {
      super.a($$0);
      float $$1 = (azj.a($$0.a) + 1.0F) * $$0.b;
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.i.e = this.c.e;
      this.i.f = this.c.f;
      this.j.e = this.c.e;
      this.j.f = this.c.f;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      this.d.e = azj.b($$3 * 0.6662F) * 1.4F * $$2;
      this.e.e = azj.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.g = $$1;
      this.g.g = -$$1;
   }
}
