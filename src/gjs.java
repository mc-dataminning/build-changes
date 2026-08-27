import com.google.common.collect.Maps;
import java.util.Map;

public class gjs<T extends bqt, M extends fri<T>, A extends fri<T>> extends gkc<T, M> {
   private static final Map<String, ajv> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final glr d;

   public gjs(ghm<T, M> $$0, A $$1, A $$2, gny $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gax.g);
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bqh.e, $$2, this.a(bqh.e));
      this.a($$0, $$1, $$3, bqh.d, $$2, this.a(bqh.d));
      this.a($$0, $$1, $$3, bqh.c, $$2, this.a(bqh.c));
      this.a($$0, $$1, $$3, bqh.f, $$2, this.a(bqh.f));
   }

   private void a(ewr $$0, gai $$1, T $$2, bqh $$3, int $$4, A $$5) {
      crs $$6 = $$2.d($$3);
      if ($$6.f() instanceof cph $$7) {
         if ($$7.k() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cpi $$10 = $$7.h().a();
            int $$11 = $$6.a(avm.ba) ? cuf.a($$6, -6265536) : -1;

            for (cpi.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)aww.b.b($$11) / 255.0F;
                  $$14 = (float)aww.b.c($$11) / 255.0F;
                  $$15 = (float)aww.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            ctt $$19 = $$6.a(jr.B);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bqh $$1) {
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

   private void a(ewr $$0, gai $$1, int $$2, A $$3, float $$4, float $$5, float $$6, ajv $$7) {
      ewv $$8 = $$1.getBuffer(gaq.a($$7));
      $$3.a($$0, $$8, $$2, glj.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(in<cpi> $$0, ewr $$1, gai $$2, int $$3, ctt $$4, A $$5, boolean $$6) {
      gls $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      ewv $$8 = $$7.a($$2.getBuffer(gax.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ewr $$0, gai $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gaq.k()), $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bqh $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bqh $$0) {
      return $$0 == bqh.d;
   }
}
