import java.util.List;

public class gdr extends gea<hac> {
   public static final List<ghd> a = List.of();
   private final ghd b;
   private final List<ghd> c;

   public gdr(ghd $$0) {
      super($$0);
      ghd $$1 = $$0.b("root");
      ghd $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static ghl b() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("root", ghi.c(), ghf.a(0.0F, 24.0F, 0.0F));
      ghn $$3 = $$2.a("upper_body", ghi.c(), ghf.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         ghi.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         ghf.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", ghi.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), ghf.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", ghi.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), ghf.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         ghi.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         ghf.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", ghi.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), ghf.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         ghi.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         ghf.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static ghj a() {
      ghl $$0 = b();
      return ghj.a($$0, 64, 64);
   }

   public void a(hac $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.e) {
         this.a(fny.a, $$0.ad, $$0.ae, 1.0F, 1.0F);
      }

      this.a($$0.b, fny.b, $$0.u);
      this.a($$0.a, fny.c, $$0.u);
      this.a($$0.c, fny.d, $$0.u);
   }

   public List<ghd> b(hac $$0) {
      return !$$0.d ? a : this.c;
   }
}
