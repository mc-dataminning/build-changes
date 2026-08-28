import java.util.function.Supplier;

public class gnc implements auq {
   private final gnb a;
   private final gne b;
   private final Supplier<gmv> c;
   private final gnd d;
   private final azh e = azh.a();
   private final fml f;

   public gnc(gnb $$0, Supplier<gmv> $$1, fml $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gne(this.f);
      this.d = new gnd();
   }

   public gnb a() {
      return this.a;
   }

   public void a(dwx $$0, ji $$1, dfk $$2, ffu $$3, ffy $$4) {
      if ($$0.o() == dpx.b) {
         hgs $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hei.d);
      }
   }

   public void a(dwx $$0, ji $$1, dfk $$2, ffu $$3, ffy $$4, boolean $$5, azh $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hei.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(ji $$0, dfk $$1, ffy $$2, dwx $$3, esz $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gne b() {
      return this.b;
   }

   public hgs a(dwx $$0) {
      return this.a.b($$0);
   }

   public void a(dwx $$0, ffu $$1, gly $$2, int $$3, int $$4) {
      dpx $$5 = $$0.o();
      if ($$5 != dpx.a) {
         hgs $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(glr.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), cwn.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(aup $$0) {
      this.d.a();
   }
}
