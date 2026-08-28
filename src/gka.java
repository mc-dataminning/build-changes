public class gka implements avf {
   private final gjz a;
   private final gkc b;
   private final gie c;
   private final gkb d;
   private final azv e = azv.a();
   private final fkz f;

   public gka(gjz $$0, gie $$1, fkz $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gkc(this.f);
      this.d = new gkb();
   }

   public gjz a() {
      return this.a;
   }

   public void a(dvo $$0, jh $$1, deh $$2, fek $$3, feo $$4) {
      if ($$0.o() == dop.c) {
         hav $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gyk.d);
      }
   }

   public void a(dvo $$0, jh $$1, deh $$2, fek $$3, feo $$4, boolean $$5, azv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gyk.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jh $$0, deh $$1, feo $$2, dvo $$3, ero $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gkc b() {
      return this.b;
   }

   public hav a(dvo $$0) {
      return this.a.b($$0);
   }

   public void a(dvo $$0, fek $$1, gix $$2, int $$3, int $$4) {
      dop $$5 = $$0.o();
      if ($$5 != dop.a) {
         switch ($$5) {
            case c:
               hav $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gip.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cwf($$0.b()), cwd.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ave $$0) {
      this.d.a();
   }
}
