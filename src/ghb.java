import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ghb implements gha.a {
   private final fff a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<ghb.a> d = Lists.newArrayList();
   private final List<ghb.b> e = Lists.newArrayList();

   public ghb(fff $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezy $$0, gdo $$1, double $$2, double $$3, double $$4) {
      dby $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         evr $$6 = new evr($$2, 0.0, $$4);
         this.d.removeIf(ghb.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fac $$7 = $$1.getBuffer(gdw.y());

         for (ghb.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gdm.a($$0, $$7, ewh.a(new evm($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fac $$9 = $$1.getBuffer(gdw.A());

         for (ghb.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gdm.b(
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

         for (ghb.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gha.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gha.a($$0, $$1, iz.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (ghb.a $$12 : this.d) {
            evr $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new evm($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gha.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(ezy $$0, gdo $$1, evm $$2, float $$3, float $$4, float $$5, float $$6) {
      feq $$7 = fff.Q().j.l();
      if ($$7.h()) {
         evr $$8 = $$7.b().e();
         gha.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ale<dwv> $$0, evr $$1) {
      this.d.add(new ghb.a(ac.c(), $$0, $$1));
   }

   public void a(dwz $$0, int $$1) {
      this.e.add(new ghb.b($$0, $$1));
   }

   static record a(long a, ale<dwv> b, evr c) {

      public boolean a() {
         return ac.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ale<dwv> c() {
         return this.b;
      }

      public evr d() {
         return this.c;
      }
   }

   static class b implements dwx {
      public final dwz a;
      public final int b;

      public b(dwz $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dby $$0, evr $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<evr> a(dby $$0) {
         return this.a.a($$0);
      }

      @Override
      public dwz a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arf $$0, ji<dwv> $$1, dwv.a $$2, evr $$3) {
         return false;
      }
   }
}
