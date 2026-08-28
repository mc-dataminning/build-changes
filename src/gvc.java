import java.util.Map;

public class gvc<S extends gym, M extends gbf<S> & gbo> extends gvy<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gvc.a c;
   private final Map<drj.a, gdc> d;
   private final gsh e;

   public gvc(gtg<S, M> $$0, ged $$1, gsh $$2) {
      this($$0, $$1, gvc.a.a, $$2);
   }

   public gvc(gtg<S, M> $$0, ged $$1, gvc.a $$2, gsh $$3) {
      super($$0);
      this.c = $$2;
      this.d = goe.a($$1);
      this.e = $$3;
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      cxk $$6 = $$3.ao;
      hdg $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cxg $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cvq $$10 && $$10.d() instanceof dja $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               daj $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               drj.a $$13 = $$11.b();
               gdc $$14 = this.d.get($$13);
               glo $$15 = goe.a($$13, $$12);
               goe.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gvn.a($$6, bvn.f)) {
               a($$0, this.c);
               this.e.a($$6, cxi.f, false, $$0, $$1, $$2, hav.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fgl $$0, gvc.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gvc.a a = new gvc.a(0.0F, 0.0F, 1.0F);

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
