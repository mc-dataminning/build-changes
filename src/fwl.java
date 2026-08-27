import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fwl implements fwk.a {
   private final eva a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fwl.a> d = Lists.newArrayList();
   private final List<fwl.b> e = Lists.newArrayList();

   public fwl(eva $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ept $$0, fsz $$1, double $$2, double $$3, double $$4) {
      cti $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         elm $$6 = new elm($$2, 0.0, $$4);
         this.d.removeIf(fwl.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         epx $$7 = $$1.getBuffer(fth.w());

         for (fwl.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               fsx.a($$0, $$7, emc.a(new elh($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         epx $$9 = $$1.getBuffer(fth.y());

         for (fwl.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> fsx.b(
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

         for (fwl.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fwk.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fwk.a($$0, $$1, hx.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fwl.a $$12 : this.d) {
            elm $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new elh($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fwk.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(ept $$0, fsz $$1, elh $$2, float $$3, float $$4, float $$5, float $$6) {
      eul $$7 = eva.N().j.m();
      if ($$7.h()) {
         elm $$8 = $$7.b().e();
         fwk.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ahc<dnk> $$0, elm $$1) {
      this.d.add(new fwl.a(ac.b(), $$0, $$1));
   }

   public void a(dno $$0, int $$1) {
      this.e.add(new fwl.b($$0, $$1));
   }

   static record a(long a, ahc<dnk> b, elm c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ahc<dnk> c() {
         return this.b;
      }

      public elm d() {
         return this.c;
      }
   }

   static class b implements dnm {
      public final dno a;
      public final int b;

      public b(dno $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cti $$0, elm $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<elm> a(cti $$0) {
         return this.a.a($$0);
      }

      @Override
      public dno a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(amz $$0, dnk $$1, dnk.a $$2, elm $$3) {
         return false;
      }
   }
}
