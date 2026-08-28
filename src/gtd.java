import java.util.Map;

public class gtd<S extends gwm, M extends fzj<S> & fzs> extends gty<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gtd.a c;
   private final Map<dps.a, gbg> d;
   private final gqi e;

   public gtd(grh<S, M> $$0, gch $$1, gqi $$2) {
      this($$0, $$1, gtd.a.a, $$2);
   }

   public gtd(grh<S, M> $$0, gch $$1, gtd.a $$2, gqi $$3) {
      super($$0);
      this.c = $$2;
      this.d = gmg.a($$1);
      this.e = $$3;
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      cwm $$6 = $$3.ao;
      hbg $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cwi $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cus $$10 && $$10.d() instanceof dhm $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               czl $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               dps.a $$13 = $$11.b();
               gbg $$14 = this.d.get($$13);
               gjq $$15 = gmg.a($$13, $$12);
               gmg.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gto.a($$6, but.f)) {
               a($$0, this.c);
               this.e.a($$6, cwk.f, false, $$0, $$1, $$2, gyv.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fer $$0, gtd.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gtd.a a = new gtd.a(0.0F, 0.0F, 1.0F);

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
