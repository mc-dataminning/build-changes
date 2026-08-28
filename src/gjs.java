import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjs extends gjo implements abu, wm {
   private static final Logger l = LogUtils.getLogger();
   private static final wy m = wy.c("multiplayer.unsecureserver.toast.title");
   private static final wy n = wy.c("multiplayer.unsecureserver.toast");
   private static final wy o = wy.c("multiplayer.disconnect.invalid_packet");
   private static final wy p = wy.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private gjr s;
   private gjr.a t;
   private final Map<UUID, gkd> u = Maps.newHashMap();
   private final Set<gkd> v = new ReferenceOpenHashSet();
   private final gjm w;
   private final gjv x;
   private final fog y = new fog(this);
   private int z = 3;
   private int A = 3;
   private final azv B = azv.b();
   private CommandDispatcher<en> C = new CommandDispatcher();
   private gjt D = new gjt(Map.of(), dec.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<alf<div>> F;
   private final js.b G;
   private final cuh H;
   private final dat I;
   private dxw J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xj L;
   private xs.c M = xs.c.a;
   private xg N = new xg(20);
   private xl O = xl.a();
   @Nullable
   private CompletableFuture<Optional<cra>> P;
   @Nullable
   private ara Q;
   private final gjl R = new gjl();
   private final gkc S;
   private final gjx T;
   @Nullable
   private gka U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final ffn Y = new ffn();
   private final gkj Z = new gkj();
   private final List<WeakReference<gjk<?, ?>>> aa = new ArrayList<>();

   public gjs(fos $$0, vr $$1, gjw $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gjm($$0, this.e);
      this.x = new gjv(this, $$0);
      this.S = new gkc(this, $$0.aQ().m());
      this.T = new gjx(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = dat.a(this.H);
      this.J = dxw.a($$2.c(), this.H);
   }

   public gjv g() {
      return this.x;
   }

   public void h() {
      this.X = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.F();
      this.s = null;
      this.U = null;
   }

   private void F() {
      for (WeakReference<gjk<?, ?>> $$0 : this.aa) {
         gjk<?, ?> $$1 = $$0.get();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.aa.clear();
   }

   public ddq j() {
      return this.D;
   }

   @Override
   public void a(adl $$0) {
      zi.a($$0, this, this.a);
      this.a.r = new gkb(this.a, this);
      agk $$1 = $$0.m();
      List<alf<div>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alf<div> $$3 = $$1.b();
      je<edw> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gjr.a $$8 = new gjr.a(bty.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gjr(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fxs.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new awy(), new foc());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.z();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new goo(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fxs.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new xg(20);
      this.O = xl.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.G()) {
         ful $$9 = ful.a(this.a, ful.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(abv $$0) {
      zi.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bwd $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bwd b(abv $$0) {
      bwm<?> $$1 = $$0.f();
      if ($$1 == bwm.bS) {
         gkd $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new goq(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bwl.r);
      }
   }

   private void a(bwd $$0) {
      if ($$0 instanceof ctk $$1) {
         this.a.ak().a((hmm)(new hmf($$1)));
      } else if ($$0 instanceof cit $$2) {
         boolean $$3 = $$2.W_();
         hlz $$4;
         if ($$3) {
            $$4 = new hlx($$2);
         } else {
            $$4 = new hly($$2);
         }

         this.a.ak().a((hmn)$$4);
      }
   }

   @Override
   public void a(aff $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afd $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(acy $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fei $$2 = $$0.e().a();
         $$1.ap().e($$2);
         if (!$$1.dg()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.dt().g($$2) > 4096.0;
            if (this.s.a($$1) && !$$5) {
               $$1.d($$2, $$3, $$4);
            } else {
               $$1.b($$2, $$3, $$4);
            }

            if ($$1.bR() && $$1.A(this.a.t)) {
               $$1.j(this.a.t);
               this.a.t.by();
            }

            $$1.d($$0.f());
         }
      }
   }

   @Override
   public void a(agc $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new aho.b(this.a.t.dA(), this.a.t.dC(), this.a.t.dG(), this.a.t.dL(), this.a.t.dN(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bxq.a) || $$0.f().contains(bxq.b) || $$0.f().contains(bxq.c);
         boolean $$3 = this.s.a($$1) || !$$1.dg() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.by();
            if ($$1.dg()) {
               this.b.a(ahp.a($$1));
            }
         }
      }
   }

   @Override
   public void a(age $$0) {
      zi.a($$0, this, this.a);
      if (this.a.s != null) {
         buk $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agf $$0) {
      zi.a($$0, this, this.a);
      if (this.a.s != null) {
         buk $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afj $$0) {
      zi.a($$0, this, this.a);
      if (cqx.d($$0.b())) {
         this.a.t.gi().j = $$0.b();
      }
   }

   @Override
   public void a(ado $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.dg()) {
            ait $$2 = $$1.ap();
            fei $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               ait $$4 = $$1.ap();
               fei $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$4.e($$5);
               if ($$0.i()) {
                  $$1.d($$5, $$0.g(), $$0.h());
               } else {
                  $$1.d($$5, $$1.dL(), $$1.dN());
               }
            } else if ($$0.i()) {
               $$1.d($$1.dt(), $$0.g(), $$0.h());
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(adp $$0) {
      zi.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof ctk $$2) {
         if ($$2.f() instanceof ctz $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aen $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aej $$0) {
      zi.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bwd $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bwd.e.b);
         }
      });
   }

   @Override
   public void a(aed $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      if (!$$1.bZ()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new agr($$0.b()));
      this.b.a(new aho.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   private static boolean a(bxp $$0, Set<bxq> $$1, bwd $$2, boolean $$3) {
      bxp $$4 = bxp.a($$2);
      bxp $$5 = bxp.a($$4, $$0, $$1);
      boolean $$6 = $$4.a().g($$5.a()) > 4096.0;
      if ($$3 && !$$6) {
         $$2.d($$5.a(), $$5.c(), $$5.d());
         $$2.i($$5.b());
         return true;
      } else {
         $$2.b($$5.a());
         $$2.i($$5.b());
         $$2.w($$5.c());
         $$2.x($$5.d());
         bxp $$7 = new bxp($$2.bB(), fei.c, $$2.N, $$2.O);
         bxp $$8 = bxp.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aee $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bA();
      this.b.a(new aho.c($$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(aeo $$0) {
      zi.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adg $$0) {
      zi.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adk $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         ecg $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(acj $$0) {
      zi.a($$0, this, this.a);

      for (acj.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (acj.a $$2 : $$0.b()) {
         this.s.a(new dic($$2.b().h, $$2.b().i));
      }

      for (acj.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.aq(); $$6 <= this.s.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adf $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(ecg $$0, int $$1, int $$2) {
      evv $$3 = this.s.h().q();
      ech[] $$4 = $$0.d();
      dic $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         ech $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(jx.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.aq(), $$2 - 1, $$1 + 1, this.s.ar(), $$2 + 1);
   }

   @Override
   public void a(ada $$0) {
      zi.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(ada $$0) {
      dic $$1 = $$0.b();
      this.s.a(() -> {
         evv $$1x = this.s.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jx $$3 = jx.a($$1, $$2);
            $$1x.a(dje.b, $$3, null);
            $$1x.a(dje.a, $$3, null);
         }

         for (int $$4 = this.s.aq(); $$4 <= this.s.ar(); $$4++) {
            $$1x.a(jx.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acc $$0) {
      zi.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afw $$0) {
      zi.a($$0, this, this.a);
      this.a.aZ().d();
      this.H();
      fsd.b $$1 = this.a.m.d().k();
      this.a.c(new gap(p, this.b));
      this.b.a(abj.d, new gjp(this.a, this.b, new gjw(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahd.a);
      this.b.a(abj.b);
   }

   @Override
   public void a(agb $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      bxc $$2 = (bxc)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bwr) {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awn.jd, awo.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awn.og, awo.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gmu(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof cnd $$3) {
            cyy $$4 = $$3.f();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bwd.e.b);
            }
         } else if (!($$1 instanceof bwr)) {
            this.s.a($$0.b(), bwd.e.b);
         }
      }
   }

   @Override
   public void a(afy $$0) {
      zi.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adw $$0) {
      zi.a($$0, this, this.a);
      Optional<xr> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gkd $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            xp $$4 = $$3.b();
            xt $$5;
            if ($$4 != null) {
               $$5 = new xt($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xt.a($$2);
            }

            xo $$7 = new xo($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aZ().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aZ().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(acw $$0) {
      zi.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acv $$0) {
      zi.a($$0, this, this.a);
      Optional<xk> $$1 = $$0.b().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get());
         if (!this.a.aZ().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(abw $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bxc $$2 = (bxc)$$1;
            $$2.a(bua.a);
         } else if ($$0.e() == 3) {
            bxc $$3 = (bxc)$$1;
            $$3.a(bua.b);
         } else if ($$0.e() == 2) {
            cqy $$4 = (cqy)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lx.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lx.r);
         }
      }
   }

   @Override
   public void a(add $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(afr $$0) {
      zi.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afb $$0) {
      zi.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afl $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bO();

         for (int $$3 : $$0.b()) {
            bwd $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cti) {
                        this.a.t.N = $$1.dL();
                        this.a.t.w($$1.dL());
                        this.a.t.r($$1.dL());
                     }

                     wy $$5 = wy.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afe $$0) {
      zi.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bxa $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cyy a(cqy $$0) {
      for (bua $$1 : bua.values()) {
         cyy $$2 = $$0.b($$1);
         if ($$2.c(kj.H)) {
            return $$2;
         }
      }

      return new cyy(czc.wz);
   }

   @Override
   public void a(acx $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hmm)(new hme((cnv)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lx.an, 30);
               this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awn.AA, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cqy)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hmm)(new hmi((clq)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(act $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afi $$0) {
      zi.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gt().a($$0.e());
      this.a.t.gt().b($$0.f());
   }

   @Override
   public void a(afh $$0) {
      zi.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aem $$0) {
      zi.a($$0, this, this.a);
      agk $$1 = $$0.b();
      alf<div> $$2 = $$1.b();
      je<edw> $$3 = $$1.a();
      gop $$4 = this.a.t;
      alf<div> $$5 = $$4.dV().aj();
      boolean $$6 = $$2 != $$5;
      fxs.a $$7 = this.a($$4.eG(), $$2, $$5);
      if ($$6) {
         Map<exz, eyb> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gjr.a $$12 = new gjr.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gjr(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gl()) {
         $$4.p();
      }

      gop $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m(), $$4.cd(), $$4.cj());
      } else {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akn.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.i($$4.dy());
         $$13.w($$4.dL());
         $$13.x($$4.dN());
      } else {
         $$13.z();
         $$13.w(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.eZ().a($$4.eZ());
      } else {
         $$13.eZ().b($$4.eZ());
      }

      this.s.d($$13);
      $$13.k = new goo(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gz());
      $$13.b($$4.n());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cv = $$4.cv;
      $$13.cw = $$4.cw;
      if (this.a.z instanceof fwy || this.a.z instanceof fwy.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fxs.a a(boolean $$0, alf<div> $$1, alf<div> $$2) {
      fxs.a $$3 = fxs.a.c;
      if (!$$0) {
         if ($$1 == div.j || $$2 == div.j) {
            $$3 = fxs.a.a;
         } else if ($$1 == div.k || $$2 == div.k) {
            $$3 = fxs.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acz $$0) {
      zi.a($$0, this, this.a);
      fei $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awo.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(adc $$0) {
      zi.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof cld $$2) {
         gop $$3 = this.a.t;
         int $$4 = $$0.e();
         bui $$5 = new bui(cld.v($$4));
         cvs $$6 = new cvs($$0.b(), $$3.gi(), $$5, $$2, $$4);
         $$3.bQ = $$6;
         this.a.a(new fzj($$6, $$3.gi(), $$2, $$4));
      }
   }

   @Override
   public void a(ads $$0) {
      zi.a($$0, this, this.a);
      fxl.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acq $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      cyy $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fyz $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cvt.e($$3) && !$$2.f()) {
            cyy $$7 = $$1.bP.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bP.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bQ.l && ($$0.b() != 0 || !$$5)) {
         $$1.bQ.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fyz) {
         $$1.bP.a($$3, $$2);
         $$1.bP.d();
      }
   }

   @Override
   public void a(afa $$0) {
      zi.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fyz)) {
         this.a.t.bQ.b($$0.b());
      }
   }

   @Override
   public void a(afm $$0) {
      zi.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gi().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aco $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bP.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bQ.l) {
         $$1.bQ.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adt $$0) {
      zi.a($$0, this, this.a);
      iu $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dyl $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(aca $$0) {
      zi.a($$0, this, this.a);
      iu $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         $$1x.c($$0.f(), this.G);
         if ($$1x instanceof dxi && this.a.z instanceof fyu) {
            ((fyu)this.a.z).G();
         }
      });
   }

   @Override
   public void a(acp $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      if ($$1.bQ != null && $$1.bQ.l == $$0.b()) {
         $$1.bQ.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afg $$0) {
      zi.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bxc $$2) {
         $$0.e().forEach($$1 -> $$2.a((bwn)$$1.getFirst(), (cyy)$$1.getSecond()));
      }
   }

   @Override
   public void a(acn $$0) {
      zi.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(acb $$0) {
      zi.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abz $$0) {
      zi.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adb $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      adb.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azm.d($$3 + 0.5F);
      if ($$2 == adb.b) {
         $$1.a(wy.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adb.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adb.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adb.e) {
         this.a.r.a(dis.a($$4));
      } else if ($$2 == adb.f) {
         this.a.a(new fxx(true, () -> {
            this.a.t.j.b(new aha(aha.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adb.g) {
         fow $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fwz());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(wy.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(wy.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(wy.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(wy.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adb.h) {
         this.s.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awn.aF, awo.h, 0.18F, 0.45F);
      } else if ($$2 == adb.i) {
         this.s.e($$3);
      } else if ($$2 == adb.j) {
         this.s.c($$3);
      } else if ($$2 == adb.k) {
         this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.vG, awo.g, 1.0F, 1.0F);
      } else if ($$2 == adb.l) {
         this.s.a(lx.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.im, awo.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adb.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adb.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adb.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(gop $$0, gjr $$1, fxs.a $$2) {
      this.U = new gka($$0, $$1, this.a.f);
      this.a.a(new fxs(this.U::b, $$2));
   }

   @Override
   public void a(adm $$0) {
      zi.a($$0, this, this.a);
      exz $$1 = $$0.b();
      eyb $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = eyb.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adh $$0) {
      zi.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agg $$0) {
      zi.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aep $$0) {
      zi.a($$0, this, this.a);
      alg $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ai $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acm $$0) {
      zi.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(ee.a(this.G, this.H)));
   }

   @Override
   public void a(afx $$0) {
      zi.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acl $$0) {
      zi.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agj $$0) {
      zi.a($$0, this, this.a);
      this.D = new gjt($$0.b(), $$0.e());
   }

   @Override
   public void a(aec $$0) {
      zi.a($$0, this, this.a);
      fei $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(aga $$0) {
      zi.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abx $$0) {
      zi.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awu<?>> $$1 = (Entry<awu<?>>)$$4.next();
         awu<?> $$2 = (awu<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fxy $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aeg $$0) {
      zi.a($$0, this, this.a);
      foc $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (aeg.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fuk.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aeh $$0) {
      zi.a($$0, this, this.a);
      foc $$1 = this.a.t.m();

      for (dex $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aei $$0) {
      zi.a($$0, this, this.a);
      foc $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(foc $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof gby $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agi $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 instanceof bxc) {
         je<bvf> $$2 = $$0.e();
         bvh $$3 = new bvh($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bxc)$$1).c($$3, null);
      }
   }

   private <T> jr.a<T> a(alf<? extends jr<? extends T>> $$0, axt.a $$1) {
      jr<T> $$2 = this.G.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(zw $$0) {
      zi.a($$0, this, this.a);
      List<jr.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || jv.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(jr.a::d);
      this.J = dxw.a(this.G, this.H);
      List<cyy> $$3 = List.copyOf(cxq.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(adx $$0) {
   }

   @Override
   public void a(ady $$0) {
   }

   @Override
   public void a(adz $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new fwy($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gf();
         }
      }
   }

   @Override
   public void a(acg $$0) {
      zi.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(aex $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ade $$0) {
      zi.a($$0, this, this.a);
      ebr $$1 = this.s.A_();
      $$1.c($$0.b(), $$0.e());
      long $$2 = $$0.h();
      if ($$2 > 0L) {
         $$1.a($$0.g(), $$0.f(), $$2);
      } else {
         $$1.a($$0.f());
      }

      $$1.a($$0.i());
      $$1.c($$0.k());
      $$1.b($$0.j());
   }

   @Override
   public void a(aes $$0) {
      zi.a($$0, this, this.a);
      this.s.A_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aet $$0) {
      zi.a($$0, this, this.a);
      this.s.A_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeu $$0) {
      zi.a($$0, this, this.a);
      this.s.A_().a($$0.b());
   }

   @Override
   public void a(aew $$0) {
      zi.a($$0, this, this.a);
      this.s.A_().c($$0.b());
   }

   @Override
   public void a(aev $$0) {
      zi.a($$0, this, this.a);
      this.s.A_().b($$0.b());
   }

   @Override
   public void a(ack $$0) {
      zi.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aeq $$0) {
      zi.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gkg::b).ifPresent(this.c::a);
         gkh.b(this.c);
      }
   }

   @Override
   public void a(acs $$0) {
      zi.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aer $$0) {
      zi.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afs $$0) {
      zi.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afq $$0) {
      zi.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(aft $$0) {
      zi.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afz $$0) {
      zi.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aek $$0) {
      zi.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bxc $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aea $$0) {
      zi.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gkd $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aeb $$0) {
      zi.a($$0, this, this.a);

      for (aeb.b $$1 : $$0.f()) {
         gkd $$2 = new gkd(Objects.requireNonNull($$1.b()), this.G());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aeb.b $$3 : $$0.e()) {
         gkd $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aeb.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aeb.a $$0, aeb.b $$1, gkd $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cG().equals($$1.a())) {
               this.a.t.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.v.add($$2);
            } else {
               this.v.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
            break;
         case h:
            $$2.b($$1.g());
            break;
         case g:
            $$2.b($$1.h());
      }
   }

   private void a(aeb.b $$0, gkd $$1) {
      GameProfile $$2 = $$1.a();
      bab $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.G());
      } else {
         xp.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xp $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (crb.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.G());
            }
         } else {
            $$1.a(this.G());
         }
      }
   }

   private boolean G() {
      return this.a.aW() && this.V;
   }

   @Override
   public void a(adv $$0) {
      zi.a($$0, this, this.a);
      cqy $$1 = this.a.t;
      $$1.gj().b = $$0.e();
      $$1.gj().d = $$0.g();
      $$1.gj().a = $$0.b();
      $$1.gj().c = $$0.f();
      $$1.gj().a($$0.h());
      $$1.gj().b($$0.i());
   }

   @Override
   public void a(afv $$0) {
      zi.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afu $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acd $$0) {
      zi.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(acr $$0) {
      zi.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gE().a($$0.b());
      } else {
         this.a.t.gE().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adq $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.a.t.df();
      if ($$1 != this.a.t && $$1.dg()) {
         fei $$2 = $$0.b();
         fei $$3;
         if ($$1.bR()) {
            $$3 = $$1.N_().a();
         } else {
            $$3 = $$1.dt();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bR()) {
               $$1.N_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(ahp.a($$1));
      }
   }

   @Override
   public void a(adr $$0) {
      zi.a($$0, this, this.a);
      cyy $$1 = this.a.t.b($$0.b());
      fyr.a $$2 = fyr.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fyr($$2));
      }
   }

   @Override
   public void a(aai $$0) {
      if ($$0 instanceof aar $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aaq $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof aaw $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof aax $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof aaz $$5) {
         ((gul)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aau $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aas $$7) {
         gto.a $$8 = new gto.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aat $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof aay $$10) {
         guj $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aao $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aaf $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aae $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aap $$15) {
         this.a.l.p.a($$15.b(), this.s.ae());
      } else if ($$0 instanceof aam $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aan) {
         this.a.l.s.a();
      } else if ($$0 instanceof aav $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aak $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aal $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aah $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aai $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afk $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, ffq.c, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fff $$2 = this.Y.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.Y.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afo $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      ffm $$2 = ffm.c($$0.b());
      fff $$3 = this.Y.a($$1);
      if ($$3 != null) {
         ffl $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(ael $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      ffm $$2 = ffm.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fff $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afc $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      fff $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(afn $$0) {
      zi.a($$0, this, this.a);
      afn.a $$1 = $$0.e();
      ffi $$2;
      if ($$1 == afn.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afn.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         $$2.a($$1x.d());
         $$2.a($$1x.e());
         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afn.a $$5 = $$0.b();
      if ($$5 == afn.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == afn.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == afn.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(adi $$0) {
      zi.a($$0, this, this.a);
      if ($$0.m() == 0) {
         double $$1 = (double)($$0.l() * $$0.i());
         double $$2 = (double)($$0.l() * $$0.j());
         double $$3 = (double)($$0.l() * $$0.k());

         try {
            this.s.a($$0.n(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            l.warn("Could not spawn particle effect {}", $$0.n());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.m(); $$5++) {
            double $$6 = this.B.k() * (double)$$0.i();
            double $$7 = this.B.k() * (double)$$0.j();
            double $$8 = this.B.k() * (double)$$0.k();
            double $$9 = this.B.k() * (double)$$0.l();
            double $$10 = this.B.k() * (double)$$0.l();
            double $$11 = this.B.k() * (double)$$0.l();

            try {
               this.s.a($$0.n(), $$0.b(), $$0.e(), $$0.f() + $$6, $$0.g() + $$7, $$0.h() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               l.warn("Could not spawn particle effect {}", $$0.n());
               return;
            }
         }
      }
   }

   @Override
   public void a(agh $$0) {
      zi.a($$0, this, this.a);
      bwd $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bxc)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            byf $$2 = ((bxc)$$1).eZ();

            for (agh.a $$3 : $$0.e()) {
               bye $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (byg $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adu $$0) {
      zi.a($$0, this, this.a);
      cuq $$1 = this.a.t.bQ;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gby $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adj $$0) {
      zi.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adk $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adk $$2, boolean $$3) {
      evv $$4 = this.s.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dje.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dje.b, $$8, $$9, $$10, $$3);
      $$4.a(new dic($$0, $$1), true);
   }

   @Override
   public void a(adn $$0) {
      zi.a($$0, this, this.a);
      cuq $$1 = this.a.t.bQ;
      if ($$0.b() == $$1.l && $$1 instanceof cwb $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aez $$0) {
      zi.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afp $$0) {
      zi.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(aey $$0) {
      zi.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aby $$0) {
      zi.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acf $$0) {
      zi.a($$0, this, this.a);

      for (zf<? super abu> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aef $$0) {
      zi.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof crg $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(aci $$0) {
      this.R.a();
   }

   @Override
   public void a(ach $$0) {
      this.R.a($$0.b());
      this.b(new agz(this.R.b()));
   }

   @Override
   public void a(acu $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajw $$0) {
      this.S.a($$0);
   }

   @Override
   public void a(agd $$0) {
      zi.a($$0, this, this.a);
      if (this.a.z instanceof gaa $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   private void a(int $$0, int $$1, evv $$2, dje $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, jx.a($$0, $$9, $$1), $$10 ? new ecb((byte[])$$6.next().clone()) : new ecb());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vr k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gkd> l() {
      return this.v;
   }

   public Collection<gkd> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gkd a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gkd a(String $$0) {
      for (gkd $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gjm p() {
      return this.w;
   }

   public CommandDispatcher<en> q() {
      return this.C;
   }

   public gjr r() {
      return this.s;
   }

   public fog s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alf<div>> u() {
      return this.F;
   }

   public js.b v() {
      return this.G;
   }

   public void a(xo $$0, boolean $$1) {
      xk $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.H();
      }
   }

   private void H() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new agu($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayj.c.a();
      xg.a $$3 = this.N.b();
      xk $$4 = this.M.pack(new xr($$0, $$1, $$2, $$3.a()));
      this.b(new agx($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xq<en> $$1 = xq.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agv($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayj.c.a();
         xg.a $$4 = this.N.b();
         ep $$5 = ep.a($$1, $$3x -> {
            xr $$4x = new xr($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new agw($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xq.a(this.e($$0))) {
         this.b(new agv($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<en> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(ara $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new zz($$0));
         this.Q = $$0;
      }
   }

   @Override
   public void d() {
      if (this.L != null && this.a.w().b()) {
         this.w();
      }

      if (this.P != null && this.P.isDone()) {
         this.P.join().ifPresent(this::a);
         this.P = null;
      }

      this.e();
      if (this.a.aQ().f()) {
         this.S.a();
      }

      this.T.a();
      this.e.a();
      if (this.U != null) {
         this.U.a();
         if (this.U.b() && !this.a.t.gI()) {
            this.b.a(new ahy());
            this.a.t.v(true);
         }
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(cra $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xj.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new agy(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gkg x() {
      return this.c;
   }

   public cuh y() {
      return this.H;
   }

   public boolean a(cuh $$0) {
      return $$0.a(this.y());
   }

   public ffn z() {
      return this.Y;
   }

   public dat A() {
      return this.I;
   }

   public dxw B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public gkj D() {
      return this.Z;
   }

   public aly E() {
      return this.j;
   }

   public void a(gjk<?, ?> $$0) {
      this.aa.add(new WeakReference<>($$0));
   }
}
