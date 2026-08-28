import java.util.List;

public class gay extends gbh<gxi> {
   public static final List<gej> a = List.of();
   private final gej b;
   private final List<gej> c;

   public gay(gej $$0) {
      super($$0);
      gej $$1 = $$0.b("root");
      gej $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static ger b() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a("root", geo.c(), gel.a(0.0F, 24.0F, 0.0F));
      get $$3 = $$2.a("upper_body", geo.c(), gel.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         geo.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         gel.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", geo.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), gel.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", geo.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), gel.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         geo.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         gel.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", geo.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), gel.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         geo.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         gel.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static gep a() {
      ger $$0 = b();
      return gep.a($$0, 64, 64);
   }

   public void a(gxi $$0) {
      super.a($$0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$0.e) {
         this.a(fmu.a, $$0.X, $$0.Y, 1.0F, 1.0F);
      }

      this.a($$0.b, fmu.b, $$0.p);
      this.a($$0.a, fmu.c, $$0.p);
      this.a($$0.c, fmu.d, $$0.p);
   }

   public List<gej> b(gxi $$0) {
      return !$$0.d ? a : this.c;
   }
}
