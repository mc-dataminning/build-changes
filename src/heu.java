import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class heu implements heq {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gkf c;
   private final hgl d;
   private final dil e;
   private final bam f;
   private final Object2ObjectArrayMap<dij, heu.a> g = new Object2ObjectArrayMap();
   private Optional<dih> h = Optional.empty();
   private Optional<dig> i = Optional.empty();
   private float j;
   @Nullable
   private dij k;

   public heu(gkf $$0, hgl $$1, dil $$2) {
      this.f = $$0.dV().H_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(hep::m);
      dij $$0 = this.e.a(this.c.dA(), this.c.dC(), this.c.dG()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(heu.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new heu.a((axe)$$1.a());
                  this.d.a((hfg)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hfb.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dhh $$1 = this.c.dV();
               int $$2 = $$0x.c() * 2 + 1;
               jh $$3 = jh.a(
                  this.c.dA() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dE() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dG() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dhq.a, $$3);
               if ($$4 > 0) {
                  this.j -= (float)$$4 / 15.0F * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dhq.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dA();
                  double $$9 = $$6 - this.c.dE();
                  double $$10 = $$7 - this.c.dG();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  hfb $$13 = hfb.a($$0x.a().a(), this.f, this.c.dA() + $$8 / $$11 * $$12, this.c.dE() + $$9 / $$11 * $$12, this.c.dG() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends hep {
      private int n;
      private int o;

      public a(axe $$0) {
         super($$0, axg.i, hfg.t());
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
