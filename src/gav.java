import java.util.Set;

public class gav extends gbh<gxh> {
   public static final String a = "red_thing";
   public static final ges b = new gag(Set.of("head", "beak", "red_thing"));
   private final gej c;
   private final gej d;
   private final gej e;
   private final gej f;
   private final gej g;

   public gav(gej $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
      this.f = $$0.b("right_wing");
      this.g = $$0.b("left_wing");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      int $$2 = 16;
      get $$3 = $$1.a("head", geo.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gel.a(0.0F, 15.0F, -4.0F));
      $$3.a("beak", geo.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gel.a);
      $$3.a("red_thing", geo.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gel.a);
      $$1.a("body", geo.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gel.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      geo $$4 = geo.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$4, gel.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$4, gel.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", geo.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gel.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", geo.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gel.a(4.0F, 13.0F, 0.0F));
      return gep.a($$0, 64, 32);
   }

   public void a(gxh $$0) {
      super.a($$0);
      float $$1 = (azu.a($$0.a) + 1.0F) * $$0.b;
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      this.d.e = azu.b($$3 * 0.6662F) * 1.4F * $$2;
      this.e.e = azu.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.g = $$1;
      this.g.g = -$$1;
   }
}
