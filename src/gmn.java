public class gmn implements avw {
   private final gmm a;
   private final gmp b;
   private final gkr c;
   private final gmo d;
   private final bam e = bam.a();
   private final fnh f;

   public gmn(gmm $$0, gkr $$1, fnh $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gmp(this.f);
      this.d = new gmo();
   }

   public gmm a() {
      return this.a;
   }

   public void a(dxu $$0, jh $$1, dgj $$2, fgr $$3, fgv $$4) {
      if ($$0.o() == dqu.c) {
         hdm $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hbb.d);
      }
   }

   public void a(dxu $$0, jh $$1, dgj $$2, fgr $$3, fgv $$4, boolean $$5, bam $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hbb.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jh $$0, dgj $$1, fgv $$2, dxu $$3, etw $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gmp b() {
      return this.b;
   }

   public hdm a(dxu $$0) {
      return this.a.b($$0);
   }

   public void a(dxu $$0, fgr $$1, glk $$2, int $$3, int $$4) {
      dqu $$5 = $$0.o();
      if ($$5 != dqu.a) {
         switch ($$5) {
            case c:
               hdm $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(glc.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cxo($$0.b()), cxm.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(avv $$0) {
      this.d.a();
   }
}
