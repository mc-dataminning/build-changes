import com.google.common.collect.Maps;
import java.util.Map;

public class gmx<T extends btn, M extends ful<T>, A extends ful<T>> extends gnh<T, M> {
   private static final Map<String, ale> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gow d;

   public gmx(gkr<T, M> $$0, A $$1, A $$2, gre $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(geb.g);
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsz.e, $$2, this.a(bsz.e));
      this.a($$0, $$1, $$3, bsz.d, $$2, this.a(bsz.d));
      this.a($$0, $$1, $$3, bsz.c, $$2, this.a(bsz.c));
      this.a($$0, $$1, $$3, bsz.f, $$2, this.a(bsz.f));
   }

   private void a(ezw $$0, gdm $$1, T $$2, bsz $$3, int $$4, A $$5) {
      cun $$6 = $$2.a($$3);
      if ($$6.g() instanceof csc $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            csd $$10 = $$7.h().a();
            int $$11 = $$6.a(awx.by) ? cxf.a($$6, -6265536) : -1;

            for (csd.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)ayh.b.b($$11) / 255.0F;
                  $$14 = (float)ayh.b.c($$11) / 255.0F;
                  $$15 = (float)ayh.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            cwr $$19 = $$6.a(km.J);
            if ($$19 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$19, $$5, $$9);
            }

            if ($$6.y()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsz $$1) {
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

   private void a(ezw $$0, gdm $$1, int $$2, A $$3, float $$4, float $$5, float $$6, ale $$7) {
      faa $$8 = $$1.getBuffer(gdu.a($$7));
      $$3.a($$0, $$8, $$2, goo.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(ji<csd> $$0, ezw $$1, gdm $$2, int $$3, cwr $$4, A $$5, boolean $$6) {
      gox $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      faa $$8 = $$7.a($$2.getBuffer(geb.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(ezw $$0, gdm $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gdu.k()), $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bsz $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsz $$0) {
      return $$0 == bsz.d;
   }
}
