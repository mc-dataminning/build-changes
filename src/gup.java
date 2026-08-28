import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gup implements guo.a {
   private final fpo a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gup.a> d = Lists.newArrayList();
   private final List<gup.b> e = Lists.newArrayList();

   public gup(fpo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjy $$0, gqm $$1, double $$2, double $$3, double $$4) {
      djh $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         fex $$6 = new fex($$2, 0.0, $$4);
         this.d.removeIf(gup.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fkc $$7 = $$1.getBuffer(gqx.y());

         for (gup.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               guo.a($$0, $$7, ffo.a(new fes($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fkc $$9 = $$1.getBuffer(gqx.B());

         for (gup.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> grf.b(
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

         for (gup.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               guo.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               guo.a($$0, $$1, iv.a((jp)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gup.a $$12 : this.d) {
            fex $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fes($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            guo.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fjy $$0, gqm $$1, fes $$2, float $$3, float $$4, float $$5, float $$6) {
      fow $$7 = fpo.Q().j.k();
      if ($$7.h()) {
         fex $$8 = $$7.b().e();
         guo.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(alf<efo> $$0, fex $$1) {
      this.d.add(new gup.a(ag.c(), $$0, $$1));
   }

   public void a(efs $$0, int $$1) {
      this.e.add(new gup.b($$0, $$1));
   }

   static record a(long a, alf<efo> b, fex c) {

      public boolean a() {
         return ag.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public alf<efo> c() {
         return this.b;
      }

      public fex d() {
         return this.c;
      }
   }

   static class b implements efq {
      public final efs a;
      public final int b;

      public b(efs $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(djh $$0, fex $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<fex> a(djh $$0) {
         return this.a.a($$0);
      }

      @Override
      public efs a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arq $$0, jf<efo> $$1, efo.a $$2, fex $$3) {
         return false;
      }
   }
}
