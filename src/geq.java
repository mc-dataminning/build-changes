import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class geq implements gem {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fpw c;
   private final ggg d;
   private final cta e;
   private final ats f;
   private final Object2ObjectArrayMap<csy, geq.a> g = new Object2ObjectArrayMap();
   private Optional<csw> h = Optional.empty();
   private Optional<csv> i = Optional.empty();
   private float j;
   @Nullable
   private csy k;

   public geq(fpw $$0, ggg $$1, cta $$2) {
      this.f = $$0.dN().E_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gel::m);
      csy $$0 = this.e.a(this.c.ds(), this.c.du(), this.c.dy()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(geq.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new geq.a((aqq)$$1.a());
                  this.d.a((gfc)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gex.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               csa $$1 = this.c.dN();
               int $$2 = $$0x.c() * 2 + 1;
               ht $$3 = ht.a(
                  this.c.ds() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dw() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dy() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(csj.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.N() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(csj.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.ds();
                  double $$9 = $$6 - this.c.dw();
                  double $$10 = $$7 - this.c.dy();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gex $$13 = gex.a($$0x.a().a(), this.f, this.c.ds() + $$8 / $$11 * $$12, this.c.dw() + $$9 / $$11 * $$12, this.c.dy() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gel {
      private int n;
      private int o;

      public a(aqq $$0) {
         super($$0, aqs.i, gfc.t());
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
         this.d = atm.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
