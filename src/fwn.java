public class fwn implements asc {
   private final fwm a;
   private final fwp b;
   private final fvg c;
   private final fwo d;
   private final awp e = awp.a();
   private final eys f;

   public fwn(fwm $$0, fvg $$1, eys $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fwp(this.f);
      this.d = new fwo();
   }

   public fwm a() {
      return this.a;
   }

   public void a(dlj $$0, hz $$1, cuu $$2, esh $$3, esl $$4) {
      if ($$0.l() == dex.c) {
         gjb $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, ggs.d);
      }
   }

   public void a(dlj $$0, hz $$1, cuu $$2, esh $$3, esl $$4, boolean $$5, awp $$6) {
      try {
         dex $$7 = $$0.l();
         if ($$7 == dex.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), ggs.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hz $$0, cuu $$1, esl $$2, dlj $$3, egw $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fwp b() {
      return this.b;
   }

   public gjb a(dlj $$0) {
      return this.a.b($$0);
   }

   public void a(dlj $$0, esh $$1, fvt $$2, int $$3, int $$4) {
      dex $$5 = $$0.l();
      if ($$5 != dex.a) {
         switch ($$5) {
            case c:
               gjb $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fvo.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cpd($$0.b()), cpa.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(asb $$0) {
      this.d.a();
   }
}
