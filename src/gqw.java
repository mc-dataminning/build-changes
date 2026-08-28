import java.util.function.Supplier;

public class gqw implements ave {
   private final gqv a;
   private final gqy b;
   private final Supplier<gqp> c;
   private final gqx d;
   private final azv e = azv.a();
   private final fpu f;

   public gqw(gqv $$0, Supplier<gqp> $$1, fpu $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gqy(this.f);
      this.d = new gqx();
   }

   public gqv a() {
      return this.a;
   }

   public void a(dzz $$0, iu $$1, dhy $$2, fjc $$3, fjg $$4) {
      if ($$0.o() == dsm.b) {
         hkp $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hif.d);
      }
   }

   public void a(dzz $$0, iu $$1, dhy $$2, fjc $$3, fjg $$4, boolean $$5, azv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hif.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(iu $$0, dhy $$1, fjg $$2, dzz $$3, ewg $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gqy b() {
      return this.b;
   }

   public hkp a(dzz $$0) {
      return this.a.b($$0);
   }

   public void a(dzz $$0, fjc $$1, gps $$2, int $$3, int $$4) {
      dsm $$5 = $$0.o();
      if ($$5 != dsm.a) {
         hkp $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gpk.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), cyw.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avd $$0) {
      this.d.a();
   }
}
