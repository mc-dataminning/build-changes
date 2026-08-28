import com.google.common.collect.Maps;
import java.util.Map;

public class gno<T extends btb, M extends fvb<T>, A extends fvb<T>> extends gny<T, M> {
   private static final Map<String, akk> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gpn d;

   public gno(gli<T, M> $$0, A $$1, A $$2, grv $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(ges.g);
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsn.e, $$2, this.a(bsn.e));
      this.a($$0, $$1, $$3, bsn.d, $$2, this.a(bsn.d));
      this.a($$0, $$1, $$3, bsn.c, $$2, this.a(bsn.c));
      this.a($$0, $$1, $$3, bsn.f, $$2, this.a(bsn.f));
   }

   private void a(fam $$0, ged $$1, T $$2, bsn $$3, int $$4, A $$5) {
      cuc $$6 = $$2.a($$3);
      if ($$6.g() instanceof crs $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            crt $$10 = $$7.h().a();
            int $$11 = $$6.a(awf.by) ? cwt.a($$6, -6265536) : -1;

            for (crt.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)axq.b.b($$11) / 255.0F;
                  $$14 = (float)axq.b.c($$11) / 255.0F;
                  $$15 = (float)axq.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cwg $$19 = $$6.a(kn.K);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsn $$1) {
      $$0.c_(false);
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

   private void a(fam $$0, ged $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akk $$7) {
      faq $$8 = $$1.getBuffer(gel.a($$7));
      $$3.a($$0, $$8, $$2, gpf.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(jj<crt> $$0, fam $$1, ged $$2, int $$3, cwg $$4, A $$5, boolean $$6) {
      gpo $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      faq $$8 = $$7.a($$2.getBuffer(ges.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fam $$0, ged $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gel.k()), $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsn $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsn $$0) {
      return $$0 == bsn.d;
   }
}
