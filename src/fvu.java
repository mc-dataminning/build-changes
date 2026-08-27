import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fvu implements fvt.a {
   private final euk a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fvu.a> d = Lists.newArrayList();
   private final List<fvu.b> e = Lists.newArrayList();

   public fvu(euk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(epd $$0, fsi $$1, double $$2, double $$3, double $$4) {
      csy $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         elb $$6 = new elb($$2, 0.0, $$4);
         this.d.removeIf(fvu.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         eph $$7 = $$1.getBuffer(fsq.w());

         for (fvu.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               fsg.a($$0, $$7, elr.a(new ekw($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         eph $$9 = $$1.getBuffer(fsq.y());

         for (fvu.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> fsg.b(
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

         for (fvu.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fvt.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fvt.a($$0, $$1, hv.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fvu.a $$12 : this.d) {
            elb $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ekw($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fvt.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(epd $$0, fsi $$1, ekw $$2, float $$3, float $$4, float $$5, float $$6) {
      etv $$7 = euk.N().j.m();
      if ($$7.h()) {
         elb $$8 = $$7.b().e();
         fvt.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ags<dmz> $$0, elb $$1) {
      this.d.add(new fvu.a(ac.b(), $$0, $$1));
   }

   public void a(dnd $$0, int $$1) {
      this.e.add(new fvu.b($$0, $$1));
   }

   static record a(long a, ags<dmz> b, elb c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ags<dmz> c() {
         return this.b;
      }

      public elb d() {
         return this.c;
      }
   }

   static class b implements dnb {
      public final dnd a;
      public final int b;

      public b(dnd $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(csy $$0, elb $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<elb> a(csy $$0) {
         return this.a.a($$0);
      }

      @Override
      public dnd a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(amp $$0, dmz $$1, dmz.a $$2, elb $$3) {
         return false;
      }
   }
}
