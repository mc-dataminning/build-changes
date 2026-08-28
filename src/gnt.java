import java.util.Map;

public class gnt extends gne<cgd, fwm<cgd>> {
   private final fwm<cgd> a;
   private static final Map<bsn.a, alb> b = Map.of(
      bsn.a.b,
      new alb("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsn.a.c,
      new alb("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsn.a.d,
      new alb("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gnt(gko<cgd, fwm<cgd>> $$0, fwr $$1) {
      super($$0);
      this.a = new fwm<>($$1.a(fwu.cd));
   }

   public void a(ezt $$0, gdj $$1, int $$2, cgd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cuk $$10 = $$3.fR();
         if ($$10.g() instanceof cry $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            ezx var14 = $$1.getBuffer(gdr.e($$11.b()));
            this.a.a($$0, var14, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(ezt $$0, gdj $$1, int $$2, cuk $$3, cry $$4) {
      if ($$3.a(awu.by)) {
         int $$5 = cxc.a($$3, 0);
         if (aye.b.a($$5) == 0) {
            return;
         }

         alb $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)aye.b.b($$5) / 255.0F;
         float $$8 = (float)aye.b.c($$5) / 255.0F;
         float $$9 = (float)aye.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gdr.e($$6)), $$2, gol.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ezt $$0, gdj $$1, int $$2, cuk $$3) {
      bsn.a $$4 = bsn.b.a($$3);
      if ($$4 != bsn.a.a) {
         alb $$5 = b.get($$4);
         ezx $$6 = $$1.getBuffer(gdr.i($$5));
         this.a.a($$0, $$6, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
