public class gfo implements gfq<dph> {
   public static final grf a = new grf(gpa.e, new alf("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fxc c;

   public gfo(gfr.a $$0) {
      fxc $$1 = $$0.a(fxb.l);
      this.c = $$1.b("bell_body");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("bell_body", fxh.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxe.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxh.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxe.a(-8.0F, -12.0F, -8.0F));
      return fxi.a($$0, 32, 32);
   }

   public void a(dph $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayz.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == je.c) {
            $$7 = -$$9;
         } else if ($$0.c == je.d) {
            $$7 = $$9;
         } else if ($$0.c == je.f) {
            $$8 = -$$9;
         } else if ($$0.c == je.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fae $$10 = a.a($$3, gdy::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
