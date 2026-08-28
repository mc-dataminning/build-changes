import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ghq implements ghp.a {
   private final fft a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<ghq.a> d = Lists.newArrayList();
   private final List<ghq.b> e = Lists.newArrayList();

   public ghq(fft $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fam $$0, ged $$1, double $$2, double $$3, double $$4) {
      dcf $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ewf $$6 = new ewf($$2, 0.0, $$4);
         this.d.removeIf(ghq.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         faq $$7 = $$1.getBuffer(gel.y());

         for (ghq.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               geb.a($$0, $$7, ewv.a(new ewa($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         faq $$9 = $$1.getBuffer(gel.A());

         for (ghq.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> geb.b(
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

         for (ghq.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               ghp.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               ghp.a($$0, $$1, ja.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (ghq.a $$12 : this.d) {
            ewf $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ewa($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            ghp.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fam $$0, ged $$1, ewa $$2, float $$3, float $$4, float $$5, float $$6) {
      ffe $$7 = fft.Q().j.l();
      if ($$7.h()) {
         ewf $$8 = $$7.b().e();
         ghp.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(akj<dxg> $$0, ewf $$1) {
      this.d.add(new ghq.a(ac.c(), $$0, $$1));
   }

   public void a(dxk $$0, int $$1) {
      this.e.add(new ghq.b($$0, $$1));
   }

   static record a(long a, akj<dxg> b, ewf c) {

      public boolean a() {
         return ac.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public akj<dxg> c() {
         return this.b;
      }

      public ewf d() {
         return this.c;
      }
   }

   static class b implements dxi {
      public final dxk a;
      public final int b;

      public b(dxk $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dcf $$0, ewf $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ewf> a(dcf $$0) {
         return this.a.a($$0);
      }

      @Override
      public dxk a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aqm $$0, jj<dxg> $$1, dxg.a $$2, ewf $$3) {
         return false;
      }
   }
}
