import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gok implements gog {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fzb c;
   private final gqa d;
   private final czy e;
   private final axr f;
   private final Object2ObjectArrayMap<czw, gok.a> g = new Object2ObjectArrayMap();
   private Optional<czu> h = Optional.empty();
   private Optional<czt> i = Optional.empty();
   private float j;
   @Nullable
   private czw k;

   public gok(fzb $$0, gqa $$1, czy $$2) {
      this.f = $$0.dM().E_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gof::m);
      czw $$0 = this.e.a(this.c.dr(), this.c.dt(), this.c.dx()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gok.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gok.a((aul)$$1.a());
                  this.d.a((gow)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gor.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               cyx $$1 = this.c.dM();
               int $$2 = $$0x.c() * 2 + 1;
               ib $$3 = ib.a(
                  this.c.dr() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dv() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dx() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(czg.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.P() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(czg.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dr();
                  double $$9 = $$6 - this.c.dv();
                  double $$10 = $$7 - this.c.dx();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gor $$13 = gor.a($$0x.a().a(), this.f, this.c.dr() + $$8 / $$11 * $$12, this.c.dv() + $$9 / $$11 * $$12, this.c.dx() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gof {
      private int n;
      private int o;

      public a(aul $$0) {
         super($$0, aun.i, gow.t());
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
         this.d = axk.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
