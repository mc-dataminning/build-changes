import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fwt extends frw {
   private static final xj a = xj.c("selectWorld.experimental.title");
   private static final xj b = xj.c("selectWorld.experimental.message");
   private static final xj c = xj.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auk> v;
   private final fpr w = new fpr().a(10).b(20);

   public fwt(Collection<auk> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xj i() {
      return xi.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      fpr.b $$0 = this.w.d(2);
      fpv $$1 = $$0.b().b();
      $$0.a(new fnk(this.l, this.p), 2, $$1);
      fmx $$2 = $$0.a(new fmx(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fmd.a(c, $$0x -> this.m.a(new fwt.a())).a(100).a(), 2, $$1);
      $$0.a(fmd.a(xi.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fmd.a(xi.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fpq.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aO_() {
      this.u.accept(false);
   }

   class a extends frw {
      private static final xj b = xj.c("selectWorld.experimental.details.title");
      final fps c = new fps(this);
      @Nullable
      private fwt.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fwt.a.a(this.m, fwt.this.v));
         this.c.b(fmd.a(xi.k, $$0 -> this.aO_()).a());
         this.c.a($$1 -> {
            fmb var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         if (this.d != null) {
            this.d.a(this.n, this.c);
         }

         this.c.a();
      }

      @Override
      public void aO_() {
         this.m.a(fwt.this);
      }

      class a extends fmz<fwt.a.b> {
         public a(final fke $$0, final Collection<auk> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auk $$2 : $$1) {
               String $$3 = crs.a(crs.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xj $$4 = xm.a($$2.b().f(), yg.a.a(true));
                  xj $$5 = xj.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fmw.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fmz.a<fwt.a.b> {
         private final xj b;
         private final xj c;
         private final fmw d;

         b(final xj $$0, final xj $$1, final fmw $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", xi.a(this.b, this.c));
         }
      }
   }
}
