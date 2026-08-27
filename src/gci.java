public class gci implements ats {
   private final gch a;
   private final gck b;
   private final gbb c;
   private final gcj d;
   private final ayg e = ayg.a();
   private final fei f;

   public gci(gch $$0, gbb $$1, fei $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gck(this.f);
      this.d = new gcj();
   }

   public gch a() {
      return this.a;
   }

   public void a(dqh $$0, in $$1, czg $$2, exx $$3, eyb $$4) {
      if ($$0.l() == djk.c) {
         goz $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gmp.d);
      }
   }

   public void a(dqh $$0, in $$1, czg $$2, exx $$3, eyb $$4, boolean $$5, ayg $$6) {
      try {
         djk $$7 = $$0.l();
         if ($$7 == djk.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gmp.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(in $$0, czg $$1, eyb $$2, dqh $$3, ema $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gck b() {
      return this.b;
   }

   public goz a(dqh $$0) {
      return this.a.b($$0);
   }

   public void a(dqh $$0, exx $$1, gbo $$2, int $$3, int $$4) {
      djk $$5 = $$0.l();
      if ($$5 != djk.a) {
         switch ($$5) {
            case c:
               goz $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gbj.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new csz($$0.b()), csw.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(atr $$0) {
      this.d.a();
   }
}
