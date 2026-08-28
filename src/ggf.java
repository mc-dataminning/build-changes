import java.util.Set;

public class ggf extends gia<hef> {
   public static final gkc a = new gfk(false, 10.0F, 4.0F, Set.of("head"));
   private static final int i = 12;

   public ggf(gjt $$0) {
      super($$0);
   }

   public static gjz b() {
      gkb $$0 = c();
      return gjz.a($$0, 64, 64);
   }

   static gkb c() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a(
         "head",
         gjy.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(0, 32)
            .a(-3.0F, 0.99F, -7.0F, 6.0F, 3.0F, 2.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         gjv.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         gjy.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         gjv.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      gjy $$2 = gjy.c().a().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      gjy $$3 = gjy.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, gjv.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gjv.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, gjv.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$2, gjv.a(4.0F, 12.0F, -6.0F));
      return $$0;
   }

   public gjt d() {
      return this.b;
   }
}
