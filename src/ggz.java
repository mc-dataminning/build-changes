import com.google.common.collect.Maps;
import java.util.Map;

public class ggz<T extends bpo, M extends fop<T>, A extends fop<T>> extends ghj<T, M> {
   private static final Map<String, ajh> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final giy d;

   public ggz(get<T, M> $$0, A $$1, A $$2, glf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(fyf.g);
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bpd.e, $$2, this.a(bpd.e));
      this.a($$0, $$1, $$3, bpd.d, $$2, this.a(bpd.d));
      this.a($$0, $$1, $$3, bpd.c, $$2, this.a(bpd.c));
      this.a($$0, $$1, $$3, bpd.f, $$2, this.a(bpd.f));
   }

   private void a(etz $$0, fxq $$1, T $$2, bpd $$3, int $$4, A $$5) {
      cqk $$6 = $$2.d($$3);
      if ($$6.d() instanceof cnw $$7) {
         if ($$7.i() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cnx $$10 = $$7.f().a();
            int $$11 = $$6.a(auv.ba) ? cpd.b($$6) : -1;

            for (cnx.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)awg.b.b($$11) / 255.0F;
                  $$14 = (float)awg.b.c($$11) / 255.0F;
                  $$15 = (float)awg.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            csm.a($$2.dM().H_(), $$6, true).ifPresent($$6x -> this.a($$7.f(), $$0, $$1, $$4, $$6x, $$5, $$9));
            if ($$6.C()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bpd $$1) {
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

   private void a(etz $$0, fxq $$1, int $$2, A $$3, float $$4, float $$5, float $$6, ajh $$7) {
      eud $$8 = $$1.getBuffer(fxy.a($$7));
      $$3.a($$0, $$8, $$2, giq.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(il<cnx> $$0, etz $$1, fxq $$2, int $$3, csm $$4, A $$5, boolean $$6) {
      giz $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      eud $$8 = $$7.a($$2.getBuffer(fyf.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(etz $$0, fxq $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(fxy.k()), $$2, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bpd $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bpd $$0) {
      return $$0 == bpd.d;
   }
}
