import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gbe extends fwf {
   private static final wv a = wv.c("selectWorld.experimental.title");
   private static final wv b = wv.c("selectWorld.experimental.message");
   private static final wv c = wv.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<auh> v;
   private final fua w = new fua().a(10).b(20);

   public gbe(Collection<auh> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wv i() {
      return wu.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fua.b $$0 = this.w.d(2);
      fue $$1 = $$0.b().b();
      $$0.a(new fru(this.l, this.p), 2, $$1);
      frh $$2 = $$0.a(new frh(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fqn.a(c, $$0x -> this.m.a(new gbe.a())).a(100).a(), 2, $$1);
      $$0.a(fqn.a(wu.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fqn.a(wu.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      ftz.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aK_() {
      this.u.accept(false);
   }

   class a extends fwf {
      private static final wv b = wv.c("selectWorld.experimental.details.title");
      final fub c = new fub(this);
      @Nullable
      private gbe.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gbe.a.a(this.m, gbe.this.v));
         this.c.b(fqn.a(wu.k, $$0 -> this.aK_()).a());
         this.c.a($$1 -> {
            fql var10000 = this.c($$1);
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
         this.m.a(gbe.this);
      }

      class a extends frj<gbe.a.b> {
         public a(final fnd $$0, final Collection<auh> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (auh $$2 : $$1) {
               String $$3 = ctg.a(ctg.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wv $$4 = wy.a($$2.b().f(), xs.a.a(true));
                  wv $$5 = wv.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, frg.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends frj.a<gbe.a.b> {
         private final wv b;
         private final wv c;
         private final frg d;

         b(final wv $$0, final wv $$1, final frg $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", wu.a(this.b, this.c));
         }
      }
   }
}
