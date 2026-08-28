import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gfc extends gad {
   private static final xa a = xa.c("selectWorld.experimental.title");
   private static final xa b = xa.c("selectWorld.experimental.message");
   private static final xa c = xa.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aum> v;
   private final fxy w = new fxy().a(10).b(20);

   public gfc(Collection<aum> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xa i() {
      return wz.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      fxy.b $$0 = this.w.d(2);
      fyc $$1 = $$0.b().b();
      $$0.a(new fvs(this.l, this.p), 2, $$1);
      fvf $$2 = $$0.a(new fvf(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(ful.a(c, $$0x -> this.m.a(new gfc.a())).a(100).a(), 2, $$1);
      $$0.a(ful.a(wz.i, $$0x -> this.u.accept(true)).a());
      $$0.a(ful.a(wz.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fuj var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fxx.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.u.accept(false);
   }

   class a extends gad {
      private static final xa b = xa.c("selectWorld.experimental.details.title");
      final fxz c = new fxz(this);
      @Nullable
      private gfc.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gfc.a.a(this.m, gfc.this.v));
         this.c.b(ful.a(wz.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            fuj var10000 = this.c($$1);
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
         this.m.a(gfc.this);
      }

      class a extends fvh<gfc.a.b> {
         public a(final frd $$0, final Collection<aum> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aum $$2 : $$1) {
               String $$3 = cvj.a(cvj.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xa $$4 = xd.a($$2.b().f(), xx.a.a(true));
                  xa $$5 = xa.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fve.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fvh.a<gfc.a.b> {
         private final xa b;
         private final xa c;
         private final fve d;

         b(final xa $$0, final xa $$1, final fve $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", wz.a(this.b, this.c));
         }
      }
   }
}
