import com.google.common.collect.Maps;
import java.util.Map;

public class gmu<T extends btk, M extends fui<T>, A extends fui<T>> extends gne<T, M> {
   private static final Map<String, alb> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final got d;

   public gmu(gko<T, M> $$0, A $$1, A $$2, grb $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gdy.g);
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsw.e, $$2, this.a(bsw.e));
      this.a($$0, $$1, $$3, bsw.d, $$2, this.a(bsw.d));
      this.a($$0, $$1, $$3, bsw.c, $$2, this.a(bsw.c));
      this.a($$0, $$1, $$3, bsw.f, $$2, this.a(bsw.f));
   }

   private void a(ezt $$0, gdj $$1, T $$2, bsw $$3, int $$4, A $$5) {
      cuk $$6 = $$2.a($$3);
      if ($$6.g() instanceof crz $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            csa $$10 = $$7.h().a();
            int $$11 = $$6.a(awu.by) ? cxc.a($$6, -6265536) : -1;

            for (csa.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)aye.b.b($$11) / 255.0F;
                  $$14 = (float)aye.b.c($$11) / 255.0F;
                  $$15 = (float)aye.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cwo $$19 = $$6.a(km.J);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.y()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsw $$1) {
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

   private void a(ezt $$0, gdj $$1, int $$2, A $$3, float $$4, float $$5, float $$6, alb $$7) {
      ezx $$8 = $$1.getBuffer(gdr.a($$7));
      $$3.a($$0, $$8, $$2, gol.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(ji<csa> $$0, ezt $$1, gdj $$2, int $$3, cwo $$4, A $$5, boolean $$6) {
      gou $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      ezx $$8 = $$7.a($$2.getBuffer(gdy.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ezt $$0, gdj $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gdr.k()), $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsw $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsw $$0) {
      return $$0 == bsw.d;
   }
}
