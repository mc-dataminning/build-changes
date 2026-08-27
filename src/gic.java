import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class gic implements ghy {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final fsv c;
   private final gjs d;
   private final cuy e;
   private final auw f;
   private final Object2ObjectArrayMap<cuw, gic.a> g = new Object2ObjectArrayMap();
   private Optional<cuu> h = Optional.empty();
   private Optional<cut> i = Optional.empty();
   private float j;
   @Nullable
   private cuw k;

   public gic(fsv $$0, gjs $$1, cuy $$2) {
      this.f = $$0.dL().F_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(ghx::m);
      cuw $$0 = this.e.a(this.c.dq(), this.c.ds(), this.c.dw()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.m();
         this.i = $$0.n();
         this.g.values().forEach(gic.a::o);
         $$0.l().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new gic.a((ars)$$1.a());
                  this.d.a((gio)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(gij.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               ctx $$1 = this.c.dL();
               int $$2 = $$0x.c() * 2 + 1;
               hx $$3 = hx.a(
                  this.c.dq() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.du() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dw() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(cug.a, $$3);
               if ($$4 > 0) {
                  this.j = this.j - (float)$$4 / (float)$$1.O() * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(cug.b, $$3) - 1) / (float)$$0x.b();
               }

               if (this.j >= 1.0F) {
                  double $$5 = (double)$$3.u() + 0.5;
                  double $$6 = (double)$$3.v() + 0.5;
                  double $$7 = (double)$$3.w() + 0.5;
                  double $$8 = $$5 - this.c.dq();
                  double $$9 = $$6 - this.c.du();
                  double $$10 = $$7 - this.c.dw();
                  double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                  double $$12 = $$11 + $$0x.d();
                  gij $$13 = gij.a($$0x.a().a(), this.f, this.c.dq() + $$8 / $$11 * $$12, this.c.du() + $$9 / $$11 * $$12, this.c.dw() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends ghx {
      private int n;
      private int o;

      public a(ars $$0) {
         super($$0, aru.i, gio.t());
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
         this.d = aup.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
