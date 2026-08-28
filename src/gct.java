import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gct extends fxu {
   private static final wy a = wy.c("selectWorld.experimental.title");
   private static final wy b = wy.c("selectWorld.experimental.message");
   private static final wy c = wy.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auk> v;
   private final fvp w = new fvp().a(10).b(20);

   public gct(Collection<auk> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fvp.b $$0 = this.w.d(2);
      fvt $$1 = $$0.b().b();
      $$0.a(new ftj(this.l, this.p), 2, $$1);
      fsw $$2 = $$0.a(new fsw(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fsc.a(c, $$0x -> this.m.a(new gct.a())).a(100).a(), 2, $$1);
      $$0.a(fsc.a(wx.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fsc.a(wx.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fsa var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fvo.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aK_() {
      this.u.accept(false);
   }

   class a extends fxu {
      private static final wy b = wy.c("selectWorld.experimental.details.title");
      final fvq c = new fvq(this);
      @Nullable
      private gct.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gct.a.a(this.m, gct.this.v));
         this.c.b(fsc.a(wx.k, $$0 -> this.aK_()).a());
         this.c.a($$1 -> {
            fsa var10000 = this.c($$1);
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
      public void aK_() {
         this.m.a(gct.this);
      }

      class a extends fsy<gct.a.b> {
         public a(final fos $$0, final Collection<auk> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auk $$2 : $$1) {
               String $$3 = cuj.a(cuj.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wy $$4 = xb.a($$2.b().f(), xv.a.a(true));
                  wy $$5 = wy.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fsv.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fsy.a<gct.a.b> {
         private final wy b;
         private final wy c;
         private final fsv d;

         b(final wy $$0, final wy $$1, final fsv $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wx.a(this.b, this.c));
         }
      }
   }
}
