public class ggv extends gfz {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gig e;
   private final gig f;

   public ggv(gig $$0) {
      super($$0, gpn::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("plate", gil.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gii.a);
      $$1.a("handle", gil.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gii.a);
      return gim.a($$0, 64, 64);
   }

   public gig b() {
      return this.e;
   }

   public gig c() {
      return this.f;
   }
}
