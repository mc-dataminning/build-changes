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

public class gbi extends gbe implements abz, wr {
   private static final Logger l = LogUtils.getLogger();
   private static final xd m = xd.c("multiplayer.unsecureserver.toast.title");
   private static final xd n = xd.c("multiplayer.unsecureserver.toast");
   private static final xd o = xd.c("multiplayer.disconnect.invalid_packet");
   private static final xd p = xd.c("connect.reconfiguring");
   private static final int q = 64;
   private final GameProfile r;
   private gbh s;
   private gbh.a t;
   private final Map<UUID, gbs> u = Maps.newHashMap();
   private final Set<gbs> v = new ReferenceOpenHashSet();
   private final gbc w;
   private final gbk x;
   private final fia y = new fia(this);
   private int z = 3;
   private int A = 3;
   private final azl B = azl.b();
   private CommandDispatcher<ey> C = new CommandDispatcher();
   private final dal D;
   private final UUID E = UUID.randomUUID();
   private Set<alb<deg>> F;
   private final kb.b G;
   private final cqn H;
   private final cxn I;
   private dsp J;
   @Nullable
   private xo K;
   private xx.c L = xx.c.a;
   private xl M = new xl(20);
   private xq N = xq.a();
   @Nullable
   private CompletableFuture<Optional<cnw>> O;
   @Nullable
   private aqt P;
   private final gbb Q = new gbb();
   private final gbr R;
   private final gbm S;
   @Nullable
   private gbp T;
   private boolean U;
   private boolean V = false;
   private volatile boolean W;
   private final ezx X = new ezx();
   private final gby Y = new gby();

   public gbi(fil $$0, vx $$1, gbl $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gbc($$0, this.e);
      this.x = new gbk(this, $$0);
      this.R = new gbr(this, $$0.aR().m());
      this.D = new dal(this.G);
      this.S = new gbm(this, $$0.aR());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = cxn.a(this.H);
      this.J = dsp.a($$2.c(), this.H);
   }

   public gbk g() {
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

   public dal j() {
      return this.D;
   }

   @Override
   public void a(adq $$0) {
      zn.a($$0, this, this.a);
      this.a.r = new gbq(this.a, this);
      agl $$1 = $$0.m();
      List<alb<deg>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alb<deg> $$3 = $$1.b();
      jn<dyk> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gbh.a $$8 = new gbh.a(this.H, brm.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gbh(this, $$8, $$3, $$4, this.z, this.A, this.a::aK, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fqb.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new awp(), new fhw());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cD());
         }
      }

      this.a.l.a();
      this.a.t.y();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.cx = new ggb(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fqb.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.K = null;
      this.M = new xl(20);
      this.N = xq.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.U = $$0.n();
      if (this.c != null && !this.V && !this.F()) {
         fmt $$9 = fmt.a(this.a, fmt.a.k, m, n);
         this.a.aA().a($$9);
         this.V = true;
      }
   }

