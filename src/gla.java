import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gla implements gkw {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fvs c;
   private final gmq d;
   private final cxf e;
   private final awt f;
   private final Object2ObjectArrayMap<cxd, gla.a> g = new Object2ObjectArrayMap();
   private Optional<cxb> h = Optional.empty();
   private Optional<cxa> i = Optional.empty();
   private float j;
   @Nullable
   private cxd k;

   public gla(fvs $$0, gmq $$1, cxf $$2) {
      this.f = $$0.dJ().F_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(gkv::m);
      cxd $$0 = this.e.a(this.c.do(), this.c.dq(), this.c.du()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gla.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gla.a((ato)$$1.a());
                  this.d.a((glm)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(glh.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               cwe $$1 = this.c.dJ();
               int $$2 = $$0x.c() * 2 + 1;
               ib $$3 = ib.a(
                  this.c.do() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.ds() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.du() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(cwn.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.O() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(cwn.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.do();
                  double $$9 = $$6 - this.c.ds();
                  double $$10 = $$7 - this.c.du();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  glh $$13 = glh.a($$0x.a().a(), this.f, this.c.do() + $$8 / $$11 * $$12, this.c.ds() + $$9 / $$11 * $$12, this.c.du() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends gkv {
      private int n;
      private int o;

      public a(ato $$0) {
         super($$0, atq.i, glm.t());
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
         this.d = awm.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
