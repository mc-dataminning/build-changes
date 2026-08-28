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

public abstract class fyn extends fuq implements fty {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("narrator.screen.usage");
   protected static final gpw e = new gpw(alg.b("textures/gui/title/background/panorama"));
   protected static final gqp f = new gqp(e);
   public static final alg g = alg.b("textures/gui/menu_background.png");
   public static final alg h = alg.b("textures/gui/header_separator.png");
   public static final alg i = alg.b("textures/gui/footer_separator.png");
   private static final alg c = alg.b("textures/gui/inworld_menu_background.png");
   public static final alg j = alg.b("textures/gui/inworld_header_separator.png");
   public static final alg k = alg.b("textures/gui/inworld_footer_separator.png");
   protected final wy l;
   private final List<fus> d = Lists.newArrayList();
   private final List<fwq> s = Lists.newArrayList();
   @Nullable
   protected fpo m;
   private boolean u;
   public int n;
   public int o;
   private final List<fty> v = Lists.newArrayList();
   protected fsf p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fwv B = new fwv();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected ftc<fpq> q;
   @Nullable
   private fwq E;
   @Nullable
   private fyn.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fyn(wy $$0) {
      this.l = $$0;
   }

   public wy n() {
      return this.l;
   }

   public wy i() {
      return this.n();
   }

   public final void c(fsh $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fty $$4 : this.v) {
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
         fwy $$3 = (fwy)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fxa.d);
            case 263 -> this.a(fxa.c);
            case 264 -> this.a(fxa.b);
            case 265 -> this.a(fxa.a);
         });
         if ($$3 != null) {
            fse $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fwy.c) {
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

   private fwy.c m() {
      boolean $$0 = !t();
      return new fwy.c($$0);
   }

   private fwy.a a(fxa $$0) {
      return new fwy.a($$0);
   }

   protected void aC_() {
      if (this.m.aX().b()) {
         fwy.c $$0 = new fwy.c(true);
         fse $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fus $$0) {
      fse $$1 = fse.a(this, $$0.a(new fwy.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fse $$0 = this.aK_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fse $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aD_() {
      return true;
   }

   public void aL_() {
      this.m.a(null);
   }

   protected <T extends fus & fty & fwq> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fty> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fus & fwq> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fus $$0) {
      if ($$0 instanceof fty) {
         this.v.remove((fty)$$0);
      }

      if ($$0 instanceof fwq) {
         this.s.remove((fwq)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<wy> a(fpo $$0, czk $$1) {
      return $$1.a(czg.b.a($$0.s), $$0.t, $$0.n.m ? daz.a.b : daz.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean a(@Nullable xv $$0) {
      if ($$0 == null) {
         return false;
      } else {
         ww $$1 = $$0.i();
         if (t()) {
            if ($$0.k() != null) {
               this.a_($$0.k(), false);
            }
         } else if ($$1 != null) {
            Objects.requireNonNull($$1);
            Throwable var22;
            switch ($$1) {
               case ww.e var5:
                  ww.e var28 = var5;

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
                     this.m.a(new fxk($$1x -> {
                        if ($$1x) {
                           ag.n().a(var19);
                        }

                        this.m.a(this);
                     }, var19.toString(), false));
                  } else {
                     ag.n().a(var19);
                  }

                  return true;
               case ww.d $$3:
                  ag.n().a($$3.b());
                  return true;
               case ww.g var8:
                  ww.g var26 = var8;

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
               case ww.f var10:
                  ww.f var24 = var10;

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
               case ww.c var12:
                  ww.c var10000 = var12;

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

   public final void b(fpo $$0, int $$1, int $$2) {
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
   public List<? extends fus> aE_() {
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

   public void b(fsh $$0, int $$1, int $$2, float $$3) {
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

   protected void a(fsh $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fsh $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fsh $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fsh $$0, alg $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gqx::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fsh $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fpo.a ? fip.a(fpo.Q().aO().h(), 343) || fip.a(fpo.Q().aO().h(), 347) : fip.a(fpo.Q().aO().h(), 341) || fip.a(fpo.Q().aO().h(), 345);
   }

   public static boolean t() {
      return fip.a(fpo.Q().aO().h(), 340) || fip.a(fpo.Q().aO().h(), 344);
   }

   public static boolean u() {
      return fip.a(fpo.Q().aO().h(), 342) || fip.a(fpo.Q().aO().h(), 346);
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

   public void a(fpo $$0, int $$1, int $$2) {
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

   protected void a(fws $$0) {
      $$0.a(fwr.a, this.i());
      if (this.aN_()) {
         $$0.a(fwr.d, b);
      }

      this.b($$0);
   }

   protected void b(fws $$0) {
      List<? extends fwq> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(fwq::E).sorted(Comparator.comparingInt(fuf::K)).toList();
      fyn.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fwr.b, wy.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fwq.a.c) {
               $$0.a(fwr.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wy z() {
      return wy.c("narration.component_list.usage");
   }

   @Nullable
   public static fyn.b a(List<? extends fwq> $$0, @Nullable fwq $$1) {
      fyn.b $$2 = null;
      fyn.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fwq $$6 = $$0.get($$4);
         fwq.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fyn.b($$6, $$4, $$7);
            }

            $$3 = new fyn.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fwq.a.a) > 0) {
            $$2 = new fyn.b($$6, $$4, $$7);
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

   public void b(List<ayy> $$0) {
      this.a($$0, gbb.a, true);
   }

   public void a(List<ayy> $$0, gba $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fyn.a($$0, $$1);
      }
   }

   public void d(wy $$0) {
      this.b(fug.a(this.m, $$0));
   }

   public void a(fug $$0, gba $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fsf B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fxc J() {
      return new fxc(0, 0, this.n, this.o);
   }

   @Nullable
   public awk D() {
      return null;
   }

   static record a(List<ayy> a, gba b) {
   }

   public static class b {
      public final fwq a;
      public final int b;
      public final fwq.a c;

      public b(fwq $$0, int $$1, fwq.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
