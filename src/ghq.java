public class ghq extends ggu {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gjc e;
   private final gjc f;

   public ghq(gjc $$0) {
      super($$0, gqk::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      $$1.a("plate", gjh.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gje.a);
      $$1.a("handle", gjh.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gje.a);
      return gji.a($$0, 64, 64);
   }

   public gjc b() {
      return this.e;
   }

   public gjc c() {
      return this.f;
   }
}
