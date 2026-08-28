public class gmm implements avw {
   private final gml a;
   private final gmo b;
   private final gkq c;
   private final gmn d;
   private final bam e = bam.a();
   private final fng f;

   public gmm(gml $$0, gkq $$1, fng $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gmo(this.f);
      this.d = new gmn();
   }

   public gml a() {
      return this.a;
   }

   public void a(dxu $$0, jh $$1, dgj $$2, fgq $$3, fgu $$4) {
      if ($$0.o() == dqu.c) {
         hdl $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hba.d);
      }
   }

   public void a(dxu $$0, jh $$1, dgj $$2, fgq $$3, fgu $$4, boolean $$5, bam $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hba.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jh $$0, dgj $$1, fgu $$2, dxu $$3, etw $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gmo b() {
      return this.b;
   }

   public hdl a(dxu $$0) {
      return this.a.b($$0);
   }

   public void a(dxu $$0, fgq $$1, glj $$2, int $$3, int $$4) {
      dqu $$5 = $$0.o();
      if ($$5 != dqu.a) {
         switch ($$5) {
            case c:
               hdl $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(glb.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
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
