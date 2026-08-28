public class gft implements auf {
   private final gfs a;
   private final gfv b;
   private final gem c;
   private final gfu d;
   private final ayw e = ayw.a();
   private final fhq f;

   public gft(gfs $$0, gem $$1, fhq $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gfv(this.f);
      this.d = new gfu();
   }

   public gfs a() {
      return this.a;
   }

   public void a(dtc $$0, jd $$1, dbz $$2, fbi $$3, fbm $$4) {
      if ($$0.l() == dmf.c) {
         gsm $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gqc.d);
      }
   }

   public void a(dtc $$0, jd $$1, dbz $$2, fbi $$3, fbm $$4, boolean $$5, ayw $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gqc.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jd $$0, dbz $$1, fbm $$2, dtc $$3, epe $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gfv b() {
      return this.b;
   }

   public gsm a(dtc $$0) {
      return this.a.b($$0);
   }

   public void a(dtc $$0, fbi $$1, gez $$2, int $$3, int $$4) {
      dmf $$5 = $$0.l();
      if ($$5 != dmf.a) {
         switch ($$5) {
            case c:
               gsm $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(geu.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuq($$0.b()), cun.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aue $$0) {
      this.d.a();
   }
}
