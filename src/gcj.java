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
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcj extends gcf implements ace, ww {
   private static final Logger l = LogUtils.getLogger();
   private static final xi m = xi.c("multiplayer.unsecureserver.toast.title");
   private static final xi n = xi.c("multiplayer.unsecureserver.toast");
   private static final xi o = xi.c("multiplayer.disconnect.invalid_packet");
   private static final xi p = xi.c("connect.reconfiguring");
   private static final int q = 64;
   private final GameProfile r;
   private gci s;
   private gci.a t;
   private final Map<UUID, gct> u = Maps.newHashMap();
   private final Set<gct> v = new ReferenceOpenHashSet();
   private final gcd w;
   private final gcl x;
   private final fix y = new fix(this);
   private int z = 3;
   private int A = 3;
   private final azs B = azs.b();
   private CommandDispatcher<fb> C = new CommandDispatcher();
   private final dat D;
   private final UUID E = UUID.randomUUID();
   private Set<alh<dfb>> F;
   private final ke.b G;
   private final crf H;
   private final cxz I;
   private dtj J;
   @Nullable
   private xt K;
   private yc.c L = yc.c.a;
   private xq M = new xq(20);
   private xv N = xv.a();
   @Nullable
   private CompletableFuture<Optional<cop>> O;
   @Nullable
   private aqz P;
   private final gcc Q = new gcc();
   private final gcs R;
   private final gcn S;
   @Nullable
   private gcq T;
   private boolean U;
   private boolean V = false;
   private volatile boolean W;
   private final fas X = new fas();
   private final gcz Y = new gcz();

   public gcj(fji $$0, wc $$1, gcm $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gcd($$0, this.e);
      this.x = new gcl(this, $$0);
      this.R = new gcs(this, $$0.aQ().m());
      this.D = new dat(this.G);
      this.S = new gcn(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = cxz.a(this.H);
      this.J = dtj.a($$2.c(), this.H);
   }

   public gcl g() {
      return this.x;
   }

   public void h() {
      this.W = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.s = null;
      this.T = null;
   }

   public dat j() {
      return this.D;
   }

   @Override
   public void a(adv $$0) {
      zs.a($$0, this, this.a);
      this.a.r = new gcr(this.a, this);
      agq $$1 = $$0.m();
      List<alh<dfb>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alh<dfb> $$3 = $$1.b();
      jq<dzf> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gci.a $$8 = new gci.a(this.H, bsa.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gci(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fqy.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new aww(), new fit());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cH());
         }
      }

      this.a.l.a();
      this.a.t.y();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new ghc(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fqy.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.K = null;
      this.M = new xq(20);
      this.N = xv.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.U = $$0.n();
      if (this.c != null && !this.V && !this.F()) {
         fnq $$9 = fnq.a(this.a, fnq.a.k, m, n);
         this.a.aA().a($$9);
         this.V = true;
      }
   }

   @Override
   public void a(acf $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bue b(acf $$0) {
      bul<?> $$1 = $$0.f();
      if ($$1 == bul.by) {
         gct $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new ghe(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, buk.r);
      }
   }

   private void a(bue $$0) {
      if ($$0 instanceof cqk $$1) {
         this.a.ak().a((hca)(new hbt($$1)));
      } else if ($$0 instanceof cgs $$2) {
         boolean $$3 = $$2.ae_();
         hbn $$4;
         if ($$3) {
            $$4 = new hbl($$2);
         } else {
            $$4 = new hbm($$2);
         }

         this.a.ak().a((hcb)$$4);
      }
   }

   @Override
   public void a(acg $$0) {
      zs.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bue $$4 = new buq(this.s, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.s.d($$4);
   }

   @Override
   public void a(afm $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afk $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.aw().a($$0.e());
      }
   }

   @Override
   public void a(agj $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.dj()) {
            float $$5 = $$0.h();
            float $$6 = $$0.i();
            if (this.s.a($$1)) {
               $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            } else {
               $$1.b($$2, $$3, $$4, $$5, $$6);
            }

            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(agk $$0) {
      zs.a($$0, this, this.a);
      if (this.a.s != null) {
         bsm $$1 = this.a.s.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agl $$0) {
      zs.a($$0, this, this.a);
      if (this.a.s != null) {
         bsm $$1 = this.a.s.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afq $$0) {
      zs.a($$0, this, this.a);
      if (col.d($$0.b())) {
         this.a.t.gk().j = $$0.b();
      }
   }

   @Override
   public void a(ady $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if (!$$1.dj()) {
            if ($$0.j()) {
               aiv $$2 = $$1.aq();
               ezn $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? $$0.g() : $$1.f_();
               float $$5 = $$0.i() ? $$0.h() : $$1.Q_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               $$1.a($$1.d_(), $$1.e_(), $$1.P_(), $$0.g(), $$0.h(), 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(adz $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = $$0.a(this.s);
      if ($$1 instanceof cqk $$2) {
         if (!$$1.dj() && $$2.m() instanceof cqy $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aeu $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aeq $$0) {
      zs.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.s.a($$0x, bue.c.b));
   }

   @Override
   public void a(aen $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      bvn $$2 = bvn.a($$1);
      bvn $$3 = bvn.a($$0);
      bvn $$4 = bvn.a($$2, $$3, $$0.i());
      $$1.b($$4.a());
      $$1.h($$4.b());
      $$1.v($$4.c());
      $$1.w($$4.d());
      bvn $$5 = new bvn($$1.bD(), $$1.dA(), $$1.O, $$1.P);
      bvn $$6 = bvn.a($$5, $$3, $$0.i());
      $$1.c($$6.a(), $$6.c(), $$6.d());
      this.b.a(new agx($$0.b()));
      this.b.a(new ahu.b($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP(), false, false));
   }

   @Override
   public void a(aev $$0) {
      zs.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adq $$0) {
      zs.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adu $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         dxp $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acu $$0) {
      zs.a($$0, this, this.a);

      for (acu.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().g, $$1.b().h, $$1.a());
      }

      for (acu.a $$2 : $$0.b()) {
         this.s.a(new deh($$2.b().g, $$2.b().h));
      }

      for (acu.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.an(); $$6 <= this.s.ao(); $$6++) {
                  this.a.f.b($$3.b().g + $$4, $$6, $$3.b().h + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adp $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dxp $$0, int $$1, int $$2) {
      eqz $$3 = this.s.h().p();
      dxq[] $$4 = $$0.d();
      deh $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dxq $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kj.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.an(), $$2 - 1, $$1 + 1, this.s.ao(), $$2 + 1);
   }

   @Override
   public void a(adk $$0) {
      zs.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(adk $$0) {
      deh $$1 = $$0.b();
      this.s.a(() -> {
         eqz $$1x = this.s.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kj $$3 = kj.a($$1, $$2);
            $$1x.a(dfk.b, $$3, null);
            $$1x.a(dfk.a, $$3, null);
         }

         for (int $$4 = this.s.an(); $$4 <= this.s.ao(); $$4++) {
            $$1x.a(kj.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zs.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agd $$0) {
      zs.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      fli.b $$1 = this.a.m.d().k();
      this.a.c(new fts(p, this.b));
      this.b.a(abt.d, new gcg(this.a, this.b, new gcm(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.i, $$1, this.h, this.j, this.k)));
      this.b(ahj.a);
      this.b.a(abt.b);
   }

   @Override
   public void a(agi $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      bva $$2 = (bva)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof buq) {
            this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awl.iI, awm.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awl.nB, awm.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gfj(this.a.aq(), this.a.aR(), this.s, $$1, $$2));
         if ($$1 instanceof ckv $$3) {
            cwb $$4 = $$3.m();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bue.c.b);
            }
         } else if (!($$1 instanceof buq)) {
            this.s.a($$0.b(), bue.c.b);
         }
      }
   }

   @Override
   public void a(agf $$0) {
      zs.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeg $$0) {
      zs.a($$0, this, this.a);
      Optional<yb> $$1 = $$0.g().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gct $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            xz $$4 = $$3.b();
            yd $$5;
            if ($$4 != null) {
               $$5 = new yd($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yd.a($$2);
            }

            xy $$7 = new xy($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.ba().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.ba().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zs.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adg $$0) {
      zs.a($$0, this, this.a);
      Optional<xu> $$1 = $$0.b().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.M.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(ach $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bva $$2 = (bva)$$1;
            $$2.a(bsc.a);
         } else if ($$0.e() == 3) {
            bva $$3 = (bva)$$1;
            $$3.a(bsc.b);
         } else if ($$0.e() == 2) {
            com $$4 = (com)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lr.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lr.r);
         }
      }
   }

   @Override
   public void a(adn $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(afy $$0) {
      zs.a($$0, this, this.a);
      this.a.s.b($$0.b());
      this.a.s.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afi $$0) {
      zs.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afs $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bQ();

         for (int $$3 : $$0.b()) {
            bue $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cqm) {
                     this.a.t.O = $$1.dN();
                     this.a.t.v($$1.dN());
                     this.a.t.q($$1.dN());
                  }

                  xi $$5 = xi.a("mount.onboard", this.a.n.A.k());
                  this.a.m.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afl $$0) {
      zs.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof buy $$2) {
         $$2.h_($$0.e());
      }
   }

   private static cwb a(com $$0) {
      for (bsc $$1 : bsc.values()) {
         cwb $$2 = $$0.b($$1);
         if ($$2.b(ku.H)) {
            return $$2;
         }
      }

      return new cwb(cwf.vv);
   }

   @Override
   public void a(adi $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hca)(new hbs((cln)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lr.ak, 30);
               this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awl.zD, $$1.dn(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((com)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hca)(new hbw((cji)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(ade $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afp $$0) {
      zs.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gu().a($$0.e());
      this.a.t.gu().b($$0.f());
   }

   @Override
   public void a(afo $$0) {
      zs.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aet $$0) {
      zs.a($$0, this, this.a);
      agq $$1 = $$0.b();
      alh<dfb> $$2 = $$1.b();
      jq<dzf> $$3 = $$1.a();
      ghd $$4 = this.a.t;
      alh<dfb> $$5 = $$4.dX().ag();
      boolean $$6 = $$2 != $$5;
      fqy.a $$7 = this.a($$4.eH(), $$2, $$5);
      if ($$6) {
         Map<etc, ete> $$8 = this.s.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gci.a $$12 = new gci.a(this.H, this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gci(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gm()) {
         $$4.s();
      }

      ghd $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j(), $$4.ce(), $$4.ck());
      } else {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.as());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akp.c<?>> $$15 = $$4.aw().c();
         if ($$15 != null) {
            $$13.aw().a($$15);
         }

         $$13.h($$4.dA());
         $$13.v($$4.dN());
         $$13.w($$4.dP());
      } else {
         $$13.y();
         $$13.v(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.fa().a($$4.fa());
      } else {
         $$13.fa().b($$4.fa());
      }

      this.s.d($$13);
      $$13.k = new ghc(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gA());
      $$13.b($$4.m());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cF = $$4.cF;
      $$13.cG = $$4.cG;
      if (this.a.z instanceof fqe || this.a.z instanceof fqe.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fqy.a a(boolean $$0, alh<dfb> $$1, alh<dfb> $$2) {
      fqy.a $$3 = fqy.a.c;
      if (!$$0) {
         if ($$1 == dfb.j || $$2 == dfb.j) {
            $$3 = fqy.a.a;
         } else if ($$1 == dfb.k || $$2 == dfb.k) {
            $$3 = fqy.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adj $$0) {
      zs.a($$0, this, this.a);
      ezn $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awm.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adm $$0) {
      zs.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof civ $$2) {
         ghd $$3 = this.a.t;
         int $$4 = $$0.e();
         bsk $$5 = new bsk(civ.w($$4));
         csq $$6 = new csq($$0.b(), $$3.gk(), $$5, $$2, $$4);
         $$3.cd = $$6;
         this.a.a(new fso($$6, $$3.gk(), $$2, $$4));
      }
   }

   @Override
   public void a(aec $$0) {
      zs.a($$0, this, this.a);
      fqr.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adb $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      cwb $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fse $$4) {
         $$5 = !$$4.F();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0 && csr.e($$3)) {
         if (!$$2.f()) {
            cwb $$7 = $$1.cc.b($$3).g();
            if ($$7.f() || $$7.L() < $$2.L()) {
               $$2.d(5);
            }
         }

         $$1.cc.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cd.l && ($$0.b() != 0 || !$$5)) {
         $$1.cd.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fse) {
         $$1.cc.d();
      }
   }

   @Override
   public void a(afh $$0) {
      zs.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fse)) {
         this.a.t.cd.b($$0.b());
      }
   }

   @Override
   public void a(aft $$0) {
      zs.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gk().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.l) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aed $$0) {
      zs.a($$0, this, this.a);
      jh $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dty $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(acl $$0) {
      zs.a($$0, this, this.a);
      jh $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         uk $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dsw && this.a.z instanceof frz) {
            ((frz)this.a.z).F();
         }
      });
   }

   @Override
   public void a(ada $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      if ($$1.cd != null && $$1.cd.l == $$0.b()) {
         $$1.cd.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afn $$0) {
      zs.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bva $$2) {
         $$0.e().forEach($$1 -> $$2.a((bum)$$1.getFirst(), (cwb)$$1.getSecond()));
      }
   }

   @Override
   public void a(acy $$0) {
      zs.a($$0, this, this.a);
      this.a.t.d();
   }

   @Override
   public void a(acm $$0) {
      zs.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ack $$0) {
      zs.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adl $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      adl.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azk.d($$3 + 0.5F);
      if ($$2 == adl.b) {
         $$1.a(xi.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adl.c) {
         this.s.j().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adl.d) {
         this.s.j().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adl.e) {
         this.a.r.a(dey.a($$4));
      } else if ($$2 == adl.f) {
         this.a.a(new frd(true, () -> {
            this.a.t.j.b(new ahg(ahg.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adl.g) {
         fjm $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fqf());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xi.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xi.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xi.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xi.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adl.h) {
         this.s.a($$1, $$1.dC(), $$1.dG(), $$1.dI(), awl.aF, awm.h, 0.18F, 0.45F);
      } else if ($$2 == adl.i) {
         this.s.e($$3);
      } else if ($$2 == adl.j) {
         this.s.c($$3);
      } else if ($$2 == adl.k) {
         this.s.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awl.uU, awm.g, 1.0F, 1.0F);
      } else if ($$2 == adl.l) {
         this.s.a(lr.q, $$1.dC(), $$1.dE(), $$1.dI(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awl.hR, awm.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adl.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adl.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adl.o && this.T != null) {
         this.T.c();
      }
   }

   private void a(ghd $$0, gci $$1, fqy.a $$2) {
      this.T = new gcq($$0, $$1, this.a.f);
      this.a.a(new fqy(this.T::b, $$2));
   }

   @Override
   public void a(adw $$0) {
      zs.a($$0, this, this.a);
      etc $$1 = $$0.b();
      ete $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = ete.a($$0.e(), $$0.f(), this.a.s.ag());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adr $$0) {
      zs.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agm $$0) {
      zs.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aew $$0) {
      zs.a($$0, this, this.a);
      ali $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ah $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acx $$0) {
      zs.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(es.a(this.G, this.H)));
   }

   @Override
   public void a(age $$0) {
      zs.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      zs.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agp $$0) {
      zs.a($$0, this, this.a);
      this.D.a($$0.b());
      fit $$1 = this.a.t.j();
      $$1.a(this.D.d(), this.a.s.H_());
      this.Y.a($$1, this.G);
   }

   @Override
   public void a(aem $$0) {
      zs.a($$0, this, this.a);
      ezn $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agh $$0) {
      zs.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aci $$0) {
      zs.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<aws<?>> $$1 = (Entry<aws<?>>)$$4.next();
         aws<?> $$2 = (aws<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.i().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fre $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aep $$0) {
      zs.a($$0, this, this.a);
      fit $$1 = this.a.t.j();
      $$1.a($$0.f());
      aep.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (ali $$3 : $$0.b()) {
               this.D.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ali $$4 : $$0.b()) {
               this.D.a($$4).ifPresent($$1::a);
            }

            for (ali $$5 : $$0.e()) {
               this.D.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ali $$6 : $$0.b()) {
               this.D.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fnp.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fvc) {
         ((fvc)this.a.z).F();
      }
   }

   @Override
   public void a(ago $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 instanceof bva) {
         jq<bth> $$2 = $$0.e();
         btj $$3 = new btj($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bva)$$1).c($$3, null);
      }
   }

   private <T> kd.a<T> a(alh<? extends kd<? extends T>> $$0, axs.a $$1) {
      kd<T> $$2 = this.G.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aag $$0) {
      zs.a($$0, this, this.a);
      List<kd.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kh.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kd.a::c);
      this.J = dtj.a(this.G, this.H);
      List<cwb> $$3 = List.copyOf(cur.e().l());
      this.Y.a($$3);
   }

   @Override
   public void a(aeh $$0) {
   }

   @Override
   public void a(aei $$0) {
   }

   @Override
   public void a(aej $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.m()) {
            this.a.a(new fqe($$0.e(), this.s.j().l()));
         } else {
            this.a.t.gi();
         }
      }
   }

   @Override
   public void a(acr $$0) {
      zs.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(afe $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ado $$0) {
      zs.a($$0, this, this.a);
      dxa $$1 = this.s.C_();
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
   public void a(aez $$0) {
      zs.a($$0, this, this.a);
      this.s.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afa $$0) {
      zs.a($$0, this, this.a);
      this.s.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afb $$0) {
      zs.a($$0, this, this.a);
      this.s.C_().a($$0.b());
   }

   @Override
   public void a(afd $$0) {
      zs.a($$0, this, this.a);
      this.s.C_().c($$0.b());
   }

   @Override
   public void a(afc $$0) {
      zs.a($$0, this, this.a);
      this.s.C_().b($$0.b());
   }

   @Override
   public void a(acv $$0) {
      zs.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aex $$0) {
      zs.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gcw::b).ifPresent(this.c::a);
         gcx.b(this.c);
      }
   }

   @Override
   public void a(add $$0) {
      zs.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aey $$0) {
      zs.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afz $$0) {
      zs.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zs.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(aga $$0) {
      zs.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agg $$0) {
      zs.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aer $$0) {
      zs.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bva $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aek $$0) {
      zs.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gct $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(ael $$0) {
      zs.a($$0, this, this.a);

      for (ael.b $$1 : $$0.f()) {
         gct $$2 = new gct(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (ael.b $$3 : $$0.e()) {
         gct $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (ael.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(ael.a $$0, ael.b $$1, gct $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cH().equals($$1.a())) {
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
         case g:
            $$2.b($$1.g());
      }
   }

   private void a(ael.b $$0, gct $$1) {
      GameProfile $$2 = $$1.a();
      azx $$3 = this.a.aW();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         xz.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               xz $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (coq.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aX() && this.U;
   }

   @Override
   public void a(aef $$0) {
      zs.a($$0, this, this.a);
      com $$1 = this.a.t;
      $$1.gl().b = $$0.e();
      $$1.gl().d = $$0.g();
      $$1.gl().a = $$0.b();
      $$1.gl().c = $$0.f();
      $$1.gl().a($$0.h());
      $$1.gl().b($$0.i());
   }

   @Override
   public void a(agc $$0) {
      zs.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agb $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aco $$0) {
      zs.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(adc $$0) {
      zs.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gF().a($$0.b());
      } else {
         this.a.t.gF().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aea $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.a.t.dh();
      if ($$1 != this.a.t && $$1.dj()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahv($$1));
      }
   }

   @Override
   public void a(aeb $$0) {
      zs.a($$0, this, this.a);
      cwb $$1 = this.a.t.b($$0.b());
      frw.a $$2 = frw.a.a($$1);
      if ($$2 != null) {
         this.a.a(new frw($$2));
      }
   }

   @Override
   public void a(aas $$0) {
      if ($$0 instanceof abb $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aba $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abg $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abh $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abj $$5) {
         ((gmy)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abe $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abc $$7) {
         gmb.a $$8 = new gmb.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abd $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abi $$10) {
         gmw $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aay $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aap $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aao $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aaz $$15) {
         this.a.l.p.a($$15.b(), this.s.aa());
      } else if ($$0 instanceof aaw $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aax) {
         this.a.l.s.a();
      } else if ($$0 instanceof abf $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aau $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aav $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aar $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aas $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afr $$0) {
      zs.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.X.a($$1, fav.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fak $$2 = this.X.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.X.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afv $$0) {
      zs.a($$0, this, this.a);
      String $$1 = $$0.e();
      far $$2 = far.c($$0.b());
      fak $$3 = this.X.a($$1);
      if ($$3 != null) {
         faq $$4 = this.X.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aes $$0) {
      zs.a($$0, this, this.a);
      String $$1 = $$0.e();
      far $$2 = far.c($$0.b());
      if ($$1 == null) {
         this.X.b($$2);
      } else {
         fak $$3 = this.X.a($$1);
         if ($$3 != null) {
            this.X.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afj $$0) {
      zs.a($$0, this, this.a);
      String $$1 = $$0.e();
      fak $$2 = $$1 == null ? null : this.X.a($$1);
      this.X.a($$0.b(), $$2);
   }

   @Override
   public void a(afu $$0) {
      zs.a($$0, this, this.a);
      afu.a $$1 = $$0.e();
      fan $$2;
      if ($$1 == afu.a.a) {
         $$2 = this.X.c($$0.f());
      } else {
         $$2 = this.X.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afu.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fau.b $$2x = fau.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fau.a $$3x = fau.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afu.a $$5 = $$0.b();
      if ($$5 == afu.a.a) {
         for (String $$6 : $$0.g()) {
            this.X.a($$6, $$2);
         }
      } else if ($$5 == afu.a.b) {
         for (String $$7 : $$0.g()) {
            this.X.b($$7, $$2);
         }
      }

      if ($$1 == afu.a.b) {
         this.X.d($$2);
      }
   }

   @Override
   public void a(ads $$0) {
      zs.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.s.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            l.warn("Could not spawn particle effect {}", $$0.m());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.l(); $$5++) {
            double $$6 = this.B.k() * (double)$$0.h();
            double $$7 = this.B.k() * (double)$$0.i();
            double $$8 = this.B.k() * (double)$$0.j();
            double $$9 = this.B.k() * (double)$$0.k();
            double $$10 = this.B.k() * (double)$$0.k();
            double $$11 = this.B.k() * (double)$$0.k();

            try {
               this.s.a($$0.m(), $$0.b(), $$0.e() + $$6, $$0.f() + $$7, $$0.g() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               l.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(agn $$0) {
      zs.a($$0, this, this.a);
      bue $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bva)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bwf $$2 = ((bva)$$1).fa();

            for (agn.a $$3 : $$0.e()) {
               bwe $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bwg $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aee $$0) {
      zs.a($$0, this, this.a);
      cro $$1 = this.a.t.cd;
      if ($$1.l == $$0.e()) {
         this.D.a($$0.b()).ifPresent($$0x -> {
            if (this.a.z instanceof fvc $$2) {
               $$2.G().a($$0x);
            }
         });
      }
   }

   @Override
   public void a(adt $$0) {
      zs.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adu $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adu $$2, boolean $$3) {
      eqz $$4 = this.s.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dfk.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dfk.b, $$8, $$9, $$10, $$3);
      $$4.a(new deh($$0, $$1), true);
   }

   @Override
   public void a(adx $$0) {
      zs.a($$0, this, this.a);
      cro $$1 = this.a.t.cd;
      if ($$0.b() == $$1.l && $$1 instanceof csz $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afg $$0) {
      zs.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afw $$0) {
      zs.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(aff $$0) {
      zs.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acj $$0) {
      zs.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acq $$0) {
      zs.a($$0, this, this.a);

      for (zp<? super ace> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aeo $$0) {
      zs.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cov $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(act $$0) {
      this.Q.a();
   }

   @Override
   public void a(acs $$0) {
      this.Q.a($$0.b());
      this.b(new ahf(this.Q.b()));
   }

   @Override
   public void a(adf $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajy $$0) {
      this.R.a($$0);
   }

   private void a(int $$0, int $$1, eqz $$2, dfk $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kj.a($$0, $$9, $$1), $$10 ? new dxk((byte[])$$6.next().clone()) : new dxk());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wc k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.W;
   }

   public Collection<gct> l() {
      return this.v;
   }

   public Collection<gct> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gct a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gct a(String $$0) {
      for (gct $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gcd p() {
      return this.w;
   }

   public CommandDispatcher<fb> q() {
      return this.C;
   }

   public gci r() {
      return this.s;
   }

   public fix s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alh<dfb>> u() {
      return this.F;
   }

   public ke.b v() {
      return this.G;
   }

   public void a(xy $$0, boolean $$1) {
      xu $$2 = $$0.l();
      if ($$2 != null && this.M.a($$2, $$1) && this.M.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.M.a();
      if ($$0 > 0) {
         this.b(new aha($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayi.c.a();
      xq.a $$3 = this.M.b();
      xu $$4 = this.L.pack(new yb($$0, $$1, $$2, $$3.a()));
      this.b(new ahd($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      ya<fb> $$1 = ya.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahb($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayi.c.a();
         xq.a $$4 = this.M.b();
         fd $$5 = fd.a($$1, $$3x -> {
            yb $$4x = new yb($$3x, $$2, $$3, $$4.a());
            return this.L.pack($$4x);
         });
         this.b(new ahc($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!ya.a(this.e($$0))) {
         this.b(new ahb($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fb> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqz $$0) {
      if (!$$0.equals(this.P)) {
         this.b(new aaj($$0));
         this.P = $$0;
      }
   }

   @Override
   public void d() {
      if (this.K != null && this.a.w().b()) {
         this.w();
      }

      if (this.O != null && this.O.isDone()) {
         this.O.join().ifPresent(this::a);
         this.O = null;
      }

      this.e();
      if (this.a.aQ().f()) {
         this.R.a();
      }

      this.S.a();
      this.e.a();
      if (this.T != null) {
         this.T.a();
      }
   }

   public void w() {
      this.O = this.a.w().a();
   }

   private void a(cop $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.K == null || !this.K.c().equals($$0)) {
            this.K = xt.a($$0);
            this.L = this.K.a(this.r.getId());
            this.b(new ahe(this.K.a().a()));
         }
      }
   }

   @Nullable
   public gcw x() {
      return this.c;
   }

   public crf y() {
      return this.H;
   }

   public boolean a(crf $$0) {
      return $$0.a(this.y());
   }

   public fas z() {
      return this.X;
   }

   public cxz A() {
      return this.I;
   }

   public dtj B() {
      return this.J;
   }

   public void C() {
      this.Y.a();
   }

   public gcz D() {
      return this.Y;
   }

   public ama E() {
      return this.k;
   }
}
