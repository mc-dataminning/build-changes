import com.google.common.collect.Maps;
import java.util.Map;

public class gni<T extends bsy, M extends fuv<T>, A extends fuv<T>> extends gns<T, M> {
   private static final Map<String, akk> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gph d;

   public gni(glc<T, M> $$0, A $$1, A $$2, grp $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gem.g);
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsk.e, $$2, this.a(bsk.e));
      this.a($$0, $$1, $$3, bsk.d, $$2, this.a(bsk.d));
      this.a($$0, $$1, $$3, bsk.c, $$2, this.a(bsk.c));
      this.a($$0, $$1, $$3, bsk.f, $$2, this.a(bsk.f));
   }

   private void a(fag $$0, gdx $$1, T $$2, bsk $$3, int $$4, A $$5) {
      cua $$6 = $$2.a($$3);
      if ($$6.g() instanceof crp $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            crq $$10 = $$7.h().a();
            int $$11 = $$6.a(awd.by) ? cwr.a($$6, -6265536) : -1;

            for (crq.a $$12 : $$10.e()) {
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

            cwe $$19 = $$6.a(kn.K);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsk $$1) {
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

   private void a(fag $$0, gdx $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akk $$7) {
      fak $$8 = $$1.getBuffer(gef.a($$7));
      $$3.a($$0, $$8, $$2, goz.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(jj<crq> $$0, fag $$1, gdx $$2, int $$3, cwe $$4, A $$5, boolean $$6) {
      gpi $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fak $$8 = $$7.a($$2.getBuffer(gem.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fag $$0, gdx $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gef.k()), $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsk $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsk $$0) {
      return $$0 == bsk.d;
   }
}
