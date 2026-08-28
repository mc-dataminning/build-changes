import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fyt extends ftw {
   private static final xv a = xv.c("selectWorld.experimental.title");
   private static final xv b = xv.c("selectWorld.experimental.message");
   private static final xv c = xv.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<avd> v;
   private final frr w = new frr().a(10).b(20);

   public fyt(Collection<avd> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xv i() {
      return xu.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      frr.b $$0 = this.w.d(2);
      frv $$1 = $$0.b().b();
      $$0.a(new fpl(this.l, this.p), 2, $$1);
      foy $$2 = $$0.a(new foy(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fod.a(c, $$0x -> this.m.a(new fyt.a())).a(100).a(), 2, $$1);
      $$0.a(fod.a(xu.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fod.a(xu.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fob var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      frq.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.u.accept(false);
   }

   class a extends ftw {
      private static final xv b = xv.c("selectWorld.experimental.details.title");
      final frs c = new frs(this);
      @Nullable
      private fyt.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fyt.a.a(this.m, fyt.this.v));
         this.c.b(fod.a(xu.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            fob var10000 = this.c($$1);
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
         this.m.a(fyt.this);
      }

      class a extends fpa<fyt.a.b> {
         public a(final fme $$0, final Collection<avd> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (avd $$2 : $$1) {
               String $$3 = csu.a(csu.h, $$2.e());
               if (!$$3.isEmpty()) {
                  xv $$4 = xy.a($$2.b().f(), ys.a.a(true));
                  xv $$5 = xv.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fox.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fpa.a<fyt.a.b> {
         private final xv b;
         private final xv c;
         private final fox d;

         b(final xv $$0, final xv $$1, final fox $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", xu.a(this.b, this.c));
         }
      }
   }
}
