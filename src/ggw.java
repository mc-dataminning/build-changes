import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ggw implements ggv.a {
   private final ffa a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<ggw.a> d = Lists.newArrayList();
   private final List<ggw.b> e = Lists.newArrayList();

   public ggw(ffa $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezt $$0, gdj $$1, double $$2, double $$3, double $$4) {
      dbt $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         evm $$6 = new evm($$2, 0.0, $$4);
         this.d.removeIf(ggw.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         ezx $$7 = $$1.getBuffer(gdr.y());

         for (ggw.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gdh.a($$0, $$7, ewc.a(new evh($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         ezx $$9 = $$1.getBuffer(gdr.A());

         for (ggw.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gdh.b(
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

         for (ggw.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               ggv.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               ggv.a($$0, $$1, iz.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (ggw.a $$12 : this.d) {
            evm $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new evh($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            ggv.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(ezt $$0, gdj $$1, evh $$2, float $$3, float $$4, float $$5, float $$6) {
      fel $$7 = ffa.Q().j.m();
      if ($$7.h()) {
         evm $$8 = $$7.b().e();
         ggv.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ala<dwq> $$0, evm $$1) {
      this.d.add(new ggw.a(ac.c(), $$0, $$1));
   }

   public void a(dwu $$0, int $$1) {
      this.e.add(new ggw.b($$0, $$1));
   }

   static record a(long a, ala<dwq> b, evm c) {

      public boolean a() {
         return ac.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ala<dwq> c() {
         return this.b;
      }

      public evm d() {
         return this.c;
      }
   }

   static class b implements dws {
      public final dwu a;
      public final int b;

      public b(dwu $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dbt $$0, evm $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<evm> a(dbt $$0) {
         return this.a.a($$0);
      }

      @Override
      public dwu a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arb $$0, ji<dwq> $$1, dwq.a $$2, evm $$3) {
         return false;
      }
   }
}
