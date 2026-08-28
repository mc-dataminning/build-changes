public class gek implements auq {
   private final gej a;
   private final gem b;
   private final gdd c;
   private final gel d;
   private final azh e = azh.a();
   private final fgk f;

   public gek(gej $$0, gdd $$1, fgk $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gem(this.f);
      this.d = new gel();
   }

   public gej a() {
      return this.a;
   }

   public void a(dse $$0, iz $$1, dbd $$2, faa $$3, fae $$4) {
      if ($$0.l() == dlh.c) {
         grc $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gos.d);
      }
   }

   public void a(dse $$0, iz $$1, dbd $$2, faa $$3, fae $$4, boolean $$5, azh $$6) {
      try {
         dlh $$7 = $$0.l();
         if ($$7 == dlh.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gos.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(iz $$0, dbd $$1, fae $$2, dse $$3, enx $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gem b() {
      return this.b;
   }

   public grc a(dse $$0) {
      return this.a.b($$0);
   }

   public void a(dse $$0, faa $$1, gdq $$2, int $$3, int $$4) {
      dlh $$5 = $$0.l();
      if ($$5 != dlh.a) {
         switch ($$5) {
            case c:
               grc $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gdl.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cur($$0.b()), cuo.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aup $$0) {
      this.d.a();
   }
}
