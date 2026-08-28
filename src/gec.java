public class gec extends gfz {
   public static final int a = 20;
   public static final int b = 40;
   public static final String c = "flag";
   private static final String d = "pole";
   private static final String e = "bar";

   public gec(gig $$0) {
      super($$0, gpn::d);
   }

   public static gim a(boolean $$0) {
      gio $$1 = new gio();
      giq $$2 = $$1.a();
      if ($$0) {
         $$2.a("pole", gil.c().a(44, 0).a(-1.0F, -42.0F, -1.0F, 2.0F, 42.0F, 2.0F), gii.a);
      }

      $$2.a("bar", gil.c().a(0, 42).a(-10.0F, $$0 ? -44.0F : -20.5F, $$0 ? -1.0F : 9.5F, 20.0F, 2.0F, 2.0F), gii.a);
      return gim.a($$1, 64, 64);
   }
}
