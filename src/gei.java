public class gei implements auq {
   private final geh a;
   private final gek b;
   private final gdb c;
   private final gej d;
   private final azh e = azh.a();
   private final fgi f;

   public gei(geh $$0, gdb $$1, fgi $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gek(this.f);
      this.d = new gej();
   }

   public geh a() {
      return this.a;
   }

   public void a(dsc $$0, iz $$1, dbb $$2, ezy $$3, fac $$4) {
      if ($$0.l() == dlf.c) {
         gra $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, goq.d);
      }
   }

   public void a(dsc $$0, iz $$1, dbb $$2, ezy $$3, fac $$4, boolean $$5, azh $$6) {
      try {
         dlf $$7 = $$0.l();
         if ($$7 == dlf.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), goq.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(iz $$0, dbb $$1, fac $$2, dsc $$3, env $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gek b() {
      return this.b;
   }

   public gra a(dsc $$0) {
      return this.a.b($$0);
   }

   public void a(dsc $$0, ezy $$1, gdo $$2, int $$3, int $$4) {
      dlf $$5 = $$0.l();
      if ($$5 != dlf.a) {
         switch ($$5) {
            case c:
               gra $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gdj.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cup($$0.b()), cum.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aup $$0) {
      this.d.a();
   }
}
