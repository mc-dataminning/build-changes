import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class hon implements hoj {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final grb c;
   private final hqf d;
   private final dle e;
   private final azz f;
   private final Object2ObjectArrayMap<dlc, hon.a> g = new Object2ObjectArrayMap();
   private Optional<dla> h = Optional.empty();
   private Optional<dkz> i = Optional.empty();
   private float j;
   @Nullable
   private dlc k;

   public hon(grb $$0, hqf $$1, dle $$2) {
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
      this.g.values().removeIf(hoi::m);
      dlc $$0 = this.e.a(this.c.dA(), this.c.dC(), this.c.dG()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.n();
         this.i = $$0.o();
         this.g.values().forEach(hon.a::o);
         $$0.m().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
               if ($$2 == null) {
                  $$2 = new hon.a((awq)$$1.a());
                  this.d.a((hoz)$$2);
               }

               $$2.p();
               return $$2;
            }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hou.b($$0x.a().a()));
         }
      });
      this.h
         .ifPresent(
            $$0x -> {
               djz $$1 = this.c.dV();
               int $$2 = $$0x.c() * 2 + 1;
               iw $$3 = iw.a(
                  this.c.dA() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dE() + (double)this.f.a($$2) - (double)$$0x.c(),
                  this.c.dG() + (double)this.f.a($$2) - (double)$$0x.c()
               );
               int $$4 = $$1.a(dki.a, $$3);
               if ($$4 > 0) {
                  this.j -= (float)$$4 / 15.0F * 0.001F;
               } else {
                  this.j = this.j - (float)($$1.a(dki.b, $$3) - 1) / (float)$$0x.b();
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
                  hou $$13 = hou.a($$0x.a().a(), this.f, this.c.dA() + $$8 / $$11 * $$12, this.c.dE() + $$9 / $$11 * $$12, this.c.dG() + $$10 / $$11 * $$12);
                  this.d.a($$13);
                  this.j = 0.0F;
               } else {
                  this.j = Math.max(this.j, 0.0F);
               }
            }
         );
   }

   public static class a extends hoi {
      private int n;
      private int o;

      public a(awq $$0) {
         super($$0, aws.i, hoz.t());
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
         this.d = azq.a((float)this.o / 40.0F, 0.0F, 1.0F);
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
