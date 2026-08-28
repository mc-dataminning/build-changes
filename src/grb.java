import java.util.Map;

public class grb<S extends guj, M extends fxk<S> & fxt> extends grw<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final grb.a c;
   private final Map<dom.a, fzh> d;
   private final goh e;

   public grb(gpf<S, M> $$0, gah $$1, goh $$2) {
      this($$0, $$1, grb.a.a, $$2);
   }

   public grb(gpf<S, M> $$0, gah $$1, grb.a $$2, goh $$3) {
      super($$0);
      this.c = $$2;
      this.d = gkg.a($$1);
      this.e = $$3;
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      cvp $$6 = $$3.ao;
      gzd $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label26: {
            cvk $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.a().a($$0);
            $$9.c().a($$0);
            if ($$8 instanceof ctr $$10 && $$10.d() instanceof dgf $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cys $$12 = $$6.a(kr.ab);
               $$0.a(-0.5, 0.0, -0.5);
               dom.a $$13 = $$11.b();
               fzh $$14 = this.d.get($$13);
               ghq $$15 = gkg.a($$13, $$12);
               gkg.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label26;
            }

            if (!($$8 instanceof cti $$16) || $$16.l() != btw.f) {
               a($$0, this.c);
               this.e.a($$6, cvm.f, false, $$0, $$1, $$2, gws.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fde $$0, grb.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final grb.a a = new grb.a(0.0F, 0.0F, 1.0F);

      public float a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }
}
