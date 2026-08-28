import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class glx implements glw.a {
   private final fja a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<glx.a> d = Lists.newArrayList();
   private final List<glx.b> e = Lists.newArrayList();

   public glx(fja $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4) {
      dev $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ezh $$6 = new ezh($$2, 0.0, $$4);
         this.d.removeIf(glx.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fdx $$7 = $$1.getBuffer(gig.y());

         for (glx.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               glw.a($$0, $$7, ezy.a(new ezc($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fdx $$9 = $$1.getBuffer(gig.A());

         for (glx.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> giq.b(
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

         for (glx.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               glw.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               glw.a($$0, $$1, jg.a((jz)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (glx.a $$12 : this.d) {
            ezh $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new ezc($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            glw.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fdt $$0, ghw $$1, ezc $$2, float $$3, float $$4, float $$5, float $$6) {
      fij $$7 = fja.Q().j.k();
      if ($$7.h()) {
         ezh $$8 = $$7.b().e();
         glw.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(alg<eaa> $$0, ezh $$1) {
      this.d.add(new glx.a(ad.c(), $$0, $$1));
   }

   public void a(eae $$0, int $$1) {
      this.e.add(new glx.b($$0, $$1));
   }

   static record a(long a, alg<eaa> b, ezh c) {

      public boolean a() {
         return ad.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public alg<eaa> c() {
         return this.b;
      }

      public ezh d() {
         return this.c;
      }
   }

   static class b implements eac {
      public final eae a;
      public final int b;

      public b(eae $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dev $$0, ezh $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ezh> a(dev $$0) {
         return this.a.a($$0);
      }

      @Override
      public eae a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(arm $$0, jp<eaa> $$1, eaa.a $$2, ezh $$3) {
         return false;
      }
   }
}
