import java.util.Map;

public class gmn<T extends bto, M extends ftz<T> & fuh> extends gni<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dma.a, fvw> d;
   private final gdj e;

   public gmn(gks<T, M> $$0, fwv $$1, gdj $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmn(gks<T, M> $$0, fwv $$1, float $$2, float $$3, float $$4, gdj $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggc.a($$1);
      this.e = $$5;
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.a(bta.f);
      if (!$$10.e()) {
         cuj $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmj || $$3 instanceof ckw;
         if ($$3.p_() && !($$3 instanceof cmj)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csm && ((csm)$$11).d() instanceof ddu) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxq $$16 = $$10.a(km.V);
            $$0.a(-0.5, 0.0, -0.5);
            dma.a $$17 = ((ddu)((csm)$$11).d()).b();
            fvw $$18 = this.d.get($$17);
            gdv $$19 = ggc.a($$17, $$16);
            bup $$21;
            if ($$3.dc() instanceof bto $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggc.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof csd $$24) || $$24.m() != bta.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cul.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ezx $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
