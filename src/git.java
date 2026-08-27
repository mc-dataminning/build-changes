import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class git implements gis.a {
   private final fgj a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<git.a> d = Lists.newArrayList();
   private final List<git.b> e = Lists.newArrayList();

   public git(fgj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, gfg $$1, double $$2, double $$3, double $$4) {
      dca $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ewu $$6 = new ewu($$2, 0.0, $$4);
         this.d.removeIf(git.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fbg $$7 = $$1.getBuffer(gfo.z());

         for (git.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gfe.a($$0, $$7, exk.a(new ewp($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fbg $$9 = $$1.getBuffer(gfo.B());

         for (git.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gfe.b(
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

         for (git.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gis.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gis.a($$0, $$1, ir.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (git.a $$12 : this.d) {
            ewu $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ewp($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gis.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fbc $$0, gfg $$1, ewp $$2, float $$3, float $$4, float $$5, float $$6) {
      ffu $$7 = fgj.Q().j.m();
      if ($$7.h()) {
         ewu $$8 = $$7.b().e();
         gis.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aks<dxv> $$0, ewu $$1) {
      this.d.add(new git.a(ad.b(), $$0, $$1));
   }

   public void a(dxz $$0, int $$1) {
      this.e.add(new git.b($$0, $$1));
   }

   static record a(long a, aks<dxv> b, ewu c) {

      public boolean a() {
         return ad.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aks<dxv> c() {
         return this.b;
      }

      public ewu d() {
         return this.c;
      }
   }

   static class b implements dxx {
      public final dxz a;
      public final int b;

      public b(dxz $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dca $$0, ewu $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ewu> a(dca $$0) {
         return this.a.a($$0);
      }

      @Override
      public dxz a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aqt $$0, ja<dxv> $$1, dxv.a $$2, ewu $$3) {
         return false;
      }
   }
}
