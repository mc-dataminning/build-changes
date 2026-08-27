import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gfb implements gfa.a {
   private final fde a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gfb.a> d = Lists.newArrayList();
   private final List<gfb.b> e = Lists.newArrayList();

   public gfb(fde $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exx $$0, gbo $$1, double $$2, double $$3, double $$4) {
      dad $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         etp $$6 = new etp($$2, 0.0, $$4);
         this.d.removeIf(gfb.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         eyb $$7 = $$1.getBuffer(gbw.y());

         for (gfb.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gbm.a($$0, $$7, euf.a(new etk($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         eyb $$9 = $$1.getBuffer(gbw.A());

         for (gfb.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gbm.b(
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

         for (gfb.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gfa.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gfa.a($$0, $$1, in.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gfb.a $$12 : this.d) {
            etp $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new etk($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gfa.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(exx $$0, gbo $$1, etk $$2, float $$3, float $$4, float $$5, float $$6) {
      fcp $$7 = fde.Q().j.m();
      if ($$7.h()) {
         etp $$8 = $$7.b().e();
         gfa.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(akg<dva> $$0, etp $$1) {
      this.d.add(new gfb.a(ac.b(), $$0, $$1));
   }

   public void a(dve $$0, int $$1) {
      this.e.add(new gfb.b($$0, $$1));
   }

   static record a(long a, akg<dva> b, etp c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public akg<dva> c() {
         return this.b;
      }

      public etp d() {
         return this.c;
      }
   }

   static class b implements dvc {
      public final dve a;
      public final int b;

      public b(dve $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dad $$0, etp $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<etp> a(dad $$0) {
         return this.a.a($$0);
      }

      @Override
      public dve a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aqh $$0, iw<dva> $$1, dva.a $$2, etp $$3) {
         return false;
      }
   }
}
