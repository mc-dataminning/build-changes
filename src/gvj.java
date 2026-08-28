import java.util.Map;

public class gvj<S extends gyt, M extends gbm<S> & gbv> extends gwf<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gvj.a c;
   private final Map<drr.a, gdj> d;
   private final gso e;

   public gvj(gtn<S, M> $$0, gek $$1, gso $$2) {
      this($$0, $$1, gvj.a.a, $$2);
   }

   public gvj(gtn<S, M> $$0, gek $$1, gvj.a $$2, gso $$3) {
      super($$0);
      this.c = $$2;
      this.d = gol.a($$1);
      this.e = $$3;
   }

   public void a(fgs $$0, gll $$1, int $$2, S $$3, float $$4, float $$5) {
      cxp $$6 = $$3.ao;
      hdn $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cxl $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cvv $$10 && $$10.d() instanceof dji $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               dao $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               drr.a $$13 = $$11.b();
               gdj $$14 = this.d.get($$13);
               glv $$15 = gol.a($$13, $$12);
               gol.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gvu.a($$6, bvs.f)) {
               a($$0, this.c);
               this.e.a($$6, cxn.f, false, $$0, $$1, $$2, hbc.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fgs $$0, gvj.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gvj.a a = new gvj.a(0.0F, 0.0F, 1.0F);

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
