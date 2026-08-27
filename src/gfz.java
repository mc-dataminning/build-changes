import com.google.common.collect.Maps;
import java.util.Map;

public class gfz<T extends box, M extends fnr<T>, A extends fnr<T>> extends ggj<T, M> {
   private static final Map<String, ajc> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final ghy d;

   public gfz(gdt<T, M> $$0, A $$1, A $$2, gkf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(fxf.g);
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, bom.e, $$2, this.a(bom.e));
      this.a($$0, $$1, $$3, bom.d, $$2, this.a(bom.d));
      this.a($$0, $$1, $$3, bom.c, $$2, this.a(bom.c));
      this.a($$0, $$1, $$3, bom.f, $$2, this.a(bom.f));
   }

   private void a(etd $$0, fwq $$1, T $$2, bom $$3, int $$4, A $$5) {
      cpq $$6 = $$2.c($$3);
      if ($$6.d() instanceof cnc $$7) {
         if ($$7.i() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            cnd $$10 = $$7.f().a();
            int $$11 = $$6.a(aum.ba) ? coi.b($$6) : -1;

            for (cnd.a $$12 : $$10.e()) {
               float $$13;
               float $$14;
               float $$15;
               if ($$12.a() && $$11 != -1) {
                  $$13 = (float)avw.b.b($$11) / 255.0F;
                  $$14 = (float)avw.b.c($$11) / 255.0F;
                  $$15 = (float)avw.b.d($$11) / 255.0F;
               } else {
                  $$13 = 1.0F;
                  $$14 = 1.0F;
                  $$15 = 1.0F;
               }

               this.a($$0, $$1, $$4, $$5, $$13, $$14, $$15, $$12.a($$9));
            }

            crr.a($$2.dJ().I_(), $$6, true).ifPresent($$6x -> this.a($$7.f(), $$0, $$1, $$4, $$6x, $$5, $$9));
            if ($$6.C()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, bom $$1) {
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

   private void a(etd $$0, fwq $$1, int $$2, A $$3, float $$4, float $$5, float $$6, ajc $$7) {
      eth $$8 = $$1.getBuffer(fwy.a($$7));
      $$3.a($$0, $$8, $$2, ghq.d, $$4, $$5, $$6, 1.0F);
   }

   private void a(il<cnd> $$0, etd $$1, fwq $$2, int $$3, crr $$4, A $$5, boolean $$6) {
      ghz $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      eth $$8 = $$7.a($$2.getBuffer(fxf.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(etd $$0, fwq $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(fwy.k()), $$2, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(bom $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(bom $$0) {
      return $$0 == bom.d;
   }
}
