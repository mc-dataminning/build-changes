import java.util.function.Supplier;

public class gnd implements auq {
   private final gnc a;
   private final gnf b;
   private final Supplier<gmw> c;
   private final gne d;
   private final azh e = azh.a();
   private final fmm f;

   public gnd(gnc $$0, Supplier<gmw> $$1, fmm $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new gnf(this.f);
      this.d = new gne();
   }

   public gnc a() {
      return this.a;
   }

   public void a(dwy $$0, ji $$1, dfl $$2, ffv $$3, ffz $$4) {
      if ($$0.o() == dpy.b) {
         hgt $$5 = this.a.b($$0);
         long $$6 = $$0.b($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, hej.d);
      }
   }

   public void a(dwy $$0, ji $$1, dfl $$2, ffv $$3, ffz $$4, boolean $$5, azh $$6) {
      try {
         this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.b($$1), hej.d);
      } catch (Throwable var11) {
         o $$8 = o.a(var11, "Tesselating block in world");
         p $$9 = $$8.a("Block being tesselated");
         p.a($$9, $$2, $$1, $$0);
         throw new z($$8);
      }
   }

   public void a(ji $$0, dfl $$1, ffz $$2, dwy $$3, eta $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new z($$6);
      }
   }

   public gnf b() {
      return this.b;
   }

   public hgt a(dwy $$0) {
      return this.a.b($$0);
   }

   public void a(dwy $$0, ffv $$1, glz $$2, int $$3, int $$4) {
      dpy $$5 = $$0.o();
      if ($$5 != dpy.a) {
         hgt $$6 = this.a($$0);
         int $$7 = this.f.a($$0, null, null, 0);
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         this.b.a($$1.c(), $$2.getBuffer(gls.c($$0)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), cwo.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(aup $$0) {
      this.d.a();
   }
}
