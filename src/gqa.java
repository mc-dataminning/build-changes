import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gqa implements gpw {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gaq c;
   private final grq d;
   private final dbe e;
   private final ayg f;
   private final Object2ObjectArrayMap<dbc, gqa.a> g = new Object2ObjectArrayMap();
   private Optional<dba> h = Optional.empty();
   private Optional<daz> i = Optional.empty();
   private float j;
   @Nullable
   private dbc k;

   public gqa(gaq $$0, grq $$1, dbe $$2) {
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
      this.g.values().removeIf(gpv::m);
      dbc $$0 = this.e.a(this.c.ds(), this.c.du(), this.c.dy()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gqa.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gqa.a((avb)$$1.a());
                  this.d.a((gqm)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gqh.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dad $$1 = this.c.dN();
               int $$2 = $$0x.c() * 2 + 1;
               in $$3 = in.a(
                  this.c.ds() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dw() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dy() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dam.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.P() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dam.b, $$3) - 1) / (float)$$0x.b();
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
                  gqh $$13 = gqh.a($$0x.a().a(), this.f, this.c.ds() + $$8 / $$11 * $$12, this.c.dw() + $$9 / $$11 * $$12, this.c.dy() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gpv {
      private int n;
      private int o;

      public a(avb $$0) {
         super($$0, avd.i, gqm.t());
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
         this.d = axz.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
