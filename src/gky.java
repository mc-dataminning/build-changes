import com.google.common.collect.Maps;
import java.util.Map;

public class gky<T extends bsa, M extends fso<T>, A extends fso<T>> extends gli<T, M> {
   private static final Map<String, akh> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gmx d;

   public gky(gis<T, M> $$0, A $$1, A $$2, gpf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gcd.g);
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bro.e, $$2, this.a(bro.e));
      this.a($$0, $$1, $$3, bro.d, $$2, this.a(bro.d));
      this.a($$0, $$1, $$3, bro.c, $$2, this.a(bro.c));
      this.a($$0, $$1, $$3, bro.f, $$2, this.a(bro.f));
   }

   private void a(exx $$0, gbo $$1, T $$2, bro $$3, int $$4, A $$5) {
      csz $$6 = $$2.d($$3);
      if ($$6.f() instanceof cqo $$7) {
         if ($$7.k() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cqp $$10 = $$7.h().a();
            int $$11 = $$6.a(avz.bz) ? cvp.a($$6, -6265536) : -1;

            for (cqp.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)axj.b.b($$11) / 255.0F;
                  $$14 = (float)axj.b.c($$11) / 255.0F;
                  $$15 = (float)axj.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cvb $$19 = $$6.a(ka.I);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bro $$1) {
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

   private void a(exx $$0, gbo $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akh $$7) {
      eyb $$8 = $$1.getBuffer(gbw.a($$7));
      $$3.a($$0, $$8, $$2, gmp.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(iw<cqp> $$0, exx $$1, gbo $$2, int $$3, cvb $$4, A $$5, boolean $$6) {
      gmy $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      eyb $$8 = $$7.a($$2.getBuffer(gcd.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(exx $$0, gbo $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gbw.k()), $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bro $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bro $$0) {
      return $$0 == bro.d;
   }
}
