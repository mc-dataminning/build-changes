import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwl extends fmj.a<fwl> {
   private static final alj f = alj.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fnq h = new fnq(
      alj.b("social_interactions/report_button"), alj.b("social_interactions/report_button_disabled"), alj.b("social_interactions/report_button_highlighted")
   );
   private static final fnq i = new fnq(alj.b("social_interactions/mute_button"), alj.b("social_interactions/mute_button_highlighted"));
   private static final fnq j = new fnq(alj.b("social_interactions/unmute_button"), alj.b("social_interactions/unmute_button_highlighted"));
   private final fke k;
   private final List<fmb> l;
   private final UUID m;
   private final String n;
   private final Supplier<haf> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fmd v;
   @Nullable
   private fmd w;
   @Nullable
   private fmd x;
   private float y;
   private static final xj z = xj.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final xj A = xj.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final xj B = xj.c("gui.socialInteractions.status_offline").a(n.u);
   private static final xj C = xj.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final xj D = xj.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final xj E = xj.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xj F = xj.c("gui.socialInteractions.tooltip.hide");
   private static final xj G = xj.c("gui.socialInteractions.tooltip.show");
   private static final xj H = xj.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = axx.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = axx.a(255, 74, 74, 74);
   public static final int c = axx.a(255, 48, 48, 48);
   public static final int d = axx.a(255, 255, 255, 255);
   public static final int e = axx.a(140, 255, 255, 255);

   public fwl(fke $$0, fwo $$1, UUID $$2, String $$3, Supplier<haf> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      gep $$6 = $$0.bb();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xj $$7 = xj.a("gui.socialInteractions.narration.hide", $$3);
      xj $$8 = xj.a("gui.socialInteractions.narration.show", $$3);
      fwm $$9 = $$0.aN();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.t.cG().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fmp(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fwh($$1, $$6, this)), false), xj.c("gui.socialInteractions.report")) {
            @Override
            protected xx aN_() {
               return fwl.this.a(super.aN_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fmp(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xj.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xj.c("gui.socialInteractions.hide")) {
            @Override
            protected xx aN_() {
               return fwl.this.a(super.aN_());
            }
         };
         this.v.a(fno.a(F, $$7));
         this.v.a(g);
         this.w = new fmp(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xj.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xj.c("gui.socialInteractions.show")) {
            @Override
            protected xx aN_() {
               return fwl.this.a(super.aN_());
            }
         };
         this.w.a(fno.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fno l() {
      return !this.r ? fno.a(E) : fno.a(H, xj.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xj $$13 = this.m();
      int $$14;
      if ($$13 == xi.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fnc.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.m($$3 + ($$4 - this.v.y() - 4) - 20 - 4);
         this.v.n($$2 + ($$5 - this.v.w()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.m($$3 + ($$4 - this.w.y() - 4) - 20 - 4);
         this.w.n($$2 + ($$5 - this.w.w()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.m($$3 + ($$4 - this.w.y() - 4));
         this.x.n($$2 + ($$5 - this.w.w()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.s && this.x != null) {
         $$0.a(gjq::B, f, this.x.D() + 5, this.x.E() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends foa> aH_() {
      return this.l;
   }

   @Override
   public List<? extends fpz> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID d() {
      return this.m;
   }

   public Supplier<haf> h() {
      return this.o;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean i() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
   }

   public boolean j() {
      return this.q;
   }

   public boolean k() {
      return this.u;
   }

   private void a(boolean $$0, xj $$1) {
      this.e($$0);
      this.k.m.d().a($$1);
      this.k.aZ().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xx a(xx $$0) {
      xj $$1 = this.m();
      return $$1 == xi.a ? xj.b(this.n).f(", ").b($$0) : xj.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xj m() {
      boolean $$0 = this.k.aN().d(this.m);
      boolean $$1 = this.k.aN().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : xi.a;
      }
   }
}
