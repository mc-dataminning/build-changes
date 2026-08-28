import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fzq extends fvt implements fvb {
   private static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("narrator.screen.usage");
   protected static final gqy e = new gqy(alr.b("textures/gui/title/background/panorama"));
   protected static final grq f = new grq(e);
   public static final alr g = alr.b("textures/gui/menu_background.png");
   public static final alr h = alr.b("textures/gui/header_separator.png");
   public static final alr i = alr.b("textures/gui/footer_separator.png");
   private static final alr c = alr.b("textures/gui/inworld_menu_background.png");
   public static final alr j = alr.b("textures/gui/inworld_header_separator.png");
   public static final alr k = alr.b("textures/gui/inworld_footer_separator.png");
   protected final xg l;
   private final List<fvv> d = Lists.newArrayList();
   private final List<fxt> s = Lists.newArrayList();
   @Nullable
   protected fqq m;
   private boolean u;
   public int n;
   public int o;
   private final List<fvb> v = Lists.newArrayList();
   protected fti p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fxy B = new fxy();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fuf<fqs> q;
   @Nullable
   private fxt E;
   @Nullable
   private fzq.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fzq(xg $$0) {
      this.l = $$0;
   }

   public xg n() {
      return this.l;
   }

   public xg i() {
      return this.n();
   }

   public final void c(ftk $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fvb $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aD_()) {
         this.aL_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fyb $$3 = (fyb)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fyd.d);
            case 263 -> this.a(fyd.c);
            case 264 -> this.a(fyd.b);
            case 265 -> this.a(fyd.a);
         });
         if ($$3 != null) {
            fth $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fyb.c) {
               this.o();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private fyb.c m() {
      boolean $$0 = !t();
      return new fyb.c($$0);
   }

   private fyb.a a(fyd $$0) {
      return new fyb.a($$0);
   }

   protected void aC_() {
      if (this.m.aX().b()) {
         fyb.c $$0 = new fyb.c(true);
         fth $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fvv $$0) {
      fth $$1 = fth.a(this, $$0.a(new fyb.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fth $$0 = this.aK_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fth $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aD_() {
      return true;
   }

   public void aL_() {
      this.m.a(null);
   }

   protected <T extends fvv & fvb & fxt> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fvb> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fvv & fxt> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fvv $$0) {
      if ($$0 instanceof fvb) {
         this.v.remove((fvb)$$0);
      }

      if ($$0 instanceof fxt) {
         this.s.remove((fxt)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xg> a(fqq $$0, dak $$1) {
      return $$1.a(dag.b.a($$0.s), $$0.t, $$0.n.m ? dbz.a.b : dbz.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean a(@Nullable yd $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xe $$1 = $$0.i();
         if (t()) {
            if ($$0.k() != null) {
               this.a_($$0.k(), false);
            }
         } else if ($$1 != null) {
            Objects.requireNonNull($$1);
            Throwable var22;
            switch ($$1) {
               case xe.e var5:
                  xe.e var28 = var5;

                  try {
                     var29 = var28.b();
                  } catch (Throwable var18) {
                     var22 = var18;
                     boolean var32 = false;
                     break;
                  }

                  URI var19 = var29;
                  if (!this.m.n.O().c()) {
                     return false;
                  }

                  if (this.m.n.P().c()) {
                     this.m.a(new fyn($$1x -> {
                        if ($$1x) {
                           ag.n().a(var19);
                        }

                        this.m.a(this);
                     }, var19.toString(), false));
                  } else {
                     ag.n().a(var19);
                  }

                  return true;
               case xe.d $$3:
                  ag.n().a($$3.b());
                  return true;
               case xe.g var8:
                  xe.g var26 = var8;

                  try {
                     var27 = var26.b();
                  } catch (Throwable var17) {
                     var22 = var17;
                     boolean var31 = false;
                     break;
                  }

                  String var20 = var27;
                  this.a_(var20, true);
                  return true;
               case xe.f var10:
                  xe.f var24 = var10;

                  try {
                     var25 = var24.b();
                  } catch (Throwable var16) {
                     var22 = var16;
                     boolean var30 = false;
                     break;
                  }

                  String var21 = var25;
                  String $$5 = var21;
                  if (var21.startsWith("/")) {
                     $$5 = var21.substring(1);
                  }

                  if (!this.m.t.j.d($$5)) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$5);
                  }

                  return true;
               case xe.c var12:
                  xe.c var10000 = var12;

                  try {
                     var23 = var10000.b();
                  } catch (Throwable var15) {
                     var22 = var15;
                     boolean var10001 = false;
                     break;
                  }

                  String var14 = var23;
                  this.m.p.a(var14);
                  return true;
               default:
                  a.error("Don't know how to handle {}", $$1);
                  return true;
            }

            Throwable var3 = var22;
            throw new MatchException(var3.toString(), var3);
         }

         return false;
      }
   }

   public final void b(fqq $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aO_();
         this.aC_();
      } else {
         this.c();
      }

      this.u = true;
      this.d(false);
      this.a(w);
   }

   protected void q() {
      this.p();
      this.o();
      this.aO_();
      this.aC_();
   }

   @Override
   public List<? extends fvv> aE_() {
      return this.d;
   }

   protected void aO_() {
   }

   public void e() {
   }

   public void aF_() {
   }

   public void aG_() {
   }

   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.r();
      this.a($$0);
   }

   protected void r() {
      this.m.j.d();
   }

   protected void a(ftk $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(ftk $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(ftk $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(ftk $$0, alr $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gry::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(ftk $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fqq.a ? fka.a(fqq.Q().aO().h(), 343) || fka.a(fqq.Q().aO().h(), 347) : fka.a(fqq.Q().aO().h(), 341) || fka.a(fqq.Q().aO().h(), 345);
   }

   public static boolean t() {
      return fka.a(fqq.Q().aO().h(), 340) || fka.a(fqq.Q().aO().h(), 344);
   }

   public static boolean u() {
      return fka.a(fqq.Q().aO().h(), 342) || fka.a(fqq.Q().aO().h(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && s() && !t() && !u();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && s() && !t() && !u();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && s() && !t() && !u();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && s() && !t() && !u();
   }

   protected void c() {
      this.q();
   }

   public void a(fqq $$0, int $$1, int $$2) {
      this.n = $$1;
      this.o = $$2;
      this.c();
   }

   public void a(p $$0) {
      q $$1 = $$0.a("Affected screen", 1);
      $$1.a("Screen name", () -> this.getClass().getCanonicalName());
   }

   protected boolean a(String $$0, char $$1, int $$2) {
      int $$3 = $$0.indexOf(58);
      int $$4 = $$0.indexOf(47);
      if ($$1 == ':') {
         return ($$4 == -1 || $$2 <= $$4) && $$3 == -1;
      } else {
         return $$1 == '/' ? $$2 > $$3 : $$1 == '_' || $$1 == '-' || $$1 >= 'a' && $$1 <= 'z' || $$1 >= '0' && $$1 <= '9' || $$1 == '.';
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return true;
   }

   public void a(List<Path> $$0) {
   }

   private void a(long $$0, boolean $$1) {
      this.D = ag.c() + $$0;
      if ($$1) {
         this.C = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.C = ag.c() + $$0;
   }

   public void v() {
      this.a(750L, false);
   }

   public void w() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean E() {
      return this.m.aY().a();
   }

   public void y() {
      if (this.E()) {
         long $$0 = ag.c();
         if ($$0 > this.D && $$0 > this.C) {
            this.c(true);
            this.D = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.E()) {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      this.B.a(this::a);
      String $$1 = this.B.a(!$$0);
      if (!$$1.isEmpty()) {
         this.m.aY().a($$1);
      }
   }

   protected boolean aN_() {
      return true;
   }

   protected void a(fxv $$0) {
      $$0.a(fxu.a, this.i());
      if (this.aN_()) {
         $$0.a(fxu.d, b);
      }

      this.b($$0);
   }

   protected void b(fxv $$0) {
      List<? extends fxt> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(fxt::E).sorted(Comparator.comparingInt(fvi::K)).toList();
      fzq.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fxu.b, xg.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fxt.a.c) {
               $$0.a(fxu.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xg z() {
      return xg.c("narration.component_list.usage");
   }

   @Nullable
   public static fzq.b a(List<? extends fxt> $$0, @Nullable fxt $$1) {
      fzq.b $$2 = null;
      fzq.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fxt $$6 = $$0.get($$4);
         fxt.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fzq.b($$6, $$4, $$7);
            }

            $$3 = new fzq.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fxt.a.a) > 0) {
            $$2 = new fzq.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(x, false);
      }

      if (this.q != null) {
         this.q.a(this.m.n.av().c());
      }
   }

   protected void A() {
      this.F = null;
   }

   public void b(List<azk> $$0) {
      this.a($$0, gce.a, true);
   }

   public void a(List<azk> $$0, gcd $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fzq.a($$0, $$1);
      }
   }

   public void d(xg $$0) {
      this.b(fvj.a(this.m, $$0));
   }

   public void a(fvj $$0, gcd $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fti B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fyf J() {
      return new fyf(0, 0, this.n, this.o);
   }

   @Nullable
   public awv D() {
      return null;
   }

   static record a(List<azk> a, gcd b) {
   }

   public static class b {
      public final fxt a;
      public final int b;
      public final fxt.a c;

      public b(fxt $$0, int $$1, fxt.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
