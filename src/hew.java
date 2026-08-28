import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class hew implements hes {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gkh c;
   private final hgn d;
   private final dim e;
   private final bam f;
   private final Object2ObjectArrayMap<dik, hew.a> g = new Object2ObjectArrayMap();
   private Optional<dii> h = Optional.empty();
   private Optional<dih> i = Optional.empty();
   private float j;
   @Nullable
   private dik k;

   public hew(gkh $$0, hgn $$1, dim $$2) {
      this.f = $$0.dW().H_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(her::m);
      dik $$0 = this.e.a(this.c.dB(), this.c.dD(), this.c.dH()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(hew.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new hew.a((axe)$$1.a());
                  this.d.a((hfi)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hfd.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dhi $$1 = this.c.dW();
               int $$2 = $$0x.c() * 2 + 1;
               jh $$3 = jh.a(
                  this.c.dB() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dF() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dH() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dhr.a, $$3);
               if ($$4 > 0) {
                  this.j -= (float)$$4 / 15.0F * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dhr.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dB();
                  double $$9 = $$6 - this.c.dF();
                  double $$10 = $$7 - this.c.dH();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  hfd $$13 = hfd.a($$0x.a().a(), this.f, this.c.dB() + $$8 / $$11 * $$12, this.c.dF() + $$9 / $$11 * $$12, this.c.dH() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends her {
      private int n;
      private int o;

      public a(axe $$0) {
         super($$0, axg.i, hfi.t());
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
         this.d = bae.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
