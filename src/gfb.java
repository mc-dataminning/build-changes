public class gfb extends ggm {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final giu d;
   private final giu e;

   public gfb(giu $$0) {
      super($$0, gqc::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("bottom", giz.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), giw.a);
      $$1.a("lid", giz.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), giw.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", giz.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), giw.a(0.0F, 9.0F, 1.0F));
      return gja.a($$0, 64, 64);
   }

   public static gja b() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("bottom", giz.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), giw.a);
      $$1.a("lid", giz.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), giw.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", giz.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), giw.a(0.0F, 9.0F, 1.0F));
      return gja.a($$0, 64, 64);
   }

   public static gja c() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("bottom", giz.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), giw.a);
      $$1.a("lid", giz.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), giw.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", giz.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), giw.a(0.0F, 9.0F, 1.0F));
      return gja.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
