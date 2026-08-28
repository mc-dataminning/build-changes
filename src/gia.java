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

public class gia extends ghw implements abr, wj {
   private static final Logger l = LogUtils.getLogger();
   private static final wv m = wv.c("multiplayer.unsecureserver.toast.title");
   private static final wv n = wv.c("multiplayer.unsecureserver.toast");
   private static final wv o = wv.c("multiplayer.disconnect.invalid_packet");
   private static final wv p = wv.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private ghz s;
   private ghz.a t;
   private final Map<UUID, gil> u = Maps.newHashMap();
   private final Set<gil> v = new ReferenceOpenHashSet();
   private final ghu w;
   private final gid x;
   private final fms y = new fms(this);
   private int z = 3;
   private int A = 3;
   private final azs B = azs.b();
   private CommandDispatcher<fc> C = new CommandDispatcher();
   private gib D = new gib(Map.of(), dcy.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<alc<dhp>> F;
   private final kg.b G;
   private final cte H;
   private final czt I;
   private dwk J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xg L;
   private xp.c M = xp.c.a;
   private xd N = new xd(20);
   private xi O = xi.a();
   @Nullable
   private CompletableFuture<Optional<cqk>> P;
   @Nullable
   private aqx Q;
   private final ght R = new ght();
   private final gik S;
   private final gif T;
   @Nullable
   private gii U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final fdz Y = new fdz();
   private final gir Z = new gir();

   public gia(fnd $$0, vo $$1, gie $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new ghu($$0, this.e);
      this.x = new gid(this, $$0);
      this.S = new gik(this, $$0.aQ().m());
      this.T = new gif(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = czt.a(this.H);
      this.J = dwk.a($$2.c(), this.H);
   }

   public gid g() {
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

   public dcm j() {
      return this.D;
   }

   @Override
   public void a(adi $$0) {
      zf.a($$0, this, this.a);
      this.a.r = new gij(this.a, this);
      agh $$1 = $$0.m();
      List<alc<dhp>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alc<dhp> $$3 = $$1.b();
      js<ecj> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      ghz.a $$8 = new ghz.a(btn.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new ghz(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fwd.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new awv(), new fmo());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.z();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new gmv(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fwd.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new xd(20);
      this.O = xi.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.F()) {
         fsw $$9 = fsw.a(this.a, fsw.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(abs $$0) {
      zf.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bvs $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bvs b(abs $$0) {
      bwb<?> $$1 = $$0.f();
      if ($$1 == bwb.bR) {
         gil $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gmx(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bwa.r);
      }
   }

   private void a(bvs $$0) {
      if ($$0 instanceof csh $$1) {
         this.a.ak().a((hkp)(new hki($$1)));
      } else if ($$0 instanceof cih $$2) {
         boolean $$3 = $$2.W_();
         hkc $$4;
         if ($$3) {
            $$4 = new hka($$2);
         } else {
            $$4 = new hkb($$2);
         }

         this.a.ak().a((hkq)$$4);
      }
   }

   @Override
   public void a(afc $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afa $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(acv $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fcu $$2 = $$0.e().a();
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
   public void a(afz $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ahl.b(this.a.t.dA(), this.a.t.dC(), this.a.t.dG(), this.a.t.dL(), this.a.t.dN(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bxf.a) || $$0.f().contains(bxf.b) || $$0.f().contains(bxf.c);
         boolean $$3 = this.s.a($$1) || !$$1.dg() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.by();
            if ($$1.dg()) {
               this.b.a(ahm.a($$1));
            }
         }
      }
   }

   @Override
   public void a(agb $$0) {
      zf.a($$0, this, this.a);
      if (this.a.s != null) {
         btz $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agc $$0) {
      zf.a($$0, this, this.a);
      if (this.a.s != null) {
         btz $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afg $$0) {
      zf.a($$0, this, this.a);
      if (cqh.d($$0.b())) {
         this.a.t.gi().j = $$0.b();
      }
   }

   @Override
   public void a(adl $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.dg()) {
            aiq $$2 = $$1.ap();
            fcu $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               aiq $$4 = $$1.ap();
               fcu $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(adm $$0) {
      zf.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof csh $$2) {
         if ($$2.f() instanceof csw $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aek $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aeg $$0) {
      zf.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bvs $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bvs.e.b);
         }
      });
   }

   @Override
   public void a(aea $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      if (!$$1.bZ()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new ago($$0.b()));
      this.b.a(new ahl.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   private static boolean a(bxe $$0, Set<bxf> $$1, bvs $$2, boolean $$3) {
      bxe $$4 = bxe.a($$2);
      bxe $$5 = bxe.a($$4, $$0, $$1);
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
         bxe $$7 = new bxe($$2.bB(), fcu.c, $$2.N, $$2.O);
         bxe $$8 = bxe.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aeb $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bA();
      this.b.a(new ahl.c($$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(ael $$0) {
      zf.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(add $$0) {
      zf.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adh $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         eat $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(acg $$0) {
      zf.a($$0, this, this.a);

      for (acg.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (acg.a $$2 : $$0.b()) {
         this.s.a(new dgw($$2.b().h, $$2.b().i));
      }

      for (acg.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.aq(); $$6 <= this.s.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adc $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(eat $$0, int $$1, int $$2) {
      eui $$3 = this.s.h().q();
      eau[] $$4 = $$0.d();
      dgw $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         eau $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kl.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.aq(), $$2 - 1, $$1 + 1, this.s.ar(), $$2 + 1);
   }

   @Override
   public void a(acx $$0) {
      zf.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(acx $$0) {
      dgw $$1 = $$0.b();
      this.s.a(() -> {
         eui $$1x = this.s.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kl $$3 = kl.a($$1, $$2);
            $$1x.a(dhy.b, $$3, null);
            $$1x.a(dhy.a, $$3, null);
         }

         for (int $$4 = this.s.aq(); $$4 <= this.s.ar(); $$4++) {
            $$1x.a(kl.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abz $$0) {
      zf.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aft $$0) {
      zf.a($$0, this, this.a);
      this.a.aZ().d();
      this.G();
      fqo.b $$1 = this.a.m.d().k();
      this.a.c(new fza(p, this.b));
      this.b.a(abg.d, new ghx(this.a, this.b, new gie(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(aha.a);
      this.b.a(abg.b);
   }

   @Override
   public void a(afy $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      bwr $$2 = (bwr)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bwg) {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awk.jc, awl.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awk.of, awl.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new glb(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof cmn $$3) {
            cxy $$4 = $$3.f();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bvs.e.b);
            }
         } else if (!($$1 instanceof bwg)) {
            this.s.a($$0.b(), bvs.e.b);
         }
      }
   }

   @Override
   public void a(afv $$0) {
      zf.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adt $$0) {
      zf.a($$0, this, this.a);
      Optional<xo> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gil $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            xm $$4 = $$3.b();
            xq $$5;
            if ($$4 != null) {
               $$5 = new xq($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xq.a($$2);
            }

            xl $$7 = new xl($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(act $$0) {
      zf.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acs $$0) {
      zf.a($$0, this, this.a);
      Optional<xh> $$1 = $$0.b().a(this.O);
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
   public void a(abt $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bwr $$2 = (bwr)$$1;
            $$2.a(btp.a);
         } else if ($$0.e() == 3) {
            bwr $$3 = (bwr)$$1;
            $$3.a(btp.b);
         } else if ($$0.e() == 2) {
            cqi $$4 = (cqi)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lv.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lv.r);
         }
      }
   }

   @Override
   public void a(ada $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(afo $$0) {
      zf.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(aey $$0) {
      zf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afi $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bO();

         for (int $$3 : $$0.b()) {
            bvs $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof csf) {
                        this.a.t.N = $$1.dL();
                        this.a.t.w($$1.dL());
                        this.a.t.r($$1.dL());
                     }

                     wv $$5 = wv.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afb $$0) {
      zf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwp $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cxy a(cqi $$0) {
      for (btp $$1 : btp.values()) {
         cxy $$2 = $$0.b($$1);
         if ($$2.c(kx.I)) {
            return $$2;
         }
      }

      return new cxy(cyc.wx);
   }

   @Override
   public void a(acu $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hkp)(new hkh((cnf)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lv.an, 30);
               this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awk.Ax, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cqi)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hkp)(new hkl((cla)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acq $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(aff $$0) {
      zf.a($$0, this, this.a);
      this.a.t.K($$0.b());
      this.a.t.gt().a($$0.e());
      this.a.t.gt().b($$0.f());
   }

   @Override
   public void a(afe $$0) {
      zf.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aej $$0) {
      zf.a($$0, this, this.a);
      agh $$1 = $$0.b();
      alc<dhp> $$2 = $$1.b();
      js<ecj> $$3 = $$1.a();
      gmw $$4 = this.a.t;
      alc<dhp> $$5 = $$4.dV().aj();
      boolean $$6 = $$2 != $$5;
      fwd.a $$7 = this.a($$4.eG(), $$2, $$5);
      if ($$6) {
         Map<ewl, ewn> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         ghz.a $$12 = new ghz.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new ghz(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gl()) {
         $$4.p();
      }

      gmw $$13;
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
         List<akk.c<?>> $$15 = $$4.au().c();
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
      $$13.k = new gmv(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gz());
      $$13.b($$4.n());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cu = $$4.cu;
      $$13.cv = $$4.cv;
      if (this.a.z instanceof fvj || this.a.z instanceof fvj.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fwd.a a(boolean $$0, alc<dhp> $$1, alc<dhp> $$2) {
      fwd.a $$3 = fwd.a.c;
      if (!$$0) {
         if ($$1 == dhp.j || $$2 == dhp.j) {
            $$3 = fwd.a.a;
         } else if ($$1 == dhp.k || $$2 == dhp.k) {
            $$3 = fwd.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acw $$0) {
      zf.a($$0, this, this.a);
      fcu $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awl.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(acz $$0) {
      zf.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof ckn $$2) {
         gmw $$3 = this.a.t;
         int $$4 = $$0.e();
         btx $$5 = new btx(ckn.v($$4));
         cup $$6 = new cup($$0.b(), $$3.gi(), $$5, $$2, $$4);
         $$3.bP = $$6;
         this.a.a(new fxu($$6, $$3.gi(), $$2, $$4));
      }
   }

   @Override
   public void a(adp $$0) {
      zf.a($$0, this, this.a);
      fvw.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acn $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      cxy $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fxk $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cuq.e($$3) && !$$2.f()) {
            cxy $$7 = $$1.bO.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bO.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bP.l && ($$0.b() != 0 || !$$5)) {
         $$1.bP.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fxk) {
         $$1.bO.a($$3, $$2);
         $$1.bO.d();
      }
   }

   @Override
   public void a(aex $$0) {
      zf.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fxk)) {
         this.a.t.bP.b($$0.b());
      }
   }

   @Override
   public void a(afj $$0) {
      zf.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gi().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acl $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bO.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bP.l) {
         $$1.bP.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adq $$0) {
      zf.a($$0, this, this.a);
      jj $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dwz $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(abx $$0) {
      zf.a($$0, this, this.a);
      jj $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         tw $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dvw && this.a.z instanceof fxf) {
            ((fxf)this.a.z).G();
         }
      });
   }

   @Override
   public void a(acm $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      if ($$1.bP != null && $$1.bP.l == $$0.b()) {
         $$1.bP.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afd $$0) {
      zf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwr $$2) {
         $$0.e().forEach($$1 -> $$2.a((bwc)$$1.getFirst(), (cxy)$$1.getSecond()));
      }
   }

   @Override
   public void a(ack $$0) {
      zf.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(aby $$0) {
      zf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abw $$0) {
      zf.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acy $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      acy.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azk.d($$3 + 0.5F);
      if ($$2 == acy.b) {
         $$1.a(wv.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acy.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == acy.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == acy.e) {
         this.a.r.a(dhm.a($$4));
      } else if ($$2 == acy.f) {
         this.a.a(new fwi(true, () -> {
            this.a.t.j.b(new agx(agx.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == acy.g) {
         fnh $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fvk());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(wv.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(wv.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(wv.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(wv.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == acy.h) {
         this.s.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awk.aF, awl.h, 0.18F, 0.45F);
      } else if ($$2 == acy.i) {
         this.s.e($$3);
      } else if ($$2 == acy.j) {
         this.s.c($$3);
      } else if ($$2 == acy.k) {
         this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awk.vF, awl.g, 1.0F, 1.0F);
      } else if ($$2 == acy.l) {
         this.s.a(lv.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awk.il, awl.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acy.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == acy.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == acy.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(gmw $$0, ghz $$1, fwd.a $$2) {
      this.U = new gii($$0, $$1, this.a.f);
      this.a.a(new fwd(this.U::b, $$2));
   }

   @Override
   public void a(adj $$0) {
      zf.a($$0, this, this.a);
      ewl $$1 = $$0.b();
      ewn $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = ewn.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(ade $$0) {
      zf.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agd $$0) {
      zf.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aem $$0) {
      zf.a($$0, this, this.a);
      ald $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ai $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acj $$0) {
      zf.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(et.a(this.G, this.H)));
   }

   @Override
   public void a(afu $$0) {
      zf.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aci $$0) {
      zf.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agg $$0) {
      zf.a($$0, this, this.a);
      this.D = new gib($$0.b(), $$0.e());
   }

   @Override
   public void a(adz $$0) {
      zf.a($$0, this, this.a);
      fcu $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afx $$0) {
      zf.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abu $$0) {
      zf.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awr<?>> $$1 = (Entry<awr<?>>)$$4.next();
         awr<?> $$2 = (awr<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fwj $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aed $$0) {
      zf.a($$0, this, this.a);
      fmo $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (aed.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fsv.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aee $$0) {
      zf.a($$0, this, this.a);
      fmo $$1 = this.a.t.m();

      for (ddt $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aef $$0) {
      zf.a($$0, this, this.a);
      fmo $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(fmo $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof gaj $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agf $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 instanceof bwr) {
         js<buu> $$2 = $$0.e();
         buw $$3 = new buw($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.l();
         }

         ((bwr)$$1).c($$3, null);
      }
   }

   private <T> kf.a<T> a(alc<? extends kf<? extends T>> $$0, axr.a $$1) {
      kf<T> $$2 = this.G.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(zt $$0) {
      zf.a($$0, this, this.a);
      List<kf.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kj.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kf.a::d);
      this.J = dwk.a(this.G, this.H);
      List<cxy> $$3 = List.copyOf(cwp.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(adu $$0) {
   }

   @Override
   public void a(adv $$0) {
   }

   @Override
   public void a(adw $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new fvj($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gf();
         }
      }
   }

   @Override
   public void a(acd $$0) {
      zf.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(aeu $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adb $$0) {
      zf.a($$0, this, this.a);
      eae $$1 = this.s.A_();
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
   public void a(aep $$0) {
      zf.a($$0, this, this.a);
      this.s.A_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aeq $$0) {
      zf.a($$0, this, this.a);
      this.s.A_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aer $$0) {
      zf.a($$0, this, this.a);
      this.s.A_().a($$0.b());
   }

   @Override
   public void a(aet $$0) {
      zf.a($$0, this, this.a);
      this.s.A_().c($$0.b());
   }

   @Override
   public void a(aes $$0) {
      zf.a($$0, this, this.a);
      this.s.A_().b($$0.b());
   }

   @Override
   public void a(ach $$0) {
      zf.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aen $$0) {
      zf.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gio::b).ifPresent(this.c::a);
         gip.b(this.c);
      }
   }

   @Override
   public void a(acp $$0) {
      zf.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeo $$0) {
      zf.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afp $$0) {
      zf.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afn $$0) {
      zf.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afq $$0) {
      zf.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afw $$0) {
      zf.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeh $$0) {
      zf.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bwr $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adx $$0) {
      zf.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gil $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(ady $$0) {
      zf.a($$0, this, this.a);

      for (ady.b $$1 : $$0.f()) {
         gil $$2 = new gil(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (ady.b $$3 : $$0.e()) {
         gil $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (ady.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(ady.a $$0, ady.b $$1, gil $$2) {
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

   private void a(ady.b $$0, gil $$1) {
      GameProfile $$2 = $$1.a();
      azx $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         xm.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xm $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cql.b var7) {
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
   public void a(ads $$0) {
      zf.a($$0, this, this.a);
      cqi $$1 = this.a.t;
      $$1.gj().b = $$0.e();
      $$1.gj().d = $$0.g();
      $$1.gj().a = $$0.b();
      $$1.gj().c = $$0.f();
      $$1.gj().a($$0.h());
      $$1.gj().b($$0.i());
   }

   @Override
   public void a(afs $$0) {
      zf.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afr $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aca $$0) {
      zf.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(aco $$0) {
      zf.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gE().a($$0.b());
      } else {
         this.a.t.gE().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adn $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.a.t.df();
      if ($$1 != this.a.t && $$1.dg()) {
         fcu $$2 = $$0.b();
         fcu $$3;
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

         this.b.a(ahm.a($$1));
      }
   }

   @Override
   public void a(ado $$0) {
      zf.a($$0, this, this.a);
      cxy $$1 = this.a.t.b($$0.b());
      fxc.a $$2 = fxc.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fxc($$2));
      }
   }

   @Override
   public void a(aaf $$0) {
      if ($$0 instanceof aao $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aan $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof aat $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof aau $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof aaw $$5) {
         ((gsr)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aar $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aap $$7) {
         gru.a $$8 = new gru.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aaq $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof aav $$10) {
         gsp $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aal $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aac $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aab $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aam $$15) {
         this.a.l.p.a($$15.b(), this.s.ae());
      } else if ($$0 instanceof aaj $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aak) {
         this.a.l.s.a();
      } else if ($$0 instanceof aas $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aah $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aai $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aae $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aaf $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afh $$0) {
      zf.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, fec.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fdr $$2 = this.Y.a($$1);
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
   public void a(afl $$0) {
      zf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdy $$2 = fdy.c($$0.b());
      fdr $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fdx $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aei $$0) {
      zf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdy $$2 = fdy.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fdr $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aez $$0) {
      zf.a($$0, this, this.a);
      String $$1 = $$0.e();
      fdr $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(afk $$0) {
      zf.a($$0, this, this.a);
      afk.a $$1 = $$0.e();
      fdu $$2;
      if ($$1 == afk.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afk.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         feb.b $$2x = feb.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         feb.a $$3x = feb.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afk.a $$5 = $$0.b();
      if ($$5 == afk.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == afk.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == afk.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(adf $$0) {
      zf.a($$0, this, this.a);
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
   public void a(age $$0) {
      zf.a($$0, this, this.a);
      bvs $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bwr)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bxu $$2 = ((bwr)$$1).eZ();

            for (age.a $$3 : $$0.e()) {
               bxt $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bxv $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adr $$0) {
      zf.a($$0, this, this.a);
      ctn $$1 = this.a.t.bP;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gaj $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adg $$0) {
      zf.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adh $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adh $$2, boolean $$3) {
      eui $$4 = this.s.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dhy.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dhy.b, $$8, $$9, $$10, $$3);
      $$4.a(new dgw($$0, $$1), true);
   }

   @Override
   public void a(adk $$0) {
      zf.a($$0, this, this.a);
      ctn $$1 = this.a.t.bP;
      if ($$0.b() == $$1.l && $$1 instanceof cuy $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aew $$0) {
      zf.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afm $$0) {
      zf.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(aev $$0) {
      zf.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abv $$0) {
      zf.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acc $$0) {
      zf.a($$0, this, this.a);

      for (zc<? super abr> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aec $$0) {
      zf.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cqq $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(acf $$0) {
      this.R.a();
   }

   @Override
   public void a(ace $$0) {
      this.R.a($$0.b());
      this.b(new agw(this.R.b()));
   }

   @Override
   public void a(acr $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajt $$0) {
      this.S.a($$0);
   }

   @Override
   public void a(aga $$0) {
      zf.a($$0, this, this.a);
      if (this.a.z instanceof fyl $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   private void a(int $$0, int $$1, eui $$2, dhy $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kl.a($$0, $$9, $$1), $$10 ? new eao((byte[])$$6.next().clone()) : new eao());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vo k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gil> l() {
      return this.v;
   }

   public Collection<gil> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gil a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gil a(String $$0) {
      for (gil $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public ghu p() {
      return this.w;
   }

   public CommandDispatcher<fc> q() {
      return this.C;
   }

   public ghz r() {
      return this.s;
   }

   public fms s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alc<dhp>> u() {
      return this.F;
   }

   public kg.b v() {
      return this.G;
   }

   public void a(xl $$0, boolean $$1) {
      xh $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new agr($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayh.c.a();
      xd.a $$3 = this.N.b();
      xh $$4 = this.M.pack(new xo($$0, $$1, $$2, $$3.a()));
      this.b(new agu($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xn<fc> $$1 = xn.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ags($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayh.c.a();
         xd.a $$4 = this.N.b();
         fe $$5 = fe.a($$1, $$3x -> {
            xo $$4x = new xo($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new agt($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xn.a(this.e($$0))) {
         this.b(new ags($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fc> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqx $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new zw($$0));
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
            this.b.a(new ahv());
            this.a.t.v(true);
         }
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(cqk $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xg.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new agv(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gio x() {
      return this.c;
   }

   public cte y() {
      return this.H;
   }

   public boolean a(cte $$0) {
      return $$0.a(this.y());
   }

   public fdz z() {
      return this.Y;
   }

   public czt A() {
      return this.I;
   }

   public dwk B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public gir D() {
      return this.Z;
   }

   public alv E() {
      return this.j;
   }
}
