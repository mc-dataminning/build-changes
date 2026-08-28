import java.util.Set;

public class fza extends fyu<gvd> {
   public static final gau a = new fwm(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public fza(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = fyu.a(12, gap.a);
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gan.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gaq.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gan.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gar.a($$0, 64, 32);
   }

   public void a(gvd $$0) {
      this.c.c();
      this.c.c = this.c.c + $$0.a * 9.0F * $$0.ab;
      super.a($$0);
      this.c.e = $$0.b;
   }
}
