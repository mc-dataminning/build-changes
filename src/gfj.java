import java.util.Set;

public class gfj extends gfy<hcd> {
   public static final String a = "red_thing";
   public static final float b = 16.0F;
   public static final gjl c = new get(false, 5.0F, 2.0F, 2.0F, 1.99F, 24.0F, Set.of("head", "beak", "red_thing"));
   private final gjc d;
   private final gjc e;
   private final gjc f;
   private final gjc g;
   private final gjc i;

   public gfj(gjc $$0) {
      super($$0);
      this.d = $$0.b("head");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("right_wing");
      this.i = $$0.b("left_wing");
   }

   public static gji a() {
      gjk $$0 = b();
      return gji.a($$0, 64, 32);
   }

   protected static gjk b() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("head", gjh.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gje.a(0.0F, 15.0F, -4.0F));
      $$2.a("beak", gjh.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gje.a);
      $$2.a("red_thing", gjh.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gje.a);
      $$1.a("body", gjh.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gje.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gjh $$3 = gjh.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gje.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gje.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gjh.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gje.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gjh.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gje.a(4.0F, 13.0F, 0.0F));
      return $$0;
   }

   public void a(hcd $$0) {
      super.a($$0);
      float $$1 = (azm.a($$0.a) + 1.0F) * $$0.b;
      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$2 = $$0.ae;
      float $$3 = $$0.ad;
      this.e.e = azm.b($$3 * 0.6662F) * 1.4F * $$2;
      this.f.e = azm.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.g = $$1;
      this.i.g = -$$1;
   }
}
