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

public class gcz extends gcv implements ach, wz {
   private static final Logger k = LogUtils.getLogger();
   private static final xl l = xl.c("multiplayer.unsecureserver.toast.title");
   private static final xl m = xl.c("multiplayer.unsecureserver.toast");
   private static final xl n = xl.c("multiplayer.disconnect.invalid_packet");
   private static final xl o = xl.c("connect.reconfiguring");
   private static final int p = 64;
   private final GameProfile q;
   private gcy r;
   private gcy.a s;
   private final Map<UUID, gdj> t = Maps.newHashMap();
   private final Set<gdj> u = new ReferenceOpenHashSet();
   private final gct v;
   private final gdb w;
   private final fjm x = new fjm(this);
   private int y = 3;
   private int z = 3;
   private final azv A = azv.b();
   private CommandDispatcher<fb> B = new CommandDispatcher();
   private final dax C;
   private final UUID D = UUID.randomUUID();
   private Set<alk<dff>> E;
   private final ke.b F;
   private final crj G;
   private final cyd H;
   private dto I;
   @Nullable
   private xw J;
   private yf.c K = yf.c.a;
   private xt L = new xt(20);
   private xy M = xy.a();
   @Nullable
   private CompletableFuture<Optional<cot>> N;
   @Nullable
   private arc O;
   private final gcs P = new gcs();
   private final gdi Q;
   private final gdd R;
   @Nullable
   private gdg S;
   private boolean T;
   private boolean U = false;
   private volatile boolean V;
   private final faw W = new faw();
   private final gdp X = new gdp();

