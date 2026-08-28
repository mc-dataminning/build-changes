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

public class ggz extends ggv implements abl, wd {
   private static final Logger l = LogUtils.getLogger();
   private static final wp m = wp.c("multiplayer.unsecureserver.toast.title");
   private static final wp n = wp.c("multiplayer.unsecureserver.toast");
   private static final wp o = wp.c("multiplayer.disconnect.invalid_packet");
   private static final wp p = wp.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private ggy s;
   private ggy.a t;
   private final Map<UUID, ghk> u = Maps.newHashMap();
   private final Set<ghk> v = new ReferenceOpenHashSet();
   private final ggt w;
   private final ghc x;
   private final flv y = new flv(this);
   private int z = 3;
   private int A = 3;
   private final azh B = azh.b();
   private CommandDispatcher<fc> C = new CommandDispatcher();
   private gha D = new gha(Map.of(), dci.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<akt<dgz>> F;
   private final kf.b G;
   private final csn H;
   private final czd I;
   private dvq J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xa L;
   private xj.c M = xj.c.a;
   private wx N = new wx(20);
   private xc O = xc.a();
   @Nullable
   private CompletableFuture<Optional<cpt>> P;
   @Nullable
   private aqn Q;
   private final ggs R = new ggs();
   private final ghj S;
   private final ghe T;
   @Nullable
   private ghh U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final fdc Y = new fdc();
   private final ghq Z = new ghq();

   public ggz(fmg $$0, vi $$1, ghd $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new ggt($$0, this.e);
      this.x = new ghc(this, $$0);
      this.S = new ghj(this, $$0.aQ().m());
      this.T = new ghe(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = czd.a(this.H);
      this.J = dvq.a($$2.c(), this.H);
   }

   public ghc g() {
      return this.x;
   }

   public void h() {
      this.X = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.s = null;
      this.U = null;
   }

   public dbw j() {
      return this.D;
   }

   @Override
   public void a(adc $$0) {
      yz.a($$0, this, this.a);
      this.a.r = new ghi(this.a, this);
      aga $$1 = $$0.m();
      List<akt<dgz>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      akt<dgz> $$3 = $$1.b();
      jr<ebm> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      ggy.a $$8 = new ggy.a(bsv.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new ggy(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fvg.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new awl(), new flr());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cF());
         }
      }

      this.a.l.a();
      this.a.t.z();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new glu(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fvg.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new wx(20);
      this.O = xc.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.F()) {
         frz $$9 = frz.a(this.a, frz.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(abm $$0) {
      yz.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bva $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bva b(abm $$0) {
      bvi<?> $$1 = $$0.f();
      if ($$1 == bvi.bR) {
         ghk $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new glw(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bvh.r);
      }
   }

   private void a(bva $$0) {
      if ($$0 instanceof crq $$1) {
         this.a.ak().a((hjo)(new hjh($$1)));
      } else if ($$0 instanceof chq $$2) {
         boolean $$3 = $$2.Z_();
         hjb $$4;
         if ($$3) {
            $$4 = new hiz($$2);
         } else {
            $$4 = new hja($$2);
         }

         this.a.ak().a((hjp)$$4);
      }
   }

   @Override
   public void a(aew $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aeu $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(acp $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fbx $$2 = $$0.e().a();
         $$1.ap().e($$2);
         if (!$$1.df()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.ds().g($$2) > 4096.0;
            if (this.s.a($$1) && !$$5) {
               $$1.d($$2, $$3, $$4);
            } else {
               $$1.b($$2, $$3, $$4);
            }

            if ($$1.bQ() && $$1.A(this.a.t)) {
               $$1.j(this.a.t);
               this.a.t.bx();
            }

            $$1.d($$0.f());
         }
      }
   }

   @Override
   public void a(aft $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ahe.b(this.a.t.dz(), this.a.t.dB(), this.a.t.dF(), this.a.t.dK(), this.a.t.dM(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bwm.a) || $$0.f().contains(bwm.b) || $$0.f().contains(bwm.c);
         boolean $$3 = this.s.a($$1) || !$$1.df() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.bx();
            if ($$1.df()) {
               this.b.a(ahf.a($$1));
            }
         }
      }
   }

   @Override
   public void a(afu $$0) {
      yz.a($$0, this, this.a);
      if (this.a.s != null) {
         bth $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afv $$0) {
      yz.a($$0, this, this.a);
      if (this.a.s != null) {
         bth $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afa $$0) {
      yz.a($$0, this, this.a);
      if (cpq.d($$0.b())) {
         this.a.t.gl().j = $$0.b();
      }
   }

   @Override
   public void a(adf $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.df()) {
            aih $$2 = $$1.ap();
            fbx $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               aih $$4 = $$1.ap();
               fbx $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$4.e($$5);
               if ($$0.i()) {
                  $$1.d($$5, $$0.g(), $$0.h());
               } else {
                  $$1.d($$5, $$1.dK(), $$1.dM());
               }
            } else if ($$0.i()) {
               $$1.d($$1.ds(), $$0.g(), $$0.h());
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(adg $$0) {
      yz.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof crq $$2) {
         if ($$2.f() instanceof csf $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aee $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aea $$0) {
      yz.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bva $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bva.d.b);
         }
      });
   }

   @Override
   public void a(adu $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      if (!$$1.bY()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new agh($$0.b()));
      this.b.a(new ahe.b($$1.dz(), $$1.dB(), $$1.dF(), $$1.dK(), $$1.dM(), false, false));
   }

   private static boolean a(bwl $$0, Set<bwm> $$1, bva $$2, boolean $$3) {
      bwl $$4 = bwl.a($$2);
      bwl $$5 = bwl.a($$4, $$0, $$1);
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
         bwl $$7 = new bwl($$2.bA(), fbx.c, $$2.N, $$2.O);
         bwl $$8 = bwl.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(adv $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bz();
      this.b.a(new ahe.c($$1.dK(), $$1.dM(), false, false));
   }

   @Override
   public void a(aef $$0) {
      yz.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(acx $$0) {
      yz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adb $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         dzw $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(aca $$0) {
      yz.a($$0, this, this.a);

      for (aca.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (aca.a $$2 : $$0.b()) {
         this.s.a(new dgg($$2.b().h, $$2.b().i));
      }

      for (aca.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.aq(); $$6 <= this.s.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, acw $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dzw $$0, int $$1, int $$2) {
      etl $$3 = this.s.h().q();
      dzx[] $$4 = $$0.d();
      dgg $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dzx $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kk.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.aq(), $$2 - 1, $$1 + 1, this.s.ar(), $$2 + 1);
   }

   @Override
   public void a(acr $$0) {
      yz.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(acr $$0) {
      dgg $$1 = $$0.b();
      this.s.a(() -> {
         etl $$1x = this.s.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kk $$3 = kk.a($$1, $$2);
            $$1x.a(dhi.b, $$3, null);
            $$1x.a(dhi.a, $$3, null);
         }

         for (int $$4 = this.s.aq(); $$4 <= this.s.ar(); $$4++) {
            $$1x.a(kk.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abt $$0) {
      yz.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afn $$0) {
      yz.a($$0, this, this.a);
      this.a.aZ().d();
      this.G();
      fpr.b $$1 = this.a.m.d().k();
      this.a.c(new fyb(p, this.b));
      this.b.a(aba.d, new ggw(this.a, this.b, new ghd(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(agt.a);
      this.b.a(aba.b);
   }

   @Override
   public void a(afs $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      bvy $$2 = (bvy)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bvn) {
            this.s.a($$1.dz(), $$1.dB(), $$1.dF(), awa.jc, awb.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dz(), $$1.dB(), $$1.dF(), awa.of, awb.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gka(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof clw $$3) {
            cxh $$4 = $$3.f();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bva.d.b);
            }
         } else if (!($$1 instanceof bvn)) {
            this.s.a($$0.b(), bva.d.b);
         }
      }
   }

   @Override
   public void a(afp $$0) {
      yz.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adn $$0) {
      yz.a($$0, this, this.a);
      Optional<xi> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         ghk $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            xg $$4 = $$3.b();
            xk $$5;
            if ($$4 != null) {
               $$5 = new xk($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xk.a($$2);
            }

            xf $$7 = new xf($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(acn $$0) {
      yz.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      yz.a($$0, this, this.a);
      Optional<xb> $$1 = $$0.b().a(this.O);
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
   public void a(abn $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bvy $$2 = (bvy)$$1;
            $$2.a(bsx.a);
         } else if ($$0.e() == 3) {
            bvy $$3 = (bvy)$$1;
            $$3.a(bsx.b);
         } else if ($$0.e() == 2) {
            cpr $$4 = (cpr)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lt.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lt.r);
         }
      }
   }

   @Override
   public void a(acu $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(afi $$0) {
      yz.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(aes $$0) {
      yz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afc $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bN();

         for (int $$3 : $$0.b()) {
            bva $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cro) {
                        this.a.t.N = $$1.dK();
                        this.a.t.w($$1.dK());
                        this.a.t.r($$1.dK());
                     }

                     wp $$5 = wp.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aev $$0) {
      yz.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bvw $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cxh a(cpr $$0) {
      for (bsx $$1 : bsx.values()) {
         cxh $$2 = $$0.b($$1);
         if ($$2.b(kv.I)) {
            return $$2;
         }
      }

      return new cxh(cxl.wv);
   }

   @Override
   public void a(aco $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hjo)(new hjg((cmo)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lt.an, 30);
               this.s.a($$1.dz(), $$1.dB(), $$1.dF(), awa.Ax, $$1.dl(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cpr)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hjo)(new hjk((ckj)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(ack $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(aez $$0) {
      yz.a($$0, this, this.a);
      this.a.t.K($$0.b());
      this.a.t.gw().a($$0.e());
      this.a.t.gw().b($$0.f());
   }

   @Override
   public void a(aey $$0) {
      yz.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aed $$0) {
      yz.a($$0, this, this.a);
      aga $$1 = $$0.b();
      akt<dgz> $$2 = $$1.b();
      jr<ebm> $$3 = $$1.a();
      glv $$4 = this.a.t;
      akt<dgz> $$5 = $$4.dU().aj();
      boolean $$6 = $$2 != $$5;
      fvg.a $$7 = this.a($$4.eF(), $$2, $$5);
      if ($$6) {
         Map<evo, evq> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         ggy.a $$12 = new ggy.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new ggy(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.go()) {
         $$4.p();
      }

      glv $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m(), $$4.cc(), $$4.ci());
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
         List<akb.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.i($$4.dx());
         $$13.w($$4.dK());
         $$13.x($$4.dM());
      } else {
         $$13.z();
         $$13.w(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.eY().a($$4.eY());
      } else {
         $$13.eY().b($$4.eY());
      }

      this.s.d($$13);
      $$13.k = new glu(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gC());
      $$13.b($$4.n());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cv = $$4.cv;
      $$13.cw = $$4.cw;
      if (this.a.z instanceof fum || this.a.z instanceof fum.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fvg.a a(boolean $$0, akt<dgz> $$1, akt<dgz> $$2) {
      fvg.a $$3 = fvg.a.c;
      if (!$$0) {
         if ($$1 == dgz.j || $$2 == dgz.j) {
            $$3 = fvg.a.a;
         } else if ($$1 == dgz.k || $$2 == dgz.k) {
            $$3 = fvg.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acq $$0) {
      yz.a($$0, this, this.a);
      fbx $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awb.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(act $$0) {
      yz.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof cjw $$2) {
         glv $$3 = this.a.t;
         int $$4 = $$0.e();
         btf $$5 = new btf(cjw.v($$4));
         cty $$6 = new cty($$0.b(), $$3.gl(), $$5, $$2, $$4);
         $$3.bQ = $$6;
         this.a.a(new fwx($$6, $$3.gl(), $$2, $$4));
      }
   }

   @Override
   public void a(adj $$0) {
      yz.a($$0, this, this.a);
      fuz.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ach $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      cxh $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fwn $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (ctz.e($$3) && !$$2.f()) {
            cxh $$7 = $$1.bP.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bP.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bQ.l && ($$0.b() != 0 || !$$5)) {
         $$1.bQ.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fwn) {
         $$1.bP.a($$3, $$2);
         $$1.bP.d();
      }
   }

   @Override
   public void a(aer $$0) {
      yz.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fwn)) {
         this.a.t.bQ.b($$0.b());
      }
   }

   @Override
   public void a(afd $$0) {
      yz.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gl().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acf $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bP.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bQ.l) {
         $$1.bQ.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adk $$0) {
      yz.a($$0, this, this.a);
      ji $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dwf $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(abr $$0) {
      yz.a($$0, this, this.a);
      ji $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         tq $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dvc && this.a.z instanceof fwi) {
            ((fwi)this.a.z).G();
         }
      });
   }

   @Override
   public void a(acg $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      if ($$1.bQ != null && $$1.bQ.l == $$0.b()) {
         $$1.bQ.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aex $$0) {
      yz.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bvy $$2) {
         $$0.e().forEach($$1 -> $$2.a((bvj)$$1.getFirst(), (cxh)$$1.getSecond()));
      }
   }

   @Override
   public void a(ace $$0) {
      yz.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(abs $$0) {
      yz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abq $$0) {
      yz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acs $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      acs.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayz.d($$3 + 0.5F);
      if ($$2 == acs.b) {
         $$1.a(wp.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acs.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == acs.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == acs.e) {
         this.a.r.a(dgw.a($$4));
      } else if ($$2 == acs.f) {
         this.a.a(new fvl(true, () -> {
            this.a.t.j.b(new agq(agq.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == acs.g) {
         fmk $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fun());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(wp.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(wp.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(wp.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(wp.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == acs.h) {
         this.s.a($$1, $$1.dz(), $$1.dD(), $$1.dF(), awa.aF, awb.h, 0.18F, 0.45F);
      } else if ($$2 == acs.i) {
         this.s.e($$3);
      } else if ($$2 == acs.j) {
         this.s.c($$3);
      } else if ($$2 == acs.k) {
         this.s.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), awa.vF, awb.g, 1.0F, 1.0F);
      } else if ($$2 == acs.l) {
         this.s.a(lt.q, $$1.dz(), $$1.dB(), $$1.dF(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), awa.il, awb.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acs.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == acs.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == acs.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(glv $$0, ggy $$1, fvg.a $$2) {
      this.U = new ghh($$0, $$1, this.a.f);
      this.a.a(new fvg(this.U::b, $$2));
   }

   @Override
   public void a(add $$0) {
      yz.a($$0, this, this.a);
      evo $$1 = $$0.b();
      evq $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = evq.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(acy $$0) {
      yz.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afw $$0) {
      yz.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aeg $$0) {
      yz.a($$0, this, this.a);
      aku $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ai $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acd $$0) {
      yz.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(et.a(this.G, this.H)));
   }

   @Override
   public void a(afo $$0) {
      yz.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      yz.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(afz $$0) {
      yz.a($$0, this, this.a);
      this.D = new gha($$0.b(), $$0.e());
   }

   @Override
   public void a(adt $$0) {
      yz.a($$0, this, this.a);
      fbx $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afr $$0) {
      yz.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abo $$0) {
      yz.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awh<?>> $$1 = (Entry<awh<?>>)$$4.next();
         awh<?> $$2 = (awh<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fvm $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(adx $$0) {
      yz.a($$0, this, this.a);
      flr $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (adx.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fry.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(ady $$0) {
      yz.a($$0, this, this.a);
      flr $$1 = this.a.t.m();

      for (ddd $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(adz $$0) {
      yz.a($$0, this, this.a);
      flr $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(flr $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof fzk $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(afy $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 instanceof bvy) {
         jr<buc> $$2 = $$0.e();
         bue $$3 = new bue($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.l();
         }

         ((bvy)$$1).c($$3, null);
      }
   }

   private <T> ke.a<T> a(akt<? extends ke<? extends T>> $$0, axh.a $$1) {
      ke<T> $$2 = this.G.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(zn $$0) {
      yz.a($$0, this, this.a);
      List<ke.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || ki.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(ke.a::d);
      this.J = dvq.a(this.G, this.H);
      List<cxh> $$3 = List.copyOf(cvy.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(ado $$0) {
   }

   @Override
   public void a(adp $$0) {
   }

   @Override
   public void a(adq $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new fum($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gi();
         }
      }
   }

   @Override
   public void a(abx $$0) {
      yz.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(aeo $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(acv $$0) {
      yz.a($$0, this, this.a);
      dzh $$1 = this.s.A_();
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
   public void a(aej $$0) {
      yz.a($$0, this, this.a);
      this.s.A_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aek $$0) {
      yz.a($$0, this, this.a);
      this.s.A_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ael $$0) {
      yz.a($$0, this, this.a);
      this.s.A_().a($$0.b());
   }

   @Override
   public void a(aen $$0) {
      yz.a($$0, this, this.a);
      this.s.A_().c($$0.b());
   }

   @Override
   public void a(aem $$0) {
      yz.a($$0, this, this.a);
      this.s.A_().b($$0.b());
   }

   @Override
   public void a(acb $$0) {
      yz.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aeh $$0) {
      yz.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(ghn::b).ifPresent(this.c::a);
         gho.b(this.c);
      }
   }

   @Override
   public void a(acj $$0) {
      yz.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aei $$0) {
      yz.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afj $$0) {
      yz.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afh $$0) {
      yz.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afk $$0) {
      yz.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afq $$0) {
      yz.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeb $$0) {
      yz.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bvy $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adr $$0) {
      yz.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         ghk $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(ads $$0) {
      yz.a($$0, this, this.a);

      for (ads.b $$1 : $$0.f()) {
         ghk $$2 = new ghk(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (ads.b $$3 : $$0.e()) {
         ghk $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (ads.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(ads.a $$0, ads.b $$1, ghk $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cF().equals($$1.a())) {
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

   private void a(ads.b $$0, ghk $$1) {
      GameProfile $$2 = $$1.a();
      azm $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         xg.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xg $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cpu.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aW() && this.V;
   }

   @Override
   public void a(adm $$0) {
      yz.a($$0, this, this.a);
      cpr $$1 = this.a.t;
      $$1.gm().b = $$0.e();
      $$1.gm().d = $$0.g();
      $$1.gm().a = $$0.b();
      $$1.gm().c = $$0.f();
      $$1.gm().a($$0.h());
      $$1.gm().b($$0.i());
   }

   @Override
   public void a(afm $$0) {
      yz.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afl $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(abu $$0) {
      yz.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(aci $$0) {
      yz.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gH().a($$0.b());
      } else {
         this.a.t.gH().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adh $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.a.t.de();
      if ($$1 != this.a.t && $$1.df()) {
         fbx $$2 = $$0.b();
         fbx $$3;
         if ($$1.bQ()) {
            $$3 = $$1.N_().a();
         } else {
            $$3 = $$1.ds();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bQ()) {
               $$1.N_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(ahf.a($$1));
      }
   }

   @Override
   public void a(adi $$0) {
      yz.a($$0, this, this.a);
      cxh $$1 = this.a.t.b($$0.b());
      fwf.a $$2 = fwf.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fwf($$2));
      }
   }

   @Override
   public void a(zz $$0) {
      if ($$0 instanceof aai $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aah $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof aan $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof aao $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof aaq $$5) {
         ((grp)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aal $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aaj $$7) {
         gqs.a $$8 = new gqs.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aak $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof aap $$10) {
         grn $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aaf $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof zw $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof zv $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aag $$15) {
         this.a.l.p.a($$15.b(), this.s.ae());
      } else if ($$0 instanceof aad $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aae) {
         this.a.l.s.a();
      } else if ($$0 instanceof aam $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aab $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aac $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof zy $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(zz $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afb $$0) {
      yz.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, fdf.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fcu $$2 = this.Y.a($$1);
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
   public void a(aff $$0) {
      yz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdb $$2 = fdb.c($$0.b());
      fcu $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fda $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aec $$0) {
      yz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdb $$2 = fdb.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fcu $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aet $$0) {
      yz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fcu $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(afe $$0) {
      yz.a($$0, this, this.a);
      afe.a $$1 = $$0.e();
      fcx $$2;
      if ($$1 == afe.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afe.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fde.b $$2x = fde.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fde.a $$3x = fde.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afe.a $$5 = $$0.b();
      if ($$5 == afe.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == afe.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == afe.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(acz $$0) {
      yz.a($$0, this, this.a);
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
   public void a(afx $$0) {
      yz.a($$0, this, this.a);
      bva $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bvy)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bxd $$2 = ((bvy)$$1).eY();

            for (afx.a $$3 : $$0.e()) {
               bxc $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bxe $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adl $$0) {
      yz.a($$0, this, this.a);
      csw $$1 = this.a.t.bQ;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof fzk $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(ada $$0) {
      yz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adb $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adb $$2, boolean $$3) {
      etl $$4 = this.s.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dhi.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dhi.b, $$8, $$9, $$10, $$3);
      $$4.a(new dgg($$0, $$1), true);
   }

   @Override
   public void a(ade $$0) {
      yz.a($$0, this, this.a);
      csw $$1 = this.a.t.bQ;
      if ($$0.b() == $$1.l && $$1 instanceof cuh $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aeq $$0) {
      yz.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afg $$0) {
      yz.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(aep $$0) {
      yz.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abp $$0) {
      yz.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(abw $$0) {
      yz.a($$0, this, this.a);

      for (yw<? super abl> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(adw $$0) {
      yz.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cpz $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(abz $$0) {
      this.R.a();
   }

   @Override
   public void a(aby $$0) {
      this.R.a($$0.b());
      this.b(new agp(this.R.b()));
   }

   @Override
   public void a(acl $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajk $$0) {
      this.S.a($$0);
   }

   private void a(int $$0, int $$1, etl $$2, dhi $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kk.a($$0, $$9, $$1), $$10 ? new dzr((byte[])$$6.next().clone()) : new dzr());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vi k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<ghk> l() {
      return this.v;
   }

   public Collection<ghk> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public ghk a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public ghk a(String $$0) {
      for (ghk $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public ggt p() {
      return this.w;
   }

   public CommandDispatcher<fc> q() {
      return this.C;
   }

   public ggy r() {
      return this.s;
   }

   public flv s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<akt<dgz>> u() {
      return this.F;
   }

   public kf.b v() {
      return this.G;
   }

   public void a(xf $$0, boolean $$1) {
      xb $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new agk($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axx.c.a();
      wx.a $$3 = this.N.b();
      xb $$4 = this.M.pack(new xi($$0, $$1, $$2, $$3.a()));
      this.b(new agn($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xh<fc> $$1 = xh.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agl($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axx.c.a();
         wx.a $$4 = this.N.b();
         fe $$5 = fe.a($$1, $$3x -> {
            xi $$4x = new xi($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new agm($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xh.a(this.e($$0))) {
         this.b(new agl($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fc> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqn $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new zq($$0));
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
         if (this.U.b() && !this.a.t.gL()) {
            this.b.a(new aho());
            this.a.t.v(true);
         }
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(cpt $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xa.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new ago(this.L.a().a()));
         }
      }
   }

   @Nullable
   public ghn x() {
      return this.c;
   }

   public csn y() {
      return this.H;
   }

   public boolean a(csn $$0) {
      return $$0.a(this.y());
   }

   public fdc z() {
      return this.Y;
   }

   public czd A() {
      return this.I;
   }

   public dvq B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public ghq D() {
      return this.Z;
   }

   public alm E() {
      return this.j;
   }
}
