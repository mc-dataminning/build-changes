import java.util.Map;

public class gve<S extends gyo, M extends gbh<S> & gbq> extends gwa<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gve.a c;
   private final Map<drk.a, gde> d;
   private final gsj e;

   public gve(gti<S, M> $$0, gef $$1, gsj $$2) {
      this($$0, $$1, gve.a.a, $$2);
   }

   public gve(gti<S, M> $$0, gef $$1, gve.a $$2, gsj $$3) {
      super($$0);
      this.c = $$2;
      this.d = gog.a($$1);
      this.e = $$3;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      cxg $$6 = $$3.ao;
      hdi $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cxc $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cvm $$10 && $$10.d() instanceof diz $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               daf $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               drk.a $$13 = $$11.b();
               gde $$14 = this.d.get($$13);
               glq $$15 = gog.a($$13, $$12);
               gog.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gvp.a($$6, bvj.f)) {
               a($$0, this.c);
               this.e.a($$6, cxe.f, false, $$0, $$1, $$2, hax.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fgl $$0, gve.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gve.a a = new gve.a(0.0F, 0.0F, 1.0F);

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
