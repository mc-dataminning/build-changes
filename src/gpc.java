import java.util.function.Supplier;

public class gpc implements avb {
   private final gpb a;
   private final gpe b;
   private final Supplier<gov> c;
   private final gpd d;
   private final azs e = azs.a();
   private final fof f;

   public gpc(gpb $$0, Supplier<gov> $$1, fof $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gpe(this.f);
      this.d = new gpd();
   }

   public gpb a() {
      return this.a;
   }

   public void a(dym $$0, jj $$1, dgs $$2, fho $$3, fhs $$4) {
      if ($$0.o() == drf.b) {
         his $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hgi.d);
      }
   }

   public void a(dym $$0, jj $$1, dgs $$2, fho $$3, fhs $$4, boolean $$5, azs $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hgi.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(jj $$0, dgs $$1, fhs $$2, dym $$3, eut $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gpe b() {
      return this.b;
   }

   public his a(dym $$0) {
      return this.a.b($$0);
   }

   public void a(dym $$0, fho $$1, gny $$2, int $$3, int $$4) {
      drf $$5 = $$0.o();
      if ($$5 != drf.a) {
         his $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gnr.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), cxw.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ava $$0) {
      this.d.a();
   }
}
