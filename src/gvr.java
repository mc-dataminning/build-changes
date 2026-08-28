import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gvr implements gvq.a {
   private final fqq a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<gvr.a> d = Lists.newArrayList();
   private final List<gvr.b> e = Lists.newArrayList();

   public gvr(fqq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fld $$0, grn $$1, double $$2, double $$3, double $$4) {
      dkj $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         fgc $$6 = new fgc($$2, 0.0, $$4);
         this.d.removeIf(gvr.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         flg $$7 = $$1.getBuffer(gry.w());

         for (gvr.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               gvq.a($$0, $$7, fgt.a(new ffx($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         flg $$9 = $$1.getBuffer(gry.z());

         for (gvr.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gsg.b(
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

         for (gvr.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               gvq.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               gvq.a($$0, $$1, iw.a((jq)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (gvr.a $$12 : this.d) {
            fgc $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new ffx($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            gvq.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fld $$0, grn $$1, ffx $$2, float $$3, float $$4, float $$5, float $$6) {
      fpy $$7 = fqq.Q().j.k();
      if ($$7.h()) {
         fgc $$8 = $$7.b().e();
         gvq.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(alq<egq> $$0, fgc $$1) {
      this.d.add(new gvr.a(ag.c(), $$0, $$1));
   }

   public void a(egu $$0, int $$1) {
      this.e.add(new gvr.b($$0, $$1));
   }

   static record a(long a, alq<egq> b, fgc c) {

      public boolean a() {
         return ag.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public alq<egq> c() {
         return this.b;
      }

      public fgc d() {
         return this.c;
      }
   }

   static class b implements egs {
      public final egu a;
      public final int b;

      public b(egu $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dkj $$0, fgc $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<fgc> a(dkj $$0) {
         return this.a.a($$0);
      }

      @Override
      public egu a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(asb $$0, jg<egq> $$1, egq.a $$2, fgc $$3) {
         return false;
      }
   }
}
