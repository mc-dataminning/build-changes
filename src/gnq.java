import com.google.common.collect.Maps;
import java.util.Map;

public class gnq<T extends btc, M extends fvd<T>, A extends fvd<T>> extends goa<T, M> {
   private static final Map<String, akk> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gpp d;

   public gnq(glk<T, M> $$0, A $$1, A $$2, grx $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(geu.g);
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bso.e, $$2, this.a(bso.e));
      this.a($$0, $$1, $$3, bso.d, $$2, this.a(bso.d));
      this.a($$0, $$1, $$3, bso.c, $$2, this.a(bso.c));
      this.a($$0, $$1, $$3, bso.f, $$2, this.a(bso.f));
   }

   private void a(fao $$0, gef $$1, T $$2, bso $$3, int $$4, A $$5) {
      cud $$6 = $$2.a($$3);
      if ($$6.g() instanceof crt $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cru $$10 = $$7.h().a();
            int $$11 = $$6.a(awf.by) ? cwu.a($$6, -6265536) : -1;

            for (cru.a $$12 : $$10.e()) {
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

            cwh $$19 = $$6.a(kn.K);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bso $$1) {
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

   private void a(fao $$0, gef $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akk $$7) {
      fas $$8 = $$1.getBuffer(gen.a($$7));
      $$3.a($$0, $$8, $$2, gph.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(jj<cru> $$0, fao $$1, gef $$2, int $$3, cwh $$4, A $$5, boolean $$6) {
      gpq $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fas $$8 = $$7.a($$2.getBuffer(geu.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(fao $$0, gef $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gen.k()), $$2, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bso $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bso $$0) {
      return $$0 == bso.d;
   }
}
