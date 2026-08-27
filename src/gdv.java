import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gdv implements gdu.a {
   private final fby a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gdv.a> d = Lists.newArrayList();
   private final List<gdv.b> e = Lists.newArrayList();

   public gdv(fby $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4) {
      czg $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         esj $$6 = new esj($$2, 0.0, $$4);
         this.d.removeIf(gdv.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         ewv $$7 = $$1.getBuffer(gaq.y());

         for (gdv.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gag.a($$0, $$7, esz.a(new ese($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         ewv $$9 = $$1.getBuffer(gaq.A());

         for (gdv.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gag.b(
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

         for (gdv.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gdu.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gdu.a($$0, $$1, id.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gdv.a $$12 : this.d) {
            esj $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ese($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gdu.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(ewr $$0, gai $$1, ese $$2, float $$3, float $$4, float $$5, float $$6) {
      fbj $$7 = fby.Q().j.n();
      if ($$7.h()) {
         esj $$8 = $$7.b().e();
         gdu.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aju<dub> $$0, esj $$1) {
      this.d.add(new gdv.a(ac.b(), $$0, $$1));
   }

   public void a(duf $$0, int $$1) {
      this.e.add(new gdv.b($$0, $$1));
   }

   static record a(long a, aju<dub> b, esj c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aju<dub> c() {
         return this.b;
      }

      public esj d() {
         return this.c;
      }
   }

   static class b implements dud {
      public final duf a;
      public final int b;

      public b(duf $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(czg $$0, esj $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<esj> a(czg $$0) {
         return this.a.a($$0);
      }

      @Override
      public duf a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(apu $$0, in<dub> $$1, dub.a $$2, esj $$3) {
         return false;
      }
   }
}
