import java.util.Map;

public class gmx<T extends bsy, M extends fui<T> & fuq> extends gns<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmh.a, fwf> d;
   private final gdt e;

   public gmx(glc<T, M> $$0, fxe $$1, gdt $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmx(glc<T, M> $$0, fxe $$1, float $$2, float $$3, float $$4, gdt $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggm.a($$1);
      this.e = $$5;
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cua $$10 = $$3.a(bsk.f);
      if (!$$10.e()) {
         ctv $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof clu || $$3 instanceof ckh;
         if ($$3.p_() && !($$3 instanceof clu)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cry && ((cry)$$11).d() instanceof deb) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxb $$16 = $$10.a(kn.V);
            $$0.a(-0.5, 0.0, -0.5);
            dmh.a $$17 = ((deb)((cry)$$11).d()).b();
            fwf $$18 = this.d.get($$17);
            gef $$19 = ggm.a($$17, $$16);
            btz $$21;
            if ($$3.dc() instanceof bsy $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggm.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crp $$24) || $$24.m() != bsk.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, ctx.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(fag $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
