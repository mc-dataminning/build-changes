import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fxf implements fxe.a {
   private final evr a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fxf.a> d = Lists.newArrayList();
   private final List<fxf.b> e = Lists.newArrayList();

   public fxf(evr $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqk $$0, ftt $$1, double $$2, double $$3, double $$4) {
      ctx $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         emc $$6 = new emc($$2, 0.0, $$4);
         this.d.removeIf(fxf.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         eqo $$7 = $$1.getBuffer(fub.w());

         for (fxf.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               ftr.a($$0, $$7, ems.a(new elx($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         eqo $$9 = $$1.getBuffer(fub.y());

         for (fxf.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> ftr.b(
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

         for (fxf.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fxe.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fxe.a($$0, $$1, hx.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fxf.a $$12 : this.d) {
            emc $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new elx($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fxe.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(eqk $$0, ftt $$1, elx $$2, float $$3, float $$4, float $$5, float $$6) {
      evc $$7 = evr.O().j.m();
      if ($$7.h()) {
         emc $$8 = $$7.b().e();
         fxe.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ahg<dnz> $$0, emc $$1) {
      this.d.add(new fxf.a(ac.b(), $$0, $$1));
   }

   public void a(dod $$0, int $$1) {
      this.e.add(new fxf.b($$0, $$1));
   }

   static record a(long a, ahg<dnz> b, emc c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ahg<dnz> c() {
         return this.b;
      }

      public emc d() {
         return this.c;
      }
   }

   static class b implements dob {
      public final dod a;
      public final int b;

      public b(dod $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(ctx $$0, emc $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<emc> a(ctx $$0) {
         return this.a.a($$0);
      }

      @Override
      public dod a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(ane $$0, ih<dnz> $$1, dnz.a $$2, emc $$3) {
         return false;
      }
   }
}
