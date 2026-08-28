public class gfl extends ghg {
   private static final String a = "bell_body";
   private final gjo b;

   public gfl(gjo $$0) {
      super($$0, gqx::d);
      this.b = $$0.b("bell_body");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("bell_body", gjt.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gjq.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gjt.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gjq.a(-8.0F, -12.0F, -8.0F));
      return gju.a($$0, 32, 32);
   }

   public void a(dxk $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azm.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jb.c) {
            $$3 = -$$5;
         } else if ($$0.c == jb.d) {
            $$3 = $$5;
         } else if ($$0.c == jb.f) {
            $$4 = -$$5;
         } else if ($$0.c == jb.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
