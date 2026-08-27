import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gho implements ghk {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fsj c;
   private final gje d;
   private final cuq e;
   private final auv f;
   private final Object2ObjectArrayMap<cuo, gho.a> g = new Object2ObjectArrayMap();
   private Optional<cum> h = Optional.empty();
   private Optional<cul> i = Optional.empty();
   private float j;
   @Nullable
   private cuo k;

   public gho(fsj $$0, gje $$1, cuq $$2) {
      this.f = $$0.dM().F_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(ghj::m);
      cuo $$0 = this.e.a(this.c.dr(), this.c.dt(), this.c.dx()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gho.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gho.a((arr)$$1.a());
                  this.d.a((gia)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(ghv.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               ctp $$1 = this.c.dM();
               int $$2 = $$0x.c() * 2 + 1;
               hx $$3 = hx.a(
                  this.c.dr() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dv() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dx() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(cty.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.O() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(cty.b, $$3) - 1) / (float)$$0x.b();
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
                  ghv $$13 = ghv.a($$0x.a().a(), this.f, this.c.dr() + $$8 / $$11 * $$12, this.c.dv() + $$9 / $$11 * $$12, this.c.dx() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends ghj {
      private int n;
      private int o;

      public a(arr $$0) {
         super($$0, art.i, gia.t());
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
         this.d = auo.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
