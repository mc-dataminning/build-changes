import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class hob implements hnx {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gqm c;
   private final hpt d;
   private final dlo e;
   private final bai f;
   private final Object2ObjectArrayMap<dlm, hob.a> g = new Object2ObjectArrayMap();
   private Optional<dlk> h = Optional.empty();
   private Optional<dlj> i = Optional.empty();
   private float j;
   @Nullable
   private dlm k;

   public hob(gqm $$0, hpt $$1, dlo $$2) {
      this.f = $$0.dV().G_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(hnw::m);
      dlm $$0 = this.e.a(this.c.dA(), this.c.dC(), this.c.dG()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.n();
         this.i = $$0.o();
         this.g.values().forEach(hob.a::o);
         $$0.m().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new hob.a((awx)$$1.a());
                  this.d.a((hon)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hoi.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               dkj $$1 = this.c.dV();
               int $$2 = $$0x.c() * 2 + 1;
               iw $$3 = iw.a(
                  this.c.dA() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dE() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dG() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dks.a, $$3);
               if ($$4 > 0) {
                  this.j -= (float)$$4 / 15.0F * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dks.b, $$3) - 1) / (float)$$0x.b();
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
                  hoi $$13 = hoi.a($$0x.a().a(), this.f, this.c.dA() + $$8 / $$11 * $$12, this.c.dE() + $$9 / $$11 * $$12, this.c.dG() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends hnw {
      private int n;
      private int o;

      public a(awx $$0) {
         super($$0, awz.i, hon.t());
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
         this.d = azz.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
