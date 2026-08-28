import com.google.common.collect.Maps;
import java.util.Map;

public class gof<T extends btl, M extends fvr<T>, A extends fvr<T>> extends gop<T, M> {
   private static final Map<String, akq> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gqe d;

   public gof(glz<T, M> $$0, A $$1, A $$2, gsm $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gfi.g);
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsx.e, $$2, this.a(bsx.e));
      this.a($$0, $$1, $$3, bsx.d, $$2, this.a(bsx.d));
      this.a($$0, $$1, $$3, bsx.c, $$2, this.a(bsx.c));
      this.a($$0, $$1, $$3, bsx.f, $$2, this.a(bsx.f));
   }

   private void a(fbc $$0, get $$1, T $$2, bsx $$3, int $$4, A $$5) {
      cuo $$6 = $$2.a($$3);
      if ($$6.g() instanceof csd $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cse $$10 = $$7.h().a();
            int $$11 = $$6.a(awm.bx) ? axx.b.e(cxi.a($$6, -6265536)) : -1;

            for (cse.a $$12 : $$10.e()) {
               int $$13 = $$12.a() ? $$11 : -1;
               this.a($$0, $$1, $$4, $$5, $$13, $$12.a($$9));
            }

            cwv $$14 = $$6.a(kq.K);
            if ($$14 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$14, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsx $$1) {
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

   private void a(fbc $$0, get $$1, int $$2, A $$3, int $$4, akq $$5) {
      fbg $$6 = $$1.getBuffer(gfb.a($$5));
      $$3.a($$0, $$6, $$2, gpw.d, $$4);
   }

   private void a(jm<cse> $$0, fbc $$1, get $$2, int $$3, cwv $$4, A $$5, boolean $$6) {
      gqf $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fbg $$8 = $$7.a($$2.getBuffer(gfi.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gpw.d);
   }

   private void a(fbc $$0, get $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gfb.j()), $$2, gpw.d);
   }

   private A a(bsx $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsx $$0) {
      return $$0 == bsx.d;
   }
}
