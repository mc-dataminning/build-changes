import java.util.Set;

public class gfr extends gfl<hcc> {
   public static final ghm a = new gcx(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gfr(ghd $$0) {
      super($$0);
   }

   public static ghj a() {
      ghl $$0 = gfl.a(12, ghh.a);
      ghn $$1 = $$0.a();
      $$1.a("head", ghi.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), ghf.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", ghi.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), ghf.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return ghj.a($$0, 64, 32);
   }

   public void a(hcc $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
