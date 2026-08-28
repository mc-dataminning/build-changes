import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fvd extends fqh {
   private static final xe a = xe.c("selectWorld.experimental.title");
   private static final xe b = xe.c("selectWorld.experimental.message");
   private static final xe c = xe.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aud> v;
   private final fob w = new fob().a(10).b(20);

   public fvd(Collection<aud> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      fob.b $$0 = this.w.d(2);
      fof $$1 = $$0.b().b();
      $$0.a(new flv(this.l, this.p), 2, $$1);
      fli $$2 = $$0.a(new fli(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fko.a(c, $$0x -> this.m.a(new fvd.a())).a(100).a(), 2, $$1);
      $$0.a(fko.a(xd.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fko.a(xd.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      foa.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.u.accept(false);
   }

   class a extends fqh {
      private static final xe b = xe.c("selectWorld.experimental.details.title");
      final foc c = new foc(this);
      @Nullable
      private fvd.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fvd.a.a(this.m, fvd.this.v));
         this.c.b(fko.a(xd.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fkm var10000 = this.c($$1);
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
         this.m.a(fvd.this);
      }

      class a extends flk<fvd.a.b> {
         public a(final fip $$0, final Collection<aud> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aud $$2 : $$1) {
               String $$3 = cqs.a(cqs.h, $$2.e());
               if (!$$3.isEmpty()) {
                  xe $$4 = xh.a($$2.b().f(), yb.a.a(true));
                  xe $$5 = xe.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, flh.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends flk.a<fvd.a.b> {
         private final xe b;
         private final xe c;
         private final flh d;

         b(final xe $$0, final xe $$1, final flh $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xd.a(this.b, this.c));
         }
      }
   }
}
