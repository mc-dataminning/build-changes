import java.util.function.Function;

public class ham<S extends hdz, M extends ggk<S> & ggu> extends hbh<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final ham.a c;
   private final Function<dty.a, gii> d;

   public ham(gyq<S, M> $$0, gjk $$1) {
      this($$0, $$1, ham.a.a);
   }

   public ham(gyq<S, M> $$0, gjk $$1, ham.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = ag.b($$1x -> gto.a($$1, $$1x));
   }

   public void a(fjy $$0, gqm $$1, int $$2, S $$3, float $$4, float $$5) {
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
            dty.a $$7 = $$3.au;
            gii $$8 = this.d.apply($$7);
            gqx $$9 = gto.a($$7, $$3.av);
            gto.a(null, 180.0F, $$3.at, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.as.a($$0, $$1, $$2, hja.d);
         }

         $$0.b();
      }
   }

   public static void a(fjy $$0, ham.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final ham.a a = new ham.a(0.0F, 0.0F, 1.0F);

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
