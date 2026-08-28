import java.util.function.Supplier;

public class grp implements ave {
   private final gro a;
   private final grr b;
   private final Supplier<gri> c;
   private final grq d;
   private final azv e = azv.a();
   private final fqq f;

   public grp(gro $$0, Supplier<gri> $$1, fqq $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new grr(this.f);
      this.d = new grq();
   }

   public gro a() {
      return this.a;
   }

   public void a(eao $$0, iv $$1, dik $$2, fjy $$3, fkc $$4) {
      if ($$0.o() == dsz.b) {
         gry $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hja.d);
      }
   }

   public void a(eao $$0, iv $$1, dik $$2, fjy $$3, fkc $$4, boolean $$5, azv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hja.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(iv $$0, dik $$1, fkc $$2, eao $$3, ewv $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, null);
         throw new aa($$6);
      }
   }

   public grr b() {
      return this.b;
   }

   public gry a(eao $$0) {
      return this.a.b($$0);
   }

   public void a(eao $$0, fjy $$1, gqm $$2, int $$3, int $$4) {
      dsz $$5 = $$0.o();
      if ($$5 != dsz.a) {
         gry $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gqe.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), czi.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avd $$0) {
      this.d.a();
   }
}
