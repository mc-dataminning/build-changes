import java.util.List;

public class gbd extends gbm<gxn> {
   public static final List<geo> a = List.of();
   private final geo b;
   private final List<geo> c;

   public gbd(geo $$0) {
      super($$0);
      geo $$1 = $$0.b("root");
      geo $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static gew b() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("root", get.c(), geq.a(0.0F, 24.0F, 0.0F));
      gey $$3 = $$2.a("upper_body", get.c(), geq.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         get.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         geq.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", get.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), geq.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", get.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), geq.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         get.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         geq.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", get.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), geq.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         get.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         geq.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static geu a() {
      gew $$0 = b();
      return geu.a($$0, 64, 64);
   }

   public void a(gxn $$0) {
      this.e().e().forEach(geo::c);
      if ($$0.d) {
         this.a(fnb.a, $$0.X, $$0.Y, 5.5F, 3.0F);
      }

      this.a($$0.b, fnb.b, $$0.p);
      this.a($$0.a, fnb.c, $$0.p);
   }

   public List<geo> b(gxn $$0) {
      return !$$0.c ? a : this.c;
   }
}
