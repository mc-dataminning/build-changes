public class fwf implements asb {
   private final fwe a;
   private final fwh b;
   private final fuy c;
   private final fwg d;
   private final awo e = awo.a();
   private final eyl f;

   public fwf(fwe $$0, fuy $$1, eyl $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fwh(this.f);
      this.d = new fwg();
   }

   public fwe a() {
      return this.a;
   }

   public void a(dlf $$0, hz $$1, cuq $$2, esa $$3, ese $$4) {
      if ($$0.l() == det.c) {
         git $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, ggk.d);
      }
   }

   public void a(dlf $$0, hz $$1, cuq $$2, esa $$3, ese $$4, boolean $$5, awo $$6) {
      try {
         det $$7 = $$0.l();
         if ($$7 == det.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), ggk.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hz $$0, cuq $$1, ese $$2, dlf $$3, egp $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fwh b() {
      return this.b;
   }

   public git a(dlf $$0) {
      return this.a.b($$0);
   }

   public void a(dlf $$0, esa $$1, fvl $$2, int $$3, int $$4) {
      det $$5 = $$0.l();
      if ($$5 != det.a) {
         switch ($$5) {
            case c:
               git $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fvg.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new coz($$0.b()), cow.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(asa $$0) {
      this.d.a();
   }
}
