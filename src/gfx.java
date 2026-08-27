import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gfx implements gfw.a {
   private final feb a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gfx.a> d = Lists.newArrayList();
   private final List<gfx.b> e = Lists.newArrayList();

   public gfx(feb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eyu $$0, gck $$1, double $$2, double $$3, double $$4) {
      daz $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         eum $$6 = new eum($$2, 0.0, $$4);
         this.d.removeIf(gfx.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         eyy $$7 = $$1.getBuffer(gcs.y());

         for (gfx.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gci.a($$0, $$7, evc.a(new euh($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         eyy $$9 = $$1.getBuffer(gcs.A());

         for (gfx.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gci.b(
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

         for (gfx.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gfw.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gfw.a($$0, $$1, io.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gfx.a $$12 : this.d) {
            eum $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new euh($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gfw.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(eyu $$0, gck $$1, euh $$2, float $$3, float $$4, float $$5, float $$6) {
      fdm $$7 = feb.Q().j.m();
      if ($$7.h()) {
         eum $$8 = $$7.b().e();
         gfw.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(akm<dvw> $$0, eum $$1) {
      this.d.add(new gfx.a(ac.c(), $$0, $$1));
   }

   public void a(dwa $$0, int $$1) {
      this.e.add(new gfx.b($$0, $$1));
   }

   static record a(long a, akm<dvw> b, eum c) {

      public boolean a() {
         return ac.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public akm<dvw> c() {
         return this.b;
      }

      public eum d() {
         return this.c;
      }
   }

   static class b implements dvy {
      public final dwa a;
      public final int b;

      public b(dwa $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(daz $$0, eum $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<eum> a(daz $$0) {
         return this.a.a($$0);
      }

      @Override
      public dwa a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aqn $$0, ix<dvw> $$1, dvw.a $$2, eum $$3) {
         return false;
      }
   }
}
