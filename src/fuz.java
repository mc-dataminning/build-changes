import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fuz extends fqd {
   private static final xd a = xd.c("selectWorld.experimental.title");
   private static final xd b = xd.c("selectWorld.experimental.message");
   private static final xd c = xd.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aub> v;
   private final fnx w = new fnx().a(10).b(20);

   public fuz(Collection<aub> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      fnx.b $$0 = this.w.d(2);
      fob $$1 = $$0.b().b();
      $$0.a(new flr(this.l, this.p), 2, $$1);
      fle $$2 = $$0.a(new fle(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fkk.a(c, $$0x -> this.m.a(new fuz.a())).a(100).a(), 2, $$1);
      $$0.a(fkk.a(xc.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fkk.a(xc.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fnw.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.u.accept(false);
   }

   class a extends fqd {
      private static final xd b = xd.c("selectWorld.experimental.details.title");
      final fny c = new fny(this);
      @Nullable
      private fuz.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fuz.a.a(this.m, fuz.this.v));
         this.c.b(fkk.a(xc.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fki var10000 = this.c($$1);
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
         this.m.a(fuz.this);
      }

      class a extends flg<fuz.a.b> {
         public a(final fil $$0, final Collection<aub> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aub $$2 : $$1) {
               String $$3 = cqp.a(cqp.h, $$2.e());
               if (!$$3.isEmpty()) {
                  xd $$4 = xg.a($$2.b().f(), ya.a.a(true));
                  xd $$5 = xd.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fld.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends flg.a<fuz.a.b> {
         private final xd b;
         private final xd c;
         private final fld d;

         b(final xd $$0, final xd $$1, final fld $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", xc.a(this.b, this.c));
         }
      }
   }
}
