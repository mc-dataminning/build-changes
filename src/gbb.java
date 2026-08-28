import java.util.List;

public class gbb extends gbk<gxl> {
   public static final List<gem> a = List.of();
   private final gem b;
   private final List<gem> c;

   public gbb(gem $$0) {
      super($$0);
      gem $$1 = $$0.b("root");
      gem $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static geu b() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("root", ger.c(), geo.a(0.0F, 24.0F, 0.0F));
      gew $$3 = $$2.a("upper_body", ger.c(), geo.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         ger.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         geo.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", ger.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), geo.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", ger.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), geo.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         ger.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         geo.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", ger.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), geo.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         ger.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         geo.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static ges a() {
      geu $$0 = b();
      return ges.a($$0, 64, 64);
   }

   public void a(gxl $$0) {
      this.e().e().forEach(gem::c);
      if ($$0.d) {
         this.a(fmz.a, $$0.X, $$0.Y, 5.5F, 3.0F);
      }

      this.a($$0.b, fmz.b, $$0.p);
      this.a($$0.a, fmz.c, $$0.p);
   }

   public List<gem> b(gxl $$0) {
      return !$$0.c ? a : this.c;
   }
}
