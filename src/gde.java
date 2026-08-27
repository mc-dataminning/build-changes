public class gde implements atx {
   private final gdd a;
   private final gdg b;
   private final gbx c;
   private final gdf d;
   private final ayk e = ayk.a();
   private final ffd f;

   public gde(gdd $$0, gbx $$1, ffd $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gdg(this.f);
      this.d = new gdf();
   }

   public gdd a() {
      return this.a;
   }

   public void a(drb $$0, io $$1, daa $$2, eys $$3, eyw $$4) {
      if ($$0.l() == dke.c) {
         gpw $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gnm.d);
      }
   }

   public void a(drb $$0, io $$1, daa $$2, eys $$3, eyw $$4, boolean $$5, ayk $$6) {
      try {
         dke $$7 = $$0.l();
         if ($$7 == dke.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gnm.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(io $$0, daa $$1, eyw $$2, drb $$3, emu $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gdg b() {
      return this.b;
   }

   public gpw a(drb $$0) {
      return this.a.b($$0);
   }

   public void a(drb $$0, eys $$1, gck $$2, int $$3, int $$4) {
      dke $$5 = $$0.l();
      if ($$5 != dke.a) {
         switch ($$5) {
            case c:
               gpw $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gcf.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cto($$0.b()), ctl.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(atw $$0) {
      this.d.a();
   }
}
