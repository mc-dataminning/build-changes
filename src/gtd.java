import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class gtd implements avg {
   private final gtc a;
   private final gtf b;
   private final Supplier<gsw> c;
   private final gte d;
   private final azx e = azx.a();
   private final List<gtm> f = new ArrayList<>();
   private final fsf g;

   public gtd(gtc $$0, Supplier<gsw> $$1, fsf $$2) {
      this.a = $$0;
      this.c = $$1;
      this.g = $$2;
      this.b = new gtf(this.g);
      this.d = new gte();
   }

   public gtc a() {
      return this.a;
   }

   public void a(ebe $$0, iv $$1, diy $$2, flo $$3, flr $$4) {
      if ($$0.o() == dtp.b) {
         gtn $$5 = this.a.b($$0);
         this.e.b($$0.b($$1));
         this.f.clear();
         $$5.a(this.e, this.f);
         this.b.a($$2, this.f, $$0, $$1, $$3, $$4, true, hkq.d);
      }
   }

   public void a(ebe $$0, iv $$1, diy $$2, flo $$3, flr $$4, boolean $$5, List<gtm> $$6) {
      try {
         this.b.a($$2, $$6, $$0, $$1, $$3, $$4, $$5, hkq.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(iv $$0, diy $$1, flr $$2, ebe $$3, exo $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, null);
         throw new aa($$6);
      }
   }

   public gtf b() {
      return this.b;
   }

   public gtn a(ebe $$0) {
      return this.a.b($$0);
   }

   public void a(ebe $$0, flo $$1, gsa $$2, int $$3, int $$4) {
      dtp $$5 = $$0.o();
      if ($$5 != dtp.a) {
         gtn $$6 = this.a($$0);
         int $$7 = this.g.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(grs.c($$0)), $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), czw.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avf $$0) {
      this.d.a();
   }
}
