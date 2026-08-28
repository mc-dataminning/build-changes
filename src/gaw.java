import java.util.List;

public class gaw extends gbf<gxg> {
   public static final List<geh> a = List.of();
   private final geh b;
   private final List<geh> c;

   public gaw(geh $$0) {
      super($$0);
      geh $$1 = $$0.b("root");
      geh $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static gep b() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("root", gem.c(), gej.a(0.0F, 24.0F, 0.0F));
      ger $$3 = $$2.a("upper_body", gem.c(), gej.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         gem.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         gej.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", gem.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), gej.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", gem.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), gej.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         gem.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         gej.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", gem.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), gej.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         gem.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         gej.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static gen a() {
      gep $$0 = b();
      return gen.a($$0, 64, 64);
   }

   public void a(gxg $$0) {
      this.e().e().forEach(geh::c);
      if ($$0.d) {
         this.a(fmu.a, $$0.X, $$0.Y, 5.5F, 3.0F);
      }

      this.a($$0.b, fmu.b, $$0.p);
      this.a($$0.a, fmu.c, $$0.p);
   }

   public List<geh> b(gxg $$0) {
      return !$$0.c ? a : this.c;
   }
}
