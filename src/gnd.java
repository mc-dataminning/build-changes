import java.util.Map;

public class gnd<T extends btb, M extends fuo<T> & fuw> extends gny<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmj.a, fwl> d;
   private final gdz e;

   public gnd(gli<T, M> $$0, fxk $$1, gdz $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gnd(gli<T, M> $$0, fxk $$1, float $$2, float $$3, float $$4, gdz $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggs.a($$1);
      this.e = $$5;
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuc $$10 = $$3.a(bsn.f);
      if (!$$10.e()) {
         ctx $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof clx || $$3 instanceof ckk;
         if ($$3.p_() && !($$3 instanceof clx)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csb && ((csb)$$11).d() instanceof ded) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxd $$16 = $$10.a(kn.V);
            $$0.a(-0.5, 0.0, -0.5);
            dmj.a $$17 = ((ded)((csb)$$11).d()).b();
            fwl $$18 = this.d.get($$17);
            gel $$19 = ggs.a($$17, $$16);
            buc $$21;
            if ($$3.dd() instanceof btb $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggs.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crs $$24) || $$24.m() != bsn.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, ctz.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(fam $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
