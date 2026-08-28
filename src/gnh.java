import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gnh implements gng.a {
   private final fke a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gnh.a> d = Lists.newArrayList();
   private final List<gnh.b> e = Lists.newArrayList();

   public gnh(fke $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fer $$0, gjg $$1, double $$2, double $$3, double $$4) {
      dfm $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ezy $$6 = new ezy($$2, 0.0, $$4);
         this.d.removeIf(gnh.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fev $$7 = $$1.getBuffer(gjq.y());

         for (gnh.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gng.a($$0, $$7, fap.a(new ezt($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fev $$9 = $$1.getBuffer(gjq.A());

         for (gnh.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gka.b(
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

         for (gnh.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gng.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gng.a($$0, $$1, jh.a((ka)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gnh.a $$12 : this.d) {
            ezy $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new ezt($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gng.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fer $$0, gjg $$1, ezt $$2, float $$3, float $$4, float $$5, float $$6) {
      fjn $$7 = fke.Q().j.k();
      if ($$7.h()) {
         ezy $$8 = $$7.b().e();
         gng.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ali<ear> $$0, ezy $$1) {
      this.d.add(new gnh.a(ae.c(), $$0, $$1));
   }

   public void a(eav $$0, int $$1) {
      this.e.add(new gnh.b($$0, $$1));
   }

   static record a(long a, ali<ear> b, ezy c) {

      public boolean a() {
         return ae.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ali<ear> c() {
         return this.b;
      }

      public ezy d() {
         return this.c;
      }
   }

   static class b implements eat {
      public final eav a;
      public final int b;

      public b(eav $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dfm $$0, ezy $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ezy> a(dfm $$0) {
         return this.a.a($$0);
      }

      @Override
      public eav a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arp $$0, jq<ear> $$1, ear.a $$2, ezy $$3) {
         return false;
      }
   }
}
