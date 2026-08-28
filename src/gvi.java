import java.util.Map;

public class gvi<S extends gys, M extends gbl<S> & gbu> extends gwe<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gvi.a c;
   private final Map<drq.a, gdi> d;
   private final gsn e;

   public gvi(gtm<S, M> $$0, gej $$1, gsn $$2) {
      this($$0, $$1, gvi.a.a, $$2);
   }

   public gvi(gtm<S, M> $$0, gej $$1, gvi.a $$2, gsn $$3) {
      super($$0);
      this.c = $$2;
      this.d = gok.a($$1);
      this.e = $$3;
   }

   public void a(fgr $$0, glk $$1, int $$2, S $$3, float $$4, float $$5) {
      cxo $$6 = $$3.ao;
      hdm $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cxk $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cvu $$10 && $$10.d() instanceof djh $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               dan $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               drq.a $$13 = $$11.b();
               gdi $$14 = this.d.get($$13);
               glu $$15 = gok.a($$13, $$12);
               gok.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gvt.a($$6, bvr.f)) {
               a($$0, this.c);
               this.e.a($$6, cxm.f, false, $$0, $$1, $$2, hbb.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fgr $$0, gvi.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gvi.a a = new gvi.a(0.0F, 0.0F, 1.0F);

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
