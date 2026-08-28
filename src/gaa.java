import java.util.Set;

public class gaa extends fzu<gwf> {
   public static final gbv a = new fxm(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gaa(gbm $$0) {
      super($$0);
   }

   public static gbs a() {
      gbu $$0 = fzu.a(12, gbq.a);
      gbw $$1 = $$0.a();
      $$1.a("head", gbr.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gbo.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gbr.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gbo.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gbs.a($$0, 64, 32);
   }

   public void a(gwf $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ab;
      this.b.e = $$0.b;
   }
}
