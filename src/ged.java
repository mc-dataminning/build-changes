public class ged implements aum {
   private final gec a;
   private final gef b;
   private final gcw c;
   private final gee d;
   private final azc e = azc.a();
   private final fgd f;

   public ged(gec $$0, gcw $$1, fgd $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gef(this.f);
      this.d = new gee();
   }

   public gec a() {
      return this.a;
   }

   public void a(drx $$0, iz $$1, daw $$2, ezt $$3, ezx $$4) {
      if ($$0.l() == dla.c) {
         gqv $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gol.d);
      }
   }

   public void a(drx $$0, iz $$1, daw $$2, ezt $$3, ezx $$4, boolean $$5, azc $$6) {
      try {
         dla $$7 = $$0.l();
         if ($$7 == dla.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gol.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(iz $$0, daw $$1, ezx $$2, drx $$3, enq $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gef b() {
      return this.b;
   }

   public gqv a(drx $$0) {
      return this.a.b($$0);
   }

   public void a(drx $$0, ezt $$1, gdj $$2, int $$3, int $$4) {
      dla $$5 = $$0.l();
      if ($$5 != dla.a) {
         switch ($$5) {
            case c:
               gqv $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gde.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuk($$0.b()), cuh.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aul $$0) {
      this.d.a();
   }
}
