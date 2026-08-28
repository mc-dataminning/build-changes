import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fzi extends ful {
   private static final wp a = wp.c("selectWorld.experimental.title");
   private static final wp b = wp.c("selectWorld.experimental.message");
   private static final wp c = wp.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<atx> v;
   private final fsg w = new fsg().a(10).b(20);

   public fzi(Collection<atx> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wp i() {
      return wo.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      fsg.b $$0 = this.w.d(2);
      fsk $$1 = $$0.b().b();
      $$0.a(new fqa(this.l, this.p), 2, $$1);
      fpn $$2 = $$0.a(new fpn(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fot.a(c, $$0x -> this.m.a(new fzi.a())).a(100).a(), 2, $$1);
      $$0.a(fot.a(wo.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fot.a(wo.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         foq var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fsf.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aO_() {
      this.u.accept(false);
   }

   class a extends ful {
      private static final wp b = wp.c("selectWorld.experimental.details.title");
      final fsh c = new fsh(this);
      @Nullable
      private fzi.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fzi.a.a(this.m, fzi.this.v));
         this.c.b(fot.a(wo.k, $$0 -> this.aO_()).a());
         this.c.a($$1 -> {
            foq var10000 = this.c($$1);
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
         this.m.a(fzi.this);
      }

      class a extends fpp<fzi.a.b> {
         public a(final flj $$0, final Collection<atx> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atx $$2 : $$1) {
               String $$3 = crv.a(crv.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wp $$4 = ws.a($$2.b().f(), xm.a.a(true));
                  wp $$5 = wp.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fpm.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fpp.a<fzi.a.b> {
         private final wp b;
         private final wp c;
         private final fpm d;

         b(final wp $$0, final wp $$1, final fpm $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", wo.a(this.b, this.c));
         }
      }
   }
}
