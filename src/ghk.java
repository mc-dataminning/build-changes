public class ghk extends ghj {
   private static final String c = "saddle";
   private static final String d = "bridle";
   private static final String e = "reins";
   private final glg f = this.b.b("reins");

   public ghk(glg $$0) {
      super($$0);
   }

   public static glm c() {
      glo $$0 = b();
      glq $$1 = $$0.a();
      glq $$2 = $$1.b("body");
      glq $$3 = $$2.b("head");
      glk $$4 = new glk(0.05F);
      $$2.a(
         "saddle",
         gll.c()
            .a(74, 64)
            .a(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, $$4)
            .a(92, 114)
            .a(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, $$4)
            .a(0, 89)
            .a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, $$4),
         gli.a(0.0F, 0.0F, 0.0F)
      );
      $$3.a(
         "reins",
         gll.c()
            .a(98, 42)
            .a(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .a(84, 57)
            .a(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .a(98, 42)
            .a(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         gli.a(0.0F, 0.0F, 0.0F)
      );
      $$3.a(
         "bridle",
         gll.c()
            .a(60, 87)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F, $$4)
            .a(21, 64)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F, $$4)
            .a(50, 64)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F, $$4)
            .a(74, 70)
            .a(2.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F)
            .a(74, 70)
            .a()
            .a(-3.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F),
         gli.a(0.0F, 0.0F, 0.0F)
      );
      return glm.a($$0, 128, 128);
   }

   @Override
   public void a(hef $$0) {
      super.a($$0);
      this.f.k = $$0.b;
   }
}
