import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gch extends fxi {
   private static final ww a = ww.c("selectWorld.experimental.title");
   private static final ww b = ww.c("selectWorld.experimental.message");
   private static final ww c = ww.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<aui> v;
   private final fvd w = new fvd().a(10).b(20);

   public gch(Collection<aui> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public ww i() {
      return wv.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fvd.b $$0 = this.w.d(2);
      fvh $$1 = $$0.b().b();
      $$0.a(new fsx(this.l, this.p), 2, $$1);
      fsk $$2 = $$0.a(new fsk(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(frq.a(c, $$0x -> this.m.a(new gch.a())).a(100).a(), 2, $$1);
      $$0.a(frq.a(wv.i, $$0x -> this.u.accept(true)).a());
      $$0.a(frq.a(wv.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fro var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fvc.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aK_() {
      this.u.accept(false);
   }

   class a extends fxi {
      private static final ww b = ww.c("selectWorld.experimental.details.title");
      final fve c = new fve(this);
      @Nullable
      private gch.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new gch.a.a(this.m, gch.this.v));
         this.c.b(frq.a(wv.k, $$0 -> this.aK_()).a());
         this.c.a($$1 -> {
            fro var10000 = this.c($$1);
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
         this.m.a(gch.this);
      }

      class a extends fsm<gch.a.b> {
         public a(final fof $$0, final Collection<aui> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aui $$2 : $$1) {
               String $$3 = cud.a(cud.g, $$2.e());
               if (!$$3.isEmpty()) {
                  ww $$4 = wz.a($$2.b().f(), xt.a.a(true));
                  ww $$5 = ww.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fsj.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fsm.a<gch.a.b> {
         private final ww b;
         private final ww c;
         private final fsj d;

         b(final ww $$0, final ww $$1, final fsj $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", wv.a(this.b, this.c));
         }
      }
   }
}
