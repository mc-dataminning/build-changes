import java.util.Map;

public class gsc<S extends gvl, M extends fyk<S> & fyt> extends gsx<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gsc.a c;
   private final Map<dpg.a, gah> d;
   private final gpi e;

   public gsc(gqg<S, M> $$0, gbi $$1, gpi $$2) {
      this($$0, $$1, gsc.a.a, $$2);
   }

   public gsc(gqg<S, M> $$0, gbi $$1, gsc.a $$2, gpi $$3) {
      super($$0);
      this.c = $$2;
      this.d = glh.a($$1);
      this.e = $$3;
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      cwb $$6 = $$3.ao;
      haf $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cvx $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cuh $$10 && $$10.d() instanceof dha $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cza $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               dpg.a $$13 = $$11.b();
               gah $$14 = this.d.get($$13);
               gir $$15 = glh.a($$13, $$12);
               glh.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gsn.a($$6, bum.f)) {
               a($$0, this.c);
               this.e.a($$6, cvz.f, false, $$0, $$1, $$2, gxu.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(feb $$0, gsc.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gsc.a a = new gsc.a(0.0F, 0.0F, 1.0F);

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
