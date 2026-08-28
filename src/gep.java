import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gep extends fzq {
   private static final xg a = xg.c("selectWorld.experimental.title");
   private static final xg b = xg.c("selectWorld.experimental.message");
   private static final xg c = xg.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auv> v;
   private final fxl w = new fxl().a(10).b(20);

   public gep(Collection<auv> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xg i() {
      return xf.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      fxl.b $$0 = this.w.d(2);
      fxp $$1 = $$0.b().b();
      $$0.a(new fvf(this.l, this.p), 2, $$1);
      fus $$2 = $$0.a(new fus(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fty.a(c, $$0x -> this.m.a(new gep.a())).a(100).a(), 2, $$1);
      $$0.a(fty.a(xf.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fty.a(xf.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fxk.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aL_() {
      this.u.accept(false);
   }

   class a extends fzq {
      private static final xg b = xg.c("selectWorld.experimental.details.title");
      final fxm c = new fxm(this);
      @Nullable
      private gep.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aO_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gep.a.a(this.m, gep.this.v));
         this.c.b(fty.a(xf.k, $$0 -> this.aL_()).a());
         this.c.a($$1 -> {
            ftw var10000 = this.c($$1);
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
      public void aL_() {
         this.m.a(gep.this);
      }

      class a extends fuu<gep.a.b> {
         public a(final fqq $$0, final Collection<auv> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auv $$2 : $$1) {
               String $$3 = cvu.a(cvu.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xg $$4 = xj.a($$2.b().f(), yd.a.a(true));
                  xg $$5 = xg.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fur.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fuu.a<gep.a.b> {
         private final xg b;
         private final xg c;
         private final fur d;

         b(final xg $$0, final xg $$1, final fur $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", xf.a(this.b, this.c));
         }
      }
   }
}
