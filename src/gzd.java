import java.util.function.Function;

public class gzd<S extends hcp, M extends gfd<S> & gfn> extends gzy<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gzd.a c;
   private final Function<dtc.a, ghb> d;

   public gzd(gxh<S, M> $$0, gic $$1) {
      this($$0, $$1, gzd.a.a);
   }

   public gzd(gxh<S, M> $$0, gic $$1, gzd.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = af.b($$1x -> gsf.a($$1, $$1x));
   }

   public void a(fiq $$0, gpd $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.as.c() || $$3.au != null) {
         $$0.a();
         $$0.b(this.c.c(), 1.0F, this.c.c());
         M $$6 = this.d();
         $$6.e().a($$0);
         $$6.b().a($$0);
         if ($$3.au != null) {
            $$0.a(0.0F, this.c.b(), 0.0F);
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            $$0.a(-0.5, 0.0, -0.5);
            dtc.a $$7 = $$3.au;
            ghb $$8 = this.d.apply($$7);
            gpn $$9 = gsf.a($$7, $$3.av);
            gsf.a(null, 180.0F, $$3.at, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.as.a($$0, $$1, $$2, hhp.d);
         }

         $$0.b();
      }
   }

   public static void a(fiq $$0, gzd.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gzd.a a = new gzd.a(0.0F, 0.0F, 1.0F);

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