   public gcz(fjx $$0, wf $$1, gdc $$2) {
      super($$0, $$1, $$2);
      this.q = $$2.a();
      this.F = $$2.c();
      this.G = $$2.d();
      this.v = new gct($$0, this.e);
      this.w = new gdb(this, $$0);
      this.Q = new gdi(this, $$0.aQ().m());
      this.C = new dax(this.F);
      this.R = new gdd(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.H = cyd.a(this.G);
      this.I = dto.a($$2.c(), this.G);
   }

   public gdb g() {
      return this.w;
   }

   public void h() {
      this.V = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.r = null;
      this.S = null;
   }

   public dax j() {
      return this.C;
   }

   @Override
   public void a(ady $$0) {
      zv.a($$0, this, this.a);
      this.a.r = new gdh(this.a, this);
      agt $$1 = $$0.m();
      List<alk<dff>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.E = Sets.newLinkedHashSet($$2);
      alk<dff> $$3 = $$1.b();
      jq<dzj> $$4 = $$1.a();
      this.y = $$0.h();
      this.z = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gcy.a $$8 = new gcy.a(this.G, bse.c, $$0.e(), $$6);
      this.s = $$8;
      this.r = new gcy(this, $$8, $$3, $$4, this.y, this.z, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.r, frn.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.r, new awz(), new fji());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cI());
         }
      }

      this.a.l.a();
      this.a.t.y();
      this.a.t.e($$0.b());
      this.r.d(this.a.t);
      this.a.t.k = new ghs(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.r, frn.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.J = null;
      this.L = new xt(20);
      this.M = xy.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.T = $$0.n();
      if (this.c != null && !this.U && !this.F()) {
         fof $$9 = fof.a(this.a, fof.a.k, l, m);
         this.a.aA().a($$9);
         this.U = true;
      }
   }

   @Override
   public void a(aci $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.r.d($$1);
         this.a($$1);
      } else {
         k.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bui b(aci $$0) {
      bup<?> $$1 = $$0.f();
      if ($$1 == bup.by) {
         gdj $$2 = this.a($$0.e());
         if ($$2 == null) {
            k.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new ghu(this.r, $$2.a());
         }
      } else {
         return $$1.a(this.r, buo.r);
      }
   }

   private void a(bui $$0) {
      if ($$0 instanceof cqo $$1) {
         this.a.ak().a((hcq)(new hcj($$1)));
      } else if ($$0 instanceof cgw $$2) {
         boolean $$3 = $$2.ae_();
         hcd $$4;
         if ($$3) {
            $$4 = new hcb($$2);
         } else {
            $$4 = new hcc($$2);
         }

         this.a.ak().a((hcr)$$4);
      }
   }

   @Override
   public void a(acj $$0) {
      zv.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bui $$4 = new buu(this.r, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.r.d($$4);
   }

   @Override
   public void a(afp $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afn $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.aw().a($$0.e());
      }
   }

   @Override
   public void a(agm $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.dk()) {
            float $$5 = $$0.h();
            float $$6 = $$0.i();
            if (this.r.a($$1)) {
               $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            } else {
               $$1.b($$2, $$3, $$4, $$5, $$6);
            }

            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(agn $$0) {
      zv.a($$0, this, this.a);
      if (this.a.s != null) {
         bsq $$1 = this.a.s.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(ago $$0) {
      zv.a($$0, this, this.a);
      if (this.a.s != null) {
         bsq $$1 = this.a.s.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aft $$0) {
      zv.a($$0, this, this.a);
      if (coq.d($$0.b())) {
         this.a.t.gl().j = $$0.b();
      }
   }

   @Override
   public void a(aeb $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = $$0.a(this.r);
      if ($$1 != null) {
         if (!$$1.dk()) {
            if ($$0.j()) {
               aiy $$2 = $$1.aq();
               ezr $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aec $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = $$0.a(this.r);
      if ($$1 instanceof cqo $$2) {
         if (!$$1.dk() && $$2.m() instanceof crc $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aex $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = $$0.a(this.r);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aet $$0) {
      zv.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.r.a($$0x, bui.c.b));
   }

   @Override
   public void a(aeq $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      bvr $$2 = bvr.a($$1);
      bvr $$3 = bvr.a($$0);
      bvr $$4 = bvr.a($$2, $$3, $$0.i());
      $$1.b($$4.a());
      $$1.h($$4.b());
      $$1.v($$4.c());
      $$1.w($$4.d());
      bvr $$5 = new bvr($$1.bE(), $$1.dB(), $$1.O, $$1.P);
      bvr $$6 = bvr.a($$5, $$3, $$0.i());
      $$1.c($$6.a(), $$6.c(), $$6.d());
      this.b.a(new aha($$0.b()));
      this.b.a(new ahx.b($$1.dD(), $$1.dF(), $$1.dJ(), $$1.dO(), $$1.dQ(), false, false));
   }

   @Override
   public void a(aey $$0) {
      zv.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.r.b($$0x, $$1, 19));
   }

   @Override
   public void a(adt $$0) {
      zv.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adx $$3 = $$0.g();
      this.r.a(() -> {
         this.a($$1, $$2, $$3, false);
         dxt $$3x = this.r.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acx $$0) {
      zv.a($$0, this, this.a);

      for (acx.a $$1 : $$0.b()) {
         this.r.h().a($$1.b().g, $$1.b().h, $$1.a());
      }

      for (acx.a $$2 : $$0.b()) {
         this.r.a(new del($$2.b().g, $$2.b().h));
      }

      for (acx.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.r.an(); $$6 <= this.r.ao(); $$6++) {
                  this.a.f.b($$3.b().g + $$4, $$6, $$3.b().h + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, ads $$2) {
      this.r.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dxt $$0, int $$1, int $$2) {
      erd $$3 = this.r.h().p();
      dxu[] $$4 = $$0.d();
      del $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dxu $$7 = $$4[$$6];
         int $$8 = this.r.h($$6);
         $$3.a(kj.a($$5, $$8), $$7.c());
      }

      this.r.b($$1 - 1, this.r.an(), $$2 - 1, $$1 + 1, this.r.ao(), $$2 + 1);
   }

   @Override
   public void a(adn $$0) {
      zv.a($$0, this, this.a);
      this.r.h().a($$0.b());
      this.b($$0);
   }

   private void b(adn $$0) {
      del $$1 = $$0.b();
      this.r.a(() -> {
         erd $$1x = this.r.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kj $$3 = kj.a($$1, $$2);
            $$1x.a(dfo.b, $$3, null);
            $$1x.a(dfo.a, $$3, null);
         }

         for (int $$4 = this.r.an(); $$4 <= this.r.ao(); $$4++) {
            $$1x.a(kj.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acq $$0) {
      zv.a($$0, this, this.a);
      this.r.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agg $$0) {
      zv.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      flx.b $$1 = this.a.m.d().k();
      this.a.c(new fuh(o, this.b));
      this.b.a(abw.d, new gcw(this.a, this.b, new gdc(this.q, this.e, this.F, this.G, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahm.a);
      this.b.a(abw.b);
   }

   @Override
   public void a(agl $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      bve $$2 = (bve)this.r.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof buu) {
            this.r.a($$1.dD(), $$1.dF(), $$1.dJ(), awo.iI, awp.h, 0.1F, (this.A.i() - this.A.i()) * 0.35F + 0.9F, false);
         } else {
            this.r.a($$1.dD(), $$1.dF(), $$1.dJ(), awo.nB, awp.h, 0.2F, (this.A.i() - this.A.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gfz(this.a.aq(), this.a.aR(), this.r, $$1, $$2));
         if ($$1 instanceof ckz $$3) {
            cwf $$4 = $$3.m();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.r.a($$0.b(), bui.c.b);
            }
         } else if (!($$1 instanceof buu)) {
            this.r.a($$0.b(), bui.c.b);
         }
      }
   }

   @Override
   public void a(agi $$0) {
      zv.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aej $$0) {
      zv.a($$0, this, this.a);
      Optional<ye> $$1 = $$0.g().a(this.M);
      if ($$1.isEmpty()) {
         this.b.a(n);
      } else {
         this.M.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gdj $$3 = this.a($$2);
         if ($$3 == null) {
            k.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            yc $$4 = $$3.b();
            yg $$5;
            if ($$4 != null) {
               $$5 = new yg($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yg.a($$2);
            }

            yb $$7 = new yb($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adk $$0) {
      zv.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adj $$0) {
      zv.a($$0, this, this.a);
      Optional<xx> $$1 = $$0.b().a(this.M);
      if ($$1.isEmpty()) {
         this.b.a(n);
      } else {
         this.L.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(ack $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bve $$2 = (bve)$$1;
            $$2.a(bsg.a);
         } else if ($$0.e() == 3) {
            bve $$3 = (bve)$$1;
            $$3.a(bsg.b);
         } else if ($$0.e() == 2) {
            cor $$4 = (cor)$$1;
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
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(agb $$0) {
      zv.a($$0, this, this.a);
      this.a.s.b($$0.b());
      this.a.s.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afl $$0) {
      zv.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afv $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.e());
      if ($$1 == null) {
         k.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bR();

         for (int $$3 : $$0.b()) {
            bui $$4 = this.r.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cqq) {
                     this.a.t.O = $$1.dO();
                     this.a.t.v($$1.dO());
                     this.a.t.q($$1.dO());
                  }

                  xl $$5 = xl.a("mount.onboard", this.a.n.A.k());
                  this.a.m.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afo $$0) {
      zv.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof bvc $$2) {
         $$2.h_($$0.e());
      }
   }

   private static cwf a(cor $$0) {
      for (bsg $$1 : bsg.values()) {
         cwf $$2 = $$0.b($$1);
         if ($$2.b(ku.H)) {
            return $$2;
         }
      }

      return new cwf(cwj.vL);
   }

   @Override
   public void a(adl $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = $$0.a(this.r);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hcq)(new hci((clr)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ls.ak, 30);
               this.r.a($$1.dD(), $$1.dF(), $$1.dJ(), awo.zD, $$1.do(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cor)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hcq)(new hcm((cjm)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.r));
      }
   }

   @Override
   public void a(afs $$0) {
      zv.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gw().a($$0.e());
      this.a.t.gw().b($$0.f());
   }

   @Override
   public void a(afr $$0) {
      zv.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aew $$0) {
      zv.a($$0, this, this.a);
      agt $$1 = $$0.b();
      alk<dff> $$2 = $$1.b();
      jq<dzj> $$3 = $$1.a();
      ght $$4 = this.a.t;
      alk<dff> $$5 = $$4.dY().ag();
      boolean $$6 = $$2 != $$5;
      frn.a $$7 = this.a($$4.eI(), $$2, $$5);
      if ($$6) {
         Map<etg, eti> $$8 = this.r.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gcy.a $$12 = new gcy.a(this.G, this.s.q(), this.s.l(), $$10);
         this.s = $$12;
         this.r = new gcy(this, $$12, $$2, $$3, this.y, this.z, this.a.f, $$9, $$1.c(), $$11);
         this.r.a($$8);
         this.a.a(this.r, $$7);
      }

      this.a.u = null;
      if ($$4.gn()) {
         $$4.s();
      }

      ght $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.r, $$4.i(), $$4.j(), $$4.cf(), $$4.cl());
      } else {
         $$13 = this.a.r.a(this.r, $$4.i(), $$4.j());
      }

      this.a($$13, this.r, $$7);
      $$13.e($$4.as());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<aks.c<?>> $$15 = $$4.aw().c();
         if ($$15 != null) {
            $$13.aw().a($$15);
         }

         $$13.h($$4.dB());
         $$13.v($$4.dO());
         $$13.w($$4.dQ());
      } else {
         $$13.y();
         $$13.v(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.fb().a($$4.fb());
      } else {
         $$13.fb().b($$4.fb());
      }

      this.r.d($$13);
      $$13.k = new ghs(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gC());
      $$13.b($$4.m());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cF = $$4.cF;
      $$13.cG = $$4.cG;
      if (this.a.z instanceof fqt || this.a.z instanceof fqt.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private frn.a a(boolean $$0, alk<dff> $$1, alk<dff> $$2) {
      frn.a $$3 = frn.a.c;
      if (!$$0) {
         if ($$1 == dff.j || $$2 == dff.j) {
            $$3 = frn.a.a;
         } else if ($$1 == dff.k || $$2 == dff.k) {
            $$3 = frn.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adm $$0) {
      zv.a($$0, this, this.a);
      ezr $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awp.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adp $$0) {
      zv.a($$0, this, this.a);
      if (this.r.a($$0.f()) instanceof ciz $$2) {
         ght $$3 = this.a.t;
         int $$4 = $$0.e();
         bso $$5 = new bso(ciz.w($$4));
         csu $$6 = new csu($$0.b(), $$3.gl(), $$5, $$2, $$4);
         $$3.cd = $$6;
         this.a.a(new ftd($$6, $$3.gl(), $$2, $$4));
      }
   }

   @Override
   public void a(aef $$0) {
      zv.a($$0, this, this.a);
      frg.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ade $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      cwf $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fst $$4) {
         $$5 = !$$4.F();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (csv.e($$3) && !$$2.f()) {
            cwf $$7 = $$1.cc.b($$3).g();
            if ($$7.f() || $$7.L() < $$2.L()) {
               $$2.d(5);
            }
         }

         $$1.cc.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cd.l && ($$0.b() != 0 || !$$5)) {
         $$1.cd.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fst) {
         $$1.cc.a($$3, $$2);
         $$1.cc.d();
      }
   }

   @Override
   public void a(afk $$0) {
      zv.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fst)) {
         this.a.t.cd.b($$0.b());
      }
   }

   @Override
   public void a(afw $$0) {
      zv.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gl().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adc $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.l) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aeg $$0) {
      zv.a($$0, this, this.a);
      jh $$1 = $$0.b();
      if (this.r.c_($$1) instanceof dud $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         k.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.r.c_($$1), $$1);
      }
   }

   @Override
   public void a(aco $$0) {
      zv.a($$0, this, this.a);
      jh $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         un $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.F);
         }

         if ($$1x instanceof dtb && this.a.z instanceof fso) {
            ((fso)this.a.z).F();
         }
      });
   }

   @Override
   public void a(add $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      if ($$1.cd != null && $$1.cd.l == $$0.b()) {
         $$1.cd.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afq $$0) {
      zv.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof bve $$2) {
         $$0.e().forEach($$1 -> $$2.a((buq)$$1.getFirst(), (cwf)$$1.getSecond()));
      }
   }

   @Override
   public void a(adb $$0) {
      zv.a($$0, this, this.a);
      this.a.t.d();
   }

   @Override
   public void a(acp $$0) {
      zv.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acn $$0) {
      zv.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ado $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      ado.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azn.d($$3 + 0.5F);
      if ($$2 == ado.b) {
         $$1.a(xl.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ado.c) {
         this.r.j().b(true);
         this.r.e(0.0F);
      } else if ($$2 == ado.d) {
         this.r.j().b(false);
         this.r.e(1.0F);
      } else if ($$2 == ado.e) {
         this.a.r.a(dfc.a($$4));
      } else if ($$2 == ado.f) {
         this.a.a(new frs(true, () -> {
            this.a.t.j.b(new ahj(ahj.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == ado.g) {
         fkb $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fqu());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xl.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xl.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xl.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xl.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == ado.h) {
         this.r.a($$1, $$1.dD(), $$1.dH(), $$1.dJ(), awo.aF, awp.h, 0.18F, 0.45F);
      } else if ($$2 == ado.i) {
         this.r.e($$3);
      } else if ($$2 == ado.j) {
         this.r.c($$3);
      } else if ($$2 == ado.k) {
         this.r.a($$1, $$1.dD(), $$1.dF(), $$1.dJ(), awo.uU, awp.g, 1.0F, 1.0F);
      } else if ($$2 == ado.l) {
         this.r.a(ls.q, $$1.dD(), $$1.dF(), $$1.dJ(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.r.a($$1, $$1.dD(), $$1.dF(), $$1.dJ(), awo.hR, awp.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ado.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == ado.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == ado.o && this.S != null) {
         this.S.c();
      }
   }

   private void a(ght $$0, gcy $$1, frn.a $$2) {
      this.S = new gdg($$0, $$1, this.a.f);
      this.a.a(new frn(this.S::b, $$2));
   }

   @Override
   public void a(adz $$0) {
      zv.a($$0, this, this.a);
      etg $$1 = $$0.b();
      eti $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = eti.a($$0.e(), $$0.f(), this.a.s.ag());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adu $$0) {
      zv.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agp $$0) {
      zv.a($$0, this, this.a);
      this.v.a($$0);
   }

   @Override
   public void a(aez $$0) {
      zv.a($$0, this, this.a);
      all $$1 = $$0.b();
      if ($$1 == null) {
         this.v.a(null, false);
      } else {
         ah $$2 = this.v.a($$1);
         this.v.a($$2, false);
      }
   }

   @Override
   public void a(ada $$0) {
      zv.a($$0, this, this.a);
      this.B = new CommandDispatcher($$0.a(es.a(this.F, this.G)));
   }

   @Override
   public void a(agh $$0) {
      zv.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zv.a($$0, this, this.a);
      this.w.a($$0.e(), $$0.b());
   }

   @Override
   public void a(ags $$0) {
      zv.a($$0, this, this.a);
      this.C.a($$0.b());
      fji $$1 = this.a.t.j();
      $$1.a(this.C.d(), this.a.s.H_());
      this.X.a($$1, this.F);
   }

   @Override
   public void a(aep $$0) {
      zv.a($$0, this, this.a);
      ezr $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agk $$0) {
      zv.a($$0, this, this.a);
      if (!this.x.a($$0.b(), $$0.e())) {
         k.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acl $$0) {
      zv.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awv<?>> $$1 = (Entry<awv<?>>)$$4.next();
         awv<?> $$2 = (awv<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.i().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof frt $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aes $$0) {
      zv.a($$0, this, this.a);
      fji $$1 = this.a.t.j();
      $$1.a($$0.f());
      aes.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (all $$3 : $$0.b()) {
               this.C.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (all $$4 : $$0.b()) {
               this.C.a($$4).ifPresent($$1::a);
            }

            for (all $$5 : $$0.e()) {
               this.C.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (all $$6 : $$0.b()) {
               this.C.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     foe.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fvr) {
         ((fvr)this.a.z).F();
      }
   }

   @Override
   public void a(agr $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 instanceof bve) {
         jq<btl> $$2 = $$0.e();
         btn $$3 = new btn($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bve)$$1).c($$3, null);
      }
   }

   private <T> kd.a<T> a(alk<? extends kd<? extends T>> $$0, axv.a $$1) {
      kd<T> $$2 = this.F.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aaj $$0) {
      zv.a($$0, this, this.a);
      List<kd.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kh.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kd.a::c);
      this.I = dto.a(this.F, this.G);
      List<cwf> $$3 = List.copyOf(cuv.e().l());
      this.X.a($$3);
   }

   @Override
   public void a(aek $$0) {
   }

   @Override
   public void a(ael $$0) {
   }

   @Override
   public void a(aem $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.m()) {
            this.a.a(new fqt($$0.e(), this.r.j().l()));
         } else {
            this.a.t.gj();
         }
      }
   }

   @Override
   public void a(acu $$0) {
      zv.a($$0, this, this.a);
      this.s.a($$0.e());
      this.s.a($$0.b());
   }

   @Override
   public void a(afh $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adr $$0) {
      zv.a($$0, this, this.a);
      dxe $$1 = this.r.C_();
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
   public void a(afc $$0) {
      zv.a($$0, this, this.a);
      this.r.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afd $$0) {
      zv.a($$0, this, this.a);
      this.r.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afe $$0) {
      zv.a($$0, this, this.a);
      this.r.C_().a($$0.b());
   }

   @Override
   public void a(afg $$0) {
      zv.a($$0, this, this.a);
      this.r.C_().c($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zv.a($$0, this, this.a);
      this.r.C_().b($$0.b());
   }

   @Override
   public void a(acy $$0) {
      zv.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(afa $$0) {
      zv.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gdm::b).ifPresent(this.c::a);
         gdn.b(this.c);
      }
   }

   @Override
   public void a(adg $$0) {
      zv.a($$0, this, this.a);
      this.w.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afb $$0) {
      zv.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(agc $$0) {
      zv.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(aga $$0) {
      zv.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(agd $$0) {
      zv.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agj $$0) {
      zv.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeu $$0) {
      zv.a($$0, this, this.a);
      if ($$0.a(this.r) instanceof bve $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aen $$0) {
      zv.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gdj $$2 = this.t.remove($$1);
         if ($$2 != null) {
            this.u.remove($$2);
         }
      }
   }

   @Override
   public void a(aeo $$0) {
      zv.a($$0, this, this.a);

      for (aeo.b $$1 : $$0.f()) {
         gdj $$2 = new gdj(Objects.requireNonNull($$1.b()), this.F());
         if (this.t.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aeo.b $$3 : $$0.e()) {
         gdj $$4 = this.t.get($$3.a());
         if ($$4 == null) {
            k.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aeo.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aeo.a $$0, aeo.b $$1, gdj $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cI().equals($$1.a())) {
               this.a.t.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.u.add($$2);
            } else {
               this.u.remove($$2);
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

   private void a(aeo.b $$0, gdj $$1) {
      GameProfile $$2 = $$1.a();
      baa $$3 = this.a.aW();
      if ($$3 == null) {
         k.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         yc.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               yc $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cou.b var7) {
               k.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aX() && this.T;
   }

   @Override
   public void a(aei $$0) {
      zv.a($$0, this, this.a);
      cor $$1 = this.a.t;
      $$1.gm().b = $$0.e();
      $$1.gm().d = $$0.g();
      $$1.gm().a = $$0.b();
      $$1.gm().c = $$0.f();
      $$1.gm().a($$0.h());
      $$1.gm().b($$0.i());
   }

   @Override
   public void a(agf $$0) {
      zv.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(age $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acr $$0) {
      zv.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(adf $$0) {
      zv.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gH().a($$0.b());
      } else {
         this.a.t.gH().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aed $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.a.t.di();
      if ($$1 != this.a.t && $$1.dk()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahy($$1));
      }
   }

   @Override
   public void a(aee $$0) {
      zv.a($$0, this, this.a);
      cwf $$1 = this.a.t.b($$0.b());
      fsl.a $$2 = fsl.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fsl($$2));
      }
   }

   @Override
   public void a(aav $$0) {
      if ($$0 instanceof abe $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abd $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abj $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abk $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abm $$5) {
         ((gno)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abh $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abf $$7) {
         gmr.a $$8 = new gmr.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abg $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abl $$10) {
         gnm $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof abb $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aas $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aar $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof abc $$15) {
         this.a.l.p.a($$15.b(), this.r.aa());
      } else if ($$0 instanceof aaz $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aba) {
         this.a.l.s.a();
      } else if ($$0 instanceof abi $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aax $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aay $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aau $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aav $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afu $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.W.a($$1, faz.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fao $$2 = this.W.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.W.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afy $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      fav $$2 = fav.c($$0.b());
      fao $$3 = this.W.a($$1);
      if ($$3 != null) {
         fau $$4 = this.W.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         k.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aev $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      fav $$2 = fav.c($$0.b());
      if ($$1 == null) {
         this.W.b($$2);
      } else {
         fao $$3 = this.W.a($$1);
         if ($$3 != null) {
            this.W.e($$2, $$3);
         } else {
            k.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afm $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      fao $$2 = $$1 == null ? null : this.W.a($$1);
      this.W.a($$0.b(), $$2);
   }

   @Override
   public void a(afx $$0) {
      zv.a($$0, this, this.a);
      afx.a $$1 = $$0.e();
      far $$2;
      if ($$1 == afx.a.a) {
         $$2 = this.W.c($$0.f());
      } else {
         $$2 = this.W.b($$0.f());
         if ($$2 == null) {
            k.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afx.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fay.b $$2x = fay.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fay.a $$3x = fay.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afx.a $$5 = $$0.b();
      if ($$5 == afx.a.a) {
         for (String $$6 : $$0.g()) {
            this.W.a($$6, $$2);
         }
      } else if ($$5 == afx.a.b) {
         for (String $$7 : $$0.g()) {
            this.W.b($$7, $$2);
         }
      }

      if ($$1 == afx.a.b) {
         this.W.d($$2);
      }
   }

   @Override
   public void a(adv $$0) {
      zv.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.r.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            k.warn("Could not spawn particle effect {}", $$0.m());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.l(); $$5++) {
            double $$6 = this.A.k() * (double)$$0.h();
            double $$7 = this.A.k() * (double)$$0.i();
            double $$8 = this.A.k() * (double)$$0.j();
            double $$9 = this.A.k() * (double)$$0.k();
            double $$10 = this.A.k() * (double)$$0.k();
            double $$11 = this.A.k() * (double)$$0.k();

            try {
               this.r.a($$0.m(), $$0.b(), $$0.e() + $$6, $$0.f() + $$7, $$0.g() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               k.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(agq $$0) {
      zv.a($$0, this, this.a);
      bui $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bve)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bwj $$2 = ((bve)$$1).fb();

            for (agq.a $$3 : $$0.e()) {
               bwi $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  k.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bwk $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      zv.a($$0, this, this.a);
      crs $$1 = this.a.t.cd;
      if ($$1.l == $$0.e()) {
         this.C.a($$0.b()).ifPresent($$0x -> {
            if (this.a.z instanceof fvr $$2) {
               $$2.G().a($$0x);
            }
         });
      }
   }

   @Override
   public void a(adw $$0) {
      zv.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adx $$3 = $$0.f();
      this.r.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adx $$2, boolean $$3) {
      erd $$4 = this.r.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dfo.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dfo.b, $$8, $$9, $$10, $$3);
      $$4.a(new del($$0, $$1), true);
   }

   @Override
   public void a(aea $$0) {
      zv.a($$0, this, this.a);
      crs $$1 = this.a.t.cd;
      if ($$0.b() == $$1.l && $$1 instanceof ctd $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afj $$0) {
      zv.a($$0, this, this.a);
      this.y = $$0.b();
      this.a.n.b(this.y);
      this.r.h().a($$0.b());
   }

   @Override
   public void a(afz $$0) {
      zv.a($$0, this, this.a);
      this.z = $$0.b();
      this.r.i(this.z);
   }

   @Override
   public void a(afi $$0) {
      zv.a($$0, this, this.a);
      this.r.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      zv.a($$0, this, this.a);
      this.r.b($$0.b());
   }

   @Override
   public void a(act $$0) {
      zv.a($$0, this, this.a);

      for (zs<? super ach> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aer $$0) {
      zv.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof coz $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(acw $$0) {
      this.P.a();
   }

   @Override
   public void a(acv $$0) {
      this.P.a($$0.b());
      this.b(new ahi(this.P.b()));
   }

   @Override
   public void a(adi $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(akb $$0) {
      this.Q.a($$0);
   }

   private void a(int $$0, int $$1, erd $$2, dfo $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kj.a($$0, $$9, $$1), $$10 ? new dxo((byte[])$$6.next().clone()) : new dxo());
            if ($$7) {
               this.r.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wf k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.V;
   }

   public Collection<gdj> l() {
      return this.u;
   }

   public Collection<gdj> m() {
      return this.t.values();
   }

   public Collection<UUID> n() {
      return this.t.keySet();
   }

   @Nullable
   public gdj a(UUID $$0) {
      return this.t.get($$0);
   }

   @Nullable
   public gdj a(String $$0) {
      for (gdj $$1 : this.t.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.q;
   }

   public gct p() {
      return this.v;
   }

   public CommandDispatcher<fb> q() {
      return this.B;
   }

   public gcy r() {
      return this.r;
   }

   public fjm s() {
      return this.x;
   }

   public UUID t() {
      return this.D;
   }

   public Set<alk<dff>> u() {
      return this.E;
   }

   public ke.b v() {
      return this.F;
   }

   public void a(yb $$0, boolean $$1) {
      xx $$2 = $$0.l();
      if ($$2 != null && this.L.a($$2, $$1) && this.L.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.L.a();
      if ($$0 > 0) {
         this.b(new ahd($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayl.c.a();
      xt.a $$3 = this.L.b();
      xx $$4 = this.K.pack(new ye($$0, $$1, $$2, $$3.a()));
      this.b(new ahg($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yd<fb> $$1 = yd.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahe($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayl.c.a();
         xt.a $$4 = this.L.b();
         fd $$5 = fd.a($$1, $$3x -> {
            ye $$4x = new ye($$3x, $$2, $$3, $$4.a());
            return this.K.pack($$4x);
         });
         this.b(new ahf($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yd.a(this.e($$0))) {
         this.b(new ahe($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fb> e(String $$0) {
      return this.B.parse($$0, this.w);
   }

   public void a(arc $$0) {
      if (!$$0.equals(this.O)) {
         this.b(new aam($$0));
         this.O = $$0;
      }
   }

   @Override
   public void d() {
      if (this.J != null && this.a.w().b()) {
         this.w();
      }

      if (this.N != null && this.N.isDone()) {
         this.N.join().ifPresent(this::a);
         this.N = null;
      }

      this.e();
      if (this.a.aQ().f()) {
         this.Q.a();
      }

      this.R.a();
      this.e.a();
      if (this.S != null) {
         this.S.a();
      }
   }

   public void w() {
      this.N = this.a.w().a();
   }

   private void a(cot $$0) {
      if (this.a.b(this.q.getId())) {
         if (this.J == null || !this.J.c().equals($$0)) {
            this.J = xw.a($$0);
            this.K = this.J.a(this.q.getId());
            this.b(new ahh(this.J.a().a()));
         }
      }
   }

   @Nullable
   public gdm x() {
      return this.c;
   }

   public crj y() {
      return this.G;
   }

   public boolean a(crj $$0) {
      return $$0.a(this.y());
   }

   public faw z() {
      return this.W;
   }

   public cyd A() {
      return this.H;
   }

   public dto B() {
      return this.I;
   }

   public void C() {
      this.X.a();
   }

   public gdp D() {
      return this.X;
   }

   public amd E() {
      return this.j;
   }
}
