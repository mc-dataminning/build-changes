import java.util.Set;

public class gai extends fzj<gwi> {
   private static final String i = "egg_belly";
   public static final gbk a = new fxb(true, 120.0F, 0.0F, 9.0F, 6.0F, 120.0F, Set.of("head"));
   private final gbb j;

   public gai(gbb $$0) {
      super($$0);
      this.j = $$0.b("egg_belly");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("head", gbg.c().a(3, 0).a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), gbd.a(0.0F, 19.0F, -10.0F));
      $$1.a(
         "body",
         gbg.c().a(7, 37).a("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).a(31, 1).a("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         gbd.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("egg_belly", gbg.c().a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), gbd.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 1;
      $$1.a("right_hind_leg", gbg.c().a(1, 23).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gbd.a(-3.5F, 22.0F, 11.0F));
      $$1.a("left_hind_leg", gbg.c().a(1, 12).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), gbd.a(3.5F, 22.0F, 11.0F));
      $$1.a("right_front_leg", gbg.c().a(27, 30).a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gbd.a(-5.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", gbg.c().a(27, 24).a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), gbd.a(5.0F, 21.0F, -4.0F));
      return gbh.a($$0, 128, 64);
   }

   public void a(gwi $$0) {
      super.a($$0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      if ($$0.a) {
         float $$3 = $$0.b ? 4.0F : 1.0F;
         float $$4 = $$0.b ? 2.0F : 1.0F;
         float $$5 = $$1 * 5.0F;
         float $$6 = azj.b($$3 * $$5);
         float $$7 = azj.b($$5);
         this.f.f = -$$6 * 8.0F * $$2 * $$4;
         this.g.f = $$6 * 8.0F * $$2 * $$4;
         this.d.f = -$$7 * 3.0F * $$2;
         this.e.f = $$7 * 3.0F * $$2;
      } else {
         float $$8 = 0.5F * $$2;
         float $$9 = azj.b($$1 * 0.6662F * 0.6F) * $$8;
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
