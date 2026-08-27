public class fxk implements asg {
   private final fxj a;
   private final fxm b;
   private final fwd c;
   private final fxl d;
   private final awt e = awt.a();
   private final ezo f;

   public fxk(fxj $$0, fwd $$1, ezo $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fxm(this.f);
      this.d = new fxl();
   }

   public fxj a() {
      return this.a;
   }

   public void a(dme $$0, ib $$1, cvh $$2, etd $$3, eth $$4) {
      if ($$0.l() == dfk.c) {
         gjz $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, ghq.d);
      }
   }

   public void a(dme $$0, ib $$1, cvh $$2, etd $$3, eth $$4, boolean $$5, awt $$6) {
      try {
         dfk $$7 = $$0.l();
         if ($$7 == dfk.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), ghq.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ib $$0, cvh $$1, eth $$2, dme $$3, ehr $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fxm b() {
      return this.b;
   }

   public gjz a(dme $$0) {
      return this.a.b($$0);
   }

   public void a(dme $$0, etd $$1, fwq $$2, int $$3, int $$4) {
      dfk $$5 = $$0.l();
      if ($$5 != dfk.a) {
         switch ($$5) {
            case c:
               gjz $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fwl.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cpq($$0.b()), cpn.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(asf $$0) {
      this.d.a();
   }
}
