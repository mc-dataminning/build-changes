public class gdd extends gch {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final geo e;
   private final geo f;

   public gdd(geo $$0) {
      super($$0, glv::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("plate", get.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), geq.a);
      $$1.a("handle", get.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), geq.a);
      return geu.a($$0, 64, 64);
   }

   public geo b() {
      return this.e;
   }

   public geo c() {
      return this.f;
   }
}
