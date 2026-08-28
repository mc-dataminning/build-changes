import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwj extends fxi {
   private static final ww b = ww.c("createWorld.customize.flat.title");
   static final ale c = ale.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fve y = new fve(this, 33, 64);
   protected final gcj a;
   private final Consumer<eol> z;
   eol A;
   @Nullable
   private fwj.a B;
   @Nullable
   private frq C;

   public fwj(gcj $$0, Consumer<eol> $$1, eol $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public eol l() {
      return this.A;
   }

   public void a(eol $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aN_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fwj.a());
      fvi $$0 = this.y.b(fvi.d().a(4));
      $$0.c().e();
      fvi $$1 = $$0.a(fvi.e().a(8));
      fvi $$2 = $$0.a(fvi.e().a(8));
      this.C = $$1.a(frq.a(ww.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eoi> $$1x = this.A.e();
            int $$2x = this.B.aD_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aD_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(frq.a(ww.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fxe(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(frq.a(wv.d, $$0x -> {
         this.z.accept(this.A);
         this.aK_();
         this.A.g();
      }).a());
      $$2.a(frq.a(wv.e, $$0x -> {
         this.aK_();
         this.A.g();
      }).a());
      this.A.g();
      this.m();
      this.y.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.a(this.n, this.y);
      }

      this.y.a();
   }

   void m() {
      if (this.C != null) {
         this.C.j = this.E();
      }
   }

   private boolean E() {
      return this.B != null && this.B.p() != null;
   }

   @Override
   public void aK_() {
      this.m.a(this.a);
   }

   class a extends fsm<fwj.a.a> {
      private static final ww m = ww.c("createWorld.customize.flat.tile").a(n.t);
      private static final ww n = ww.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fwj.this.m, fwj.this.n, fwj.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fwj.this.A.e().size(); $$0++) {
            this.b(new fwj.a.a());
         }
      }

      public void a(@Nullable fwj.a.a $$0) {
         super.a($$0);
         fwj.this.m();
      }

      public void b() {
         int $$0 = this.aD_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fwj.this.A.e().size(); $$1++) {
            this.b(new fwj.a.a());
         }

         List<fwj.a.a> $$2 = this.aD_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(frc $$0, int $$1, int $$2) {
         $$0.b(fwj.this.p, m, $$1, $$2, -1);
         $$0.b(fwj.this.p, n, $$1 + this.a() - fwj.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fsm.a<fwj.a.a> {
         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eoi $$10 = fwj.this.A.e().get(fwj.this.A.e().size() - $$1 - 1);
            dzo $$11 = $$10.b();
            cys $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fwj.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            ww $$14;
            if ($$1 == 0) {
               $$14 = ww.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fwj.this.A.e().size() - 1) {
               $$14 = ww.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = ww.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fwj.this.p, $$14, $$3 + $$4 - fwj.this.p.a($$14) - 8, $$13, -1);
         }

         private cys a(dzo $$0) {
            cyo $$1 = $$0.b().h();
            if ($$1 == cyw.a) {
               if ($$0.a(dlw.J)) {
                  $$1 = cyw.rk;
               } else if ($$0.a(dlw.K)) {
                  $$1 = cyw.rl;
               }
            }

            return new cys($$1);
         }

         @Override
         public ww a() {
            eoi $$0 = fwj.this.A.e().get(fwj.this.A.e().size() - a.this.aD_().indexOf(this) - 1);
            cys $$1 = this.a($$0.b());
            return (ww)(!$$1.f() ? ww.a("narrator.select", $$1.y()) : wv.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(frc $$0, int $$1, int $$2, cys $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(frc $$0, int $$1, int $$2) {
            $$0.a(gpn::H, fwj.c, $$1, $$2, 18, 18);
         }
      }
   }
}
