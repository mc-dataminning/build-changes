public class gei implements gek<doe> {
   public static final gpz a = new gpz(gnu.e, new akm("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fvw c;

   public gei(gel.a $$0) {
      fvw $$1 = $$0.a(fvv.l);
      this.c = $$1.b("bell_body");
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      fwf $$2 = $$1.a("bell_body", fwb.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fvy.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fwb.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fvy.a(-8.0F, -12.0F, -8.0F));
      return fwc.a($$0, 32, 32);
   }

   public void a(doe $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayd.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == it.c) {
            $$7 = -$$9;
         } else if ($$0.c == it.d) {
            $$7 = $$9;
         } else if ($$0.c == it.f) {
            $$8 = -$$9;
         } else if ($$0.c == it.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eyw $$10 = a.a($$3, gcs::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
