public class gmo implements avw {
   private final gmn a;
   private final gmq b;
   private final gks c;
   private final gmp d;
   private final bam e = bam.a();
   private final fni f;

   public gmo(gmn $$0, gks $$1, fni $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gmq(this.f);
      this.d = new gmp();
   }

   public gmn a() {
      return this.a;
   }

   public void a(dxv $$0, jh $$1, dgk $$2, fgs $$3, fgw $$4) {
      if ($$0.o() == dqv.c) {
         hdn $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hbc.d);
      }
   }

   public void a(dxv $$0, jh $$1, dgk $$2, fgs $$3, fgw $$4, boolean $$5, bam $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hbc.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jh $$0, dgk $$1, fgw $$2, dxv $$3, etx $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gmq b() {
      return this.b;
   }

   public hdn a(dxv $$0) {
      return this.a.b($$0);
   }

   public void a(dxv $$0, fgs $$1, gll $$2, int $$3, int $$4) {
      dqv $$5 = $$0.o();
      if ($$5 != dqv.a) {
         switch ($$5) {
            case c:
               hdn $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gld.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cxp($$0.b()), cxn.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(avv $$0) {
      this.d.a();
   }
}
