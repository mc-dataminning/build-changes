import java.util.function.Function;

public class hbo<S extends hfe, M extends ghn<S> & ghx> extends hcj<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final hbo.a c;
   private final Function<dva.a, gjl> d;

   public hbo(gzs<S, M> $$0, gkn $$1) {
      this($$0, $$1, hbo.a.a);
   }

   public hbo(gzs<S, M> $$0, gkn $$1, hbo.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = ag.b($$1x -> guq.a($$1, $$1x));
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.av.c() || $$3.ax != null) {
         $$0.a();
         $$0.b(this.c.c(), 1.0F, this.c.c());
         M $$6 = this.d();
         $$6.e().a($$0);
         $$6.b().a($$0);
         if ($$3.ax != null) {
            $$0.a(0.0F, this.c.b(), 0.0F);
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            $$0.a(-0.5, 0.0, -0.5);
            dva.a $$7 = $$3.ax;
            gjl $$8 = this.d.apply($$7);
            gry $$9 = guq.a($$7, $$3.ay);
            guq.a(null, 180.0F, $$3.aw, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.av.a($$0, $$1, $$2, hkg.d);
         }

         $$0.b();
      }
   }

   public static void a(fld $$0, hbo.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final hbo.a a = new hbo.a(0.0F, 0.0F, 1.0F);

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
