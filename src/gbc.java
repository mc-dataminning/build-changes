import java.util.List;

public class gbc extends gbl<gxm> {
   public static final List<gen> a = List.of();
   private final gen b;
   private final List<gen> c;

   public gbc(gen $$0) {
      super($$0);
      gen $$1 = $$0.b("root");
      gen $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
   }

   private static gev b() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("root", ges.c(), gep.a(0.0F, 24.0F, 0.0F));
      gex $$3 = $$2.a("upper_body", ges.c(), gep.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         ges.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         gep.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", ges.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), gep.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", ges.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), gep.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         ges.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         gep.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", ges.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), gep.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         ges.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         gep.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static get a() {
      gev $$0 = b();
      return get.a($$0, 64, 64);
   }

   public void a(gxm $$0) {
      this.e().e().forEach(gen::c);
      if ($$0.d) {
         this.a(fna.a, $$0.X, $$0.Y, 5.5F, 3.0F);
      }

      this.a($$0.b, fna.b, $$0.p);
      this.a($$0.a, fna.c, $$0.p);
   }

   public List<gen> b(gxm $$0) {
      return !$$0.c ? a : this.c;
   }
}
