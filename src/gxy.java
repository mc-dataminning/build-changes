import java.util.function.Function;

public class gxy<S extends hbk, M extends gea<S> & gek> extends gyt<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gxy.a c;
   private final Function<dsc.a, gfy> d;

   public gxy(gwc<S, M> $$0, ggz $$1) {
      this($$0, $$1, gxy.a.a);
   }

   public gxy(gwc<S, M> $$0, ggz $$1, gxy.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = af.b($$1x -> gra.a($$1, $$1x));
   }

   public void a(fho $$0, gny $$1, int $$2, S $$3, float $$4, float $$5) {
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
            dsc.a $$7 = $$3.au;
            gfy $$8 = this.d.apply($$7);
            goi $$9 = gra.a($$7, $$3.av);
            gra.a(null, 180.0F, $$3.at, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.as.a($$0, $$1, $$2, hgi.d);
         }

         $$0.b();
      }
   }

   public static void a(fho $$0, gxy.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gxy.a a = new gxy.a(0.0F, 0.0F, 1.0F);

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
