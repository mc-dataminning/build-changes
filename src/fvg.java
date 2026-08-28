import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvg extends flf.a<fvg> {
   private static final alh f = alh.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fmm h = new fmm(
      alh.b("social_interactions/report_button"), alh.b("social_interactions/report_button_disabled"), alh.b("social_interactions/report_button_highlighted")
   );
   private static final fmm i = new fmm(alh.b("social_interactions/mute_button"), alh.b("social_interactions/mute_button_highlighted"));
   private static final fmm j = new fmm(alh.b("social_interactions/unmute_button"), alh.b("social_interactions/unmute_button_highlighted"));
   private final fja k;
   private final List<fkx> l;
   private final UUID m;
   private final String n;
   private final Supplier<gyt> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fkz v;
   @Nullable
   private fkz w;
   @Nullable
   private fkz x;
   private float y;
   private static final xh z = xh.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final xh A = xh.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final xh B = xh.c("gui.socialInteractions.status_offline").a(n.u);
   private static final xh C = xh.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final xh D = xh.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final xh E = xh.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xh F = xh.c("gui.socialInteractions.tooltip.hide");
   private static final xh G = xh.c("gui.socialInteractions.tooltip.show");
   private static final xh H = xh.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = axu.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = axu.a(255, 74, 74, 74);
   public static final int c = axu.a(255, 48, 48, 48);
   public static final int d = axu.a(255, 255, 255, 255);
   public static final int e = axu.a(140, 255, 255, 255);

   public fvg(fja $$0, fvj $$1, UUID $$2, String $$3, Supplier<gyt> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      gdf $$6 = $$0.bc();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xh $$7 = xh.a("gui.socialInteractions.narration.hide", $$3);
      xh $$8 = xh.a("gui.socialInteractions.narration.show", $$3);
      fvh $$9 = $$0.aO();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.t.cH().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fll(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fvc($$1, $$6, this)), false), xh.c("gui.socialInteractions.report")) {
            @Override
            protected xv aP_() {
               return fvg.this.a(super.aP_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fll(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xh.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xh.c("gui.socialInteractions.hide")) {
            @Override
            protected xv aP_() {
               return fvg.this.a(super.aP_());
            }
         };
         this.v.a(fmk.a(F, $$7));
         this.v.a(g);
         this.w = new fll(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xh.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xh.c("gui.socialInteractions.show")) {
            @Override
            protected xv aP_() {
               return fvg.this.a(super.aP_());
            }
         };
         this.w.a(fmk.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fmk l() {
      return !this.r ? fmk.a(E) : fmk.a(H, xh.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xh $$13 = this.m();
      int $$14;
      if ($$13 == xg.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fly.a($$0, this.o.get(), $$10, $$11, 24);
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
         $$0.a(gig::B, f, this.x.D() + 5, this.x.E() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fmw> aJ_() {
      return this.l;
   }

   @Override
   public List<? extends fov> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID d() {
      return this.m;
   }

   public Supplier<gyt> h() {
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

   private void a(boolean $$0, xh $$1) {
      this.e($$0);
      this.k.m.d().a($$1);
      this.k.ba().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xv a(xv $$0) {
      xh $$1 = this.m();
      return $$1 == xg.a ? xh.b(this.n).f(", ").b($$0) : xh.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xh m() {
      boolean $$0 = this.k.aO().d(this.m);
      boolean $$1 = this.k.aO().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : xg.a;
      }
   }
}
