import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gfe extends gaf {
   private static final xc a = xc.c("selectWorld.experimental.title");
   private static final xc b = xc.c("selectWorld.experimental.message");
   private static final xc c = xc.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auo> v;
   private final fya w = new fya().a(10).b(20);

   public gfe(Collection<auo> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xc i() {
      return xb.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      fya.b $$0 = this.w.d(2);
      fye $$1 = $$0.b().b();
      $$0.a(new fvu(this.l, this.p), 2, $$1);
      fvh $$2 = $$0.a(new fvh(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fun.a(c, $$0x -> this.m.a(new gfe.a())).a(100).a(), 2, $$1);
      $$0.a(fun.a(xb.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fun.a(xb.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fxz.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.u.accept(false);
   }

   class a extends gaf {
      private static final xc b = xc.c("selectWorld.experimental.details.title");
      final fyb c = new fyb(this);
      @Nullable
      private gfe.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gfe.a.a(this.m, gfe.this.v));
         this.c.b(fun.a(xb.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            ful var10000 = this.c($$1);
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
      public void aP_() {
         this.m.a(gfe.this);
      }

      class a extends fvj<gfe.a.b> {
         public a(final frf $$0, final Collection<auo> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auo $$2 : $$1) {
               String $$3 = cvl.a(cvl.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xc $$4 = xf.a($$2.b().f(), xz.a.a(true));
                  xc $$5 = xc.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fvg.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fvj.a<gfe.a.b> {
         private final xc b;
         private final xc c;
         private final fvg d;

         b(final xc $$0, final xc $$1, final fvg $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", xb.a(this.b, this.c));
         }
      }
   }
}
