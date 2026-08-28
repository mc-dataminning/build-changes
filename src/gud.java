import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gud implements guc.a {
   private final foz a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gud.a> d = Lists.newArrayList();
   private final List<gud.b> e = Lists.newArrayList();

   public gud(foz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjj $$0, gqa $$1, double $$2, double $$3, double $$4) {
      dja $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         feq $$6 = new feq($$2, 0.0, $$4);
         this.d.removeIf(gud.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fjn $$7 = $$1.getBuffer(gqk.y());

         for (gud.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               guc.a($$0, $$7, ffh.a(new fel($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fjn $$9 = $$1.getBuffer(gqk.B());

         for (gud.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gqu.b(
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

         for (gud.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               guc.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               guc.a($$0, $$1, iu.a((jo)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gud.a $$12 : this.d) {
            feq $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fel($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            guc.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fjj $$0, gqa $$1, fel $$2, float $$3, float $$4, float $$5, float $$6) {
      fog $$7 = foz.Q().j.k();
      if ($$7.h()) {
         feq $$8 = $$7.b().e();
         guc.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(alf<efh> $$0, feq $$1) {
      this.d.add(new gud.a(af.c(), $$0, $$1));
   }

   public void a(efl $$0, int $$1) {
      this.e.add(new gud.b($$0, $$1));
   }

   static record a(long a, alf<efh> b, feq c) {

      public boolean a() {
         return af.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public alf<efh> c() {
         return this.b;
      }

      public feq d() {
         return this.c;
      }
   }

   static class b implements efj {
      public final efl a;
      public final int b;

      public b(efl $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dja $$0, feq $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<feq> a(dja $$0) {
         return this.a.a($$0);
      }

      @Override
      public efl a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arq $$0, je<efh> $$1, efh.a $$2, feq $$3) {
         return false;
      }
   }
}
