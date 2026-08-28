import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class gsq implements avp {
   private final gsp a;
   private final gss b;
   private final Supplier<gsj> c;
   private final gsr d;
   private final bai e = bai.a();
   private final List<gsz> f = new ArrayList<>();
   private final frs g;

   public gsq(gsp $$0, Supplier<gsj> $$1, frs $$2) {
      this.a = $$0;
      this.c = $$1;
      this.g = $$2;
      this.b = new gss(this.g);
      this.d = new gsr();
   }

   public gsp a() {
      return this.a;
   }

   public void a(ebq $$0, iw $$1, djk $$2, fld $$3, flg $$4) {
      if ($$0.o() == dub.b) {
         gta $$5 = this.a.b($$0);
         this.e.b($$0.b($$1));
         this.f.clear();
         $$5.a(this.e, this.f);
         this.b.a($$2, this.f, $$0, $$1, $$3, $$4, true, hkg.d);
      }
   }

   public void a(ebq $$0, iw $$1, djk $$2, fld $$3, flg $$4, boolean $$5, List<gsz> $$6) {
      try {
         this.b.a($$2, $$6, $$0, $$1, $$3, $$4, $$5, hkg.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(iw $$0, djk $$1, flg $$2, ebq $$3, eya $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, $$3);
         throw new aa($$6);
      }
   }

   public gss b() {
      return this.b;
   }

   public gta a(ebq $$0) {
      return this.a.b($$0);
   }

   public void a(ebq $$0, fld $$1, grn $$2, int $$3, int $$4) {
      dub $$5 = $$0.o();
      if ($$5 != dub.a) {
         gta $$6 = this.a($$0);
         int $$7 = this.g.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         gss.a($$1.c(), $$2.getBuffer(grf.c($$0)), $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), dai.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avo $$0) {
      this.d.a();
   }
}
