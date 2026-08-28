import java.util.Map;

public class grr<S extends gva, M extends fxz<S> & fyi> extends gsm<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final grr.a c;
   private final Map<dpa.a, fzw> d;
   private final gox e;

   public grr(gpv<S, M> $$0, gax $$1, gox $$2) {
      this($$0, $$1, grr.a.a, $$2);
   }

   public grr(gpv<S, M> $$0, gax $$1, grr.a $$2, gox $$3) {
      super($$0);
      this.c = $$2;
      this.d = gkw.a($$1);
      this.e = $$3;
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      cvx $$6 = $$3.ao;
      gzu $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cvt $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cuc $$10 && $$10.d() instanceof dgu $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cyu $$12 = $$6.a(kt.af);
               $$0.a(-0.5, 0.0, -0.5);
               dpa.a $$13 = $$11.b();
               fzw $$14 = this.d.get($$13);
               gig $$15 = gkw.a($$13, $$12);
               gkw.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gsc.a($$6, buh.f)) {
               a($$0, this.c);
               this.e.a($$6, cvv.f, false, $$0, $$1, $$2, gxj.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fdt $$0, grr.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final grr.a a = new grr.a(0.0F, 0.0F, 1.0F);

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
