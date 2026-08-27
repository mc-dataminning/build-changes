import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fws implements fwr.a {
   private final evh a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fws.a> d = Lists.newArrayList();
   private final List<fws.b> e = Lists.newArrayList();

   public fws(evh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqa $$0, ftg $$1, double $$2, double $$3, double $$4) {
      cto $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         els $$6 = new els($$2, 0.0, $$4);
         this.d.removeIf(fws.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         eqe $$7 = $$1.getBuffer(fto.w());

         for (fws.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               fte.a($$0, $$7, emi.a(new eln($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         eqe $$9 = $$1.getBuffer(fto.y());

         for (fws.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> fte.b(
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

         for (fws.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fwr.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fwr.a($$0, $$1, hx.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fws.a $$12 : this.d) {
            els $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new eln($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fwr.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(eqa $$0, ftg $$1, eln $$2, float $$3, float $$4, float $$5, float $$6) {
      eus $$7 = evh.O().j.m();
      if ($$7.h()) {
         els $$8 = $$7.b().e();
         fwr.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(ahf<dnq> $$0, els $$1) {
      this.d.add(new fws.a(ac.b(), $$0, $$1));
   }

   public void a(dnu $$0, int $$1) {
      this.e.add(new fws.b($$0, $$1));
   }

   static record a(long a, ahf<dnq> b, els c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public ahf<dnq> c() {
         return this.b;
      }

      public els d() {
         return this.c;
      }
   }

   static class b implements dns {
      public final dnu a;
      public final int b;

      public b(dnu $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cto $$0, els $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<els> a(cto $$0) {
         return this.a.a($$0);
      }

      @Override
      public dnu a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(and $$0, dnq $$1, dnq.a $$2, els $$3) {
         return false;
      }
   }
}
