public class gar extends fzv {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gcc e;
   private final gcc f;

   public gar(gcc $$0) {
      super($$0, gjh::c);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("plate", gch.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gce.a);
      $$1.a("handle", gch.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gce.a);
      return gci.a($$0, 64, 64);
   }

   public gcc b() {
      return this.e;
   }

   public gcc c() {
      return this.f;
   }
}
