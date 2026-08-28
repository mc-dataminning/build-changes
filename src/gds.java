import java.util.Set;

public class gds extends gdm<hae> {
   public static final gfn a = new gbb(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gds(gfe $$0) {
      super($$0);
   }

   public static gfk a() {
      gfm $$0 = gdm.a(12, gfi.a);
      gfo $$1 = $$0.a();
      $$1.a("head", gfj.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gfg.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gfj.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gfg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gfk.a($$0, 64, 32);
   }

   public void a(hae $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
