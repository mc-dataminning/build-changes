public class geh implements aup {
   private final geg a;
   private final gej b;
   private final gda c;
   private final gei d;
   private final azg e = azg.a();
   private final fgh f;

   public geh(geg $$0, gda $$1, fgh $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gej(this.f);
      this.d = new gei();
   }

   public geg a() {
      return this.a;
   }

   public void a(dsb $$0, iz $$1, dba $$2, ezx $$3, fab $$4) {
      if ($$0.l() == dle.c) {
         gqz $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gop.d);
      }
   }

   public void a(dsb $$0, iz $$1, dba $$2, ezx $$3, fab $$4, boolean $$5, azg $$6) {
      try {
         dle $$7 = $$0.l();
         if ($$7 == dle.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gop.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(iz $$0, dba $$1, fab $$2, dsb $$3, enu $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gej b() {
      return this.b;
   }

   public gqz a(dsb $$0) {
      return this.a.b($$0);
   }

   public void a(dsb $$0, ezx $$1, gdn $$2, int $$3, int $$4) {
      dle $$5 = $$0.l();
      if ($$5 != dle.a) {
         switch ($$5) {
            case c:
               gqz $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gdi.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cuo($$0.b()), cul.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(auo $$0) {
      this.d.a();
   }
}
