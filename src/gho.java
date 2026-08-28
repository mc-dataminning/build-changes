public class gho extends ghq {
   public gho(gle $$0) {
      super($$0);
   }

   public static glk a() {
      glm $$0 = c();
      $$0.a()
         .a(
            "body",
            glj.c()
               .a(20, 32)
               .a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new gli(0.5F))
               .a(18, 4)
               .a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F)
               .a(52, 0)
               .a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
            glg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
         );
      glo $$1 = $$0.a()
         .a("head", glj.c().a(0, 0).a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F).a(9, 33).a(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F), glg.a(0.0F, 4.0F, -8.0F));
      $$1.a("right_horn", glj.c().a(0, 32).a(-1.5F, -4.5F, -0.5F, 2.0F, 6.0F, 2.0F), glg.a(-4.5F, -2.5F, -3.5F, 1.5708F, 0.0F, 0.0F));
      $$1.a("left_horn", glj.c().a().a(0, 32).a(-1.5F, -3.0F, -0.5F, 2.0F, 6.0F, 2.0F), glg.a(5.5F, -2.5F, -5.0F, 1.5708F, 0.0F, 0.0F));
      return glk.a($$0, 64, 64);
   }
}
