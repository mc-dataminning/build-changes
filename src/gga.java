public class gga implements aue {
   private final gfz a;
   private final ggc b;
   private final get c;
   private final ggb d;
   private final ayt e = ayt.a();
   private final fhn f;

   public gga(gfz $$0, get $$1, fhn $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new ggc(this.f);
      this.d = new ggb();
   }

   public gfz a() {
      return this.a;
   }

   public void a(dtc $$0, ir $$1, dbd $$2, fbc $$3, fbg $$4) {
      if ($$0.l() == dlw.c) {
         gsz $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gqp.d);
      }
   }

   public void a(dtc $$0, ir $$1, dbd $$2, fbc $$3, fbg $$4, boolean $$5, ayt $$6) {
      try {
         dlw $$7 = $$0.l();
         if ($$7 == dlw.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gqp.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new z($$9);
      }
   }

   public void a(ir $$0, dbd $$1, fbg $$2, dtc $$3, epe $$4, int $$5, int $$6, int $$7) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4, (double)$$5, (double)$$6, (double)$$7);
      } catch (Throwable var12) {
         o $$9 = o.a(var12, "Tesselating liquid in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$1, $$0, null);
         throw new z($$9);
      }
   }

   public ggc b() {
      return this.b;
   }

   public gsz a(dtc $$0) {
      return this.a.b($$0);
   }

   public void a(dtc $$0, fbc $$1, gfg $$2, int $$3, int $$4) {
      dlw $$5 = $$0.l();
      if ($$5 != dlw.a) {
         switch ($$5) {
            case c:
               gsz $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gfb.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuh($$0.b()), cue.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aud $$0) {
      this.d.a();
   }
}
