import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fzf extends fui {
   private static final wo a = wo.c("selectWorld.experimental.title");
   private static final wo b = wo.c("selectWorld.experimental.message");
   private static final wo c = wo.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<atw> v;
   private final fsd w = new fsd().a(10).b(20);

   public fzf(Collection<atw> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wo i() {
      return wn.a(super.i(), b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      fsd.b $$0 = this.w.d(2);
      fsh $$1 = $$0.b().b();
      $$0.a(new fpx(this.l, this.p), 2, $$1);
      fpk $$2 = $$0.a(new fpk(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fop.a(c, $$0x -> this.m.a(new fzf.a())).a(100).a(), 2, $$1);
      $$0.a(fop.a(wn.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fop.a(wn.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fon var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      fsc.a(this.w, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void aO_() {
      this.u.accept(false);
   }

   class a extends fui {
      private static final wo b = wo.c("selectWorld.experimental.details.title");
      final fse c = new fse(this);
      @Nullable
      private fzf.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fzf.a.a(this.m, fzf.this.v));
         this.c.b(fop.a(wn.k, $$0 -> this.aO_()).a());
         this.c.a($$1 -> {
            fon var10000 = this.c($$1);
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
         this.m.a(fzf.this);
      }

      class a extends fpm<fzf.a.b> {
         public a(final flh $$0, final Collection<atw> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atw $$2 : $$1) {
               String $$3 = crt.a(crt.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wo $$4 = wr.a($$2.b().f(), xl.a.a(true));
                  wo $$5 = wo.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fpj.a(a.this.p, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fpm.a<fzf.a.b> {
         private final wo b;
         private final wo c;
         private final fpj d;

         b(final wo $$0, final wo $$1, final fpj $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", wn.a(this.b, this.c));
         }
      }
   }
}
