import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ful extends fqo implements fpw {
   private static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("narrator.screen.usage");
   protected static final glk e = new glk(akv.b("textures/gui/title/background/panorama"));
   protected static final gmb f = new gmb(e);
   public static final akv g = akv.b("textures/gui/menu_background.png");
   public static final akv h = akv.b("textures/gui/header_separator.png");
   public static final akv i = akv.b("textures/gui/footer_separator.png");
   private static final akv c = akv.b("textures/gui/inworld_menu_background.png");
   public static final akv j = akv.b("textures/gui/inworld_header_separator.png");
   public static final akv k = akv.b("textures/gui/inworld_footer_separator.png");
   protected final wp l;
   private final List<fqq> d = Lists.newArrayList();
   private final List<fso> s = Lists.newArrayList();
   @Nullable
   protected flj m;
   private boolean u;
   public int n;
   public int o;
   private final List<fpw> v = Lists.newArrayList();
   protected foc p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fst B = new fst();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fpa<fll> q;
   @Nullable
   private fso E;
   @Nullable
   private ful.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected ful(wp $$0) {
      this.l = $$0;
   }

   public wp n() {
      return this.l;
   }

   public wp i() {
      return this.n();
   }

   public final void c(foe $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fpw $$4 : this.v) {
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
         fsw $$3 = (fsw)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fsy.d);
            case 263 -> this.a(fsy.c);
            case 264 -> this.a(fsy.b);
            case 265 -> this.a(fsy.a);
         });
         if ($$3 != null) {
            fob $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fsw.c) {
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

   private fsw.c m() {
      boolean $$0 = !t();
      return new fsw.c($$0);
   }

   private fsw.a a(fsy $$0) {
      return new fsw.a($$0);
   }

   protected void aF_() {
      if (this.m.aX().b()) {
         fsw.c $$0 = new fsw.c(true);
         fob $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fqq $$0) {
      fob $$1 = fob.a(this, $$0.a(new fsw.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fob $$0 = this.aN_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fob $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aG_() {
      return true;
   }

   public void aO_() {
      this.m.a(null);
   }

   protected <T extends fqq & fpw & fso> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fpw> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fqq & fso> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fqq $$0) {
      if ($$0 instanceof fpw) {
         this.v.remove((fpw)$$0);
      }

      if ($$0 instanceof fso) {
         this.s.remove((fso)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<wp> a(flj $$0, cwp $$1) {
      return $$1.a(cwl.b.a($$0.s), $$0.t, $$0.n.m ? cyh.a.b : cyh.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

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
            if ($$1.a() == wn.a.a) {
               if (!this.m.n.O().c()) {
                  return false;
               }

               try {
                  URI $$2 = af.a($$1.b());
                  if (this.m.n.P().c()) {
                     this.m.a(new fti($$1x -> {
                        if ($$1x) {
                           af.m().a($$2);
                        }

                        this.m.a(this);
                     }, $$1.b(), false));
                  } else {
                     af.m().a($$2);
                  }
               } catch (URISyntaxException var4) {
                  a.error("Can't open url for {}", $$1, var4);
               }
            } else if ($$1.a() == wn.a.b) {
               af.m().a(new File($$1.b()));
            } else if ($$1.a() == wn.a.d) {
               this.a_(azw.g($$1.b()), true);
            } else if ($$1.a() == wn.a.c) {
               String $$4 = azw.g($$1.b());
               if ($$4.startsWith("/")) {
                  if (!this.m.t.j.d($$4.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$4);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$4);
               }
            } else if ($$1.a() == wn.a.f) {
               this.m.p.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(flj $$0, int $$1, int $$2) {
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
   public List<? extends fqq> aH_() {
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

   public void b(foe $$0, int $$1, int $$2, float $$3) {
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

   protected void a(foe $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(foe $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(foe $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(foe $$0, akv $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gmi::H, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(foe $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return flj.a ? fep.a(flj.Q().aO().h(), 343) || fep.a(flj.Q().aO().h(), 347) : fep.a(flj.Q().aO().h(), 341) || fep.a(flj.Q().aO().h(), 345);
   }

   public static boolean t() {
      return fep.a(flj.Q().aO().h(), 340) || fep.a(flj.Q().aO().h(), 344);
   }

   public static boolean u() {
      return fep.a(flj.Q().aO().h(), 342) || fep.a(flj.Q().aO().h(), 346);
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

   public void a(flj $$0, int $$1, int $$2) {
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

   protected void a(fsq $$0) {
      $$0.a(fsp.a, this.i());
      if (this.aQ_()) {
         $$0.a(fsp.d, b);
      }

      this.b($$0);
   }

   protected void b(fsq $$0) {
      List<? extends fso> $$1 = this.s.stream().flatMap($$0x -> $$0x.L().stream()).filter(fso::E).sorted(Comparator.comparingInt(fqd::K)).toList();
      ful.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fsp.b, wp.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fso.a.c) {
               $$0.a(fsp.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wp z() {
      return wp.c("narration.component_list.usage");
   }

   @Nullable
   public static ful.b a(List<? extends fso> $$0, @Nullable fso $$1) {
      ful.b $$2 = null;
      ful.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fso $$6 = $$0.get($$4);
         fso.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new ful.b($$6, $$4, $$7);
            }

            $$3 = new ful.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fso.a.a) > 0) {
            $$2 = new ful.b($$6, $$4, $$7);
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
      this.a($$0, fwx.a, true);
   }

   public void a(List<ayl> $$0, fww $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new ful.a($$0, $$1);
      }
   }

   public void d(wp $$0) {
      this.b(fqe.a(this.m, $$0));
   }

   public void a(fqe $$0, fww $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public foc B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fta J() {
      return new fta(0, 0, this.n, this.o);
   }

   @Nullable
   public avx D() {
      return null;
   }

   static record a(List<ayl> a, fww b) {
   }

   public static class b {
      public final fso a;
      public final int b;
      public final fso.a c;

      public b(fso $$0, int $$1, fso.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
