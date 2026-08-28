public class gif extends gia<hez> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gle d = this.v.b("body");
   private final gle e = this.d.b("head");
   private final gle f = this.e.b("eyes");
   private final gle g = this.d.b("tongue");
   private final gle i = this.d.b("left_arm");
   private final gle j = this.d.b("right_arm");
   private final gle k = this.v.b("left_leg");
   private final gle l = this.v.b("right_leg");
   private final gle m = this.d.b("croaking_body");

   public gif(gle $$0) {
      super($$0.b("root"));
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glo $$2 = $$1.a("root", glj.c(), glg.a(0.0F, 24.0F, 0.0F));
      glo $$3 = $$2.a(
         "body", glj.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), glg.a(0.0F, -2.0F, 4.0F)
      );
      glo $$4 = $$3.a(
         "head", glj.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), glg.a(0.0F, -2.0F, -1.0F)
      );
      glo $$5 = $$4.a("eyes", glj.c(), glg.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", glj.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), glg.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", glj.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), glg.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", glj.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gli(-0.1F)), glg.a(0.0F, -1.0F, -5.0F));
      glo $$6 = $$3.a("tongue", glj.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), glg.a(0.0F, -1.01F, 1.0F));
      glo $$7 = $$3.a("left_arm", glj.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), glg.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", glj.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), glg.a(0.0F, 3.0F, -1.0F));
      glo $$8 = $$3.a("right_arm", glj.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), glg.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", glj.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), glg.a(0.0F, 3.0F, 0.0F));
      glo $$9 = $$2.a("left_leg", glj.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), glg.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", glj.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), glg.a(2.0F, 3.0F, 0.0F));
      glo $$10 = $$2.a("right_leg", glj.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), glg.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", glj.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), glg.a(-2.0F, 3.0F, 0.0F));
      return glk.a($$0, 48, 48);
   }

   public void a(hez $$0) {
      super.a($$0);
      this.a($$0.b, frz.c, $$0.u);
      this.a($$0.c, frz.a, $$0.u);
      this.a($$0.d, frz.d, $$0.u);
      if ($$0.a) {
         this.a(frz.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(frz.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, frz.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
