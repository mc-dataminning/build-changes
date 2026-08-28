import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class geh extends fue.a<geh> {
   private static final alr f = alr.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fvl h = new fvl(
      alr.b("social_interactions/report_button"), alr.b("social_interactions/report_button_disabled"), alr.b("social_interactions/report_button_highlighted")
   );
   private static final fvl i = new fvl(alr.b("social_interactions/mute_button"), alr.b("social_interactions/mute_button_highlighted"));
   private static final fvl j = new fvl(alr.b("social_interactions/unmute_button"), alr.b("social_interactions/unmute_button_highlighted"));
   private final fqq k;
   private final List<ftw> l;
   private final UUID m;
   private final String n;
   private final Supplier<hls> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fty v;
   @Nullable
   private fty w;
   @Nullable
   private fty x;
   private float y;
   private static final xg z = xg.c("gui.socialInteractions.status_hidden").a(o.u);
   private static final xg A = xg.c("gui.socialInteractions.status_blocked").a(o.u);
   private static final xg B = xg.c("gui.socialInteractions.status_offline").a(o.u);
   private static final xg C = xg.c("gui.socialInteractions.status_hidden_offline").a(o.u);
   private static final xg D = xg.c("gui.socialInteractions.status_blocked_offline").a(o.u);
   private static final xg E = xg.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xg F = xg.c("gui.socialInteractions.tooltip.hide");
   private static final xg G = xg.c("gui.socialInteractions.tooltip.show");
   private static final xg H = xg.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = ayh.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = ayh.a(255, 74, 74, 74);
   public static final int c = ayh.a(255, 48, 48, 48);
   public static final int d = ayh.a(255, 255, 255, 255);
   public static final int e = ayh.a(140, 255, 255, 255);

   public geh(fqq $$0, gek $$1, UUID $$2, String $$3, Supplier<hls> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      gmx $$6 = $$0.ba();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xg $$7 = xg.a("gui.socialInteractions.narration.hide", $$3);
      xg $$8 = xg.a("gui.socialInteractions.narration.show", $$3);
      gei $$9 = $$0.aN();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.t.cG().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fuk(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new ged($$1, $$6, this)), false), xg.c("gui.socialInteractions.report")) {
            @Override
            protected xu d() {
               return geh.this.a(super.d());
            }
         };
         this.x.j = this.r;
         this.x.a(this.m());
         this.x.a(g);
         this.v = new fuk(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xg.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xg.c("gui.socialInteractions.hide")) {
            @Override
            protected xu d() {
               return geh.this.a(super.d());
            }
         };
         this.v.a(fvj.a(F, $$7));
         this.v.a(g);
         this.w = new fuk(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xg.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xg.c("gui.socialInteractions.show")) {
            @Override
            protected xu d() {
               return geh.this.a(super.d());
            }
         };
         this.w.a(fvj.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fvj m() {
      return !this.r ? fvj.a(E) : fvj.a(H, xg.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xg $$13 = this.n();
      int $$14;
      if ($$13 == xf.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.b(this.k.h, $$13, $$12, $$14 + 12, e);
      }

      fux.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.b(this.k.h, this.n, $$12, $$14, d);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.j($$3 + ($$4 - this.v.A() - 4) - 20 - 4);
         this.v.k($$2 + ($$5 - this.v.y()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.j($$3 + ($$4 - this.w.A() - 4) - 20 - 4);
         this.w.k($$2 + ($$5 - this.w.y()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.j($$3 + ($$4 - this.w.A() - 4));
         this.x.k($$2 + ($$5 - this.w.y()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.s && this.x != null) {
         $$0.a(gry::H, f, this.x.F() + 5, this.x.G() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fvv> aE_() {
      return this.l;
   }

   @Override
   public List<? extends fxt> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID g() {
      return this.m;
   }

   public Supplier<hls> h() {
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

   public boolean k() {
      return this.q;
   }

   public boolean l() {
      return this.u;
   }

   private void a(boolean $$0, xg $$1) {
      this.e($$0);
      this.k.m.d().a($$1);
      this.k.aY().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xu a(xu $$0) {
      xg $$1 = this.n();
      return $$1 == xf.a ? xg.b(this.n).f(", ").b($$0) : xg.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xg n() {
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
         return this.p ? B : xf.a;
      }
   }
}
