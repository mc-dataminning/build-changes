import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gpf implements gpe.a {
   private final flz a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gpf.a> d = Lists.newArrayList();
   private final List<gpf.b> e = Lists.newArrayList();

   public gpf(flz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgl $$0, gle $$1, double $$2, double $$3, double $$4) {
      dha $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         fbs $$6 = new fbs($$2, 0.0, $$4);
         this.d.removeIf(gpf.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fgp $$7 = $$1.getBuffer(glo.y());

         for (gpf.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gpe.a($$0, $$7, fcj.a(new fbn($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fgp $$9 = $$1.getBuffer(glo.B());

         for (gpf.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gly.b(
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

         for (gpf.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gpe.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gpe.a($$0, $$1, jh.a((ka)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gpf.a $$12 : this.d) {
            fbs $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fbn($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gpe.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fgl $$0, gle $$1, fbn $$2, float $$3, float $$4, float $$5, float $$6) {
      fli $$7 = flz.Q().j.k();
      if ($$7.h()) {
         fbs $$8 = $$7.b().e();
         gpe.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aly<ecj> $$0, fbs $$1) {
      this.d.add(new gpf.a(ae.c(), $$0, $$1));
   }

   public void a(ecn $$0, int $$1) {
      this.e.add(new gpf.b($$0, $$1));
   }

   static record a(long a, aly<ecj> b, fbs c) {

      public boolean a() {
         return ae.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aly<ecj> c() {
         return this.b;
      }

      public fbs d() {
         return this.c;
      }
   }

   static class b implements ecl {
      public final ecn a;
      public final int b;

      public b(ecn $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dha $$0, fbs $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<fbs> a(dha $$0) {
         return this.a.a($$0);
      }

      @Override
      public ecn a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(ash $$0, jq<ecj> $$1, ecj.a $$2, fbs $$3) {
         return false;
      }
   }
}
