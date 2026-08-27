import com.google.common.collect.Maps;
import java.util.Map;

public class glv<T extends bso, M extends ftj<T>, A extends ftj<T>> extends gmf<T, M> {
   private static final Map<String, akm> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gnu d;

   public glv(gjp<T, M> $$0, A $$1, A $$2, gqc $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gcz.g);
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsb.e, $$2, this.a(bsb.e));
      this.a($$0, $$1, $$3, bsb.d, $$2, this.a(bsb.d));
      this.a($$0, $$1, $$3, bsb.c, $$2, this.a(bsb.c));
      this.a($$0, $$1, $$3, bsb.f, $$2, this.a(bsb.f));
   }

   private void a(eys $$0, gck $$1, T $$2, bsb $$3, int $$4, A $$5) {
      cto $$6 = $$2.a($$3);
      if ($$6.g() instanceof crd $$7) {
         if ($$7.l() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cre $$10 = $$7.h().a();
            int $$11 = $$6.a(awe.bz) ? cwg.a($$6, -6265536) : -1;

            for (cre.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)axo.b.b($$11) / 255.0F;
                  $$14 = (float)axo.b.c($$11) / 255.0F;
                  $$15 = (float)axo.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cvs $$19 = $$6.a(kb.J);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.y()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsb $$1) {
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

   private void a(eys $$0, gck $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akm $$7) {
      eyw $$8 = $$1.getBuffer(gcs.a($$7));
      $$3.a($$0, $$8, $$2, gnm.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(ix<cre> $$0, eys $$1, gck $$2, int $$3, cvs $$4, A $$5, boolean $$6) {
      gnv $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      eyw $$8 = $$7.a($$2.getBuffer(gcz.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(eys $$0, gck $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gcs.k()), $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsb $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsb $$0) {
      return $$0 == bsb.d;
   }
}
