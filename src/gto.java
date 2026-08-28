import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gto implements gtk {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final geb c;
   private final gvf d;
   private final ddy e;
   private final ayw f;
   private final Object2ObjectArrayMap<ddw, gto.a> g = new Object2ObjectArrayMap();
   private Optional<ddu> h = Optional.empty();
   private Optional<ddt> i = Optional.empty();
   private float j;
   @Nullable
   private ddw k;

   public gto(geb $$0, gvf $$1, ddy $$2) {
      this.f = $$0.dO().E_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gtj::m);
      ddw $$0 = this.e.a(this.c.dt(), this.c.dv(), this.c.dz()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gto.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gto.a((avo)$$1.a());
                  this.d.a((gua)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gtv.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dcw $$1 = this.c.dO();
               int $$2 = $$0x.c() * 2 + 1;
               jd $$3 = jd.a(
                  this.c.dt() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dx() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dz() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(ddf.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.Q() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(ddf.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dt();
                  double $$9 = $$6 - this.c.dx();
                  double $$10 = $$7 - this.c.dz();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gtv $$13 = gtv.a($$0x.a().a(), this.f, this.c.dt() + $$8 / $$11 * $$12, this.c.dx() + $$9 / $$11 * $$12, this.c.dz() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gtj {
      private int n;
      private int o;

      public a(avo $$0) {
         super($$0, avq.i, gua.t());
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
         this.d = ayo.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
