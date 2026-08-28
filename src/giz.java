public class giz implements avb {
   private final giy a;
   private final gjb b;
   private final ghd c;
   private final gja d;
   private final azr e = azr.a();
   private final fkc f;

   public giz(giy $$0, ghd $$1, fkc $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gjb(this.f);
      this.d = new gja();
   }

   public giy a() {
      return this.a;
   }

   public void a(dvd $$0, jg $$1, ddx $$2, fdt $$3, fdx $$4) {
      if ($$0.o() == doe.c) {
         gzu $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gxj.d);
      }
   }

   public void a(dvd $$0, jg $$1, ddx $$2, fdt $$3, fdx $$4, boolean $$5, azr $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gxj.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jg $$0, ddx $$1, fdx $$2, dvd $$3, ere $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gjb b() {
      return this.b;
   }

   public gzu a(dvd $$0) {
      return this.a.b($$0);
   }

   public void a(dvd $$0, fdt $$1, ghw $$2, int $$3, int $$4) {
      doe $$5 = $$0.o();
      if ($$5 != doe.a) {
         switch ($$5) {
            case c:
               gzu $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gho.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cvx($$0.b()), cvv.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ava $$0) {
      this.d.a();
   }
}
