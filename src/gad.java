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

public abstract class gad extends fwg implements fvo {
   private static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("narrator.screen.usage");
   protected static final grl e = new grl(ali.b("textures/gui/title/background/panorama"));
   protected static final gsd f = new gsd(e);
   public static final ali g = ali.b("textures/gui/menu_background.png");
   public static final ali h = ali.b("textures/gui/header_separator.png");
   public static final ali i = ali.b("textures/gui/footer_separator.png");
   private static final ali c = ali.b("textures/gui/inworld_menu_background.png");
   public static final ali j = ali.b("textures/gui/inworld_header_separator.png");
   public static final ali k = ali.b("textures/gui/inworld_footer_separator.png");
   protected final xa l;
   private final List<fwi> d = Lists.newArrayList();
   private final List<fyg> s = Lists.newArrayList();
   @Nullable
   protected frd m;
   private boolean u;
   public int n;
   public int o;
   private final List<fvo> v = Lists.newArrayList();
   protected ftv p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fyl B = new fyl();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fus<frf> q;
   @Nullable
   private fyg E;
   @Nullable
   private gad.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected gad(xa $$0) {
      this.l = $$0;
   }

   public xa n() {
      return this.l;
   }

   public xa i() {
      return this.n();
   }

   public final void c(ftx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fvo $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aH_()) {
         this.aP_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fyo $$3 = (fyo)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fyq.d);
            case 263 -> this.a(fyq.c);
            case 264 -> this.a(fyq.b);
            case 265 -> this.a(fyq.a);
         });
         if ($$3 != null) {
            ftu $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fyo.c) {
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

   private fyo.c m() {
      boolean $$0 = !t();
      return new fyo.c($$0);
   }

   private fyo.a a(fyq $$0) {
      return new fyo.a($$0);
   }

   protected void aG_() {
      if (this.m.aX().b()) {
         fyo.c $$0 = new fyo.c(true);
         ftu $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fwi $$0) {
      ftu $$1 = ftu.a(this, $$0.a(new fyo.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      ftu $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(ftu $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aH_() {
      return true;
   }

   public void aP_() {
      this.m.a(null);
   }

   protected <T extends fwi & fvo & fyg> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fvo> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fwi & fyg> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fwi $$0) {
      if ($$0 instanceof fvo) {
         this.v.remove((fvo)$$0);
      }

      if ($$0 instanceof fyg) {
         this.s.remove((fyg)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xa> a(frd $$0, czy $$1) {
      return $$1.a(czu.b.a($$0.s), $$0.t, $$0.n.m ? dbn.a.b : dbn.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean a(@Nullable xx $$0) {
      if ($$0 == null) {
         return false;
      } else {
         wy $$1 = $$0.i();
         if (t()) {
            if ($$0.k() != null) {
               this.a_($$0.k(), false);
            }
         } else if ($$1 != null) {
            Objects.requireNonNull($$1);
            Throwable var22;
            switch ($$1) {
               case wy.e var5:
                  wy.e var28 = var5;

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
                     this.m.a(new fza($$1x -> {
                        if ($$1x) {
                           ag.n().a(var19);
                        }

                        this.m.a(this);
                     }, var19.toString(), false));
                  } else {
                     ag.n().a(var19);
                  }

                  return true;
               case wy.d $$3:
                  ag.n().a($$3.b());
                  return true;
               case wy.g var8:
                  wy.g var26 = var8;

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
               case wy.f var10:
                  wy.f var24 = var10;

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
               case wy.c var12:
                  wy.c var10000 = var12;

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

   public final void b(frd $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aS_();
         this.aG_();
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
      this.aS_();
      this.aG_();
   }

   @Override
   public List<? extends fwi> aI_() {
      return this.d;
   }

   protected void aS_() {
   }

   public void e() {
   }

   public void aJ_() {
   }

   public void aK_() {
   }

   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.r();
      this.a($$0);
   }

   protected void r() {
      this.m.j.d();
   }

   protected void a(ftx $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(ftx $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(ftx $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(ftx $$0, ali $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gsl::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(ftx $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return frd.a ? fka.a(frd.Q().aO().h(), 343) || fka.a(frd.Q().aO().h(), 347) : fka.a(frd.Q().aO().h(), 341) || fka.a(frd.Q().aO().h(), 345);
   }

   public static boolean t() {
      return fka.a(frd.Q().aO().h(), 340) || fka.a(frd.Q().aO().h(), 344);
   }

   public static boolean u() {
      return fka.a(frd.Q().aO().h(), 342) || fka.a(frd.Q().aO().h(), 346);
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

   public void a(frd $$0, int $$1, int $$2) {
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

   protected boolean aR_() {
      return true;
   }

   protected void a(fyi $$0) {
      $$0.a(fyh.a, this.i());
      if (this.aR_()) {
         $$0.a(fyh.d, b);
      }

      this.b($$0);
   }

   protected void b(fyi $$0) {
      List<? extends fyg> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(fyg::E).sorted(Comparator.comparingInt(fvv::K)).toList();
      gad.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fyh.b, xa.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fyg.a.c) {
               $$0.a(fyh.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xa z() {
      return xa.c("narration.component_list.usage");
   }

   @Nullable
   public static gad.b a(List<? extends fyg> $$0, @Nullable fyg $$1) {
      gad.b $$2 = null;
      gad.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fyg $$6 = $$0.get($$4);
         fyg.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new gad.b($$6, $$4, $$7);
            }

            $$3 = new gad.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fyg.a.a) > 0) {
            $$2 = new gad.b($$6, $$4, $$7);
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

   public void b(List<aza> $$0) {
      this.a($$0, gcr.a, true);
   }

   public void a(List<aza> $$0, gcq $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new gad.a($$0, $$1);
      }
   }

   public void d(xa $$0) {
      this.b(fvw.a(this.m, $$0));
   }

   public void a(fvw $$0, gcq $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public ftv B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fys J() {
      return new fys(0, 0, this.n, this.o);
   }

   @Nullable
   public awm D() {
      return null;
   }

   static record a(List<aza> a, gcq b) {
   }

   public static class b {
      public final fyg a;
      public final int b;
      public final fyg.a c;

      public b(fyg $$0, int $$1, fyg.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
