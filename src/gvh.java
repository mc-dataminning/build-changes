import java.util.Map;

public class gvh<S extends gyr, M extends gbk<S> & gbt> extends gwd<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gvh.a c;
   private final Map<drq.a, gdh> d;
   private final gsm e;

   public gvh(gtl<S, M> $$0, gei $$1, gsm $$2) {
      this($$0, $$1, gvh.a.a, $$2);
   }

   public gvh(gtl<S, M> $$0, gei $$1, gvh.a $$2, gsm $$3) {
      super($$0);
      this.c = $$2;
      this.d = goj.a($$1);
      this.e = $$3;
   }

   public void a(fgq $$0, glj $$1, int $$2, S $$3, float $$4, float $$5) {
      cxo $$6 = $$3.ao;
      hdl $$7 = $$3.an;
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
               gdh $$14 = this.d.get($$13);
               glt $$15 = goj.a($$13, $$12);
               goj.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gvs.a($$6, bvr.f)) {
               a($$0, this.c);
               this.e.a($$6, cxm.f, false, $$0, $$1, $$2, hba.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fgq $$0, gvh.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gvh.a a = new gvh.a(0.0F, 0.0F, 1.0F);

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
