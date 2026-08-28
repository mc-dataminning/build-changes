public class gex implements atx {
   private final gew a;
   private final gez b;
   private final gdq c;
   private final gey d;
   private final ayo e = ayo.a();
   private final fgw f;

   public gex(gew $$0, gdq $$1, fgw $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gez(this.f);
      this.d = new gey();
   }

   public gew a() {
      return this.a;
   }

   public void a(dsk $$0, ja $$1, dbi $$2, fam $$3, faq $$4) {
      if ($$0.l() == dln.c) {
         grp $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gpf.d);
      }
   }

   public void a(dsk $$0, ja $$1, dbi $$2, fam $$3, faq $$4, boolean $$5, ayo $$6) {
      try {
         dln $$7 = $$0.l();
         if ($$7 == dln.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gpf.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ja $$0, dbi $$1, faq $$2, dsk $$3, eoh $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gez b() {
      return this.b;
   }

   public grp a(dsk $$0) {
      return this.a.b($$0);
   }

   public void a(dsk $$0, fam $$1, ged $$2, int $$3, int $$4) {
      dln $$5 = $$0.l();
      if ($$5 != dln.a) {
         switch ($$5) {
            case c:
               grp $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gdy.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuc($$0.b()), ctz.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(atw $$0) {
      this.d.a();
   }
}
