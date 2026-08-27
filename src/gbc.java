public class gbc implements atf {
   private final gbb a;
   private final gbe b;
   private final fzv c;
   private final gbd d;
   private final axt e = axt.a();
   private final fdc f;

   public gbc(gbb $$0, fzv $$1, fdc $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gbe(this.f);
      this.d = new gbd();
   }

   public gbb a() {
      return this.a;
   }

   public void a(dpi $$0, id $$1, cyj $$2, ewr $$3, ewv $$4) {
      if ($$0.l() == dim.c) {
         gns $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, glj.d);
      }
   }

   public void a(dpi $$0, id $$1, cyj $$2, ewr $$3, ewv $$4, boolean $$5, axt $$6) {
      try {
         dim $$7 = $$0.l();
         if ($$7 == dim.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), glj.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(id $$0, cyj $$1, ewv $$2, dpi $$3, elb $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gbe b() {
      return this.b;
   }

   public gns a(dpi $$0) {
      return this.a.b($$0);
   }

   public void a(dpi $$0, ewr $$1, gai $$2, int $$3, int $$4) {
      dim $$5 = $$0.l();
      if ($$5 != dim.a) {
         switch ($$5) {
            case c:
               gns $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gad.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new crs($$0.b()), crp.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ate $$0) {
      this.d.a();
   }
}
