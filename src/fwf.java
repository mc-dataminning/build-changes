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

public abstract class fwf extends fsi implements frq {
   private static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("narrator.screen.usage");
   protected static final gnk e = new gnk(ald.b("textures/gui/title/background/panorama"));
   protected static final gob f = new gob(e);
   public static final ald g = ald.b("textures/gui/menu_background.png");
   public static final ald h = ald.b("textures/gui/header_separator.png");
   public static final ald i = ald.b("textures/gui/footer_separator.png");
   private static final ald c = ald.b("textures/gui/inworld_menu_background.png");
   public static final ald j = ald.b("textures/gui/inworld_header_separator.png");
   public static final ald k = ald.b("textures/gui/inworld_footer_separator.png");
   protected final wv l;
   private final List<fsk> d = Lists.newArrayList();
   private final List<fui> s = Lists.newArrayList();
   @Nullable
   protected fnd m;
   private boolean u;
   public int n;
   public int o;
   private final List<frq> v = Lists.newArrayList();
   protected fpx p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fun B = new fun();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fqu<fnf> q;
   @Nullable
   private fui E;
   @Nullable
   private fwf.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fwf(wv $$0) {
      this.l = $$0;
   }

   public wv n() {
      return this.l;
   }

   public wv i() {
      return this.n();
   }

   public final void c(fpz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (frq $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aC_()) {
         this.aK_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fuq $$3 = (fuq)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fus.d);
            case 263 -> this.a(fus.c);
            case 264 -> this.a(fus.b);
            case 265 -> this.a(fus.a);
         });
         if ($$3 != null) {
            fpw $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fuq.c) {
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

   private fuq.c m() {
      boolean $$0 = !t();
      return new fuq.c($$0);
   }

   private fuq.a a(fus $$0) {
      return new fuq.a($$0);
   }

   protected void aB_() {
      if (this.m.aX().b()) {
         fuq.c $$0 = new fuq.c(true);
         fpw $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fsk $$0) {
      fpw $$1 = fpw.a(this, $$0.a(new fuq.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fpw $$0 = this.aJ_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fpw $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aC_() {
      return true;
   }

   public void aK_() {
      this.m.a(null);
   }

   protected <T extends fsk & frq & fui> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends frq> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fsk & fui> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fsk $$0) {
      if ($$0 instanceof frq) {
         this.v.remove((frq)$$0);
      }

      if ($$0 instanceof fui) {
         this.s.remove((fui)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<wv> a(fnd $$0, cxy $$1) {
      return $$1.a(cxu.b.a($$0.s), $$0.t, $$0.n.m ? czn.a.b : czn.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean a(@Nullable xs $$0) {
      if ($$0 == null) {
         return false;
      } else {
         wt $$1 = $$0.i();
         if (t()) {
            if ($$0.k() != null) {
               this.a_($$0.k(), false);
            }
         } else if ($$1 != null) {
            Objects.requireNonNull($$1);
            Throwable var22;
            switch ($$1) {
               case wt.e var5:
                  wt.e var28 = var5;

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
                     this.m.a(new fvc($$1x -> {
                        if ($$1x) {
                           af.n().a(var19);
                        }

                        this.m.a(this);
                     }, var19.toString(), false));
                  } else {
                     af.n().a(var19);
                  }

                  return true;
               case wt.d $$3:
                  af.n().a($$3.b());
                  return true;
               case wt.g var8:
                  wt.g var26 = var8;

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
               case wt.f var10:
                  wt.f var24 = var10;

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
               case wt.c var12:
                  wt.c var10000 = var12;

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

   public final void b(fnd $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aN_();
         this.aB_();
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
      this.aN_();
      this.aB_();
   }

   @Override
   public List<? extends fsk> aD_() {
      return this.d;
   }

   protected void aN_() {
   }

   public void e() {
   }

   public void aE_() {
   }

   public void aF_() {
   }

   public void b(fpz $$0, int $$1, int $$2, float $$3) {
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

   protected void a(fpz $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fpz $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fpz $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fpz $$0, ald $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(goi::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fpz $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fnd.a ? fgj.a(fnd.Q().aO().h(), 343) || fgj.a(fnd.Q().aO().h(), 347) : fgj.a(fnd.Q().aO().h(), 341) || fgj.a(fnd.Q().aO().h(), 345);
   }

   public static boolean t() {
      return fgj.a(fnd.Q().aO().h(), 340) || fgj.a(fnd.Q().aO().h(), 344);
   }

   public static boolean u() {
      return fgj.a(fnd.Q().aO().h(), 342) || fgj.a(fnd.Q().aO().h(), 346);
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

   public void a(fnd $$0, int $$1, int $$2) {
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

   protected boolean aM_() {
      return true;
   }

   protected void a(fuk $$0) {
      $$0.a(fuj.a, this.i());
      if (this.aM_()) {
         $$0.a(fuj.d, b);
      }

      this.b($$0);
   }

   protected void b(fuk $$0) {
      List<? extends fui> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(fui::E).sorted(Comparator.comparingInt(frx::K)).toList();
      fwf.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fuj.b, wv.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fui.a.c) {
               $$0.a(fuj.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wv z() {
      return wv.c("narration.component_list.usage");
   }

   @Nullable
   public static fwf.b a(List<? extends fui> $$0, @Nullable fui $$1) {
      fwf.b $$2 = null;
      fwf.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fui $$6 = $$0.get($$4);
         fui.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fwf.b($$6, $$4, $$7);
            }

            $$3 = new fwf.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fui.a.a) > 0) {
            $$2 = new fwf.b($$6, $$4, $$7);
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

   public void b(List<ayw> $$0) {
      this.a($$0, fyt.a, true);
   }

   public void a(List<ayw> $$0, fys $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fwf.a($$0, $$1);
      }
   }

   public void d(wv $$0) {
      this.b(fry.a(this.m, $$0));
   }

   public void a(fry $$0, fys $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fpx B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fuu J() {
      return new fuu(0, 0, this.n, this.o);
   }

   @Nullable
   public awh D() {
      return null;
   }

   static record a(List<ayw> a, fys b) {
   }

   public static class b {
      public final fui a;
      public final int b;
      public final fui.a c;

      public b(fui $$0, int $$1, fui.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
