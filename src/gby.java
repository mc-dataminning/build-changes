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

public class gby extends gbu implements acd, wv {
   private static final Logger l = LogUtils.getLogger();
   private static final xh m = xh.c("multiplayer.unsecureserver.toast.title");
   private static final xh n = xh.c("multiplayer.unsecureserver.toast");
   private static final xh o = xh.c("multiplayer.disconnect.invalid_packet");
   private static final xh p = xh.c("connect.reconfiguring");
   private static final int q = 64;
   private final GameProfile r;
   private gbx s;
   private gbx.a t;
   private final Map<UUID, gci> u = Maps.newHashMap();
   private final Set<gci> v = new ReferenceOpenHashSet();
   private final gbs w;
   private final gca x;
   private final fip y = new fip(this);
   private int z = 3;
   private int A = 3;
   private final azr B = azr.b();
   private CommandDispatcher<fa> C = new CommandDispatcher();
   private final dan D;
   private final UUID E = UUID.randomUUID();
   private Set<alg<dev>> F;
   private final kd.b G;
   private final cra H;
   private final cxv I;
   private dtd J;
   @Nullable
   private xs K;
   private yb.c L = yb.c.a;
   private xp M = new xp(20);
   private xu N = xu.a();
   @Nullable
   private CompletableFuture<Optional<coj>> O;
   @Nullable
   private aqy P;
   private final gbr Q = new gbr();
   private final gch R;
   private final gcc S;
   @Nullable
   private gcf T;
   private boolean U;
   private boolean V = false;
   private volatile boolean W;
   private final fam X = new fam();
   private final gco Y = new gco();

   public gby(fja $$0, wb $$1, gcb $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gbs($$0, this.e);
      this.x = new gca(this, $$0);
      this.R = new gch(this, $$0.aR().m());
      this.D = new dan(this.G);
      this.S = new gcc(this, $$0.aR());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = cxv.a(this.H);
      this.J = dtd.a($$2.c(), this.H);
   }

   public gca g() {
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

   public dan j() {
      return this.D;
   }

   @Override
   public void a(adu $$0) {
      zr.a($$0, this, this.a);
      this.a.r = new gcg(this.a, this);
      agp $$1 = $$0.m();
      List<alg<dev>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alg<dev> $$3 = $$1.b();
      jp<dyz> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gbx.a $$8 = new gbx.a(this.H, brv.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gbx(this, $$8, $$3, $$4, this.z, this.A, this.a::aK, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fqq.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new awv(), new fil());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cH());
         }
      }

      this.a.l.a();
      this.a.t.y();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.cx = new ggr(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fqq.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.K = null;
      this.M = new xp(20);
      this.N = xu.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.be().a(this.a);
      this.U = $$0.n();
      if (this.c != null && !this.V && !this.F()) {
         fni $$9 = fni.a(this.a, fni.a.k, m, n);
         this.a.aA().a($$9);
         this.V = true;
      }
   }

