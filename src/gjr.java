import java.util.Set;

public class gjr extends gjl<hgh> {
   public static final gln a = new ggv(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gjr(gle $$0) {
      super($$0);
   }

   public static glk a() {
      glm $$0 = gjl.a(12, gli.a);
      glo $$1 = $$0.a();
      $$1.a("head", glj.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), glg.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", glj.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), glg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return glk.a($$0, 64, 32);
   }

   public void a(hgh $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
