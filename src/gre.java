import java.util.function.Supplier;

public class gre implements ave {
   private final grd a;
   private final grg b;
   private final Supplier<gqx> c;
   private final grf d;
   private final azv e = azv.a();
   private final fqb f;

   public gre(grd $$0, Supplier<gqx> $$1, fqb $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new grg(this.f);
      this.d = new grf();
   }

   public grd a() {
      return this.a;
   }

   public void a(eah $$0, iu $$1, did $$2, fjj $$3, fjn $$4) {
      if ($$0.o() == dss.b) {
         hkx $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hin.d);
      }
   }

   public void a(eah $$0, iu $$1, did $$2, fjj $$3, fjn $$4, boolean $$5, azv $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hin.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(iu $$0, did $$1, fjn $$2, eah $$3, ewo $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public grg b() {
      return this.b;
   }

   public hkx a(eah $$0) {
      return this.a.b($$0);
   }

   public void a(eah $$0, fjj $$1, gqa $$2, int $$3, int $$4) {
      dss $$5 = $$0.o();
      if ($$5 != dss.a) {
         hkx $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gps.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), czb.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(avd $$0) {
      this.d.a();
   }
}
