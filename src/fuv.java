import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuv extends fku.a<fuv> {
   private static final ale f = ale.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fmb h = new fmb(
      ale.b("social_interactions/report_button"), ale.b("social_interactions/report_button_disabled"), ale.b("social_interactions/report_button_highlighted")
   );
   private static final fmb i = new fmb(ale.b("social_interactions/mute_button"), ale.b("social_interactions/mute_button_highlighted"));
   private static final fmb j = new fmb(ale.b("social_interactions/unmute_button"), ale.b("social_interactions/unmute_button_highlighted"));
   private final fip k;
   private final List<fkm> l;
   private final UUID m;
   private final String n;
   private final Supplier<gyh> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fko v;
   @Nullable
   private fko w;
   @Nullable
   private fko x;
   private float y;
   private static final xe z = xe.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final xe A = xe.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final xe B = xe.c("gui.socialInteractions.status_offline").a(n.u);
   private static final xe C = xe.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final xe D = xe.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final xe E = xe.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xe F = xe.c("gui.socialInteractions.tooltip.hide");
   private static final xe G = xe.c("gui.socialInteractions.tooltip.show");
   private static final xe H = xe.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = axq.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = axq.a(255, 74, 74, 74);
   public static final int c = axq.a(255, 48, 48, 48);
   public static final int d = axq.a(255, 255, 255, 255);
   public static final int e = axq.a(140, 255, 255, 255);

   public fuv(fip $$0, fuy $$1, UUID $$2, String $$3, Supplier<gyh> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      gcu $$6 = $$0.bb();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xe $$7 = xe.a("gui.socialInteractions.narration.hide", $$3);
      xe $$8 = xe.a("gui.socialInteractions.narration.show", $$3);
      fuw $$9 = $$0.aO();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.t.cD().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fla(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fur($$1, $$6, this)), false), xe.c("gui.socialInteractions.report")) {
            @Override
            protected xs aP_() {
               return fuv.this.a(super.aP_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fla(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xe.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xe.c("gui.socialInteractions.hide")) {
            @Override
            protected xs aP_() {
               return fuv.this.a(super.aP_());
            }
         };
         this.v.a(flz.a(F, $$7));
         this.v.a(g);
         this.w = new fla(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xe.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xe.c("gui.socialInteractions.show")) {
            @Override
            protected xs aP_() {
               return fuv.this.a(super.aP_());
            }
         };
         this.w.a(flz.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private flz l() {
      return !this.r ? flz.a(E) : flz.a(H, xe.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xe $$13 = this.m();
      int $$14;
      if ($$13 == xd.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fln.a($$0, this.o.get(), $$10, $$11, 24);
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
         $$0.a(ghv::B, f, this.x.D() + 5, this.x.E() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fml> aJ_() {
      return this.l;
   }

   @Override
   public List<? extends foj> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID d() {
      return this.m;
   }

   public Supplier<gyh> h() {
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

   private void a(boolean $$0, xe $$1) {
      this.e($$0);
      this.k.m.d().a($$1);
      this.k.aZ().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xs a(xs $$0) {
      xe $$1 = this.m();
      return $$1 == xd.a ? xe.b(this.n).f(", ").b($$0) : xe.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xe m() {
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
         return this.p ? B : xd.a;
      }
   }
}
