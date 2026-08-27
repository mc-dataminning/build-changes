public class gby implements atp {
   private final gbx a;
   private final gca b;
   private final gar c;
   private final gbz d;
   private final ayd e = ayd.a();
   private final fdy f;

   public gby(gbx $$0, gar $$1, fdy $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gca(this.f);
      this.d = new gbz();
   }

   public gbx a() {
      return this.a;
   }

   public void a(dpy $$0, im $$1, cyx $$2, exn $$3, exr $$4) {
      if ($$0.l() == djb.c) {
         goo $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gmf.d);
      }
   }

   public void a(dpy $$0, im $$1, cyx $$2, exn $$3, exr $$4, boolean $$5, ayd $$6) {
      try {
         djb $$7 = $$0.l();
         if ($$7 == djb.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gmf.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(im $$0, cyx $$1, exr $$2, dpy $$3, elr $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public gca b() {
      return this.b;
   }

   public goo a(dpy $$0) {
      return this.a.b($$0);
   }

   public void a(dpy $$0, exn $$1, gbe $$2, int $$3, int $$4) {
      djb $$5 = $$0.l();
      if ($$5 != djb.a) {
         switch ($$5) {
            case c:
               goo $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(gaz.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new csd($$0.b()), csa.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ato $$0) {
      this.d.a();
   }
}
