public class gfn implements aue {
   private final gfm a;
   private final gfp b;
   private final geg c;
   private final gfo d;
   private final ayv e = ayv.a();
   private final fhk f;

   public gfn(gfm $$0, geg $$1, fhk $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gfp(this.f);
      this.d = new gfo();
   }

   public gfm a() {
      return this.a;
   }

   public void a(dta $$0, jd $$1, dbx $$2, fbc $$3, fbg $$4) {
      if ($$0.l() == dmd.c) {
         gsg $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gpw.d);
      }
   }

   public void a(dta $$0, jd $$1, dbx $$2, fbc $$3, fbg $$4, boolean $$5, ayv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gpw.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jd $$0, dbx $$1, fbg $$2, dta $$3, eoy $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gfp b() {
      return this.b;
   }

   public gsg a(dta $$0) {
      return this.a.b($$0);
   }

   public void a(dta $$0, fbc $$1, get $$2, int $$3, int $$4) {
      dmd $$5 = $$0.l();
      if ($$5 != dmd.a) {
         switch ($$5) {
            case c:
               gsg $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(geo.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuo($$0.b()), cul.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aud $$0) {
      this.d.a();
   }
}
