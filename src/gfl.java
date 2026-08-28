public class gfl implements gfn<dpe> {
   public static final grc a = new grc(gox.e, new ale("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fwz c;

   public gfl(gfo.a $$0) {
      fwz $$1 = $$0.a(fwy.l);
      this.c = $$1.b("bell_body");
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxi $$2 = $$1.a("bell_body", fxe.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxb.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxe.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxb.a(-8.0F, -12.0F, -8.0F));
      return fxf.a($$0, 32, 32);
   }

   public void a(dpe $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayy.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      fab $$10 = a.a($$3, gdv::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
