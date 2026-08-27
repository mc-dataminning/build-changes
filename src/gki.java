import java.util.Map;

public class gki extends gjt<cdg, ftd<cdg>> {
   private final ftd<cdg> a;
   private static final Map<bpt.a, ajt> b = Map.of(
      bpt.a.b,
      new ajt("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bpt.a.c,
      new ajt("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bpt.a.d,
      new ajt("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gki(ghd<cdg, ftd<cdg>> $$0, fti $$1) {
      super($$0);
      this.a = new ftd<>($$1.a(ftl.cd));
   }

   public void a(ewi $$0, fzz $$1, int $$2, cdg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gx()) {
         crj $$10 = $$3.fP();
         if ($$10.f() instanceof cox $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            ewm var14 = $$1.getBuffer(gah.e($$11.b()));
            this.a.a($$0, var14, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(ewi $$0, fzz $$1, int $$2, crj $$3, cox $$4) {
      if ($$3.a(avk.ba)) {
         int $$5 = ctw.a($$3, 0);
         if (awu.b.a($$5) == 0) {
            return;
         }

         ajt $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)awu.b.b($$5) / 255.0F;
         float $$8 = (float)awu.b.c($$5) / 255.0F;
         float $$9 = (float)awu.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gah.e($$6)), $$2, gla.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ewi $$0, fzz $$1, int $$2, crj $$3) {
      bpt.a $$4 = bpt.b.a($$3);
      if ($$4 != bpt.a.a) {
         ajt $$5 = b.get($$4);
         ewm $$6 = $$1.getBuffer(gah.i($$5));
         this.a.a($$0, $$6, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