   @Override
   public void a(aca $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bto b(aca $$0) {
      btv<?> $$1 = $$0.f();
      if ($$1 == btv.by) {
         gbs $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new ggd(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, btu.r);
      }
   }

   private void a(bto $$0) {
      if ($$0 instanceof cps $$1) {
         this.a.ak().a((hav)(new hao($$1)));
      } else if ($$0 instanceof cgb $$2) {
         boolean $$3 = $$2.ac_();
         hai $$4;
         if ($$3) {
            $$4 = new hag($$2);
         } else {
            $$4 = new hah($$2);
         }

         this.a.ak().a((haw)$$4);
      }
   }

   @Override
   public void a(acb $$0) {
      zn.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bto $$4 = new bua(this.s, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.s.d($$4);
   }

   @Override
   public void a(afh $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aff $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.at().a($$0.e());
      }
   }

   @Override
   public void a(age $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.de()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
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
   public void a(agf $$0) {
      zn.a($$0, this, this.a);
      if (this.a.s != null) {
         bry $$1 = this.a.s.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agg $$0) {
      zn.a($$0, this, this.a);
      if (this.a.s != null) {
         bry $$1 = this.a.s.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afl $$0) {
      zn.a($$0, this, this.a);
      if (cnt.d($$0.b())) {
         this.a.t.gc().j = $$0.b();
      }
   }

   @Override
   public void a(adt $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if (!$$1.de()) {
            if ($$0.j()) {
               aiq $$2 = $$1.an();
               eys $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.O_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.N_(), $$6, $$7, 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(adu $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = $$0.a(this.s);
      if ($$1 instanceof cps $$2) {
         if (!$$1.de() && $$2.m() instanceof cqg $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aep $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = $$0.a(this.s);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(ael $$0) {
      zn.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.s.a($$0x, bto.c.b));
   }

   @Override
   public void a(aei $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      eys $$2 = $$1.dv();
      boolean $$3 = $$0.j().contains(bux.a);
      boolean $$4 = $$0.j().contains(bux.b);
      boolean $$5 = $$0.j().contains(bux.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dx() + $$0.b();
         $$1.ab = $$1.ab + $$0.b();
         $$1.L = $$1.L + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ab = $$7;
         $$1.L = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dz() + $$0.e();
         $$1.ac = $$1.ac + $$0.e();
         $$1.M = $$1.M + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.ac = $$11;
         $$1.M = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dD() + $$0.f();
         $$1.ad = $$1.ad + $$0.f();
         $$1.N = $$1.N + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.ad = $$15;
         $$1.N = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.n($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(bux.e)) {
         $$1.w($$1.dK() + $$19);
         $$1.P += $$19;
      } else {
         $$1.w($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(bux.d)) {
         $$1.v($$1.dI() + $$18);
         $$1.O += $$18;
      } else {
         $$1.v($$18);
         $$1.O = $$18;
      }

      this.b.a(new ags($$0.i()));
      this.b.a(new ahp.b($$1.dx(), $$1.dz(), $$1.dD(), $$1.dI(), $$1.dK(), false, false));
   }

   @Override
   public void a(aeq $$0) {
      zn.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adl $$0) {
      zn.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adp $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         dwu $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acp $$0) {
      zn.a($$0, this, this.a);

      for (acp.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acp.a $$2 : $$0.b()) {
         this.s.a(new ddm($$2.b().e, $$2.b().f));
      }

      for (acp.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.ap(); $$6 <= this.s.aq(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adk $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dwu $$0, int $$1, int $$2) {
      eqe $$3 = this.s.h().p();
      dwv[] $$4 = $$0.d();
      ddm $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dwv $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(kg.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.ap(), $$2 - 1, $$1 + 1, this.s.aq(), $$2 + 1);
   }

   @Override
   public void a(adf $$0) {
      zn.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(adf $$0) {
      ddm $$1 = $$0.b();
      this.s.a(() -> {
         eqe $$1x = this.s.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kg $$3 = kg.a($$1, $$2);
            $$1x.a(dep.b, $$3, null);
            $$1x.a(dep.a, $$3, null);
         }

         for (int $$4 = this.s.ap(); $$4 <= this.s.aq(); $$4++) {
            $$1x.a(kg.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aci $$0) {
      zn.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afy $$0) {
      zn.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      fkl.b $$1 = this.a.m.d().k();
      this.a.c(new fsv(p, this.b));
      this.b.a(abo.d, new gbf(this.a, this.b, new gbl(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.i, $$1, this.h, this.j, this.k)));
      this.b(ahe.a);
      this.b.a(abo.b);
   }

   @Override
   public void a(agd $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      buk $$2 = (buk)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bua) {
            this.s.a($$1.dx(), $$1.dz(), $$1.dD(), awe.iI, awf.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dx(), $$1.dz(), $$1.dD(), awe.nD, awf.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gei(this.a.aq(), this.a.aS(), this.s, $$1, $$2));
         if ($$1 instanceof cke $$3) {
            cvp $$4 = $$3.m();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bto.c.b);
            }
         } else if (!($$1 instanceof bua)) {
            this.s.a($$0.b(), bto.c.b);
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zn.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeb $$0) {
      zn.a($$0, this, this.a);
      Optional<xw> $$1 = $$0.g().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gbs $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            xu $$4 = $$3.b();
            xy $$5;
            if ($$4 != null) {
               $$5 = new xy($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xy.a($$2);
            }

            xt $$7 = new xt($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adc $$0) {
      zn.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adb $$0) {
      zn.a($$0, this, this.a);
      Optional<xp> $$1 = $$0.b().a(this.N);
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
   public void a(acc $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            buk $$2 = (buk)$$1;
            $$2.a(bro.a);
         } else if ($$0.e() == 3) {
            buk $$3 = (buk)$$1;
            $$3.a(bro.b);
         } else if ($$0.e() == 2) {
            cnu $$4 = (cnu)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, ln.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, ln.r);
         }
      }
   }

   @Override
   public void a(adi $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(aft $$0) {
      zn.a($$0, this, this.a);
      this.a.s.b($$0.b());
      this.a.s.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afd $$0) {
      zn.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afn $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bM();

         for (int $$3 : $$0.b()) {
            bto $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cpu) {
                     this.a.t.O = $$1.dI();
                     this.a.t.v($$1.dI());
                     this.a.t.q($$1.dI());
                  }

                  xd $$5 = xd.a("mount.onboard", this.a.n.A.k());
                  this.a.m.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afg $$0) {
      zn.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bui $$2) {
         $$2.h_($$0.e());
      }
   }

   private static cvp a(cnu $$0) {
      for (bro $$1 : bro.values()) {
         cvp $$2 = $$0.b($$1);
         if ($$2.a(cvt.vv)) {
            return $$2;
         }
      }

      return new cvp(cvt.vv);
   }

   @Override
   public void a(add $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hav)(new han((ckw)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ln.ak, 30);
               this.s.a($$1.dx(), $$1.dz(), $$1.dD(), awe.zF, $$1.di(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cnu)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hav)(new har((cir)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acz $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afk $$0) {
      zn.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gm().a($$0.e());
      this.a.t.gm().b($$0.f());
   }

   @Override
   public void a(afj $$0) {
      zn.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeo $$0) {
      zn.a($$0, this, this.a);
      agl $$1 = $$0.b();
      alb<deg> $$2 = $$1.b();
      jn<dyk> $$3 = $$1.a();
      ggc $$4 = this.a.t;
      alb<deg> $$5 = $$4.dS().ag();
      boolean $$6 = $$2 != $$5;
      fqb.a $$7 = this.a($$4.eB(), $$2, $$5);
      if ($$6) {
         Map<esh, esj> $$8 = this.s.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gbh.a $$12 = new gbh.a(this.H, this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gbh(this, $$12, $$2, $$3, this.z, this.A, this.a::aK, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.ge()) {
         $$4.s();
      }

      ggc $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j(), $$4.ca(), $$4.cg());
      } else {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ap());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akk.c<?>> $$15 = $$4.at().c();
         if ($$15 != null) {
            $$13.at().a($$15);
         }
      }

      if ($$0.a((byte)1)) {
         $$13.eV().a($$4.eV());
      } else {
         $$13.eV().b($$4.eV());
      }

      $$13.y();
      this.s.d($$13);
      $$13.v(-180.0F);
      $$13.cx = new ggb(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gs());
      $$13.b($$4.m());
      $$13.a($$1.h());
      $$13.f($$1.i());
      $$13.cF = $$4.cF;
      $$13.cG = $$4.cG;
      if (this.a.z instanceof fph || this.a.z instanceof fph.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fqb.a a(boolean $$0, alb<deg> $$1, alb<deg> $$2) {
      fqb.a $$3 = fqb.a.c;
      if (!$$0) {
         if ($$1 == deg.i || $$2 == deg.i) {
            $$3 = fqb.a.a;
         } else if ($$1 == deg.j || $$2 == deg.j) {
            $$3 = fqb.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(ade $$0) {
      zn.a($$0, this, this.a);
      eys $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awf.e, 4.0F, (1.0F + (this.a.s.z.i() - this.a.s.z.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adh $$0) {
      zn.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof cie $$2) {
         ggc $$3 = this.a.t;
         int $$4 = $$0.e();
         brw $$5 = new brw(cie.w($$4));
         cry $$6 = new cry($$0.b(), $$3.gc(), $$5, $$2, $$4);
         $$3.bZ = $$6;
         this.a.a(new frr($$6, $$3.gc(), $$2, $$4));
      }
   }

   @Override
   public void a(adx $$0) {
      zn.a($$0, this, this.a);
      fpu.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acw $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      cvp $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof frh $$4) {
         $$5 = !$$4.F();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0 && crz.e($$3)) {
         if (!$$2.f()) {
            cvp $$7 = $$1.bY.b($$3).g();
            if ($$7.f() || $$7.J() < $$2.J()) {
               $$2.d(5);
            }
         }

         $$1.bY.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bZ.l && ($$0.b() != 0 || !$$5)) {
         $$1.bZ.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof frh) {
         $$1.bY.d();
      }
   }

   @Override
   public void a(afc $$0) {
      zn.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof frh)) {
         this.a.t.bZ.b($$0.b());
      }
   }

   @Override
   public void a(afo $$0) {
      zn.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gc().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acu $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bY.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bZ.l) {
         $$1.bZ.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(ady $$0) {
      zn.a($$0, this, this.a);
      je $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dte $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         duo $$3 = this.s.a_($$1);
         dte $$4 = new dte($$1, $$3);
         $$4.a(this.s);
         this.a.t.a($$4, $$0.e());
      }
   }

   @Override
   public void a(acg $$0) {
      zn.a($$0, this, this.a);
      je $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         uf $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dsc && this.a.z instanceof frc) {
            ((frc)this.a.z).F();
         }
      });
   }

   @Override
   public void a(acv $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      if ($$1.bZ != null && $$1.bZ.l == $$0.b()) {
         $$1.bZ.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afi $$0) {
      zn.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof buk $$2) {
         $$0.e().forEach($$1 -> $$2.a((btw)$$1.getFirst(), (cvp)$$1.getSecond()));
      }
   }

   @Override
   public void a(act $$0) {
      zn.a($$0, this, this.a);
      this.a.t.d();
   }

   @Override
   public void a(ach $$0) {
      zn.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acf $$0) {
      zn.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adg $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      adg.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azd.d($$3 + 0.5F);
      if ($$2 == adg.b) {
         $$1.a(xd.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adg.c) {
         this.s.j().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adg.d) {
         this.s.j().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adg.e) {
         this.a.r.a(ded.a($$4));
      } else if ($$2 == adg.f) {
         this.a.a(new fqg(true, () -> {
            this.a.t.cw.b(new ahb(ahb.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adg.g) {
         fip $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fpi());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xd.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xd.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xd.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xd.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adg.h) {
         this.s.a($$1, $$1.dx(), $$1.dB(), $$1.dD(), awe.aF, awf.h, 0.18F, 0.45F);
      } else if ($$2 == adg.i) {
         this.s.e($$3);
      } else if ($$2 == adg.j) {
         this.s.c($$3);
      } else if ($$2 == adg.k) {
         this.s.a($$1, $$1.dx(), $$1.dz(), $$1.dD(), awe.uW, awf.g, 1.0F, 1.0F);
      } else if ($$2 == adg.l) {
         this.s.a(ln.q, $$1.dx(), $$1.dz(), $$1.dD(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dx(), $$1.dz(), $$1.dD(), awe.hR, awf.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adg.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adg.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adg.o && this.T != null) {
         this.T.c();
      }
   }

   private void a(ggc $$0, gbh $$1, fqb.a $$2) {
      this.T = new gbp($$0, $$1, this.a.f);
      this.a.a(new fqb(this.T::b, $$2));
   }

   @Override
   public void a(adr $$0) {
      zn.a($$0, this, this.a);
      esh $$1 = $$0.b();
      esj $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = esj.a($$0.e(), $$0.f(), this.a.s.ag());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adm $$0) {
      zn.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agh $$0) {
      zn.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aer $$0) {
      zn.a($$0, this, this.a);
      alc $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ag $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acs $$0) {
      zn.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(ep.a(this.G, this.H)));
   }

   @Override
   public void a(afz $$0) {
      zn.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acr $$0) {
      zn.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agk $$0) {
      zn.a($$0, this, this.a);
      this.D.a($$0.b());
      fhw $$1 = this.a.t.j();
      $$1.a(this.D.d(), this.a.s.F_());
      this.Y.a($$1, this.G);
   }

   @Override
   public void a(aeh $$0) {
      zn.a($$0, this, this.a);
      eys $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agc $$0) {
      zn.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acd $$0) {
      zn.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awl<?>> $$1 = (Entry<awl<?>>)$$4.next();
         awl<?> $$2 = (awl<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.i().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fqh $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aek $$0) {
      zn.a($$0, this, this.a);
      fhw $$1 = this.a.t.j();
      $$1.a($$0.f());
      aek.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (alc $$3 : $$0.b()) {
               this.D.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (alc $$4 : $$0.b()) {
               this.D.a($$4).ifPresent($$1::a);
            }

            for (alc $$5 : $$0.e()) {
               this.D.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (alc $$6 : $$0.b()) {
               this.D.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fms.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fuf) {
         ((fuf)this.a.z).F();
      }
   }

   @Override
   public void a(agj $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 instanceof buk) {
         jn<bst> $$2 = $$0.e();
         bsv $$3 = new bsv($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((buk)$$1).c($$3, null);
      }
   }

   private <T> ka.a<T> a(alb<? extends ka<? extends T>> $$0, axl.a $$1) {
      ka<T> $$2 = this.G.d($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aab $$0) {
      zn.a($$0, this, this.a);
      List<ka.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || ke.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(ka.a::c);
      this.J = dsp.a(this.G, this.H);
      List<cvp> $$3 = List.copyOf(cuc.e().l());
      this.Y.a($$3);
   }

   @Override
   public void a(aec $$0) {
   }

   @Override
   public void a(aed $$0) {
   }

   @Override
   public void a(aee $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.m()) {
            this.a.a(new fph($$0.e(), this.s.j().l()));
         } else {
            this.a.t.ga();
         }
      }
   }

   @Override
   public void a(acm $$0) {
      zn.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(aez $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adj $$0) {
      zn.a($$0, this, this.a);
      dwf $$1 = this.s.A_();
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
   public void a(aeu $$0) {
      zn.a($$0, this, this.a);
      this.s.A_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aev $$0) {
      zn.a($$0, this, this.a);
      this.s.A_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aew $$0) {
      zn.a($$0, this, this.a);
      this.s.A_().a($$0.b());
   }

   @Override
   public void a(aey $$0) {
      zn.a($$0, this, this.a);
      this.s.A_().c($$0.b());
   }

   @Override
   public void a(aex $$0) {
      zn.a($$0, this, this.a);
      this.s.A_().b($$0.b());
   }

   @Override
   public void a(acq $$0) {
      zn.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aes $$0) {
      zn.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gbv::b).ifPresent(this.c::a);
         gbw.b(this.c);
      }
   }

   @Override
   public void a(acy $$0) {
      zn.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aet $$0) {
      zn.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afu $$0) {
      zn.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afs $$0) {
      zn.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afv $$0) {
      zn.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agb $$0) {
      zn.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aem $$0) {
      zn.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof buk $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aef $$0) {
      zn.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aO().f($$1);
         gbs $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aeg $$0) {
      zn.a($$0, this, this.a);

      for (aeg.b $$1 : $$0.f()) {
         gbs $$2 = new gbs(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aO().a($$2);
         }
      }

      for (aeg.b $$3 : $$0.e()) {
         gbs $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aeg.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aeg.a $$0, aeg.b $$1, gbs $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cD().equals($$1.a())) {
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

   private void a(aeg.b $$0, gbs $$1) {
      GameProfile $$2 = $$1.a();
      azq $$3 = this.a.aW();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         xu.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               xu $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cnx.b var7) {
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
   public void a(aea $$0) {
      zn.a($$0, this, this.a);
      cnu $$1 = this.a.t;
      $$1.gd().b = $$0.e();
      $$1.gd().d = $$0.g();
      $$1.gd().a = $$0.b();
      $$1.gd().c = $$0.f();
      $$1.gd().a($$0.h());
      $$1.gd().b($$0.i());
   }

   @Override
   public void a(afx $$0) {
      zn.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afw $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acj $$0) {
      zn.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(acx $$0) {
      zn.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gx().a($$0.b());
      } else {
         this.a.t.gx().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adv $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.a.t.dd();
      if ($$1 != this.a.t && $$1.de()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahq($$1));
      }
   }

   @Override
   public void a(adw $$0) {
      zn.a($$0, this, this.a);
      cvp $$1 = this.a.t.b($$0.b());
      fqz.a $$2 = fqz.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fqz($$2));
      }
   }

   @Override
   public void a(aan $$0) {
      if ($$0 instanceof aaw $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aav $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abb $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abc $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abe $$5) {
         ((glx)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aaz $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aax $$7) {
         gla.a $$8 = new gla.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aay $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abd $$10) {
         glv $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aat $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aak $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aaj $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aau $$15) {
         this.a.l.p.a($$15.b(), this.s.aa());
      } else if ($$0 instanceof aar $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aas) {
         this.a.l.s.a();
      } else if ($$0 instanceof aba $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aap $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aaq $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aam $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aan $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afm $$0) {
      zn.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.X.a($$1, faa.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         ezp $$2 = this.X.a($$1);
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
   public void a(afq $$0) {
      zn.a($$0, this, this.a);
      String $$1 = $$0.e();
      ezw $$2 = ezw.c($$0.b());
      ezp $$3 = this.X.a($$1);
      if ($$3 != null) {
         ezv $$4 = this.X.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aen $$0) {
      zn.a($$0, this, this.a);
      String $$1 = $$0.e();
      ezw $$2 = ezw.c($$0.b());
      if ($$1 == null) {
         this.X.b($$2);
      } else {
         ezp $$3 = this.X.a($$1);
         if ($$3 != null) {
            this.X.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afe $$0) {
      zn.a($$0, this, this.a);
      String $$1 = $$0.e();
      ezp $$2 = $$1 == null ? null : this.X.a($$1);
      this.X.a($$0.b(), $$2);
   }

   @Override
   public void a(afp $$0) {
      zn.a($$0, this, this.a);
      afp.a $$1 = $$0.e();
      ezs $$2;
      if ($$1 == afp.a.a) {
         $$2 = this.X.c($$0.f());
      } else {
         $$2 = this.X.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afp.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         ezz.b $$2x = ezz.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         ezz.a $$3x = ezz.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afp.a $$5 = $$0.b();
      if ($$5 == afp.a.a) {
         for (String $$6 : $$0.g()) {
            this.X.a($$6, $$2);
         }
      } else if ($$5 == afp.a.b) {
         for (String $$7 : $$0.g()) {
            this.X.b($$7, $$2);
         }
      }

      if ($$1 == afp.a.b) {
         this.X.d($$2);
      }
   }

   @Override
   public void a(adn $$0) {
      zn.a($$0, this, this.a);
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
   public void a(agi $$0) {
      zn.a($$0, this, this.a);
      bto $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof buk)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bvo $$2 = ((buk)$$1).eV();

            for (agi.a $$3 : $$0.e()) {
               bvn $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bvp $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adz $$0) {
      zn.a($$0, this, this.a);
      cqw $$1 = this.a.t.bZ;
      if ($$1.l == $$0.e()) {
         this.D.a($$0.b()).ifPresent($$0x -> {
            if (this.a.z instanceof fuf $$2) {
               $$2.G().a($$0x);
            }
         });
      }
   }

   @Override
   public void a(ado $$0) {
      zn.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adp $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adp $$2, boolean $$3) {
      eqe $$4 = this.s.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dep.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dep.b, $$8, $$9, $$10, $$3);
      $$4.a(new ddm($$0, $$1), true);
   }

   @Override
   public void a(ads $$0) {
      zn.a($$0, this, this.a);
      cqw $$1 = this.a.t.bZ;
      if ($$0.b() == $$1.l && $$1 instanceof csh $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afb $$0) {
      zn.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afr $$0) {
      zn.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(afa $$0) {
      zn.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(ace $$0) {
      zn.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acl $$0) {
      zn.a($$0, this, this.a);

      for (zk<? super abz> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aej $$0) {
      zn.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof coc $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(aco $$0) {
      this.Q.a();
   }

   @Override
   public void a(acn $$0) {
      this.Q.a($$0.b());
      this.b(new aha(this.Q.b()));
   }

   @Override
   public void a(ada $$0) {
      this.a.aR().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajt $$0) {
      this.R.a($$0);
   }

   private void a(int $$0, int $$1, eqe $$2, dep $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kg.a($$0, $$9, $$1), $$10 ? new dwp((byte[])$$6.next().clone()) : new dwp());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vx k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.W;
   }

   public Collection<gbs> l() {
      return this.v;
   }

   public Collection<gbs> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gbs a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gbs a(String $$0) {
      for (gbs $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gbc p() {
      return this.w;
   }

   public CommandDispatcher<ey> q() {
      return this.C;
   }

   public gbh r() {
      return this.s;
   }

   public fia s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alb<deg>> u() {
      return this.F;
   }

   public kb.b v() {
      return this.G;
   }

   public void a(xt $$0, boolean $$1) {
      xp $$2 = $$0.l();
      if ($$2 != null && this.M.a($$2, $$1) && this.M.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.M.a();
      if ($$0 > 0) {
         this.b(new agv($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayb.c.a();
      xl.a $$3 = this.M.b();
      xp $$4 = this.L.pack(new xw($$0, $$1, $$2, $$3.a()));
      this.b(new agy($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xv<ey> $$1 = xv.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agw($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayb.c.a();
         xl.a $$4 = this.M.b();
         fa $$5 = fa.a($$1, $$3x -> {
            xw $$4x = new xw($$3x, $$2, $$3, $$4.a());
            return this.L.pack($$4x);
         });
         this.b(new agx($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xv.a(this.e($$0))) {
         this.b(new agw($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ey> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqt $$0) {
      if (!$$0.equals(this.P)) {
         this.b(new aae($$0));
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
      if (this.a.aR().f()) {
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

   private void a(cnw $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.K == null || !this.K.c().equals($$0)) {
            this.K = xo.a($$0);
            this.L = this.K.a(this.r.getId());
            this.b(new agz(this.K.a().a()));
         }
      }
   }

   @Nullable
   public gbv x() {
      return this.c;
   }

   public cqn y() {
      return this.H;
   }

   public boolean a(cqn $$0) {
      return $$0.a(this.y());
   }

   public ezx z() {
      return this.X;
   }

   public cxn A() {
      return this.I;
   }

   public dsp B() {
      return this.J;
   }

   public void C() {
      this.Y.a();
   }

   public gby D() {
      return this.Y;
   }

   public alu E() {
      return this.k;
   }
}
