public class ger implements atv {
   private final geq a;
   private final get b;
   private final gdk c;
   private final ges d;
   private final aym e = aym.a();
   private final fgq f;

   public ger(geq $$0, gdk $$1, fgq $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new get(this.f);
      this.d = new ges();
   }

   public geq a() {
      return this.a;
   }

   public void a(dsh $$0, ja $$1, dbg $$2, fag $$3, fak $$4) {
      if ($$0.l() == dll.c) {
         grj $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, goz.d);
      }
   }

   public void a(dsh $$0, ja $$1, dbg $$2, fag $$3, fak $$4, boolean $$5, aym $$6) {
      try {
         dll $$7 = $$0.l();
         if ($$7 == dll.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), goz.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ja $$0, dbg $$1, fak $$2, dsh $$3, eob $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public get b() {
      return this.b;
   }

   public grj a(dsh $$0) {
      return this.a.b($$0);
   }

   public void a(dsh $$0, fag $$1, gdx $$2, int $$3, int $$4) {
      dll $$5 = $$0.l();
      if ($$5 != dll.a) {
         switch ($$5) {
            case c:
               grj $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gds.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cua($$0.b()), ctx.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(atu $$0) {
      this.d.a();
   }
}
