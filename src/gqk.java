import java.util.Map;

public class gqk<S extends gts, M extends fxa<S> & fxj> extends grf<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gqk.a c;
   private final Map<dny.a, fyx> d;
   private final gnq e;

   public gqk(goo<S, M> $$0, fzx $$1, gnq $$2) {
      this($$0, $$1, gqk.a.a, $$2);
   }

   public gqk(goo<S, M> $$0, fzx $$1, gqk.a $$2, gnq $$3) {
      super($$0);
      this.c = $$2;
      this.d = gjr.a($$1);
      this.e = $$3;
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      cvl $$6 = $$3.ao;
      gym $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label26: {
            cvg $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.a().a($$0);
            $$9.c().a($$0);
            if ($$8 instanceof ctl $$10 && $$10.d() instanceof dfr $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cyn $$12 = $$6.a(kr.Y);
               $$0.a(-0.5, 0.0, -0.5);
               dny.a $$13 = $$11.b();
               fyx $$14 = this.d.get($$13);
               ghe $$15 = gjr.a($$13, $$12);
               gjr.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label26;
            }

            if (!($$8 instanceof ctc $$16) || $$16.m() != btr.f) {
               a($$0, this.c);
               this.e.a($$6, cvi.f, false, $$0, $$1, $$2, gwb.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fcu $$0, gqk.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gqk.a a = new gqk.a(0.0F, 0.0F, 1.0F);

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
