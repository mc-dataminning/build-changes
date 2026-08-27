import com.google.common.collect.Maps;
import java.util.Map;

public class gjj<T extends bqo, M extends fqz<T>, A extends fqz<T>> extends gjt<T, M> {
   private static final Map<String, ajt> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gli d;

   public gjj(ghd<T, M> $$0, A $$1, A $$2, gnp $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gao.g);
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bqc.e, $$2, this.a(bqc.e));
      this.a($$0, $$1, $$3, bqc.d, $$2, this.a(bqc.d));
      this.a($$0, $$1, $$3, bqc.c, $$2, this.a(bqc.c));
      this.a($$0, $$1, $$3, bqc.f, $$2, this.a(bqc.f));
   }

   private void a(ewi $$0, fzz $$1, T $$2, bqc $$3, int $$4, A $$5) {
      crj $$6 = $$2.d($$3);
      if ($$6.f() instanceof coy $$7) {
         if ($$7.k() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            coz $$10 = $$7.h().a();
            int $$11 = $$6.a(avk.ba) ? ctw.a($$6, -6265536) : -1;

            for (coz.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)awu.b.b($$11) / 255.0F;
                  $$14 = (float)awu.b.c($$11) / 255.0F;
                  $$15 = (float)awu.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            ctk $$19 = $$6.a(jp.B);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bqc $$1) {
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

   private void a(ewi $$0, fzz $$1, int $$2, A $$3, float $$4, float $$5, float $$6, ajt $$7) {
      ewm $$8 = $$1.getBuffer(gah.a($$7));
      $$3.a($$0, $$8, $$2, gla.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(il<coz> $$0, ewi $$1, fzz $$2, int $$3, ctk $$4, A $$5, boolean $$6) {
      glj $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      ewm $$8 = $$7.a($$2.getBuffer(gao.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ewi $$0, fzz $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gah.k()), $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bqc $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bqc $$0) {
      return $$0 == bqc.d;
   }
}
