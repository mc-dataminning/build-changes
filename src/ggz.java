import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ggz implements ggy.a {
   private final ffd a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<ggz.a> d = Lists.newArrayList();
   private final List<ggz.b> e = Lists.newArrayList();

   public ggz(ffd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezw $$0, gdm $$1, double $$2, double $$3, double $$4) {
      dbw $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         evp $$6 = new evp($$2, 0.0, $$4);
         this.d.removeIf(ggz.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         faa $$7 = $$1.getBuffer(gdu.y());

         for (ggz.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gdk.a($$0, $$7, ewf.a(new evk($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         faa $$9 = $$1.getBuffer(gdu.A());

         for (ggz.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gdk.b(
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

         for (ggz.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               ggy.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               ggy.a($$0, $$1, iz.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (ggz.a $$12 : this.d) {
            evp $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new evk($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            ggy.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(ezw $$0, gdm $$1, evk $$2, float $$3, float $$4, float $$5, float $$6) {
      feo $$7 = ffd.Q().j.l();
      if ($$7.h()) {
         evp $$8 = $$7.b().e();
         ggy.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ald<dwt> $$0, evp $$1) {
      this.d.add(new ggz.a(ac.c(), $$0, $$1));
   }

   public void a(dwx $$0, int $$1) {
      this.e.add(new ggz.b($$0, $$1));
   }

   static record a(long a, ald<dwt> b, evp c) {

      public boolean a() {
         return ac.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ald<dwt> c() {
         return this.b;
      }

      public evp d() {
         return this.c;
      }
   }

   static class b implements dwv {
      public final dwx a;
      public final int b;

      public b(dwx $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dbw $$0, evp $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<evp> a(dbw $$0) {
         return this.a.a($$0);
      }

      @Override
      public dwx a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(are $$0, ji<dwt> $$1, dwt.a $$2, evp $$3) {
         return false;
      }
   }
}
