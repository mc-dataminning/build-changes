import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gss implements gso {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gdh c;
   private final guj d;
   private final ddi e;
   private final ayo f;
   private final Object2ObjectArrayMap<ddg, gss.a> g = new Object2ObjectArrayMap();
   private Optional<dde> h = Optional.empty();
   private Optional<ddd> i = Optional.empty();
   private float j;
   @Nullable
   private ddg k;

   public gss(gdh $$0, guj $$1, ddi $$2) {
      this.f = $$0.dR().E_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gsn::m);
      ddg $$0 = this.e.a(this.c.dw(), this.c.dy(), this.c.dC()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gss.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gss.a((avg)$$1.a());
                  this.d.a((gte)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gsz.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dcg $$1 = this.c.dR();
               int $$2 = $$0x.c() * 2 + 1;
               ja $$3 = ja.a(
                  this.c.dw() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dA() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dC() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dcp.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.Q() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dcp.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dw();
                  double $$9 = $$6 - this.c.dA();
                  double $$10 = $$7 - this.c.dC();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gsz $$13 = gsz.a($$0x.a().a(), this.f, this.c.dw() + $$8 / $$11 * $$12, this.c.dA() + $$9 / $$11 * $$12, this.c.dC() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gsn {
      private int n;
      private int o;

      public a(avg $$0) {
         super($$0, avi.i, gte.t());
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
         this.d = ayg.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
