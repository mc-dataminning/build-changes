import java.util.function.Supplier;

public class gqh implements avc {
   private final gqg a;
   private final gqj b;
   private final Supplier<gqa> c;
   private final gqi d;
   private final azt e = azt.a();
   private final fpi f;

   public gqh(gqg $$0, Supplier<gqa> $$1, fpi $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gqj(this.f);
      this.d = new gqi();
   }

   public gqg a() {
      return this.a;
   }

   public void a(dzo $$0, iu $$1, dhs $$2, fiq $$3, fiu $$4) {
      if ($$0.o() == dsf.b) {
         hjz $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hhp.d);
      }
   }

   public void a(dzo $$0, iu $$1, dhs $$2, fiq $$3, fiu $$4, boolean $$5, azt $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hhp.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(iu $$0, dhs $$1, fiu $$2, dzo $$3, evv $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gqj b() {
      return this.b;
   }

   public hjz a(dzo $$0) {
      return this.a.b($$0);
   }

   public void a(dzo $$0, fiq $$1, gpd $$2, int $$3, int $$4) {
      dsf $$5 = $$0.o();
      if ($$5 != dsf.a) {
         hjz $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gov.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), cyq.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avb $$0) {
      this.d.a();
   }
}
