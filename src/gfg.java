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

public class gfg extends gfc implements acg, wy {
   private static final Logger l = LogUtils.getLogger();
   private static final xk m = xk.c("multiplayer.unsecureserver.toast.title");
   private static final xk n = xk.c("multiplayer.unsecureserver.toast");
   private static final xk o = xk.c("multiplayer.disconnect.invalid_packet");
   private static final xk p = xk.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private gff s;
   private gff.a t;
   private final Map<UUID, gfr> u = Maps.newHashMap();
   private final Set<gfr> v = new ReferenceOpenHashSet();
   private final gfa w;
   private final gfj x;
   private final flo y = new flo(this);
   private int z = 3;
   private int A = 3;
   private final bac B = bac.b();
   private CommandDispatcher<fb> C = new CommandDispatcher();
   private gfh D = new gfh(Map.of(), dci.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<alo<dgz>> F;
   private final ke.b G;
   private final csk H;
   private final cze I;
   private dvo J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xv L;
   private ye.c M = ye.c.a;
   private xs N = new xs(20);
   private xx O = xx.a();
   @Nullable
   private CompletableFuture<Optional<cpq>> P;
   @Nullable
   private ari Q;
   private final gez R = new gez();
   private final gfq S;
   private final gfl T;
   @Nullable
   private gfo U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final fcw Y = new fcw();
   private final gfx Z = new gfx();

   public gfg(flz $$0, we $$1, gfk $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gfa($$0, this.e);
      this.x = new gfj(this, $$0);
      this.S = new gfq(this, $$0.aQ().m());
      this.T = new gfl(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = cze.a(this.H);
      this.J = dvo.a($$2.c(), this.H);
   }

   public gfj g() {
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
   public void a(ady $$0) {
      zu.a($$0, this, this.a);
      this.a.r = new gfp(this.a, this);
      agw $$1 = $$0.m();
      List<alo<dgz>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alo<dgz> $$3 = $$1.b();
      jq<ebj> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gff.a $$8 = new gff.a(bsx.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gff(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, ftp.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new axg(), new flk());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.B();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new gkb(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, ftp.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new xs(20);
      this.O = xx.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.F()) {
         fqi $$9 = fqi.a(this.a, fqi.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(ach $$0) {
      zu.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bvb $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bvb b(ach $$0) {
      bvi<?> $$1 = $$0.f();
      if ($$1 == bvi.bS) {
         gfr $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gkd(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bvh.r);
      }
   }

   private void a(bvb $$0) {
      if ($$0 instanceof crn $$1) {
         this.a.ak().a((hfd)(new hew($$1)));
      } else if ($$0 instanceof chp $$2) {
         boolean $$3 = $$2.ad_();
         heq $$4;
         if ($$3) {
            $$4 = new heo($$2);
         } else {
            $$4 = new hep($$2);
         }

         this.a.ak().a((hfe)$$4);
      }
   }

   @Override
   public void a(aci $$0) {
      zu.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bvb $$4 = new bvn(this.s, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.s.d($$4);
   }

   @Override
   public void a(afs $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afq $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(adl $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fbr $$2 = $$0.e().a();
         $$1.ap().e($$2);
         if (!$$1.di()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.du().g($$2) > 4096.0;
            if (this.s.a($$1) && !$$5) {
               $$1.a($$2.d, $$2.e, $$2.f, $$3, $$4, 3);
            } else {
               $$1.b($$2.d, $$2.e, $$2.f, $$3, $$4);
               if ($$1.A(this.a.t)) {
                  $$1.j(this.a.t);
                  this.a.t.bz();
               }
            }

            $$1.d($$0.f());
         }
      }
   }

   @Override
   public void a(agp $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new aia.b(this.a.t.dB(), this.a.t.dD(), this.a.t.dH(), this.a.t.dM(), this.a.t.dO(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bwl.a) || $$0.f().contains(bwl.b) || $$0.f().contains(bwl.c);
         boolean $$3 = this.s.a($$1) || !$$1.di() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.bz();
            if ($$1.dh()) {
               this.b.a(new aib($$1));
            }
         }
      }
   }

   @Override
   public void a(agq $$0) {
      zu.a($$0, this, this.a);
      if (this.a.s != null) {
         btj $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agr $$0) {
      zu.a($$0, this, this.a);
      if (this.a.s != null) {
         btj $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afw $$0) {
      zu.a($$0, this, this.a);
      if (cpn.d($$0.b())) {
         this.a.t.gi().j = $$0.b();
      }
   }

   @Override
   public void a(aeb $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.di()) {
            ajc $$2 = $$1.ap();
            fbr $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               ajc $$4 = $$1.ap();
               fbr $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$4.e($$5);
               float $$6 = $$0.i() ? $$0.g() : $$1.h_();
               float $$7 = $$0.i() ? $$0.h() : $$1.r_();
               $$1.a($$5.a(), $$5.b(), $$5.c(), $$6, $$7, 3);
            } else if ($$0.i()) {
               $$1.a($$1.R_(), $$1.S_(), $$1.g_(), $$0.g(), $$0.h(), 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(aec $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = $$0.a(this.s);
      if ($$1 instanceof crn $$2) {
         if (!$$1.di() && $$2.l() instanceof csc $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(afa $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aew $$0) {
      zu.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bvb $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bvb.d.b);
         }
      });
   }

   @Override
   public void a(aeq $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      if (!$$1.bZ()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new aia.b($$1.dB(), $$1.dD(), $$1.dH(), $$1.dM(), $$1.dO(), false, false));
      this.b.a(new ahd($$0.b()));
   }

   private static boolean a(bwk $$0, Set<bwl> $$1, bvb $$2, boolean $$3) {
      bwk $$4 = bwk.b($$2);
      bwk $$5 = bwk.a($$4, $$0, $$1);
      boolean $$6 = $$4.a().g($$5.a()) > 4096.0;
      if ($$3 && !$$6) {
         $$2.a($$5.a().a(), $$5.a().b(), $$5.a().c(), $$5.c(), $$5.d(), 3);
         $$2.h($$5.b());
         return true;
      } else {
         $$2.b($$5.a());
         $$2.h($$5.b());
         $$2.v($$5.c());
         $$2.w($$5.d());
         bwk $$7 = new bwk($$2.bC(), fbr.c, $$2.N, $$2.O);
         bwk $$8 = bwk.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aer $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      $$1.v($$0.b());
      $$1.w($$0.e());
      $$1.bB();
      this.b.a(new aia.c($$1.dM(), $$1.dO(), false, false));
   }

   @Override
   public void a(afb $$0) {
      zu.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adt $$0) {
      zu.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adx $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         dzt $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(acw $$0) {
      zu.a($$0, this, this.a);

      for (acw.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (acw.a $$2 : $$0.b()) {
         this.s.a(new dgf($$2.b().h, $$2.b().i));
      }

      for (acw.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.ap(); $$6 <= this.s.aq(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, ads $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dzt $$0, int $$1, int $$2) {
      etf $$3 = this.s.h().p();
      dzu[] $$4 = $$0.d();
      dgf $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dzu $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kj.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.ap(), $$2 - 1, $$1 + 1, this.s.aq(), $$2 + 1);
   }

   @Override
   public void a(adn $$0) {
      zu.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(adn $$0) {
      dgf $$1 = $$0.b();
      this.s.a(() -> {
         etf $$1x = this.s.C_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kj $$3 = kj.a($$1, $$2);
            $$1x.a(dhi.b, $$3, null);
            $$1x.a(dhi.a, $$3, null);
         }

         for (int $$4 = this.s.ap(); $$4 <= this.s.aq(); $$4++) {
            $$1x.a(kj.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acp $$0) {
      zu.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agj $$0) {
      zu.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      fnz.b $$1 = this.a.m.d().k();
      this.a.c(new fwk(p, this.b));
      this.b.a(abv.d, new gfd(this.a, this.b, new gfk(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahp.a);
      this.b.a(abv.b);
   }

   @Override
   public void a(ago $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      bvx $$2 = (bvx)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bvn) {
            this.s.a($$1.dB(), $$1.dD(), $$1.dH(), awv.jc, aww.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dB(), $$1.dD(), $$1.dH(), awv.oa, aww.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gih(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof cls $$3) {
            cxg $$4 = $$3.l();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bvb.d.b);
            }
         } else if (!($$1 instanceof bvn)) {
            this.s.a($$0.b(), bvb.d.b);
         }
      }
   }

   @Override
   public void a(agl $$0) {
      zu.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aej $$0) {
      zu.a($$0, this, this.a);
      Optional<yd> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gfr $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            yb $$4 = $$3.b();
            yf $$5;
            if ($$4 != null) {
               $$5 = new yf($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yf.a($$2);
            }

            ya $$7 = new ya($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adj $$0) {
      zu.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adi $$0) {
      zu.a($$0, this, this.a);
      Optional<xw> $$1 = $$0.b().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(acj $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bvx $$2 = (bvx)$$1;
            $$2.a(bsz.a);
         } else if ($$0.e() == 3) {
            bvx $$3 = (bvx)$$1;
            $$3.a(bsz.b);
         } else if ($$0.e() == 2) {
            cpo $$4 = (cpo)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, ls.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, ls.r);
         }
      }
   }

   @Override
   public void a(adq $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(age $$0) {
      zu.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afo $$0) {
      zu.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afy $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bP();

         for (int $$3 : $$0.b()) {
            bvb $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof crl) {
                        this.a.t.N = $$1.dM();
                        this.a.t.v($$1.dM());
                        this.a.t.q($$1.dM());
                     }

                     xk $$5 = xk.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aZ().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afr $$0) {
      zu.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bvv $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cxg a(cpo $$0) {
      for (bsz $$1 : bsz.values()) {
         cxg $$2 = $$0.b($$1);
         if ($$2.b(ku.H)) {
            return $$2;
         }
      }

      return new cxg(cxk.wt);
   }

   @Override
   public void a(adk $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hfd)(new hev((cmk)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ls.am, 30);
               this.s.a($$1.dB(), $$1.dD(), $$1.dH(), awv.Ao, $$1.dn(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cpo)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hfd)(new hez((ckf)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adg $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afv $$0) {
      zu.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gt().a($$0.e());
      this.a.t.gt().b($$0.f());
   }

   @Override
   public void a(afu $$0) {
      zu.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aez $$0) {
      zu.a($$0, this, this.a);
      agw $$1 = $$0.b();
      alo<dgz> $$2 = $$1.b();
      jq<ebj> $$3 = $$1.a();
      gkc $$4 = this.a.t;
      alo<dgz> $$5 = $$4.dW().ai();
      boolean $$6 = $$2 != $$5;
      ftp.a $$7 = this.a($$4.eF(), $$2, $$5);
      if ($$6) {
         Map<evi, evk> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gff.a $$12 = new gff.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gff(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gk()) {
         $$4.p();
      }

      gkc $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.m(), $$4.n(), $$4.cd(), $$4.cj());
      } else {
         $$13 = this.a.r.a(this.s, $$4.m(), $$4.n());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akw.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.h($$4.dz());
         $$13.v($$4.dM());
         $$13.w($$4.dO());
      } else {
         $$13.B();
         $$13.v(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.eY().a($$4.eY());
      } else {
         $$13.eY().b($$4.eY());
      }

      this.s.d($$13);
      $$13.k = new gkb(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gz());
      $$13.b($$4.t());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cH = $$4.cH;
      $$13.cI = $$4.cI;
      if (this.a.z instanceof fsv || this.a.z instanceof fsv.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private ftp.a a(boolean $$0, alo<dgz> $$1, alo<dgz> $$2) {
      ftp.a $$3 = ftp.a.c;
      if (!$$0) {
         if ($$1 == dgz.j || $$2 == dgz.j) {
            $$3 = ftp.a.a;
         } else if ($$1 == dgz.k || $$2 == dgz.k) {
            $$3 = ftp.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adm $$0) {
      zu.a($$0, this, this.a);
      fbr $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), aww.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adp $$0) {
      zu.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof cjs $$2) {
         gkc $$3 = this.a.t;
         int $$4 = $$0.e();
         bth $$5 = new bth(cjs.v($$4));
         ctv $$6 = new ctv($$0.b(), $$3.gi(), $$5, $$2, $$4);
         $$3.cd = $$6;
         this.a.a(new fvg($$6, $$3.gi(), $$2, $$4));
      }
   }

   @Override
   public void a(aef $$0) {
      zu.a($$0, this, this.a);
      fti.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(add $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      cxg $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fuw $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (ctw.e($$3) && !$$2.f()) {
            cxg $$7 = $$1.cc.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.cc.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cd.l && ($$0.b() != 0 || !$$5)) {
         $$1.cd.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fuw) {
         $$1.cc.a($$3, $$2);
         $$1.cc.d();
      }
   }

   @Override
   public void a(afn $$0) {
      zu.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fuw)) {
         this.a.t.cd.b($$0.b());
      }
   }

   @Override
   public void a(afz $$0) {
      zu.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gi().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adb $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.l) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aeg $$0) {
      zu.a($$0, this, this.a);
      jh $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dwd $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(acn $$0) {
      zu.a($$0, this, this.a);
      jh $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         um $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dva && this.a.z instanceof fur) {
            ((fur)this.a.z).G();
         }
      });
   }

   @Override
   public void a(adc $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      if ($$1.cd != null && $$1.cd.l == $$0.b()) {
         $$1.cd.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aft $$0) {
      zu.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bvx $$2) {
         $$0.e().forEach($$1 -> $$2.a((bvj)$$1.getFirst(), (cxg)$$1.getSecond()));
      }
   }

   @Override
   public void a(ada $$0) {
      zu.a($$0, this, this.a);
      this.a.t.f();
   }

   @Override
   public void a(aco $$0) {
      zu.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acm $$0) {
      zu.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ado $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      ado.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azu.d($$3 + 0.5F);
      if ($$2 == ado.b) {
         $$1.a(xk.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ado.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == ado.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == ado.e) {
         this.a.r.a(dgw.a($$4));
      } else if ($$2 == ado.f) {
         this.a.a(new ftu(true, () -> {
            this.a.t.j.b(new ahm(ahm.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == ado.g) {
         fmd $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fsw());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xk.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xk.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xk.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xk.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == ado.h) {
         this.s.a($$1, $$1.dB(), $$1.dF(), $$1.dH(), awv.aF, aww.h, 0.18F, 0.45F);
      } else if ($$2 == ado.i) {
         this.s.e($$3);
      } else if ($$2 == ado.j) {
         this.s.c($$3);
      } else if ($$2 == ado.k) {
         this.s.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), awv.vv, aww.g, 1.0F, 1.0F);
      } else if ($$2 == ado.l) {
         this.s.a(ls.q, $$1.dB(), $$1.dD(), $$1.dH(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), awv.il, aww.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ado.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == ado.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == ado.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(gkc $$0, gff $$1, ftp.a $$2) {
      this.U = new gfo($$0, $$1, this.a.f);
      this.a.a(new ftp(this.U::b, $$2));
   }

   @Override
   public void a(adz $$0) {
      zu.a($$0, this, this.a);
      evi $$1 = $$0.b();
      evk $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = evk.a($$0.e(), $$0.f(), this.a.s.ai());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adu $$0) {
      zu.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(ags $$0) {
      zu.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(afc $$0) {
      zu.a($$0, this, this.a);
      alp $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ah $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acz $$0) {
      zu.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(es.a(this.G, this.H)));
   }

   @Override
   public void a(agk $$0) {
      zu.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acy $$0) {
      zu.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agv $$0) {
      zu.a($$0, this, this.a);
      this.D = new gfh($$0.b(), $$0.e());
   }

   @Override
   public void a(aep $$0) {
      zu.a($$0, this, this.a);
      fbr $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agn $$0) {
      zu.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(ack $$0) {
      zu.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<axc<?>> $$1 = (Entry<axc<?>>)$$4.next();
         axc<?> $$2 = (axc<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.m().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof ftv $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aet $$0) {
      zu.a($$0, this, this.a);
      flk $$1 = this.a.t.n();
      if ($$0.e()) {
         $$1.b();
      }

      for (aet.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fqh.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aeu $$0) {
      zu.a($$0, this, this.a);
      flk $$1 = this.a.t.n();

      for (ddc $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aev $$0) {
      zu.a($$0, this, this.a);
      flk $$1 = this.a.t.n();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(flk $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof fxt $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agu $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 instanceof bvx) {
         jq<bue> $$2 = $$0.e();
         bug $$3 = new bug($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bvx)$$1).c($$3, null);
      }
   }

   private <T> kd.a<T> a(alo<? extends kd<? extends T>> $$0, ayc.a $$1) {
      kd<T> $$2 = this.G.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aai $$0) {
      zu.a($$0, this, this.a);
      List<kd.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kh.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kd.a::d);
      this.J = dvo.a(this.G, this.H);
      List<cxg> $$3 = List.copyOf(cvw.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(aek $$0) {
   }

   @Override
   public void a(ael $$0) {
   }

   @Override
   public void a(aem $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.t()) {
            this.a.a(new fsv($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gg();
         }
      }
   }

   @Override
   public void a(act $$0) {
      zu.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(afk $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adr $$0) {
      zu.a($$0, this, this.a);
      dze $$1 = this.s.F_();
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
   public void a(aff $$0) {
      zu.a($$0, this, this.a);
      this.s.F_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afg $$0) {
      zu.a($$0, this, this.a);
      this.s.F_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afh $$0) {
      zu.a($$0, this, this.a);
      this.s.F_().a($$0.b());
   }

   @Override
   public void a(afj $$0) {
      zu.a($$0, this, this.a);
      this.s.F_().c($$0.b());
   }

   @Override
   public void a(afi $$0) {
      zu.a($$0, this, this.a);
      this.s.F_().b($$0.b());
   }

   @Override
   public void a(acx $$0) {
      zu.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(afd $$0) {
      zu.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gfu::b).ifPresent(this.c::a);
         gfv.b(this.c);
      }
   }

   @Override
   public void a(adf $$0) {
      zu.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afe $$0) {
      zu.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(agf $$0) {
      zu.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(agd $$0) {
      zu.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(agg $$0) {
      zu.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agm $$0) {
      zu.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aex $$0) {
      zu.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bvx $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aen $$0) {
      zu.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gfr $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aeo $$0) {
      zu.a($$0, this, this.a);

      for (aeo.b $$1 : $$0.f()) {
         gfr $$2 = new gfr(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aeo.b $$3 : $$0.e()) {
         gfr $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aeo.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aeo.a $$0, aeo.b $$1, gfr $$2) {
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

   private void a(aeo.b $$0, gfr $$1) {
      GameProfile $$2 = $$1.a();
      bah $$3 = this.a.aW();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         yb.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               yb $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cpr.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aX() && this.V;
   }

   @Override
   public void a(aei $$0) {
      zu.a($$0, this, this.a);
      cpo $$1 = this.a.t;
      $$1.gj().b = $$0.e();
      $$1.gj().d = $$0.g();
      $$1.gj().a = $$0.b();
      $$1.gj().c = $$0.f();
      $$1.gj().a($$0.h());
      $$1.gj().b($$0.i());
   }

   @Override
   public void a(agi $$0) {
      zu.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agh $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acq $$0) {
      zu.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(ade $$0) {
      zu.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gE().a($$0.b());
      } else {
         this.a.t.gE().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aed $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.a.t.dg();
      if ($$1 != this.a.t && $$1.di()) {
         fbr $$2 = new fbr($$0.b(), $$0.e(), $$0.f());
         fbr $$3 = new fbr($$1.R_(), $$1.S_(), $$1.g_());
         if ($$2.f($$3) > 1.0E-5F) {
            $$1.f_();
            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.g(), $$0.h());
         }

         this.b.a(new aib($$1));
      }
   }

   @Override
   public void a(aee $$0) {
      zu.a($$0, this, this.a);
      cxg $$1 = this.a.t.b($$0.b());
      fuo.a $$2 = fuo.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fuo($$2));
      }
   }

   @Override
   public void a(aau $$0) {
      if ($$0 instanceof abd $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abc $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abi $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abj $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abl $$5) {
         ((gpx)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abg $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abe $$7) {
         gpa.a $$8 = new gpa.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abf $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abk $$10) {
         gpv $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aba $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aar $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aaq $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof abb $$15) {
         this.a.l.p.a($$15.b(), this.s.ad());
      } else if ($$0 instanceof aay $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aaz) {
         this.a.l.s.a();
      } else if ($$0 instanceof abh $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aaw $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aax $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aat $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aau $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afx $$0) {
      zu.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, fcz.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fco $$2 = this.Y.a($$1);
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
   public void a(agb $$0) {
      zu.a($$0, this, this.a);
      String $$1 = $$0.e();
      fcv $$2 = fcv.c($$0.b());
      fco $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fcu $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aey $$0) {
      zu.a($$0, this, this.a);
      String $$1 = $$0.e();
      fcv $$2 = fcv.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fco $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afp $$0) {
      zu.a($$0, this, this.a);
      String $$1 = $$0.e();
      fco $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(aga $$0) {
      zu.a($$0, this, this.a);
      aga.a $$1 = $$0.e();
      fcr $$2;
      if ($$1 == aga.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<aga.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fcy.b $$2x = fcy.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fcy.a $$3x = fcy.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      aga.a $$5 = $$0.b();
      if ($$5 == aga.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == aga.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == aga.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(adv $$0) {
      zu.a($$0, this, this.a);
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
   public void a(agt $$0) {
      zu.a($$0, this, this.a);
      bvb $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bvx)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bxc $$2 = ((bvx)$$1).eY();

            for (agt.a $$3 : $$0.e()) {
               bxb $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bxd $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      zu.a($$0, this, this.a);
      cst $$1 = this.a.t.cd;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof fxt $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adw $$0) {
      zu.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adx $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adx $$2, boolean $$3) {
      etf $$4 = this.s.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dhi.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dhi.b, $$8, $$9, $$10, $$3);
      $$4.a(new dgf($$0, $$1), true);
   }

   @Override
   public void a(aea $$0) {
      zu.a($$0, this, this.a);
      cst $$1 = this.a.t.cd;
      if ($$0.b() == $$1.l && $$1 instanceof cue $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afm $$0) {
      zu.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(agc $$0) {
      zu.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(afl $$0) {
      zu.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acl $$0) {
      zu.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acs $$0) {
      zu.a($$0, this, this.a);

      for (zr<? super acg> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aes $$0) {
      zu.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cpw $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(acv $$0) {
      this.R.a();
   }

   @Override
   public void a(acu $$0) {
      this.R.a($$0.b());
      this.b(new ahl(this.R.b()));
   }

   @Override
   public void a(adh $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(akf $$0) {
      this.S.a($$0);
   }

   private void a(int $$0, int $$1, etf $$2, dhi $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kj.a($$0, $$9, $$1), $$10 ? new dzo((byte[])$$6.next().clone()) : new dzo());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public we k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gfr> l() {
      return this.v;
   }

   public Collection<gfr> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gfr a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gfr a(String $$0) {
      for (gfr $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gfa p() {
      return this.w;
   }

   public CommandDispatcher<fb> q() {
      return this.C;
   }

   public gff r() {
      return this.s;
   }

   public flo s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alo<dgz>> u() {
      return this.F;
   }

   public ke.b v() {
      return this.G;
   }

   public void a(ya $$0, boolean $$1) {
      xw $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new ahg($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ays.c.a();
      xs.a $$3 = this.N.b();
      xw $$4 = this.M.pack(new yd($$0, $$1, $$2, $$3.a()));
      this.b(new ahj($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yc<fb> $$1 = yc.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahh($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ays.c.a();
         xs.a $$4 = this.N.b();
         fd $$5 = fd.a($$1, $$3x -> {
            yd $$4x = new yd($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new ahi($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yc.a(this.e($$0))) {
         this.b(new ahh($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fb> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(ari $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new aal($$0));
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
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(cpq $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xv.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new ahk(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gfu x() {
      return this.c;
   }

   public csk y() {
      return this.H;
   }

   public boolean a(csk $$0) {
      return $$0.a(this.y());
   }

   public fcw z() {
      return this.Y;
   }

   public cze A() {
      return this.I;
   }

   public dvo B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public gfx D() {
      return this.Z;
   }

   public amh E() {
      return this.j;
   }
}
