import java.util.Set;

public class gfc extends gfq<hbv> {
   public static final String a = "red_thing";
   public static final gjd b = new gem(Set.of("head", "beak", "red_thing"));
   private final giu c;
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;

   public gfc(giu $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
      this.f = $$0.b("right_wing");
      this.g = $$0.b("left_wing");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      int $$2 = 16;
      gje $$3 = $$1.a("head", giz.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), giw.a(0.0F, 15.0F, -4.0F));
      $$3.a("beak", giz.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), giw.a);
      $$3.a("red_thing", giz.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), giw.a);
      $$1.a("body", giz.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), giw.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      giz $$4 = giz.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$4, giw.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$4, giw.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", giz.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), giw.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", giz.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), giw.a(4.0F, 13.0F, 0.0F));
      return gja.a($$0, 64, 32);
   }

   public void a(hbv $$0) {
      super.a($$0);
      float $$1 = (azm.a($$0.a) + 1.0F) * $$0.b;
      this.c.e = $$0.ab * (float) (Math.PI / 180.0);
      this.c.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$2 = $$0.ae;
      float $$3 = $$0.ad;
      this.d.e = azm.b($$3 * 0.6662F) * 1.4F * $$2;
      this.e.e = azm.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.g = $$1;
      this.g.g = -$$1;
   }
}
