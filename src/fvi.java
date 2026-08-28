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

public abstract class fvi extends frl implements fqt {
   private static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("narrator.screen.usage");
   protected static final gmj e = new gmj(aku.b("textures/gui/title/background/panorama"));
   protected static final gna f = new gna(e);
   public static final aku g = aku.b("textures/gui/menu_background.png");
   public static final aku h = aku.b("textures/gui/header_separator.png");
   public static final aku i = aku.b("textures/gui/footer_separator.png");
   private static final aku c = aku.b("textures/gui/inworld_menu_background.png");
   public static final aku j = aku.b("textures/gui/inworld_header_separator.png");
   public static final aku k = aku.b("textures/gui/inworld_footer_separator.png");
   protected final wp l;
   private final List<frn> d = Lists.newArrayList();
   private final List<ftl> s = Lists.newArrayList();
   @Nullable
   protected fmg m;
   private boolean u;
   public int n;
   public int o;
   private final List<fqt> v = Lists.newArrayList();
   protected fpa p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final ftq B = new ftq();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fpx<fmi> q;
   @Nullable
   private ftl E;
   @Nullable
   private fvi.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fvi(wp $$0) {
      this.l = $$0;
   }

   public wp n() {
      return this.l;
   }

   public wp i() {
      return this.n();
   }

   public final void c(fpc $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fqt $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aG_()) {
         this.aO_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         ftt $$3 = (ftt)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(ftv.d);
            case 263 -> this.a(ftv.c);
            case 264 -> this.a(ftv.b);
            case 265 -> this.a(ftv.a);
         });
         if ($$3 != null) {
            foz $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof ftt.c) {
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

   private ftt.c m() {
      boolean $$0 = !t();
      return new ftt.c($$0);
   }

   private ftt.a a(ftv $$0) {
      return new ftt.a($$0);
   }

   protected void aF_() {
      if (this.m.aX().b()) {
         ftt.c $$0 = new ftt.c(true);
         foz $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(frn $$0) {
      foz $$1 = foz.a(this, $$0.a(new ftt.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      foz $$0 = this.aN_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(foz $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aG_() {
      return true;
   }

   public void aO_() {
      this.m.a(null);
   }

   protected <T extends frn & fqt & ftl> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fqt> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends frn & ftl> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(frn $$0) {
      if ($$0 instanceof fqt) {
         this.v.remove((fqt)$$0);
      }

      if ($$0 instanceof ftl) {
         this.s.remove((ftl)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<wp> a(fmg $$0, cxh $$1) {
      return $$1.a(cxd.b.a($$0.s), $$0.t, $$0.n.m ? cyx.a.b : cyx.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean a(@Nullable xm $$0) {
      if ($$0 == null) {
         return false;
      } else {
         wn $$1 = $$0.i();
         if (t()) {
            if ($$0.k() != null) {
               this.a_($$0.k(), false);
            }
         } else if ($$1 != null) {
            Objects.requireNonNull($$1);
            Throwable var22;
            switch ($$1) {
               case wn.e var5:
                  wn.e var28 = var5;

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
                     this.m.a(new fuf($$1x -> {
                        if ($$1x) {
                           af.n().a(var19);
                        }

                        this.m.a(this);
                     }, var19.toString(), false));
                  } else {
                     af.n().a(var19);
                  }

                  return true;
               case wn.d $$3:
                  af.n().a($$3.b());
                  return true;
               case wn.g var8:
                  wn.g var26 = var8;

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
               case wn.f var10:
                  wn.f var24 = var10;

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
               case wn.c var12:
                  wn.c var10000 = var12;

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

   public final void b(fmg $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aR_();
         this.aF_();
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
      this.aR_();
      this.aF_();
   }

   @Override
   public List<? extends frn> aH_() {
      return this.d;
   }

   protected void aR_() {
   }

   public void e() {
   }

   public void aI_() {
   }

   public void aJ_() {
   }

   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.r();
      this.a($$0);
   }

   protected void r() {
      this.m.j.d();
      this.m.h().a(false);
   }

   protected void a(fpc $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fpc $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fpc $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fpc $$0, aku $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gnh::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fpc $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fmg.a ? ffm.a(fmg.Q().aO().h(), 343) || ffm.a(fmg.Q().aO().h(), 347) : ffm.a(fmg.Q().aO().h(), 341) || ffm.a(fmg.Q().aO().h(), 345);
   }

   public static boolean t() {
      return ffm.a(fmg.Q().aO().h(), 340) || ffm.a(fmg.Q().aO().h(), 344);
   }

   public static boolean u() {
      return ffm.a(fmg.Q().aO().h(), 342) || ffm.a(fmg.Q().aO().h(), 346);
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

   public void a(fmg $$0, int $$1, int $$2) {
      this.n = $$1;
      this.o = $$2;
      this.c();
   }

   public void a(o $$0) {
      p $$1 = $$0.a("Affected screen", 1);
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
      this.D = af.c() + $$0;
      if ($$1) {
         this.C = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.C = af.c() + $$0;
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
         long $$0 = af.c();
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

   protected boolean aQ_() {
      return true;
   }

   protected void a(ftn $$0) {
      $$0.a(ftm.a, this.i());
      if (this.aQ_()) {
         $$0.a(ftm.d, b);
      }

      this.b($$0);
   }

   protected void b(ftn $$0) {
      List<? extends ftl> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(ftl::E).sorted(Comparator.comparingInt(fra::K)).toList();
      fvi.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(ftm.b, wp.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == ftl.a.c) {
               $$0.a(ftm.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wp z() {
      return wp.c("narration.component_list.usage");
   }

   @Nullable
   public static fvi.b a(List<? extends ftl> $$0, @Nullable ftl $$1) {
      fvi.b $$2 = null;
      fvi.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         ftl $$6 = $$0.get($$4);
         ftl.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fvi.b($$6, $$4, $$7);
            }

            $$3 = new fvi.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : ftl.a.a) > 0) {
            $$2 = new fvi.b($$6, $$4, $$7);
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

   public void b(List<ayl> $$0) {
      this.a($$0, fxu.a, true);
   }

   public void a(List<ayl> $$0, fxt $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fvi.a($$0, $$1);
      }
   }

   public void d(wp $$0) {
      this.b(frb.a(this.m, $$0));
   }

   public void a(frb $$0, fxt $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fpa B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public ftx J() {
      return new ftx(0, 0, this.n, this.o);
   }

   @Nullable
   public avx D() {
      return null;
   }

   static record a(List<ayl> a, fxt b) {
   }

   public static class b {
      public final ftl a;
      public final int b;
      public final ftl.a c;

      public b(ftl $$0, int $$1, ftl.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
