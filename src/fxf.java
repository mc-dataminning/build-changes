import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fxf<T extends bjg, M extends ffq<T>, A extends ffq<T>> extends fxp<T, M> {
   private static final Map<String, aew> a = Maps.newHashMap();
   private final A b;
   private final A c;
   private final fzd d;

   public fxf(fvc<T, M> $$0, A $$1, A $$2, gbl $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3.a(fot.g);
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$3, biv.e, $$2, this.a(biv.e));
      this.a($$0, $$1, $$3, biv.d, $$2, this.a(biv.d));
      this.a($$0, $$1, $$3, biv.c, $$2, this.a(biv.c));
      this.a($$0, $$1, $$3, biv.f, $$2, this.a(biv.f));
   }

   private void a(elp $$0, foe $$1, T $$2, biv $$3, int $$4, A $$5) {
      cjf $$6 = $$2.c($$3);
      if ($$6.d() instanceof cgp $$7) {
         if ($$7.g() == $$3) {
            this.c().a($$5);
            this.a($$5, $$3);
            boolean $$9 = this.b($$3);
            if ($$7 instanceof chv $$10) {
               int $$11 = $$10.e_($$6);
               float $$12 = (float)($$11 >> 16 & 0xFF) / 255.0F;
               float $$13 = (float)($$11 >> 8 & 0xFF) / 255.0F;
               float $$14 = (float)($$11 & 0xFF) / 255.0F;
               this.a($$0, $$1, $$4, $$7, $$5, $$9, $$12, $$13, $$14, null);
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, "overlay");
            } else {
               this.a($$0, $$1, $$4, $$7, $$5, $$9, 1.0F, 1.0F, 1.0F, null);
            }

            clh.a($$2.dL().G_(), $$6, true).ifPresent($$6x -> this.a($$7.d(), $$0, $$1, $$4, $$6x, $$5, $$9));
            if ($$6.B()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, biv $$1) {
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

   private void a(elp $$0, foe $$1, int $$2, cgp $$3, A $$4, boolean $$5, float $$6, float $$7, float $$8, @Nullable String $$9) {
      elt $$10 = $$1.getBuffer(fom.a(this.a($$3, $$5, $$9)));
      $$4.a($$0, $$10, $$2, fyv.d, $$6, $$7, $$8, 1.0F);
   }

   private void a(cgq $$0, elp $$1, foe $$2, int $$3, clh $$4, A $$5, boolean $$6) {
      fze $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
      elt $$8 = $$7.a($$2.getBuffer(fot.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(elp $$0, foe $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(fom.l()), $$2, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private A a(biv $$0) {
      return this.b($$0) ? this.b : this.c;
   }

   private boolean b(biv $$0) {
      return $$0 == biv.d;
   }

   private aew a(cgp $$0, boolean $$1, @Nullable String $$2) {
      String $$3 = "textures/models/armor/" + $$0.d().e() + "_layer_" + ($$1 ? 2 : 1) + ($$2 == null ? "" : "_" + $$2) + ".png";
      return a.computeIfAbsent($$3, aew::new);
   }
}
