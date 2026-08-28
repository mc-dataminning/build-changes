import java.util.Set;

public class ghd extends giy<hfe> {
   public static final gla a = new ggi(false, 8.0F, 6.0F, Set.of("head"));
   private static final int i = 12;

   public ghd(gkr $$0) {
      super($$0);
   }

   public static gkx b() {
      gkz $$0 = c();
      return gkx.a($$0, 64, 64);
   }

   static gkz c() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a(
         "head",
         gkw.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(1, 33)
            .a(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F),
         gkt.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         gkw.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         gkt.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      gkw $$2 = gkw.c().a().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      gkw $$3 = gkw.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, gkt.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gkt.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, gkt.a(-4.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gkt.a(4.0F, 12.0F, -5.0F));
      return $$0;
   }

   public gkr d() {
      return this.b;
   }
}
