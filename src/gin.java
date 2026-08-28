import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gin implements gim.a {
   private final fgo a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gin.a> d = Lists.newArrayList();
   private final List<gin.b> e = Lists.newArrayList();

   public gin(fgo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      dcw $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         exc $$6 = new exc($$2, 0.0, $$4);
         this.d.removeIf(gin.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fbm $$7 = $$1.getBuffer(gfh.y());

         for (gin.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gex.a($$0, $$7, exs.a(new ewx($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fbm $$9 = $$1.getBuffer(gfh.A());

         for (gin.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gex.b(
                        $$0,
                        $$9,
                        $$5x.a() - 0.25 - $$2,
                        $$5x.b() - $$3,
                        $$5x.c() - 0.25 - $$4,
                        $$5x.a() + 0.25 - $$2,
                        $$5x.b() - $$3 + 1.0,
                        $$5x.c() + 0.25 - $$4,
                        1.0F,
                        1.0F,
                        0.0F,
                        0.35F
                     )
               );
         }

         for (gin.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gim.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gim.a($$0, $$1, jd.a((jw)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gin.a $$12 : this.d) {
            exc $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ewx($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gim.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fbi $$0, gez $$1, ewx $$2, float $$3, float $$4, float $$5, float $$6) {
      ffy $$7 = fgo.Q().j.l();
      if ($$7.h()) {
         exc $$8 = $$7.b().e();
         gim.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(akq<dxz> $$0, exc $$1) {
      this.d.add(new gin.a(ad.c(), $$0, $$1));
   }

   public void a(dyd $$0, int $$1) {
      this.e.add(new gin.b($$0, $$1));
   }

   static record a(long a, akq<dxz> b, exc c) {

      public boolean a() {
         return ad.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public akq<dxz> c() {
         return this.b;
      }

      public exc d() {
         return this.c;
      }
   }

   static class b implements dyb {
      public final dyd a;
      public final int b;

      public b(dyd $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dcw $$0, exc $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<exc> a(dcw $$0) {
         return this.a.a($$0);
      }

      @Override
      public dyd a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aqu $$0, jm<dxz> $$1, dxz.a $$2, exc $$3) {
         return false;
      }
   }
}
