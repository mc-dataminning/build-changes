import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class gtf implements avi {
   private final gte a;
   private final gth b;
   private final Supplier<gsy> c;
   private final gtg d;
   private final azz e = azz.a();
   private final List<gto> f = new ArrayList<>();
   private final fsh g;

   public gtf(gte $$0, Supplier<gsy> $$1, fsh $$2) {
      this.a = $$0;
      this.c = $$1;
      this.g = $$2;
      this.b = new gth(this.g);
      this.d = new gtg();
   }

   public gte a() {
      return this.a;
   }

   public void a(ebg $$0, iw $$1, dja $$2, flq $$3, flt $$4) {
      if ($$0.o() == dtr.b) {
         gtp $$5 = this.a.b($$0);
         this.e.b($$0.b($$1));
         this.f.clear();
         $$5.a(this.e, this.f);
         this.b.a($$2, this.f, $$0, $$1, $$3, $$4, true, hks.d);
      }
   }

   public void a(ebg $$0, iw $$1, dja $$2, flq $$3, flt $$4, boolean $$5, List<gto> $$6) {
      try {
         this.b.a($$2, $$6, $$0, $$1, $$3, $$4, $$5, hks.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(iw $$0, dja $$1, flt $$2, ebg $$3, exq $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, null);
         throw new aa($$6);
      }
   }

   public gth b() {
      return this.b;
   }

   public gtp a(ebg $$0) {
      return this.a.b($$0);
   }

   public void a(ebg $$0, flq $$1, gsc $$2, int $$3, int $$4) {
      dtr $$5 = $$0.o();
      if ($$5 != dtr.a) {
         gtp $$6 = this.a($$0);
         int $$7 = this.g.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gru.c($$0)), $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), czy.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avh $$0) {
      this.d.a();
   }
}
