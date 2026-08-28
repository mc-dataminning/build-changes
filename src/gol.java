import com.google.common.collect.Maps;
import java.util.Map;

public class gol<T extends btn, M extends fvx<T>, A extends fvx<T>> extends gov<T, M> {
   private static final Map<String, akr> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final gqk d;

   public gol(gmf<T, M> $$0, A $$1, A $$2, gst $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(gfo.g);
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bsy.e, $$2, this.a(bsy.e));
      this.a($$0, $$1, $$3, bsy.d, $$2, this.a(bsy.d));
      this.a($$0, $$1, $$3, bsy.c, $$2, this.a(bsy.c));
      this.a($$0, $$1, $$3, bsy.f, $$2, this.a(bsy.f));
   }

   private void a(fbi $$0, gez $$1, T $$2, bsy $$3, int $$4, A $$5) {
      cuq $$6 = $$2.a($$3);
      if ($$6.g() instanceof csf $$7) {
         if ($$7.m() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            csg $$10 = $$7.h().a();
            int $$11 = $$6.a(awn.bx) ? axy.b.e(cxk.a($$6, -6265536)) : -1;

            for (csg.a $$12 : $$10.e()) {
               int $$13 = $$12.a() ? $$11 : -1;
               this.a($$0, $$1, $$4, $$5, $$13, $$12.a($$9));
            }

            cwx $$14 = $$6.a(kq.K);
            if ($$14 != null) {
               this.a($$7.h(), $$0, $$1, $$4, $$14, $$5, $$9);
            }

            if ($$6.x()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bsy $$1) {
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

   private void a(fbi $$0, gez $$1, int $$2, A $$3, int $$4, akr $$5) {
      fbm $$6 = $$1.getBuffer(gfh.a($$5));
      $$3.a($$0, $$6, $$2, gqc.d, $$4);
   }

   private void a(jm<csg> $$0, fbi $$1, gez $$2, int $$3, cwx $$4, A $$5, boolean $$6) {
      gql $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fbm $$8 = $$7.a($$2.getBuffer(gfo.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gqc.d);
   }

   private void a(fbi $$0, gez $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(gfh.j()), $$2, gqc.d);
   }

   private A a(bsy $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bsy $$0) {
      return $$0 == bsy.d;
   }
}
