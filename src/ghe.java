import java.util.List;

public class ghe extends ghn<hdu> {
   public static final List<gkr> a = List.of();
   private final gkr b;
   private final List<gkr> c;

   public ghe(gkr $$0) {
      super($$0);
      gkr $$1 = $$0.b("root");
      gkr $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static gkz b() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("root", gkw.c(), gkt.a(0.0F, 24.0F, 0.0F));
      glb $$3 = $$2.a("upper_body", gkw.c(), gkt.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         gkw.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         gkt.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", gkw.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), gkt.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", gkw.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), gkt.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         gkw.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         gkt.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", gkw.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), gkt.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         gkw.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         gkt.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static gkx a() {
      gkz $$0 = b();
      return gkx.a($$0, 64, 64);
   }

   public void a(hdu $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      if ($$0.e) {
         this.a(frl.a, $$0.ag, $$0.ah, 1.0F, 1.0F);
      }

      this.a($$0.b, frl.b, $$0.v);
      this.a($$0.a, frl.c, $$0.v);
      this.a($$0.c, frl.d, $$0.v);
   }

   public List<gkr> b(hdu $$0) {
      return !$$0.d ? a : this.c;
   }
}
