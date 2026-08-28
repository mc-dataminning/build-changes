public class gij implements auu {
   private final gii a;
   private final gil b;
   private final ggn c;
   private final gik d;
   private final azl e = azl.a();
   private final fjn f;

   public gij(gii $$0, ggn $$1, fjn $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gil(this.f);
      this.d = new gik();
   }

   public gii a() {
      return this.a;
   }

   public void a(duo $$0, je $$1, ddi $$2, fde $$3, fdi $$4) {
      if ($$0.o() == dnq.c) {
         gzd $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gws.d);
      }
   }

   public void a(duo $$0, je $$1, ddi $$2, fde $$3, fdi $$4, boolean $$5, azl $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gws.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(je $$0, ddi $$1, fdi $$2, duo $$3, eqp $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gil b() {
      return this.b;
   }

   public gzd a(duo $$0) {
      return this.a.b($$0);
   }

   public void a(duo $$0, fde $$1, ghg $$2, int $$3, int $$4) {
      dnq $$5 = $$0.o();
      if ($$5 != dnq.a) {
         switch ($$5) {
            case c:
               gzd $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(ggy.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cvp($$0.b()), cvm.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aut $$0) {
      this.d.a();
   }
}
