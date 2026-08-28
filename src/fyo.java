import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fyo extends ftr {
   private static final xk a = xk.c("selectWorld.experimental.title");
   private static final xk b = xk.c("selectWorld.experimental.message");
   private static final xk c = xk.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aus> v;
   private final frm w = new frm().a(10).b(20);

   public fyo(Collection<aus> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xk i() {
      return xj.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      frm.b $$0 = this.w.d(2);
      frq $$1 = $$0.b().b();
      $$0.a(new fpg(this.l, this.p), 2, $$1);
      fot $$2 = $$0.a(new fot(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fny.a(c, $$0x -> this.m.a(new fyo.a())).a(100).a(), 2, $$1);
      $$0.a(fny.a(xj.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fny.a(xj.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fnw var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      frl.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.u.accept(false);
   }

   class a extends ftr {
      private static final xk b = xk.c("selectWorld.experimental.details.title");
      final frn c = new frn(this);
      @Nullable
      private fyo.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fyo.a.a(this.m, fyo.this.v));
         this.c.b(fny.a(xj.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            fnw var10000 = this.c($$1);
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
         this.m.a(fyo.this);
      }

      class a extends fov<fyo.a.b> {
         public a(final flz $$0, final Collection<aus> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aus $$2 : $$1) {
               String $$3 = csm.a(csm.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xk $$4 = xn.a($$2.b().f(), yh.a.a(true));
                  xk $$5 = xk.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fos.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fov.a<fyo.a.b> {
         private final xk b;
         private final xk c;
         private final fos d;

         b(final xk $$0, final xk $$1, final fos $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xk a() {
            return xk.a("narrator.select", xj.a(this.b, this.c));
         }
      }
   }
}
