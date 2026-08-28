import java.util.Map;

public class grg<S extends guo, M extends fxo<S> & fxx> extends gsb<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final grg.a c;
   private final Map<dop.a, fzl> d;
   private final gom e;

   public grg(gpk<S, M> $$0, gam $$1, gom $$2) {
      this($$0, $$1, grg.a.a, $$2);
   }

   public grg(gpk<S, M> $$0, gam $$1, grg.a $$2, gom $$3) {
      super($$0);
      this.c = $$2;
      this.d = gkl.a($$1);
      this.e = $$3;
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      cvs $$6 = $$3.ao;
      gzi $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label26: {
            cvn $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof ctu $$10 && $$10.d() instanceof dgi $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cyv $$12 = $$6.a(ks.ab);
               $$0.a(-0.5, 0.0, -0.5);
               dop.a $$13 = $$11.b();
               fzl $$14 = this.d.get($$13);
               ghv $$15 = gkl.a($$13, $$12);
               gkl.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label26;
            }

            if (!($$8 instanceof ctl $$16) || $$16.l() != btz.f) {
               a($$0, this.c);
               this.e.a($$6, cvp.f, false, $$0, $$1, $$2, gwx.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fdi $$0, grg.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final grg.a a = new grg.a(0.0F, 0.0F, 1.0F);

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
