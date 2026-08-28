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

public class gfl extends gfh implements acr, xj {
   private static final Logger l = LogUtils.getLogger();
   private static final xv m = xv.c("multiplayer.unsecureserver.toast.title");
   private static final xv n = xv.c("multiplayer.unsecureserver.toast");
   private static final xv o = xv.c("multiplayer.disconnect.invalid_packet");
   private static final xv p = xv.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private gfk s;
   private gfk.a t;
   private final Map<UUID, gfw> u = Maps.newHashMap();
   private final Set<gfw> v = new ReferenceOpenHashSet();
   private final gff w;
   private final gfo x;
   private final flv y = new flv(this);
   private int z = 3;
   private int A = 3;
   private final bam B = bam.b();
   private CommandDispatcher<fb> C = new CommandDispatcher();
   private gfm D = new gfm(Map.of(), dcr.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<aly<dhi>> F;
   private final ke.b G;
   private final cst H;
   private final czn I;
   private dvv J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private yg L;
   private yp.c M = yp.c.a;
   private yd N = new yd(20);
   private yi O = yi.a();
   @Nullable
   private CompletableFuture<Optional<cpz>> P;
   @Nullable
   private ars Q;
   private final gfe R = new gfe();
   private final gfv S;
   private final gfq T;
   @Nullable
   private gft U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final fdd Y = new fdd();
   private final ggc Z = new ggc();

   public gfl(fmg $$0, wp $$1, gfp $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gff($$0, this.e);
      this.x = new gfo(this, $$0);
      this.S = new gfv(this, $$0.aQ().m());
      this.T = new gfq(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = czn.a(this.H);
      this.J = dvv.a($$2.c(), this.H);
   }

   public gfo g() {
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

   public dcf j() {
      return this.D;
   }

   @Override
   public void a(aej $$0) {
      aaf.a($$0, this, this.a);
      this.a.r = new gfu(this.a, this);
      ahh $$1 = $$0.m();
      List<aly<dhi>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      aly<dhi> $$3 = $$1.b();
      jq<ebq> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gfk.a $$8 = new gfk.a(btg.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gfk(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, ftw.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new axq(), new flr());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.B();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.j = new gkg(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, ftw.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new yd(20);
      this.O = yi.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.F()) {
         fqp $$9 = fqp.a(this.a, fqp.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(acs $$0) {
      aaf.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bvk $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bvk b(acs $$0) {
      bvr<?> $$1 = $$0.f();
      if ($$1 == bvr.bS) {
         gfw $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gki(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bvq.r);
      }
   }

   private void a(bvk $$0) {
      if ($$0 instanceof crw $$1) {
         this.a.ak().a((hfi)(new hfb($$1)));
      } else if ($$0 instanceof chy $$2) {
         boolean $$3 = $$2.ad_();
         hev $$4;
         if ($$3) {
            $$4 = new het($$2);
         } else {
            $$4 = new heu($$2);
         }

         this.a.ak().a((hfj)$$4);
      }
   }

   @Override
   public void a(act $$0) {
      aaf.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bvk $$4 = new bvw(this.s, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.s.d($$4);
   }

   @Override
   public void a(agd $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(agb $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(adw $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fby $$2 = $$0.e().a();
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
   public void a(aha $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ail.b(this.a.t.dB(), this.a.t.dD(), this.a.t.dH(), this.a.t.dM(), this.a.t.dO(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bwu.a) || $$0.f().contains(bwu.b) || $$0.f().contains(bwu.c);
         boolean $$3 = this.s.a($$1) || !$$1.di() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.bz();
            if ($$1.dh()) {
               this.b.a(new aim($$1));
            }
         }
      }
   }

   @Override
   public void a(ahb $$0) {
      aaf.a($$0, this, this.a);
      if (this.a.s != null) {
         bts $$1 = this.a.s.t();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(ahc $$0) {
      aaf.a($$0, this, this.a);
      if (this.a.s != null) {
         bts $$1 = this.a.s.t();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(agh $$0) {
      aaf.a($$0, this, this.a);
      if (cpw.d($$0.b())) {
         this.a.t.gi().j = $$0.b();
      }
   }

   @Override
   public void a(aem $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.di()) {
            ajm $$2 = $$1.ap();
            fby $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               ajm $$4 = $$1.ap();
               fby $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aen $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = $$0.a(this.s);
      if ($$1 instanceof crw $$2) {
         if (!$$1.di() && $$2.l() instanceof csl $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(afl $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(afh $$0) {
      aaf.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bvk $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bvk.d.b);
         }
      });
   }

   @Override
   public void a(afb $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      if (!$$1.bZ()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new ail.b($$1.dB(), $$1.dD(), $$1.dH(), $$1.dM(), $$1.dO(), false, false));
      this.b.a(new aho($$0.b()));
   }

   private static boolean a(bwt $$0, Set<bwu> $$1, bvk $$2, boolean $$3) {
      bwt $$4 = bwt.b($$2);
      bwt $$5 = bwt.a($$4, $$0, $$1);
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
         bwt $$7 = new bwt($$2.bC(), fby.c, $$2.N, $$2.O);
         bwt $$8 = bwt.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(afc $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      $$1.v($$0.b());
      $$1.w($$0.e());
      $$1.bB();
      this.b.a(new ail.c($$1.dM(), $$1.dO(), false, false));
   }

   @Override
   public void a(afm $$0) {
      aaf.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(aee $$0) {
      aaf.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      aei $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         eaa $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(adh $$0) {
      aaf.a($$0, this, this.a);

      for (adh.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (adh.a $$2 : $$0.b()) {
         this.s.a(new dgo($$2.b().h, $$2.b().i));
      }

      for (adh.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.ao(); $$6 <= this.s.ap(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, aed $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(eaa $$0, int $$1, int $$2) {
      etm $$3 = this.s.h().p();
      eab[] $$4 = $$0.d();
      dgo $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         eab $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kj.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.ao(), $$2 - 1, $$1 + 1, this.s.ap(), $$2 + 1);
   }

   @Override
   public void a(ady $$0) {
      aaf.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(ady $$0) {
      dgo $$1 = $$0.b();
      this.s.a(() -> {
         etm $$1x = this.s.C_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kj $$3 = kj.a($$1, $$2);
            $$1x.a(dhr.b, $$3, null);
            $$1x.a(dhr.a, $$3, null);
         }

         for (int $$4 = this.s.ao(); $$4 <= this.s.ap(); $$4++) {
            $$1x.a(kj.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(ada $$0) {
      aaf.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agu $$0) {
      aaf.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      fog.b $$1 = this.a.m.d().k();
      this.a.c(new fwr(p, this.b));
      this.b.a(acg.d, new gfi(this.a, this.b, new gfp(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(aia.a);
      this.b.a(acg.b);
   }

   @Override
   public void a(agz $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      bwg $$2 = (bwg)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bvw) {
            this.s.a($$1.dB(), $$1.dD(), $$1.dH(), axf.jb, axg.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dB(), $$1.dD(), $$1.dH(), axf.nU, axg.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gim(this.a.aq(), this.a.aR(), this.s, $$1, $$2));
         if ($$1 instanceof cmb $$3) {
            cxp $$4 = $$3.l();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bvk.d.b);
            }
         } else if (!($$1 instanceof bvw)) {
            this.s.a($$0.b(), bvk.d.b);
         }
      }
   }

   @Override
   public void a(agw $$0) {
      aaf.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeu $$0) {
      aaf.a($$0, this, this.a);
      Optional<yo> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gfw $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            ym $$4 = $$3.b();
            yq $$5;
            if ($$4 != null) {
               $$5 = new yq($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yq.a($$2);
            }

            yl $$7 = new yl($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adu $$0) {
      aaf.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adt $$0) {
      aaf.a($$0, this, this.a);
      Optional<yh> $$1 = $$0.b().a(this.O);
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
   public void a(acu $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bwg $$2 = (bwg)$$1;
            $$2.a(bti.a);
         } else if ($$0.e() == 3) {
            bwg $$3 = (bwg)$$1;
            $$3.a(bti.b);
         } else if ($$0.e() == 2) {
            cpx $$4 = (cpx)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, ls.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, ls.r);
         }
      }
   }

   @Override
   public void a(aeb $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(agp $$0) {
      aaf.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afz $$0) {
      aaf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(agj $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bP();

         for (int $$3 : $$0.b()) {
            bvk $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cru) {
                        this.a.t.N = $$1.dM();
                        this.a.t.v($$1.dM());
                        this.a.t.q($$1.dM());
                     }

                     xv $$5 = xv.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aZ().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(agc $$0) {
      aaf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwe $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cxp a(cpx $$0) {
      for (bti $$1 : bti.values()) {
         cxp $$2 = $$0.b($$1);
         if ($$2.b(ku.H)) {
            return $$2;
         }
      }

      return new cxp(cxt.wj);
   }

   @Override
   public void a(adv $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hfi)(new hfa((cmt)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ls.al, 30);
               this.s.a($$1.dB(), $$1.dD(), $$1.dH(), axf.zY, $$1.dn(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cpx)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hfi)(new hfe((cko)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adr $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(agg $$0) {
      aaf.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gt().a($$0.e());
      this.a.t.gt().b($$0.f());
   }

   @Override
   public void a(agf $$0) {
      aaf.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afk $$0) {
      aaf.a($$0, this, this.a);
      ahh $$1 = $$0.b();
      aly<dhi> $$2 = $$1.b();
      jq<ebq> $$3 = $$1.a();
      gkh $$4 = this.a.t;
      aly<dhi> $$5 = $$4.dW().ah();
      boolean $$6 = $$2 != $$5;
      ftw.a $$7 = this.a($$4.eF(), $$2, $$5);
      if ($$6) {
         Map<evp, evr> $$8 = this.s.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gfk.a $$12 = new gfk.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gfk(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gk()) {
         $$4.p();
      }

      gkh $$13;
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
         List<alg.c<?>> $$15 = $$4.au().c();
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
      $$13.j = new gkg(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gz());
      $$13.b($$4.t());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cG = $$4.cG;
      $$13.cH = $$4.cH;
      if (this.a.z instanceof ftc || this.a.z instanceof ftc.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private ftw.a a(boolean $$0, aly<dhi> $$1, aly<dhi> $$2) {
      ftw.a $$3 = ftw.a.c;
      if (!$$0) {
         if ($$1 == dhi.j || $$2 == dhi.j) {
            $$3 = ftw.a.a;
         } else if ($$1 == dhi.k || $$2 == dhi.k) {
            $$3 = ftw.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adx $$0) {
      aaf.a($$0, this, this.a);
      fby $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), axg.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(aea $$0) {
      aaf.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof ckb $$2) {
         gkh $$3 = this.a.t;
         int $$4 = $$0.e();
         btq $$5 = new btq(ckb.v($$4));
         cue $$6 = new cue($$0.b(), $$3.gi(), $$5, $$2, $$4);
         $$3.cd = $$6;
         this.a.a(new fvn($$6, $$3.gi(), $$2, $$4));
      }
   }

   @Override
   public void a(aeq $$0) {
      aaf.a($$0, this, this.a);
      ftp.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ado $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      cxp $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fvd $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cuf.e($$3) && !$$2.f()) {
            cxp $$7 = $$1.cc.b($$3).g();
            if ($$7.f() || $$7.L() < $$2.L()) {
               $$2.d(5);
            }
         }

         $$1.cc.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cd.l && ($$0.b() != 0 || !$$5)) {
         $$1.cd.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fvd) {
         $$1.cc.a($$3, $$2);
         $$1.cc.d();
      }
   }

   @Override
   public void a(afy $$0) {
      aaf.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fvd)) {
         this.a.t.cd.b($$0.b());
      }
   }

   @Override
   public void a(agk $$0) {
      aaf.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gi().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adm $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.l) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aer $$0) {
      aaf.a($$0, this, this.a);
      jh $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dwk $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(acy $$0) {
      aaf.a($$0, this, this.a);
      jh $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         ux $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dvh && this.a.z instanceof fuy) {
            ((fuy)this.a.z).G();
         }
      });
   }

   @Override
   public void a(adn $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      if ($$1.cd != null && $$1.cd.l == $$0.b()) {
         $$1.cd.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(age $$0) {
      aaf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwg $$2) {
         $$0.e().forEach($$1 -> $$2.a((bvs)$$1.getFirst(), (cxp)$$1.getSecond()));
      }
   }

   @Override
   public void a(adl $$0) {
      aaf.a($$0, this, this.a);
      this.a.t.f();
   }

   @Override
   public void a(acz $$0) {
      aaf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acx $$0) {
      aaf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adz $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      adz.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = bae.d($$3 + 0.5F);
      if ($$2 == adz.b) {
         $$1.a(xv.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adz.c) {
         this.s.j().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adz.d) {
         this.s.j().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adz.e) {
         this.a.r.a(dhf.a($$4));
      } else if ($$2 == adz.f) {
         this.a.a(new fub(true, () -> {
            this.a.t.i.b(new ahx(ahx.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adz.g) {
         fmk $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new ftd());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xv.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xv.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xv.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xv.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adz.h) {
         this.s.a($$1, $$1.dB(), $$1.dF(), $$1.dH(), axf.aF, axg.h, 0.18F, 0.45F);
      } else if ($$2 == adz.i) {
         this.s.e($$3);
      } else if ($$2 == adz.j) {
         this.s.c($$3);
      } else if ($$2 == adz.k) {
         this.s.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), axf.vp, axg.g, 1.0F, 1.0F);
      } else if ($$2 == adz.l) {
         this.s.a(ls.q, $$1.dB(), $$1.dD(), $$1.dH(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), axf.ik, axg.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adz.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adz.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adz.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(gkh $$0, gfk $$1, ftw.a $$2) {
      this.U = new gft($$0, $$1, this.a.f);
      this.a.a(new ftw(this.U::b, $$2));
   }

   @Override
   public void a(aek $$0) {
      aaf.a($$0, this, this.a);
      evp $$1 = $$0.b();
      evr $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = evr.a($$0.e(), $$0.f(), this.a.s.ah());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(aef $$0) {
      aaf.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(ahd $$0) {
      aaf.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(afn $$0) {
      aaf.a($$0, this, this.a);
      alz $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ah $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(adk $$0) {
      aaf.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(es.a(this.G, this.H)));
   }

   @Override
   public void a(agv $$0) {
      aaf.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adj $$0) {
      aaf.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(ahg $$0) {
      aaf.a($$0, this, this.a);
      this.D = new gfm($$0.b(), $$0.e());
   }

   @Override
   public void a(afa $$0) {
      aaf.a($$0, this, this.a);
      fby $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agy $$0) {
      aaf.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acv $$0) {
      aaf.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<axm<?>> $$1 = (Entry<axm<?>>)$$4.next();
         axm<?> $$2 = (axm<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.m().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fuc $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(afe $$0) {
      aaf.a($$0, this, this.a);
      flr $$1 = this.a.t.n();
      if ($$0.e()) {
         $$1.b();
      }

      for (afe.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fqo.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aff $$0) {
      aaf.a($$0, this, this.a);
      flr $$1 = this.a.t.n();

      for (ddl $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(afg $$0) {
      aaf.a($$0, this, this.a);
      flr $$1 = this.a.t.n();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(flr $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof fya $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(ahf $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 instanceof bwg) {
         jq<bun> $$2 = $$0.e();
         bup $$3 = new bup($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bwg)$$1).c($$3, null);
      }
   }

   private <T> kd.a<T> a(aly<? extends kd<? extends T>> $$0, aym.a $$1) {
      kd<T> $$2 = this.G.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aat $$0) {
      aaf.a($$0, this, this.a);
      List<kd.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kh.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kd.a::d);
      this.J = dvv.a(this.G, this.H);
      List<cxp> $$3 = List.copyOf(cwf.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(aev $$0) {
   }

   @Override
   public void a(aew $$0) {
   }

   @Override
   public void a(aex $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.t()) {
            this.a.a(new ftc($$0.e(), this.s.j().l()));
         } else {
            this.a.t.gg();
         }
      }
   }

   @Override
   public void a(ade $$0) {
      aaf.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(afv $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(aec $$0) {
      aaf.a($$0, this, this.a);
      dzl $$1 = this.s.F_();
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
   public void a(afq $$0) {
      aaf.a($$0, this, this.a);
      this.s.F_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afr $$0) {
      aaf.a($$0, this, this.a);
      this.s.F_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afs $$0) {
      aaf.a($$0, this, this.a);
      this.s.F_().a($$0.b());
   }

   @Override
   public void a(afu $$0) {
      aaf.a($$0, this, this.a);
      this.s.F_().c($$0.b());
   }

   @Override
   public void a(aft $$0) {
      aaf.a($$0, this, this.a);
      this.s.F_().b($$0.b());
   }

   @Override
   public void a(adi $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(afo $$0) {
      aaf.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gfz::b).ifPresent(this.c::a);
         gga.b(this.c);
      }
   }

   @Override
   public void a(adq $$0) {
      aaf.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afp $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(agq $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(ago $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(agr $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agx $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(afi $$0) {
      aaf.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bwg $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aey $$0) {
      aaf.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gfw $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aez $$0) {
      aaf.a($$0, this, this.a);

      for (aez.b $$1 : $$0.f()) {
         gfw $$2 = new gfw(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aez.b $$3 : $$0.e()) {
         gfw $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aez.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aez.a $$0, aez.b $$1, gfw $$2) {
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
         case g:
            $$2.b($$1.g());
      }
   }

   private void a(aez.b $$0, gfw $$1) {
      GameProfile $$2 = $$1.a();
      bar $$3 = this.a.aW();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         ym.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               ym $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cqa.b var7) {
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
   public void a(aet $$0) {
      aaf.a($$0, this, this.a);
      cpx $$1 = this.a.t;
      $$1.gj().b = $$0.e();
      $$1.gj().d = $$0.g();
      $$1.gj().a = $$0.b();
      $$1.gj().c = $$0.f();
      $$1.gj().a($$0.h());
      $$1.gj().b($$0.i());
   }

   @Override
   public void a(agt $$0) {
      aaf.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(ags $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(adb $$0) {
      aaf.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(adp $$0) {
      aaf.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gE().a($$0.b());
      } else {
         this.a.t.gE().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aeo $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.a.t.dg();
      if ($$1 != this.a.t && $$1.di()) {
         fby $$2 = new fby($$0.b(), $$0.e(), $$0.f());
         fby $$3 = new fby($$1.R_(), $$1.S_(), $$1.g_());
         if ($$2.f($$3) > 1.0E-5F) {
            $$1.f_();
            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.g(), $$0.h());
         }

         this.b.a(new aim($$1));
      }
   }

   @Override
   public void a(aep $$0) {
      aaf.a($$0, this, this.a);
      cxp $$1 = this.a.t.b($$0.b());
      fuv.a $$2 = fuv.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fuv($$2));
      }
   }

   @Override
   public void a(abf $$0) {
      if ($$0 instanceof abo $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abn $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abt $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abu $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abw $$5) {
         ((gqc)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abr $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abp $$7) {
         gpf.a $$8 = new gpf.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abq $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abv $$10) {
         gqa $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof abl $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof abc $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof abb $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof abm $$15) {
         this.a.l.p.a($$15.b(), this.s.ac());
      } else if ($$0 instanceof abj $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof abk) {
         this.a.l.s.a();
      } else if ($$0 instanceof abs $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof abh $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof abi $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof abe $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(abf $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(agi $$0) {
      aaf.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, fdg.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fcv $$2 = this.Y.a($$1);
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
   public void a(agm $$0) {
      aaf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdc $$2 = fdc.c($$0.b());
      fcv $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fdb $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(afj $$0) {
      aaf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdc $$2 = fdc.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fcv $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aga $$0) {
      aaf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fcv $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(agl $$0) {
      aaf.a($$0, this, this.a);
      agl.a $$1 = $$0.e();
      fcy $$2;
      if ($$1 == agl.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<agl.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fdf.b $$2x = fdf.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fdf.a $$3x = fdf.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      agl.a $$5 = $$0.b();
      if ($$5 == agl.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == agl.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == agl.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(aeg $$0) {
      aaf.a($$0, this, this.a);
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
   public void a(ahe $$0) {
      aaf.a($$0, this, this.a);
      bvk $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bwg)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bxl $$2 = ((bwg)$$1).eY();

            for (ahe.a $$3 : $$0.e()) {
               bxk $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bxm $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aes $$0) {
      aaf.a($$0, this, this.a);
      ctc $$1 = this.a.t.cd;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof fya $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      aaf.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      aei $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, aei $$2, boolean $$3) {
      etm $$4 = this.s.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dhr.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dhr.b, $$8, $$9, $$10, $$3);
      $$4.a(new dgo($$0, $$1), true);
   }

   @Override
   public void a(ael $$0) {
      aaf.a($$0, this, this.a);
      ctc $$1 = this.a.t.cd;
      if ($$0.b() == $$1.l && $$1 instanceof cun $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afx $$0) {
      aaf.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(agn $$0) {
      aaf.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(afw $$0) {
      aaf.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      aaf.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(add $$0) {
      aaf.a($$0, this, this.a);

      for (aac<? super acr> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(afd $$0) {
      aaf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cqf $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(adg $$0) {
      this.R.a();
   }

   @Override
   public void a(adf $$0) {
      this.R.a($$0.b());
      this.b(new ahw(this.R.b()));
   }

   @Override
   public void a(ads $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(akp $$0) {
      this.S.a($$0);
   }

   private void a(int $$0, int $$1, etm $$2, dhr $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kj.a($$0, $$9, $$1), $$10 ? new dzv((byte[])$$6.next().clone()) : new dzv());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wp k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gfw> l() {
      return this.v;
   }

   public Collection<gfw> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gfw a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gfw a(String $$0) {
      for (gfw $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gff p() {
      return this.w;
   }

   public CommandDispatcher<fb> q() {
      return this.C;
   }

   public gfk r() {
      return this.s;
   }

   public flv s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<aly<dhi>> u() {
      return this.F;
   }

   public ke.b v() {
      return this.G;
   }

   public void a(yl $$0, boolean $$1) {
      yh $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new ahr($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = azc.c.a();
      yd.a $$3 = this.N.b();
      yh $$4 = this.M.pack(new yo($$0, $$1, $$2, $$3.a()));
      this.b(new ahu($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yn<fb> $$1 = yn.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahs($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = azc.c.a();
         yd.a $$4 = this.N.b();
         fd $$5 = fd.a($$1, $$3x -> {
            yo $$4x = new yo($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new aht($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yn.a(this.e($$0))) {
         this.b(new ahs($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fb> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(ars $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new aaw($$0));
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

   private void a(cpz $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = yg.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new ahv(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gfz x() {
      return this.c;
   }

   public cst y() {
      return this.H;
   }

   public boolean a(cst $$0) {
      return $$0.a(this.y());
   }

   public fdd z() {
      return this.Y;
   }

   public czn A() {
      return this.I;
   }

   public dvv B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public ggc D() {
      return this.Z;
   }

   public amr E() {
      return this.j;
   }
}
