public class ghu implements aut {
   private final ght a;
   private final ghw b;
   private final ggd c;
   private final ghv d;
   private final azk e = azk.a();
   private final fjd f;

   public ghu(ght $$0, ggd $$1, fjd $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new ghw(this.f);
      this.d = new ghv();
   }

   public ght a() {
      return this.a;
   }

   public void a(dua $$0, je $$1, dcu $$2, fcu $$3, fcy $$4) {
      if ($$0.o() == dnc.c) {
         gym $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gwb.d);
      }
   }

   public void a(dua $$0, je $$1, dcu $$2, fcu $$3, fcy $$4, boolean $$5, azk $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), gwb.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(je $$0, dcu $$1, fcy $$2, dua $$3, eqb $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public ghw b() {
      return this.b;
   }

   public gym a(dua $$0) {
      return this.a.b($$0);
   }

   public void a(dua $$0, fcu $$1, ggv $$2, int $$3, int $$4) {
      dnc $$5 = $$0.o();
      if ($$5 != dnc.a) {
         switch ($$5) {
            case c:
               gym $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(ggn.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cvl($$0.b()), cvi.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aus $$0) {
      this.d.a();
   }
}
