public class gep extends gfz {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gig d;
   private final gig e;

   public gep(gig $$0) {
      super($$0, gpn::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("bottom", gil.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gii.a);
      $$1.a("lid", gil.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gii.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gil.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gii.a(0.0F, 9.0F, 1.0F));
      return gim.a($$0, 64, 64);
   }

   public static gim b() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("bottom", gil.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gii.a);
      $$1.a("lid", gil.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gii.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gil.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gii.a(0.0F, 9.0F, 1.0F));
      return gim.a($$0, 64, 64);
   }

   public static gim c() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("bottom", gil.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gii.a);
      $$1.a("lid", gil.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gii.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gil.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gii.a(0.0F, 9.0F, 1.0F));
      return gim.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
