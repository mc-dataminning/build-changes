import java.util.Set;

public class gje extends giy<hfx> {
   public static final gla a = new ggi(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gje(gkr $$0) {
      super($$0);
   }

   public static gkx a() {
      gkz $$0 = giy.a(12, gkv.a);
      glb $$1 = $$0.a();
      $$1.a("head", gkw.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gkt.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gkw.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gkt.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gkx.a($$0, 64, 32);
   }

   public void a(hfx $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.aj;
      this.b.e = $$0.b;
   }
}
