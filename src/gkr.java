import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gkr implements gkq.a {
   private final fib a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gkr.a> d = Lists.newArrayList();
   private final List<gkr.b> e = Lists.newArrayList();

   public gkr(fib $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      dds $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         eye $$6 = new eye($$2, 0.0, $$4);
         this.d.removeIf(gkr.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fcy $$7 = $$1.getBuffer(ghe.z());

         for (gkr.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gkq.a($$0, $$7, eyu.a(new exz($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fcy $$9 = $$1.getBuffer(ghe.B());

         for (gkr.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> ghl.b(
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

         for (gkr.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gkq.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gkq.a($$0, $$1, je.a((jx)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gkr.a $$12 : this.d) {
            eye $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new exz($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gkq.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fcu $$0, ggv $$1, exz $$2, float $$3, float $$4, float $$5, float $$6) {
      fhk $$7 = fib.Q().j.l();
      if ($$7.h()) {
         eye $$8 = $$7.b().e();
         gkq.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ala<dyx> $$0, eye $$1) {
      this.d.add(new gkr.a(ad.c(), $$0, $$1));
   }

   public void a(dzb $$0, int $$1) {
      this.e.add(new gkr.b($$0, $$1));
   }

   static record a(long a, ala<dyx> b, eye c) {

      public boolean a() {
         return ad.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ala<dyx> c() {
         return this.b;
      }

      public eye d() {
         return this.c;
      }
   }

   static class b implements dyz {
      public final dzb a;
      public final int b;

      public b(dzb $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dds $$0, eye $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<eye> a(dds $$0) {
         return this.a.a($$0);
      }

      @Override
      public dzb a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arg $$0, jn<dyx> $$1, dyx.a $$2, eye $$3) {
         return false;
      }
   }
}
