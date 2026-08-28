import java.util.function.Supplier;

public class gru implements ave {
   private final grt a;
   private final grw b;
   private final Supplier<grn> c;
   private final grv d;
   private final azv e = azv.a();
   private final fqv f;

   public gru(grt $$0, Supplier<grn> $$1, fqv $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new grw(this.f);
      this.d = new grv();
   }

   public grt a() {
      return this.a;
   }

   public void a(eat $$0, iv $$1, din $$2, fkd $$3, fkh $$4) {
      if ($$0.o() == dte.b) {
         gsd $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hjg.d);
      }
   }

   public void a(eat $$0, iv $$1, din $$2, fkd $$3, fkh $$4, boolean $$5, azv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hjg.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(iv $$0, din $$1, fkh $$2, eat $$3, exa $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, null);
         throw new aa($$6);
      }
   }

   public grw b() {
      return this.b;
   }

   public gsd a(eat $$0) {
      return this.a.b($$0);
   }

   public void a(eat $$0, fkd $$1, gqr $$2, int $$3, int $$4) {
      dte $$5 = $$0.o();
      if ($$5 != dte.a) {
         gsd $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gqj.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), czl.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avd $$0) {
      this.d.a();
   }
}