   @Override
   public void a(ace $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private btz b(ace $$0) {
      bug<?> $$1 = $$0.f();
      if ($$1 == bug.by) {
         gci $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new ggt(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, buf.r);
      }
   }

   private void a(btz $$0) {
      if ($$0 instanceof cqf $$1) {
         this.a.ak().a((hbp)(new hbi($$1)));
      } else if ($$0 instanceof cgn $$2) {
         boolean $$3 = $$2.ae_();
         hbc $$4;
         if ($$3) {
            $$4 = new hba($$2);
         } else {
            $$4 = new hbb($$2);
         }

         this.a.ak().a((hbq)$$4);
      }
   }

   @Override
   public void a(acf $$0) {
      zr.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      btz $$4 = new bul(this.s, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.s.d($$4);
   }

   @Override
   public void a(afl $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afj $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.av().a($$0.e());
      }
   }

   @Override
   public void a(agi $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
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
   public void a(agj $$0) {
      zr.a($$0, this, this.a);
      if (this.a.s != null) {
         bsh $$1 = this.a.s.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agk $$0) {
      zr.a($$0, this, this.a);
      if (this.a.s != null) {
         bsh $$1 = this.a.s.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afp $$0) {
      zr.a($$0, this, this.a);
      if (cog.d($$0.b())) {
         this.a.t.gk().j = $$0.b();
      }
   }

   @Override
   public void a(adx $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if (!$$1.dj()) {
            if ($$0.j()) {
               aiu $$2 = $$1.ap();
               ezh $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(ady $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = $$0.a(this.s);
      if ($$1 instanceof cqf $$2) {
         if (!$$1.dj() && $$2.m() instanceof cqt $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aet $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aep $$0) {
      zr.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.s.a($$0x, btz.c.b));
   }

   @Override
   public void a(aem $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      bvi $$2 = bvi.a($$1);
      bvi $$3 = bvi.a($$0);
      bvi $$4 = bvi.a($$2, $$3, $$0.i());
      $$1.b($$4.a());
      $$1.h($$4.b());
      $$1.v($$4.c());
      $$1.w($$4.d());
      bvi $$5 = new bvi($$1.bD(), $$1.dA(), $$1.O, $$1.P);
      bvi $$6 = bvi.a($$5, $$3, $$0.i());
      $$1.c($$6.a(), $$6.c(), $$6.d());
      this.b.a(new agw($$0.b()));
      this.b.a(new aht.b($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP(), false, false));
   }

   @Override
   public void a(aeu $$0) {
      zr.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adp $$0) {
      zr.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adt $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         dxj $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(act $$0) {
      zr.a($$0, this, this.a);

      for (act.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (act.a $$2 : $$0.b()) {
         this.s.a(new deb($$2.b().e, $$2.b().f));
      }

      for (act.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.ap(); $$6 <= this.s.aq(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, ado $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dxj $$0, int $$1, int $$2) {
      eqt $$3 = this.s.h().p();
      dxk[] $$4 = $$0.d();
      deb $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dxk $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(ki.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.ap(), $$2 - 1, $$1 + 1, this.s.aq(), $$2 + 1);
   }

   @Override
   public void a(adj $$0) {
      zr.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(adj $$0) {
      deb $$1 = $$0.b();
      this.s.a(() -> {
         eqt $$1x = this.s.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            ki $$3 = ki.a($$1, $$2);
            $$1x.a(dfe.b, $$3, null);
            $$1x.a(dfe.a, $$3, null);
         }

         for (int $$4 = this.s.ap(); $$4 <= this.s.aq(); $$4++) {
            $$1x.a(ki.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acm $$0) {
      zr.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agc $$0) {
      zr.a($$0, this, this.a);
      this.a.bb().d();
      this.G();
      fla.b $$1 = this.a.m.d().k();
      this.a.c(new ftk(p, this.b));
      this.b.a(abs.d, new gbv(this.a, this.b, new gcb(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.i, $$1, this.h, this.j, this.k)));
      this.b(ahi.a);
      this.b.a(abs.b);
   }

   @Override
   public void a(agh $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      buv $$2 = (buv)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bul) {
            this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awk.iI, awl.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awk.nB, awl.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gey(this.a.aq(), this.a.aS(), this.s, $$1, $$2));
         if ($$1 instanceof ckq $$3) {
            cvx $$4 = $$3.m();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), btz.c.b);
            }
         } else if (!($$1 instanceof bul)) {
            this.s.a($$0.b(), btz.c.b);
         }
      }
   }

   @Override
   public void a(age $$0) {
      zr.a($$0, this, this.a);
      this.a.bb().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aef $$0) {
      zr.a($$0, this, this.a);
      Optional<ya> $$1 = $$0.g().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gci $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.bb().a($$2, $$0.j());
         } else {
            xy $$4 = $$3.b();
            yc $$5;
            if ($$4 != null) {
               $$5 = new yc($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yc.a($$2);
            }

            xx $$7 = new xx($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.bb().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.bb().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(adg $$0) {
      zr.a($$0, this, this.a);
      this.a.bb().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adf $$0) {
      zr.a($$0, this, this.a);
      Optional<xt> $$1 = $$0.b().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.M.a($$1.get());
         if (!this.a.bb().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(acg $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            buv $$2 = (buv)$$1;
            $$2.a(brx.a);
         } else if ($$0.e() == 3) {
            buv $$3 = (buv)$$1;
            $$3.a(brx.b);
         } else if ($$0.e() == 2) {
            coh $$4 = (coh)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lq.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lq.r);
         }
      }
   }

   @Override
   public void a(adm $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(afx $$0) {
      zr.a($$0, this, this.a);
      this.a.s.b($$0.b());
      this.a.s.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afh $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afr $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bQ();

         for (int $$3 : $$0.b()) {
            btz $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cqh) {
                     this.a.t.O = $$1.dN();
                     this.a.t.v($$1.dN());
                     this.a.t.q($$1.dN());
                  }

                  xh $$5 = xh.a("mount.onboard", this.a.n.A.k());
                  this.a.m.a($$5, false);
                  this.a.ba().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afk $$0) {
      zr.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof but $$2) {
         $$2.h_($$0.e());
      }
   }

   private static cvx a(coh $$0) {
      for (brx $$1 : brx.values()) {
         cvx $$2 = $$0.b($$1);
         if ($$2.a(cwb.vv)) {
            return $$2;
         }
      }

      return new cvx(cwb.vv);
   }

   @Override
   public void a(adh $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hbp)(new hbh((cli)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lq.ak, 30);
               this.s.a($$1.dC(), $$1.dE(), $$1.dI(), awk.zD, $$1.dn(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((coh)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hbp)(new hbl((cjd)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(add $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afo $$0) {
      zr.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gu().a($$0.e());
      this.a.t.gu().b($$0.f());
   }

   @Override
   public void a(afn $$0) {
      zr.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aes $$0) {
      zr.a($$0, this, this.a);
      agp $$1 = $$0.b();
      alg<dev> $$2 = $$1.b();
      jp<dyz> $$3 = $$1.a();
      ggs $$4 = this.a.t;
      alg<dev> $$5 = $$4.dX().ag();
      boolean $$6 = $$2 != $$5;
      fqq.a $$7 = this.a($$4.eH(), $$2, $$5);
      if ($$6) {
         Map<esw, esy> $$8 = this.s.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gbx.a $$12 = new gbx.a(this.H, this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gbx(this, $$12, $$2, $$3, this.z, this.A, this.a::aK, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gm()) {
         $$4.s();
      }

      ggs $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j(), $$4.ce(), $$4.ck());
      } else {
         $$13 = this.a.r.a(this.s, $$4.i(), $$4.j());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<ako.c<?>> $$15 = $$4.av().c();
         if ($$15 != null) {
            $$13.av().a($$15);
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
      $$13.cx = new ggr(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gA());
      $$13.b($$4.m());
      $$13.a($$1.h());
      $$13.f($$1.i());
      $$13.cF = $$4.cF;
      $$13.cG = $$4.cG;
      if (this.a.z instanceof fpw || this.a.z instanceof fpw.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fqq.a a(boolean $$0, alg<dev> $$1, alg<dev> $$2) {
      fqq.a $$3 = fqq.a.c;
      if (!$$0) {
         if ($$1 == dev.j || $$2 == dev.j) {
            $$3 = fqq.a.a;
         } else if ($$1 == dev.k || $$2 == dev.k) {
            $$3 = fqq.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adi $$0) {
      zr.a($$0, this, this.a);
      ezh $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awl.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adl $$0) {
      zr.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof ciq $$2) {
         ggs $$3 = this.a.t;
         int $$4 = $$0.e();
         bsf $$5 = new bsf(ciq.w($$4));
         csl $$6 = new csl($$0.b(), $$3.gk(), $$5, $$2, $$4);
         $$3.ca = $$6;
         this.a.a(new fsg($$6, $$3.gk(), $$2, $$4));
      }
   }

   @Override
   public void a(aeb $$0) {
      zr.a($$0, this, this.a);
      fqj.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ada $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      cvx $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof frw $$4) {
         $$5 = !$$4.F();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0 && csm.e($$3)) {
         if (!$$2.f()) {
            cvx $$7 = $$1.bZ.b($$3).g();
            if ($$7.f() || $$7.L() < $$2.L()) {
               $$2.d(5);
            }
         }

         $$1.bZ.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.ca.l && ($$0.b() != 0 || !$$5)) {
         $$1.ca.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof frw) {
         $$1.bZ.d();
      }
   }

   @Override
   public void a(afg $$0) {
      zr.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof frw)) {
         this.a.t.ca.b($$0.b());
      }
   }

   @Override
   public void a(afs $$0) {
      zr.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gk().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acy $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bZ.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.ca.l) {
         $$1.ca.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aec $$0) {
      zr.a($$0, this, this.a);
      jg $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dts $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(ack $$0) {
      zr.a($$0, this, this.a);
      jg $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         uj $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.G);
         }

         if ($$1x instanceof dsq && this.a.z instanceof frr) {
            ((frr)this.a.z).F();
         }
      });
   }

   @Override
   public void a(acz $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      if ($$1.ca != null && $$1.ca.l == $$0.b()) {
         $$1.ca.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afm $$0) {
      zr.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof buv $$2) {
         $$0.e().forEach($$1 -> $$2.a((buh)$$1.getFirst(), (cvx)$$1.getSecond()));
      }
   }

   @Override
   public void a(acx $$0) {
      zr.a($$0, this, this.a);
      this.a.t.d();
   }

   @Override
   public void a(acl $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acj $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adk $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      adk.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azj.d($$3 + 0.5F);
      if ($$2 == adk.b) {
         $$1.a(xh.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adk.c) {
         this.s.j().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adk.d) {
         this.s.j().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adk.e) {
         this.a.r.a(des.a($$4));
      } else if ($$2 == adk.f) {
         this.a.a(new fqv(true, () -> {
            this.a.t.cw.b(new ahf(ahf.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adk.g) {
         fje $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fpx());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xh.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xh.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xh.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xh.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adk.h) {
         this.s.a($$1, $$1.dC(), $$1.dG(), $$1.dI(), awk.aF, awl.h, 0.18F, 0.45F);
      } else if ($$2 == adk.i) {
         this.s.e($$3);
      } else if ($$2 == adk.j) {
         this.s.c($$3);
      } else if ($$2 == adk.k) {
         this.s.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awk.uU, awl.g, 1.0F, 1.0F);
      } else if ($$2 == adk.l) {
         this.s.a(lq.q, $$1.dC(), $$1.dE(), $$1.dI(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awk.hR, awl.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adk.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adk.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adk.o && this.T != null) {
         this.T.c();
      }
   }

   private void a(ggs $$0, gbx $$1, fqq.a $$2) {
      this.T = new gcf($$0, $$1, this.a.f);
      this.a.a(new fqq(this.T::b, $$2));
   }

   @Override
   public void a(adv $$0) {
      zr.a($$0, this, this.a);
      esw $$1 = $$0.b();
      esy $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = esy.a($$0.e(), $$0.f(), this.a.s.ag());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adq $$0) {
      zr.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agl $$0) {
      zr.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aev $$0) {
      zr.a($$0, this, this.a);
      alh $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ag $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acw $$0) {
      zr.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(er.a(this.G, this.H)));
   }

   @Override
   public void a(agd $$0) {
      zr.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acv $$0) {
      zr.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(ago $$0) {
      zr.a($$0, this, this.a);
      this.D.a($$0.b());
      fil $$1 = this.a.t.j();
      $$1.a(this.D.d(), this.a.s.H_());
      this.Y.a($$1, this.G);
   }

   @Override
   public void a(ael $$0) {
      zr.a($$0, this, this.a);
      ezh $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agg $$0) {
      zr.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(ach $$0) {
      zr.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awr<?>> $$1 = (Entry<awr<?>>)$$4.next();
         awr<?> $$2 = (awr<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.i().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fqw $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aeo $$0) {
      zr.a($$0, this, this.a);
      fil $$1 = this.a.t.j();
      $$1.a($$0.f());
      aeo.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (alh $$3 : $$0.b()) {
               this.D.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (alh $$4 : $$0.b()) {
               this.D.a($$4).ifPresent($$1::a);
            }

            for (alh $$5 : $$0.e()) {
               this.D.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (alh $$6 : $$0.b()) {
               this.D.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fnh.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fuu) {
         ((fuu)this.a.z).F();
      }
   }

   @Override
   public void a(agn $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 instanceof buv) {
         jp<btc> $$2 = $$0.e();
         bte $$3 = new bte($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((buv)$$1).c($$3, null);
      }
   }

   private <T> kc.a<T> a(alg<? extends kc<? extends T>> $$0, axr.a $$1) {
      kc<T> $$2 = this.G.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aaf $$0) {
      zr.a($$0, this, this.a);
      List<kc.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kg.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kc.a::c);
      this.J = dtd.a(this.G, this.H);
      List<cvx> $$3 = List.copyOf(cun.e().l());
      this.Y.a($$3);
   }

   @Override
   public void a(aeg $$0) {
   }

   @Override
   public void a(aeh $$0) {
   }

   @Override
   public void a(aei $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.m()) {
            this.a.a(new fpw($$0.e(), this.s.j().l()));
         } else {
            this.a.t.gi();
         }
      }
   }

   @Override
   public void a(acq $$0) {
      zr.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(afd $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adn $$0) {
      zr.a($$0, this, this.a);
      dwu $$1 = this.s.C_();
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
   public void a(aey $$0) {
      zr.a($$0, this, this.a);
      this.s.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aez $$0) {
      zr.a($$0, this, this.a);
      this.s.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afa $$0) {
      zr.a($$0, this, this.a);
      this.s.C_().a($$0.b());
   }

   @Override
   public void a(afc $$0) {
      zr.a($$0, this, this.a);
      this.s.C_().c($$0.b());
   }

   @Override
   public void a(afb $$0) {
      zr.a($$0, this, this.a);
      this.s.C_().b($$0.b());
   }

   @Override
   public void a(acu $$0) {
      zr.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aew $$0) {
      zr.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gcl::b).ifPresent(this.c::a);
         gcm.b(this.c);
      }
   }

   @Override
   public void a(adc $$0) {
      zr.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aex $$0) {
      zr.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afy $$0) {
      zr.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afw $$0) {
      zr.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afz $$0) {
      zr.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agf $$0) {
      zr.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeq $$0) {
      zr.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof buv $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aej $$0) {
      zr.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aO().f($$1);
         gci $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aek $$0) {
      zr.a($$0, this, this.a);

      for (aek.b $$1 : $$0.f()) {
         gci $$2 = new gci(Objects.requireNonNull($$1.b()), this.F());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aO().a($$2);
         }
      }

      for (aek.b $$3 : $$0.e()) {
         gci $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aek.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aek.a $$0, aek.b $$1, gci $$2) {
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

   private void a(aek.b $$0, gci $$1) {
      GameProfile $$2 = $$1.a();
      azw $$3 = this.a.aX();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         xy.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               xy $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cok.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aY() && this.U;
   }

   @Override
   public void a(aee $$0) {
      zr.a($$0, this, this.a);
      coh $$1 = this.a.t;
      $$1.gl().b = $$0.e();
      $$1.gl().d = $$0.g();
      $$1.gl().a = $$0.b();
      $$1.gl().c = $$0.f();
      $$1.gl().a($$0.h());
      $$1.gl().b($$0.i());
   }

   @Override
   public void a(agb $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(aga $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acn $$0) {
      zr.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(adb $$0) {
      zr.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gF().a($$0.b());
      } else {
         this.a.t.gF().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adz $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.a.t.dh();
      if ($$1 != this.a.t && $$1.dj()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahu($$1));
      }
   }

   @Override
   public void a(aea $$0) {
      zr.a($$0, this, this.a);
      cvx $$1 = this.a.t.b($$0.b());
      fro.a $$2 = fro.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fro($$2));
      }
   }

   @Override
   public void a(aar $$0) {
      if ($$0 instanceof aba $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aaz $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abf $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abg $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abi $$5) {
         ((gmn)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abd $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abb $$7) {
         glq.a $$8 = new glq.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abc $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abh $$10) {
         gml $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aax $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aao $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aan $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aay $$15) {
         this.a.l.p.a($$15.b(), this.s.aa());
      } else if ($$0 instanceof aav $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aaw) {
         this.a.l.s.a();
      } else if ($$0 instanceof abe $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aat $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aau $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aaq $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aar $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afq $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.X.a($$1, fap.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fae $$2 = this.X.a($$1);
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
   public void a(afu $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fal $$2 = fal.c($$0.b());
      fae $$3 = this.X.a($$1);
      if ($$3 != null) {
         fak $$4 = this.X.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aer $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fal $$2 = fal.c($$0.b());
      if ($$1 == null) {
         this.X.b($$2);
      } else {
         fae $$3 = this.X.a($$1);
         if ($$3 != null) {
            this.X.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afi $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fae $$2 = $$1 == null ? null : this.X.a($$1);
      this.X.a($$0.b(), $$2);
   }

   @Override
   public void a(aft $$0) {
      zr.a($$0, this, this.a);
      aft.a $$1 = $$0.e();
      fah $$2;
      if ($$1 == aft.a.a) {
         $$2 = this.X.c($$0.f());
      } else {
         $$2 = this.X.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<aft.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fao.b $$2x = fao.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fao.a $$3x = fao.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      aft.a $$5 = $$0.b();
      if ($$5 == aft.a.a) {
         for (String $$6 : $$0.g()) {
            this.X.a($$6, $$2);
         }
      } else if ($$5 == aft.a.b) {
         for (String $$7 : $$0.g()) {
            this.X.b($$7, $$2);
         }
      }

      if ($$1 == aft.a.b) {
         this.X.d($$2);
      }
   }

   @Override
   public void a(adr $$0) {
      zr.a($$0, this, this.a);
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
   public void a(agm $$0) {
      zr.a($$0, this, this.a);
      btz $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof buv)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bwa $$2 = ((buv)$$1).fa();

            for (agm.a $$3 : $$0.e()) {
               bvz $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bwb $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aed $$0) {
      zr.a($$0, this, this.a);
      crj $$1 = this.a.t.ca;
      if ($$1.l == $$0.e()) {
         this.D.a($$0.b()).ifPresent($$0x -> {
            if (this.a.z instanceof fuu $$2) {
               $$2.G().a($$0x);
            }
         });
      }
   }

   @Override
   public void a(ads $$0) {
      zr.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adt $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adt $$2, boolean $$3) {
      eqt $$4 = this.s.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dfe.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dfe.b, $$8, $$9, $$10, $$3);
      $$4.a(new deb($$0, $$1), true);
   }

   @Override
   public void a(adw $$0) {
      zr.a($$0, this, this.a);
      crj $$1 = this.a.t.ca;
      if ($$0.b() == $$1.l && $$1 instanceof csu $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aff $$0) {
      zr.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afv $$0) {
      zr.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(afe $$0) {
      zr.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aci $$0) {
      zr.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acp $$0) {
      zr.a($$0, this, this.a);

      for (zo<? super acd> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aen $$0) {
      zr.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof coq $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(acs $$0) {
      this.Q.a();
   }

   @Override
   public void a(acr $$0) {
      this.Q.a($$0.b());
      this.b(new ahe(this.Q.b()));
   }

   @Override
   public void a(ade $$0) {
      this.a.aR().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajx $$0) {
      this.R.a($$0);
   }

   private void a(int $$0, int $$1, eqt $$2, dfe $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, ki.a($$0, $$9, $$1), $$10 ? new dxe((byte[])$$6.next().clone()) : new dxe());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wb k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.W;
   }

   public Collection<gci> l() {
      return this.v;
   }

   public Collection<gci> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gci a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gci a(String $$0) {
      for (gci $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gbs p() {
      return this.w;
   }

   public CommandDispatcher<fa> q() {
      return this.C;
   }

   public gbx r() {
      return this.s;
   }

   public fip s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alg<dev>> u() {
      return this.F;
   }

   public kd.b v() {
      return this.G;
   }

   public void a(xx $$0, boolean $$1) {
      xt $$2 = $$0.l();
      if ($$2 != null && this.M.a($$2, $$1) && this.M.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.M.a();
      if ($$0 > 0) {
         this.b(new agz($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayh.c.a();
      xp.a $$3 = this.M.b();
      xt $$4 = this.L.pack(new ya($$0, $$1, $$2, $$3.a()));
      this.b(new ahc($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xz<fa> $$1 = xz.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new aha($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayh.c.a();
         xp.a $$4 = this.M.b();
         fc $$5 = fc.a($$1, $$3x -> {
            ya $$4x = new ya($$3x, $$2, $$3, $$4.a());
            return this.L.pack($$4x);
         });
         this.b(new ahb($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xz.a(this.e($$0))) {
         this.b(new aha($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fa> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqy $$0) {
      if (!$$0.equals(this.P)) {
         this.b(new aai($$0));
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

   private void a(coj $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.K == null || !this.K.c().equals($$0)) {
            this.K = xs.a($$0);
            this.L = this.K.a(this.r.getId());
            this.b(new ahd(this.K.a().a()));
         }
      }
   }

   @Nullable
   public gcl x() {
      return this.c;
   }

   public cra y() {
      return this.H;
   }

   public boolean a(cra $$0) {
      return $$0.a(this.y());
   }

   public fam z() {
      return this.X;
   }

   public cxv A() {
      return this.I;
   }

   public dtd B() {
      return this.J;
   }

   public void C() {
      this.Y.a();
   }

   public gco D() {
      return this.Y;
   }

   public alz E() {
      return this.k;
   }
}
