import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gbq implements gbm {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fmw c;
   private final gdg d;
   private final cql e;
   private final aru f;
   private final Object2ObjectArrayMap<cqj, gbq.a> g = new Object2ObjectArrayMap();
   private Optional<cqh> h = Optional.empty();
   private Optional<cqg> i = Optional.empty();
   private float j;
   @Nullable
   private cqj k;

   public gbq(fmw $$0, gdg $$1, cql $$2) {
      this.f = $$0.dK().y_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gbl::m);
      cqj $$0 = this.e.a(this.c.dp(), this.c.dr(), this.c.dv()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gbq.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gbq.a((aov)$$1.a());
                  this.d.a((gcc)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gbx.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               cpl $$1 = this.c.dK();
               int $$2 = $$0x.c() * 2 + 1;
               gu $$3 = gu.a(
                  this.c.dp() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dt() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dv() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(cpu.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.M() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(cpu.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dp();
                  double $$9 = $$6 - this.c.dt();
                  double $$10 = $$7 - this.c.dv();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gbx $$13 = gbx.a($$0x.a().a(), this.f, this.c.dp() + $$8 / $$11 * $$12, this.c.dt() + $$9 / $$11 * $$12, this.c.dv() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gbl {
      private int n;
      private int o;

      public a(aov $$0) {
         super($$0, aox.i, gcc.t());
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
         this.d = arp.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
