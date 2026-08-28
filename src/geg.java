public class geg extends gfz {
   private static final String a = "bell_body";
   private final gig b;

   public geg(gig $$0) {
      super($$0, gpn::d);
      this.b = $$0.b("bell_body");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("bell_body", gil.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gii.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gil.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gii.a(-8.0F, -12.0F, -8.0F));
      return gim.a($$0, 32, 32);
   }

   public void a(dwl $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azk.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == ja.c) {
            $$3 = -$$5;
         } else if ($$0.c == ja.d) {
            $$3 = $$5;
         } else if ($$0.c == ja.f) {
            $$4 = -$$5;
         } else if ($$0.c == ja.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
