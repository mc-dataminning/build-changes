import com.google.common.collect.Maps;
import java.util.Map;

public class gko<T extends bre, M extends fse<T>, A extends fse<T>> extends gky<T, M> {
   private static final Map<String, akf> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gmn d;

   public gko(gii<T, M> $$0, A $$1, A $$2, gou $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gbt.g);
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bqs.e, $$2, this.a(bqs.e));
      this.a($$0, $$1, $$3, bqs.d, $$2, this.a(bqs.d));
      this.a($$0, $$1, $$3, bqs.c, $$2, this.a(bqs.c));
      this.a($$0, $$1, $$3, bqs.f, $$2, this.a(bqs.f));
   }

   private void a(exn $$0, gbe $$1, T $$2, bqs $$3, int $$4, A $$5) {
      csd $$6 = $$2.d($$3);
      if ($$6.f() instanceof cps $$7) {
         if ($$7.k() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cpt $$10 = $$7.h().a();
            int $$11 = $$6.a(avw.ba) ? cut.a($$6, -6265536) : -1;

            for (cpt.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)axg.b.b($$11) / 255.0F;
                  $$14 = (float)axg.b.c($$11) / 255.0F;
                  $$15 = (float)axg.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cuf $$19 = $$6.a(jz.B);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bqs $$1) {
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

   private void a(exn $$0, gbe $$1, int $$2, A $$3, float $$4, float $$5, float $$6, akf $$7) {
      exr $$8 = $$1.getBuffer(gbm.a($$7));
      $$3.a($$0, $$8, $$2, gmf.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(iv<cpt> $$0, exn $$1, gbe $$2, int $$3, cuf $$4, A $$5, boolean $$6) {
      gmo $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      exr $$8 = $$7.a($$2.getBuffer(gbt.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(exn $$0, gbe $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gbm.k()), $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bqs $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bqs $$0) {
      return $$0 == bqs.d;
   }
}
