import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyl extends foj.a<fyl> {
   private static final alz f = alz.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fpr h = new fpr(
      alz.b("social_interactions/report_button"), alz.b("social_interactions/report_button_disabled"), alz.b("social_interactions/report_button_highlighted")
   );
   private static final fpr i = new fpr(alz.b("social_interactions/mute_button"), alz.b("social_interactions/mute_button_highlighted"));
   private static final fpr j = new fpr(alz.b("social_interactions/unmute_button"), alz.b("social_interactions/unmute_button_highlighted"));
   private final fme k;
   private final List<fob> l;
   private final UUID m;
   private final String n;
   private final Supplier<hck> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fod v;
   @Nullable
   private fod w;
   @Nullable
   private fod x;
   private float y;
   private static final xv z = xv.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final xv A = xv.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final xv B = xv.c("gui.socialInteractions.status_offline").a(n.u);
   private static final xv C = xv.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final xv D = xv.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final xv E = xv.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xv F = xv.c("gui.socialInteractions.tooltip.hide");
   private static final xv G = xv.c("gui.socialInteractions.tooltip.show");
   private static final xv H = xv.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = ayp.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = ayp.a(255, 74, 74, 74);
   public static final int c = ayp.a(255, 48, 48, 48);
   public static final int d = ayp.a(255, 255, 255, 255);
   public static final int e = ayp.a(140, 255, 255, 255);

   public fyl(fme $$0, fyo $$1, UUID $$2, String $$3, Supplier<hck> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      ggr $$6 = $$0.bb();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xv $$7 = xv.a("gui.socialInteractions.narration.hide", $$3);
      xv $$8 = xv.a("gui.socialInteractions.narration.show", $$3);
      fym $$9 = $$0.aN();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.t.cG().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fop(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fyh($$1, $$6, this)), false), xv.c("gui.socialInteractions.report")) {
            @Override
            protected yj aR_() {
               return fyl.this.a(super.aR_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fop(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xv.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xv.c("gui.socialInteractions.hide")) {
            @Override
            protected yj aR_() {
               return fyl.this.a(super.aR_());
            }
         };
         this.v.a(fpp.a(F, $$7));
         this.v.a(g);
         this.w = new fop(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xv.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xv.c("gui.socialInteractions.show")) {
            @Override
            protected yj aR_() {
               return fyl.this.a(super.aR_());
            }
         };
         this.w.a(fpp.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fpp l() {
      return !this.r ? fpp.a(E) : fpp.a(H, xv.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xv $$13 = this.m();
      int $$14;
      if ($$13 == xu.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fpd.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.k($$3 + ($$4 - this.v.y() - 4) - 20 - 4);
         this.v.l($$2 + ($$5 - this.v.w()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.k($$3 + ($$4 - this.w.y() - 4) - 20 - 4);
         this.w.l($$2 + ($$5 - this.w.w()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.k($$3 + ($$4 - this.w.y() - 4));
         this.x.l($$2 + ($$5 - this.w.w()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.s && this.x != null) {
         $$0.a(glt::B, f, this.x.D() + 5, this.x.E() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fqb> aI_() {
      return this.l;
   }

   @Override
   public List<? extends frz> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID g() {
      return this.m;
   }

   public Supplier<hck> h() {
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

   private void a(boolean $$0, xv $$1) {
      this.e($$0);
      this.k.m.d().a($$1);
      this.k.aZ().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   yj a(yj $$0) {
      xv $$1 = this.m();
      return $$1 == xu.a ? xv.b(this.n).f(", ").b($$0) : xv.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xv m() {
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
         return this.p ? B : xu.a;
      }
   }
}
