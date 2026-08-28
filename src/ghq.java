import java.util.Set;

public class ghq extends gjl<hfp> {
   public static final gln a = new ggv(false, 10.0F, 4.0F, Set.of("head"));
   private static final int i = 12;

   public ghq(gle $$0) {
      super($$0);
   }

   public static glk b() {
      glm $$0 = c();
      return glk.a($$0, 64, 64);
   }

   static glm c() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a(
         "head",
         glj.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(1, 33)
            .a(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         glg.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         glj.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         glg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      glj $$2 = glj.c().a().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      glj $$3 = glj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, glg.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, glg.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, glg.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$2, glg.a(4.0F, 12.0F, -6.0F));
      return $$0;
   }

   public gle d() {
      return this.b;
   }
}
