import java.util.function.Function;

public class gvx<S extends gzk, M extends gcb<S> & gck> extends gwt<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gvx.a c;
   private final Function<dqt.a, gdy> d;

   public gvx(gub<S, M> $$0, gez $$1) {
      this($$0, $$1, gvx.a.a);
   }

   public gvx(gub<S, M> $$0, gez $$1, gvx.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = af.b($$1x -> goz.a($$1, $$1x));
   }

   public void a(ffu $$0, gly $$1, int $$2, S $$3, float $$4, float $$5) {
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
            dqt.a $$7 = $$3.au;
            gdy $$8 = this.d.apply($$7);
            gmi $$9 = goz.a($$7, $$3.av);
            goz.a(null, 180.0F, $$3.at, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.as.a($$0, $$1, $$2, hei.d);
         }

         $$0.b();
      }
   }

   public static void a(ffu $$0, gvx.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gvx.a a = new gvx.a(0.0F, 0.0F, 1.0F);

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
