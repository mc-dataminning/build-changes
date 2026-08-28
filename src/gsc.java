import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gsc implements gry {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gcr c;
   private final gtw d;
   private final dda e;
   private final azh f;
   private final Object2ObjectArrayMap<dcy, gsc.a> g = new Object2ObjectArrayMap();
   private Optional<dcw> h = Optional.empty();
   private Optional<dcv> i = Optional.empty();
   private float j;
   @Nullable
   private dcy k;

   public gsc(gcr $$0, gtw $$1, dda $$2) {
      this.f = $$0.dP().E_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(grx::m);
      dcy $$0 = this.e.a(this.c.du(), this.c.dw(), this.c.dA()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gsc.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gsc.a((avz)$$1.a());
                  this.d.a((gso)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gsj.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dbz $$1 = this.c.dP();
               int $$2 = $$0x.c() * 2 + 1;
               iz $$3 = iz.a(
                  this.c.du() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dy() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dA() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dci.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.Q() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dci.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.du();
                  double $$9 = $$6 - this.c.dy();
                  double $$10 = $$7 - this.c.dA();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gsj $$13 = gsj.a($$0x.a().a(), this.f, this.c.du() + $$8 / $$11 * $$12, this.c.dy() + $$9 / $$11 * $$12, this.c.dA() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends grx {
      private int n;
      private int o;

      public a(avz $$0) {
         super($$0, awb.i, gso.t());
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.o < 0) {
            this.n();
         }

         this.o = this.o + this.n;
         this.d = ayz.a((float)this.o / 40.0F, 0.0F, 1.0F);
      }

      public void o() {
         this.o = Math.min(this.o, 40);
         this.n = -1;
      }

      public void p() {
         this.o = Math.max(0, this.o);
         this.n = 1;
      }
   }
}
