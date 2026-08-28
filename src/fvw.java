import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fvw extends fra {
   private static final xi a = xi.c("selectWorld.experimental.title");
   private static final xi b = xi.c("selectWorld.experimental.message");
   private static final xi c = xi.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aui> v;
   private final fov w = new fov().a(10).b(20);

   public fvw(Collection<aui> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xi i() {
      return xh.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      fov.b $$0 = this.w.d(2);
      foz $$1 = $$0.b().b();
      $$0.a(new fmo(this.l, this.p), 2, $$1);
      fmb $$2 = $$0.a(new fmb(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(flh.a(c, $$0x -> this.m.a(new fvw.a())).a(100).a(), 2, $$1);
      $$0.a(flh.a(xh.i, $$0x -> this.u.accept(true)).a());
      $$0.a(flh.a(xh.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fou.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.u.accept(false);
   }

   class a extends fra {
      private static final xi b = xi.c("selectWorld.experimental.details.title");
      final fow c = new fow(this);
      @Nullable
      private fvw.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fvw.a.a(this.m, fvw.this.v));
         this.c.b(flh.a(xh.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            flf var10000 = this.c($$1);
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
      public void d() {
         this.m.a(fvw.this);
      }

      class a extends fmd<fvw.a.b> {
         public a(final fji $$0, final Collection<aui> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aui $$2 : $$1) {
               String $$3 = crh.a(crh.h, $$2.e());
               if (!$$3.isEmpty()) {
                  xi $$4 = xl.a($$2.b().f(), yf.a.a(true));
                  xi $$5 = xi.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fma.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fmd.a<fvw.a.b> {
         private final xi b;
         private final xi c;
         private final fma d;

         b(final xi $$0, final xi $$1, final fma $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", xh.a(this.b, this.c));
         }
      }
   }
}
