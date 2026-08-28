import com.google.common.collect.Maps;
import java.util.Map;

public class gmz<T extends btp, M extends fun<T>, A extends fun<T>> extends gnj<T, M> {
   private static final Map<String, alf> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final goy d;

   public gmz(gkt<T, M> $$0, A $$1, A $$2, grg $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(ged.g);
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, btb.e, $$2, this.a(btb.e));
      this.a($$0, $$1, $$3, btb.d, $$2, this.a(btb.d));
      this.a($$0, $$1, $$3, btb.c, $$2, this.a(btb.c));
      this.a($$0, $$1, $$3, btb.f, $$2, this.a(btb.f));
   }

   private void a(ezy $$0, gdo $$1, T $$2, btb $$3, int $$4, A $$5) {
      cup $$6 = $$2.a($$3);
      if ($$6.g() instanceof cse $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            csf $$10 = $$7.h().a();
            int $$11 = $$6.a(awy.by) ? cxh.a($$6, -6265536) : -1;

            for (csf.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)ayj.b.b($$11) / 255.0F;
                  $$14 = (float)ayj.b.c($$11) / 255.0F;
                  $$15 = (float)ayj.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cwt $$19 = $$6.a(km.K);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.y()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, btb $$1) {
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

   private void a(ezy $$0, gdo $$1, int $$2, A $$3, float $$4, float $$5, float $$6, alf $$7) {
      fac $$8 = $$1.getBuffer(gdw.a($$7));
      $$3.a($$0, $$8, $$2, goq.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(ji<csf> $$0, ezy $$1, gdo $$2, int $$3, cwt $$4, A $$5, boolean $$6) {
      goz $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fac $$8 = $$7.a($$2.getBuffer(ged.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ezy $$0, gdo $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gdw.k()), $$2, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(btb $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(btb $$0) {
      return $$0 == btb.d;
   }
}
