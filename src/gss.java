import java.util.Map;

public class gss<S extends gwb, M extends fza<S> & fzj> extends gtn<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final gss.a c;
   private final Map<dpl.a, gax> d;
   private final gpy e;

   public gss(gqw<S, M> $$0, gby $$1, gpy $$2) {
      this($$0, $$1, gss.a.a, $$2);
   }

   public gss(gqw<S, M> $$0, gby $$1, gss.a $$2, gpy $$3) {
      super($$0);
      this.c = $$2;
      this.d = glx.a($$1);
      this.e = $$3;
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      cwf $$6 = $$3.ao;
      hav $$7 = $$3.an;
      if (!$$6.f() && $$7 != null) {
         label17: {
            cwb $$8 = $$6.h();
            $$0.a();
            $$0.b(this.c.c(), 1.0F, this.c.c());
            M $$9 = this.d();
            $$9.e().a($$0);
            $$9.b().a($$0);
            if ($$8 instanceof cul $$10 && $$10.d() instanceof dhf $$11) {
               $$0.a(0.0F, this.c.b(), 0.0F);
               $$0.b(1.1875F, -1.1875F, -1.1875F);
               cze $$12 = $$6.a(ku.ag);
               $$0.a(-0.5, 0.0, -0.5);
               dpl.a $$13 = $$11.b();
               gax $$14 = this.d.get($$13);
               gjh $$15 = glx.a($$13, $$12);
               glx.a(null, 180.0F, $$3.Z, $$0, $$1, $$2, $$14, $$15);
               break label17;
            }

            if (!gtd.a($$6, buq.f)) {
               a($$0, this.c);
               this.e.a($$6, cwd.f, false, $$0, $$1, $$2, gyk.d, $$7);
            }
         }

         $$0.b();
      }
   }

   public static void a(fek $$0, gss.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public static record a(float b, float c, float d) {
      public static final gss.a a = new gss.a(0.0F, 0.0F, 1.0F);

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
