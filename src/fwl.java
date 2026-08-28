import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fwl extends frp {
   private static final xl a = xl.c("selectWorld.experimental.title");
   private static final xl b = xl.c("selectWorld.experimental.message");
   private static final xl c = xl.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aul> v;
   private final fpk w = new fpk().a(10).b(20);

   public fwl(Collection<aul> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      fpk.b $$0 = this.w.d(2);
      fpo $$1 = $$0.b().b();
      $$0.a(new fnd(this.l, this.p), 2, $$1);
      fmq $$2 = $$0.a(new fmq(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(flw.a(c, $$0x -> this.m.a(new fwl.a())).a(100).a(), 2, $$1);
      $$0.a(flw.a(xk.i, $$0x -> this.u.accept(true)).a());
      $$0.a(flw.a(xk.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fpj.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.u.accept(false);
   }

   class a extends frp {
      private static final xl b = xl.c("selectWorld.experimental.details.title");
      final fpl c = new fpl(this);
      @Nullable
      private fwl.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fwl.a.a(this.m, fwl.this.v));
         this.c.b(flw.a(xk.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            flu var10000 = this.c($$1);
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
         this.m.a(fwl.this);
      }

      class a extends fms<fwl.a.b> {
         public a(final fjx $$0, final Collection<aul> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aul $$2 : $$1) {
               String $$3 = crl.a(crl.h, $$2.e());
               if (!$$3.isEmpty()) {
                  xl $$4 = xo.a($$2.b().f(), yi.a.a(true));
                  xl $$5 = xl.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fmp.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fms.a<fwl.a.b> {
         private final xl b;
         private final xl c;
         private final fmp d;

         b(final xl $$0, final xl $$1, final fmp $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xk.a(this.b, this.c));
         }
      }
   }
}
