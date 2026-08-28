import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gda extends fyb {
   private static final wy a = wy.c("selectWorld.experimental.title");
   private static final wy b = wy.c("selectWorld.experimental.message");
   private static final wy c = wy.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auk> v;
   private final fvw w = new fvw().a(10).b(20);

   public gda(Collection<auk> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      fvw.b $$0 = this.w.d(2);
      fwa $$1 = $$0.b().b();
      $$0.a(new ftq(this.l, this.p), 2, $$1);
      ftd $$2 = $$0.a(new ftd(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fsj.a(c, $$0x -> this.m.a(new gda.a())).a(100).a(), 2, $$1);
      $$0.a(fsj.a(wx.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fsj.a(wx.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fsh var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fvv.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aL_() {
      this.u.accept(false);
   }

   class a extends fyb {
      private static final wy b = wy.c("selectWorld.experimental.details.title");
      final fvx c = new fvx(this);
      @Nullable
      private gda.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aO_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gda.a.a(this.m, gda.this.v));
         this.c.b(fsj.a(wx.k, $$0 -> this.aL_()).a());
         this.c.a($$1 -> {
            fsh var10000 = this.c($$1);
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
         this.m.a(gda.this);
      }

      class a extends ftf<gda.a.b> {
         public a(final foz $$0, final Collection<auk> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auk $$2 : $$1) {
               String $$3 = cuo.a(cuo.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wy $$4 = xb.a($$2.b().f(), xv.a.a(true));
                  wy $$5 = wy.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, ftc.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends ftf.a<gda.a.b> {
         private final wy b;
         private final wy c;
         private final ftc d;

         b(final wy $$0, final wy $$1, final ftc $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
