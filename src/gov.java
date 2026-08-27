import com.google.common.collect.Maps;
import java.util.Map;

public class gov<T extends bso, M extends fwd<T>, A extends fwd<T>> extends gpi<T, M> {
   private static final Map<String, akt> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gqx d;

   public gov(gmp<T, M> $$0, A $$1, A $$2, gtf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gfv.g);
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsc.e, $$2, this.a(bsc.e));
      this.a($$0, $$1, $$3, bsc.d, $$2, this.a(bsc.d));
      this.a($$0, $$1, $$3, bsc.c, $$2, this.a(bsc.c));
      this.a($$0, $$1, $$3, bsc.f, $$2, this.a(bsc.f));
   }

   private void a(fbc $$0, gfg $$1, T $$2, bsc $$3, int $$4, A $$5) {
      cuh $$6 = $$2.d($$3);
      if ($$6.f() instanceof crt $$7) {
         if ($$7.k() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cru $$10 = $$7.h().a();
            int $$11 = $$6.a(awm.bA) ? cxi.a($$6, -6265536) : -1;

            for (cru.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)axw.b.b($$11) / 255.0F;
                  $$14 = (float)axw.b.c($$11) / 255.0F;
                  $$15 = (float)axw.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cwu $$19 = $$6.a(ke.I);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsc $$1) {
      $$0.b_(false);
      switch ($$1) {
         case f:
            $$0.k.k = true;
            $$0.l.k = true;
            break;
         case e:
            $$0.m.k = true;
            $$0.n.k = true;
            $$0.o.k = true;
            break;
         case d:
            $$0.m.k = true;
            $$0.p.k = true;
            $$0.q.k = true;
            break;
         case c:
            $$0.p.k = true;
            $$0.q.k = true;
      }
   }

   private void a(fbc $$0, gfg $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akt $$7) {
      fbg $$8 = $$1.getBuffer(gfo.a($$7));
      $$3.a($$0, $$8, $$2, gqp.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(ja<cru> $$0, fbc $$1, gfg $$2, int $$3, cwu $$4, A $$5, boolean $$6) {
      gqy $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fbg $$8 = $$7.a($$2.getBuffer(gfv.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fbc $$0, gfg $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gfo.k()), $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsc $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsc $$0) {
      return $$0 == bsc.d;
   }
}
