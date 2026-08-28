import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class guu implements gut.a {
   private final fpt a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<guu.a> d = Lists.newArrayList();
   private final List<guu.b> e = Lists.newArrayList();

   public guu(fpt $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fkd $$0, gqr $$1, double $$2, double $$3, double $$4) {
      djm $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ffc $$6 = new ffc($$2, 0.0, $$4);
         this.d.removeIf(guu.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fkh $$7 = $$1.getBuffer(grc.y());

         for (guu.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gut.a($$0, $$7, fft.a(new fex($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fkh $$9 = $$1.getBuffer(grc.B());

         for (guu.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> grk.b(
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

         for (guu.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gut.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gut.a($$0, $$1, iv.a((jp)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (guu.a $$12 : this.d) {
            ffc $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fex($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gut.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fkd $$0, gqr $$1, fex $$2, float $$3, float $$4, float $$5, float $$6) {
      fpb $$7 = fpt.Q().j.k();
      if ($$7.h()) {
         ffc $$8 = $$7.b().e();
         gut.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(alf<eft> $$0, ffc $$1) {
      this.d.add(new guu.a(ag.c(), $$0, $$1));
   }

   public void a(efx $$0, int $$1) {
      this.e.add(new guu.b($$0, $$1));
   }

   static record a(long a, alf<eft> b, ffc c) {

      public boolean a() {
         return ag.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public alf<eft> c() {
         return this.b;
      }

      public ffc d() {
         return this.c;
      }
   }

   static class b implements efv {
      public final efx a;
      public final int b;

      public b(efx $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(djm $$0, ffc $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ffc> a(djm $$0) {
         return this.a.a($$0);
      }

      @Override
      public efx a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arq $$0, jf<eft> $$1, eft.a $$2, ffc $$3) {
         return false;
      }
   }
}
