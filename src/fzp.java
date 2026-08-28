import java.util.Set;

public class fzp extends fzj<gvu> {
   public static final gbk a = new fxb(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public fzp(gbb $$0) {
      super($$0);
   }

   public static gbh a() {
      gbj $$0 = fzj.a(12, gbf.a);
      gbl $$1 = $$0.a();
      $$1.a("head", gbg.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gbd.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gbg.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gbd.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gbh.a($$0, 64, 32);
   }

   public void a(gvu $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ab;
      this.b.e = $$0.b;
   }
}
