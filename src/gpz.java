import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gpz implements gpy.a {
   private final fli a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gpz.a> d = Lists.newArrayList();
   private final List<gpz.b> e = Lists.newArrayList();

   public gpz(fli $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fft $$0, glx $$1, double $$2, double $$3, double $$4) {
      dgh $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         faz $$6 = new faz($$2, 0.0, $$4);
         this.d.removeIf(gpz.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         ffx $$7 = $$1.getBuffer(gmh.y());

         for (gpz.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gpy.a($$0, $$7, fbq.a(new fau($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         ffx $$9 = $$1.getBuffer(gmh.B());

         for (gpz.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gmr.b(
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

         for (gpz.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gpy.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gpy.a($$0, $$1, ji.a((kb)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gpz.a $$12 : this.d) {
            faz $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fau($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gpy.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fft $$0, glx $$1, fau $$2, float $$3, float $$4, float $$5, float $$6) {
      fkq $$7 = fli.Q().j.k();
      if ($$7.h()) {
         faz $$8 = $$7.b().e();
         gpy.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aku<ebs> $$0, faz $$1) {
      this.d.add(new gpz.a(af.c(), $$0, $$1));
   }

   public void a(ebw $$0, int $$1) {
      this.e.add(new gpz.b($$0, $$1));
   }

   static record a(long a, aku<ebs> b, faz c) {

      public boolean a() {
         return af.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aku<ebs> c() {
         return this.b;
      }

      public faz d() {
         return this.c;
      }
   }

   static class b implements ebu {
      public final ebw a;
      public final int b;

      public b(ebw $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dgh $$0, faz $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<faz> a(dgh $$0) {
         return this.a.a($$0);
      }

      @Override
      public ebw a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(ard $$0, jr<ebs> $$1, ebs.a $$2, faz $$3) {
         return false;
      }
   }
}
