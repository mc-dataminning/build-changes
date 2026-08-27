import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fzf implements fze.a {
   private final exo a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fzf.a> d = Lists.newArrayList();
   private final List<fzf.b> e = Lists.newArrayList();

   public fzf(exo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4) {
      cvr $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         enz $$6 = new enz($$2, 0.0, $$4);
         this.d.removeIf(fzf.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         esl $$7 = $$1.getBuffer(fwb.w());

         for (fzf.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               fvr.a($$0, $$7, eop.a(new enu($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         esl $$9 = $$1.getBuffer(fwb.y());

         for (fzf.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> fvr.b(
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

         for (fzf.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fze.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fze.a($$0, $$1, hz.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fzf.a $$12 : this.d) {
            enz $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new enu($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fze.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(esh $$0, fvt $$1, enu $$2, float $$3, float $$4, float $$5, float $$6) {
      ewz $$7 = exo.P().j.m();
      if ($$7.h()) {
         enz $$8 = $$7.b().e();
         fze.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aix<dpw> $$0, enz $$1) {
      this.d.add(new fzf.a(ac.b(), $$0, $$1));
   }

   public void a(dqa $$0, int $$1) {
      this.e.add(new fzf.b($$0, $$1));
   }

   static record a(long a, aix<dpw> b, enz c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aix<dpw> c() {
         return this.b;
      }

      public enz d() {
         return this.c;
      }
   }

   static class b implements dpy {
      public final dqa a;
      public final int b;

      public b(dqa $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cvr $$0, enz $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<enz> a(cvr $$0) {
         return this.a.a($$0);
      }

      @Override
      public dqa a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aow $$0, ij<dpw> $$1, dpw.a $$2, enz $$3) {
         return false;
      }
   }
}
