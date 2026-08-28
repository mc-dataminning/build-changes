import java.util.Map;

public class gny extends gnj<cgi, fwr<cgi>> {
   private final fwr<cgi> a;
   private static final Map<bss.a, alf> b = Map.of(
      bss.a.b,
      new alf("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bss.a.c,
      new alf("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bss.a.d,
      new alf("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gny(gkt<cgi, fwr<cgi>> $$0, fww $$1) {
      super($$0);
      this.a = new fwr<>($$1.a(fwz.cd));
   }

   public void a(ezy $$0, gdo $$1, int $$2, cgi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cup $$10 = $$3.fR();
         if ($$10.g() instanceof csd $$11 && $$11.d() == csd.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fac $$13 = $$1.getBuffer(gdw.e($$11.b()));
            this.a.a($$0, $$13, $$2, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(ezy $$0, gdo $$1, int $$2, cup $$3, csd $$4) {
      if ($$3.a(awy.by)) {
         int $$5 = cxh.a($$3, 0);
         if (ayj.b.a($$5) == 0) {
            return;
         }

         alf $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)ayj.b.b($$5) / 255.0F;
         float $$8 = (float)ayj.b.c($$5) / 255.0F;
         float $$9 = (float)ayj.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gdw.e($$6)), $$2, goq.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ezy $$0, gdo $$1, int $$2, cup $$3) {
      bss.a $$4 = bss.b.a($$3);
      if ($$4 != bss.a.a) {
         alf $$5 = b.get($$4);
         fac $$6 = $$1.getBuffer(gdw.i($$5));
         this.a.a($$0, $$6, $$2, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
