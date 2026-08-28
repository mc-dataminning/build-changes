import java.util.Set;

public class gej extends gdk<haq> {
   private static final String i = "egg_belly";
   public static final gfl a = new gaz(true, 120.0F, 0.0F, 9.0F, 6.0F, 120.0F, Set.of("head"));
   private final gfc j;

   public gej(gfc $$0) {
      super($$0);
      this.j = $$0.b("egg_belly");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("head", gfh.c().a(3, 0).a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), gfe.a(0.0F, 19.0F, -10.0F));
      $$1.a(
         "body",
         gfh.c().a(7, 37).a("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).a(31, 1).a("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         gfe.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("egg_belly", gfh.c().a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), gfe.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 1;
      $$1.a("right_hind_leg", gfh.c().a(1, 23).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gfe.a(-3.5F, 22.0F, 11.0F));
      $$1.a("left_hind_leg", gfh.c().a(1, 12).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gfe.a(3.5F, 22.0F, 11.0F));
      $$1.a("right_front_leg", gfh.c().a(27, 30).a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gfe.a(-5.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", gfh.c().a(27, 24).a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gfe.a(5.0F, 21.0F, -4.0F));
      return gfi.a($$0, 128, 64);
   }

   public void a(haq $$0) {
      super.a($$0);
      float $$1 = $$0.ad;
      float $$2 = $$0.ae;
      if ($$0.a) {
         float $$3 = $$0.b ? 4.0F : 1.0F;
         float $$4 = $$0.b ? 2.0F : 1.0F;
         float $$5 = $$1 * 5.0F;
         float $$6 = ayz.b($$3 * $$5);
         float $$7 = ayz.b($$5);
         this.f.f = -$$6 * 8.0F * $$2 * $$4;
         this.g.f = $$6 * 8.0F * $$2 * $$4;
         this.d.f = -$$7 * 3.0F * $$2;
         this.e.f = $$7 * 3.0F * $$2;
      } else {
         float $$8 = 0.5F * $$2;
         float $$9 = ayz.b($$1 * 0.6662F * 0.6F) * $$8;
         this.d.e = $$9;
         this.e.e = -$$9;
         this.f.g = -$$9;
         this.g.g = $$9;
      }

      this.j.k = $$0.c;
      if (this.j.k) {
         this.v.c--;
      }
   }
}
