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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzg extends fzc implements abu, wn {
   private static final Logger l = LogUtils.getLogger();
   private static final wz m = wz.c("multiplayer.unsecureserver.toast.title");
   private static final wz n = wz.c("multiplayer.unsecureserver.toast");
   private static final wz o = wz.c("multiplayer.disconnect.invalid_packet");
   private static final wz p = wz.c("multiplayer.disconnect.chat_validation_failed");
   private static final wz q = wz.c("connect.reconfiguring");
   private static final int r = 64;
   private final GameProfile s;
   private fzf t;
   private fzf.a u;
   private final Map<UUID, fzq> v = Maps.newHashMap();
   private final Set<fzq> w = new ReferenceOpenHashSet();
   private final fza x;
   private final fzi y;
   private final fge z = new fge(this);
   private int A = 3;
   private int B = 3;
   private final ayw C = ayw.b();
   private CommandDispatcher<ey> D = new CommandDispatcher();
   private final czd E;
   private final UUID F = UUID.randomUUID();
   private Set<akq<dcw>> G;
   private final ka.b H;
   private final cpl I;
   private final cwt J;
   @Nullable
   private xk K;
   private xt.c L = xt.c.a;
   private xh M = new xh(20);
   private xm N = xm.a();
   private final fyz O = new fyz();
   private final fzp P;
   private final fzk Q;
   @Nullable
   private fzn R;
   private boolean S;
   private boolean T = false;
   private volatile boolean U;
   private final eyg V = new eyg();
   private final fzw W = new fzw();

   public fzg(fgo $$0, vt $$1, fzj $$2) {
      super($$0, $$1, $$2);
      this.s = $$2.a();
      this.H = $$2.c();
      this.I = $$2.d();
      this.x = new fza($$0, this.e);
      this.y = new fzi(this, $$0);
      this.P = new fzp(this, $$0.aN().m());
      this.E = new czd(this.H);
      this.Q = new fzk(this, $$0.aN());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.J = cwt.a(this.I);
   }

   public fzi g() {
      return this.y;
   }

   public void h() {
      this.U = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.t = null;
      this.R = null;
   }

   public czd j() {
      return this.E;
   }

   @Override
   public void a(adl $$0) {
      zj.a($$0, this, this.a);
      this.a.q = new fzo(this.a, this);
      agd $$1 = $$0.m();
      List<akq<dcw>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.G = Sets.newLinkedHashSet($$2);
      akq<dcw> $$3 = $$1.b();
      jm<dwy> $$4 = $$1.a();
      this.A = $$0.h();
      this.B = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fzf.a $$7 = new fzf.a(bqo.c, $$0.e(), $$6);
      this.u = $$7;
      this.t = new fzf(this, $$7, $$3, $$4, this.A, this.B, this.a::aH, this.a.f, $$5, $$1.c());
      this.a.a(this.t, fob.a.c);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.t, new awa(), new fga());
         this.a.s.t(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.y();
      this.a.s.e($$0.b());
      this.t.c(this.a.s);
      this.a.s.cz = new gea(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.t, fob.a.c);
      this.a.s.v($$0.j());
      this.a.s.b($$0.k());
      this.a.s.x($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.K = null;
      this.M = new xh(20);
      this.N = xm.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.aZ().a(this.a);
      this.S = $$0.n();
      if (this.c != null && !this.T && !this.D()) {
         fku $$8 = fku.a(this.a, fku.a.k, m, n);
         this.a.aw().a($$8);
         this.T = true;
      }
   }

   @Override
   public void a(abv $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.t.c($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bsr b(abv $$0) {
      bsx<?> $$1 = $$0.f();
      if ($$1 == bsx.by) {
         fzq $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gec(this.t, $$2.a());
         }
      } else {
         return $$1.a((dcw)this.t);
      }
   }

   private void a(bsr $$0) {
      if ($$0 instanceof cot $$1) {
         this.a.aj().a((gua)(new gtt($$1)));
      } else if ($$0 instanceof cff $$2) {
         boolean $$3 = $$2.ad_();
         gtn $$4;
         if ($$3) {
            $$4 = new gtl($$2);
         } else {
            $$4 = new gtm($$2);
         }

         this.a.aj().a((gub)$$4);
      }
   }

   @Override
   public void a(abw $$0) {
      zj.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bsr $$4 = new btc(this.t, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.t(0.0F);
      $$4.u(0.0F);
      $$4.e($$0.b());
      this.t.c($$4);
   }

   @Override
   public void a(afb $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aez $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.ar().a($$0.e());
      }
   }

   @Override
   public void a(afw $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.da()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(afx $$0) {
      zj.a($$0, this, this.a);
      if (this.a.r != null) {
         brc $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afy $$0) {
      zj.a($$0, this, this.a);
      if (this.a.r != null) {
         brc $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aeu $$0) {
      zj.a($$0, this, this.a);
      if (cmw.d($$0.b())) {
         this.a.s.fY().k = $$0.b();
      }
   }

   @Override
   public void a(ado $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = $$0.a(this.t);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               aig $$2 = $$1.al();
               exc $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.Q_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.P_(), $$6, $$7, 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(aej $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = $$0.a(this.t);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aef $$0) {
      zj.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.t.a($$0x, bsr.c.b));
   }

   @Override
   public void a(aec $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      exc $$2 = $$1.dr();
      boolean $$3 = $$0.j().contains(buc.a);
      boolean $$4 = $$0.j().contains(buc.b);
      boolean $$5 = $$0.j().contains(buc.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dt() + $$0.b();
         $$1.ad = $$1.ad + $$0.b();
         $$1.L = $$1.L + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ad = $$7;
         $$1.L = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dv() + $$0.e();
         $$1.ae = $$1.ae + $$0.e();
         $$1.M = $$1.M + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.ae = $$11;
         $$1.M = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dz() + $$0.f();
         $$1.af = $$1.af + $$0.f();
         $$1.N = $$1.N + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.af = $$15;
         $$1.N = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.n($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(buc.e)) {
         $$1.u($$1.dG() + $$19);
         $$1.P += $$19;
      } else {
         $$1.u($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(buc.d)) {
         $$1.t($$1.dE() + $$18);
         $$1.O += $$18;
      } else {
         $$1.t($$18);
         $$1.O = $$18;
      }

      this.b.a(new agk($$0.i()));
      this.b.a(new ahg.b($$1.dt(), $$1.dv(), $$1.dz(), $$1.dE(), $$1.dG(), false));
   }

   @Override
   public void a(aek $$0) {
      zj.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.t.b($$0x, $$1, 19));
   }

   @Override
   public void a(adg $$0) {
      zj.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adk $$3 = $$0.g();
      this.t.a(() -> {
         this.a($$1, $$2, $$3);
         dvi $$3x = this.t.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(ack $$0) {
      zj.a($$0, this, this.a);

      for (ack.a $$1 : $$0.b()) {
         this.t.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (ack.a $$2 : $$0.b()) {
         this.t.a(new dcd($$2.b().e, $$2.b().f));
      }

      for (ack.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.t.ao(); $$6 < this.t.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adf $$2) {
      this.t.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dvi $$0, int $$1, int $$2) {
      eot $$3 = this.t.i().p();
      dvj[] $$4 = $$0.d();
      dcd $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dvj $$7 = $$4[$$6];
         int $$8 = this.t.g($$6);
         $$3.a(kf.a($$5, $$8), $$7.c());
         this.t.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(ada $$0) {
      zj.a($$0, this, this.a);
      this.t.i().a($$0.b());
      this.b($$0);
   }

   private void b(ada $$0) {
      dcd $$1 = $$0.b();
      this.t.a(() -> {
         eot $$1x = this.t.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kf $$3 = kf.a($$1, $$2);
            $$1x.a(ddf.b, $$3, null);
            $$1x.a(ddf.a, $$3, null);
         }

         for (int $$4 = this.t.ao(); $$4 < this.t.ap(); $$4++) {
            $$1x.a(kf.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acd $$0) {
      zj.a($$0, this, this.a);
      this.t.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afq $$0) {
      zj.a($$0, this, this.a);
      this.a.aW().d();
      this.E();
      fin.b $$1 = this.a.l.d().k();
      this.a.c(new fqw(q, this.b));
      this.b.a(abj.d, new fzd(this.a, this.b, new fzj(this.s, this.e, this.H, this.I, this.d, this.c, this.f, this.i, $$1, this.h, this.j, this.k)));
      this.b(agv.a);
      this.b.a(abj.b);
   }

   @Override
   public void a(afv $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      btn $$2 = (btn)this.t.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof btc) {
            this.t.a($$1.dt(), $$1.dv(), $$1.dz(), avp.iH, avq.h, 0.1F, (this.C.i() - this.C.i()) * 0.35F + 0.9F, false);
         } else {
            this.t.a($$1.dt(), $$1.dv(), $$1.dz(), avp.nC, avq.h, 0.2F, (this.C.i() - this.C.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gch(this.a.ap(), this.a.aO(), this.t, $$1, $$2));
         if ($$1 instanceof cjh $$3) {
            cuq $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.t.a($$0.b(), bsr.c.b);
            }
         } else if (!($$1 instanceof btc)) {
            this.t.a($$0.b(), bsr.c.b);
         }
      }
   }

   @Override
   public void a(afs $$0) {
      zj.a($$0, this, this.a);
      this.a.aW().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adv $$0) {
      zj.a($$0, this, this.a);
      Optional<xs> $$1 = $$0.g().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fzq $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aW().a($$2, $$0.j());
         } else {
            xq $$4 = $$3.b();
            xu $$5;
            if ($$4 != null) {
               $$5 = new xu($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xu.a($$2);
            }

            xp $$7 = new xp($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aW().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aW().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(acx $$0) {
      zj.a($$0, this, this.a);
      this.a.aW().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      zj.a($$0, this, this.a);
      Optional<xl> $$1 = $$0.b().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.M.a($$1.get());
         if (!this.a.aW().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(abx $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            btn $$2 = (btn)$$1;
            $$2.a(bqq.a);
         } else if ($$0.e() == 3) {
            btn $$3 = (btn)$$1;
            $$3.a(bqq.b);
         } else if ($$0.e() == 2) {
            cmx $$4 = (cmx)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lm.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lm.r);
         }
      }
   }

   @Override
   public void a(add $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.n($$0.e());
      }
   }

   @Override
   public void a(afl $$0) {
      zj.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aex $$0) {
      zj.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afg $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bI();

         for (int $$3 : $$0.b()) {
            bsr $$4 = this.t.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cov) {
                     this.a.s.O = $$1.dE();
                     this.a.s.t($$1.dE());
                     this.a.s.o($$1.dE());
                  }

                  wz $$5 = wz.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afa $$0) {
      zj.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof btk $$2) {
         $$2.h_($$0.e());
      }
   }

   private static cuq a(cmx $$0) {
      for (bqq $$1 : bqq.values()) {
         cuq $$2 = $$0.b($$1);
         if ($$2.a(cut.vt)) {
            return $$2;
         }
      }

      return new cuq(cut.vt);
   }

   @Override
   public void a(acy $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = $$0.a(this.t);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gua)(new gts((cjz)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lm.ak, 30);
               this.t.a($$1.dt(), $$1.dv(), $$1.dz(), avp.zz, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cmx)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gua)(new gtw((chv)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acu $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.t));
      }
   }

   @Override
   public void a(afe $$0) {
      zj.a($$0, this, this.a);
      this.a.s.H($$0.b());
      this.a.s.gi().a($$0.e());
      this.a.s.gi().b($$0.f());
   }

   @Override
   public void a(afd $$0) {
      zj.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aei $$0) {
      zj.a($$0, this, this.a);
      agd $$1 = $$0.b();
      akq<dcw> $$2 = $$1.b();
      jm<dwy> $$3 = $$1.a();
      geb $$4 = this.a.s;
      akq<dcw> $$5 = $$4.dO().af();
      boolean $$6 = $$2 != $$5;
      fob.a $$7 = this.a($$4.ex(), $$2, $$5);
      if ($$6) {
         Map<eqr, eqt> $$8 = this.t.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         fzf.a $$11 = new fzf.a(this.u.q(), this.u.l(), $$10);
         this.u = $$11;
         this.t = new fzf(this, $$11, $$2, $$3, this.A, this.B, this.a::aH, this.a.f, $$9, $$1.c());
         this.t.a($$8);
         this.a.a(this.t, $$7);
      }

      this.a.t = null;
      if ($$4.ga()) {
         $$4.s();
      }

      geb $$12;
      if ($$0.a((byte)2)) {
         $$12 = this.a.q.a(this.t, $$4.j(), $$4.m(), $$4.bW(), $$4.cc());
      } else {
         $$12 = this.a.q.a(this.t, $$4.j(), $$4.m());
      }

      this.a($$12, this.t, $$7);
      $$12.e($$4.an());
      this.a.s = $$12;
      if ($$6) {
         this.a.s().b();
      }

      this.a.t = $$12;
      if ($$0.a((byte)2)) {
         List<aka.c<?>> $$14 = $$4.ar().c();
         if ($$14 != null) {
            $$12.ar().a($$14);
         }
      }

      if ($$0.a((byte)1)) {
         $$12.eS().a($$4.eS());
      } else {
         $$12.eS().b($$4.eS());
      }

      $$12.y();
      this.t.c($$12);
      $$12.t(-180.0F);
      $$12.cz = new gea(this.a.m);
      this.a.q.a($$12);
      $$12.v($$4.go());
      $$12.b($$4.o());
      $$12.a($$1.h());
      $$12.f($$1.i());
      $$12.cH = $$4.cH;
      $$12.cI = $$4.cI;
      if (this.a.y instanceof fnh || this.a.y instanceof fnh.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   private fob.a a(boolean $$0, akq<dcw> $$1, akq<dcw> $$2) {
      fob.a $$3 = fob.a.c;
      if (!$$0) {
         if ($$1 == dcw.i || $$2 == dcw.i) {
            $$3 = fob.a.a;
         } else if ($$1 == dcw.j || $$2 == dcw.j) {
            $$3 = fob.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acz $$0) {
      zj.a($$0, this, this.a);
      dco $$1 = new dco(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.i(this.a.s.dr().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adc $$0) {
      zj.a($$0, this, this.a);
      if (this.t.a($$0.f()) instanceof chi $$2) {
         geb $$3 = this.a.s;
         int $$4 = $$0.e();
         bra $$5 = new bra(chi.w($$4));
         cqv $$6 = new cqv($$0.b(), $$3.fY(), $$5, $$2, $$4);
         $$3.cd = $$6;
         this.a.a(new fps($$6, $$3.fY(), $$2, $$4));
      }
   }

   @Override
   public void a(adr $$0) {
      zj.a($$0, this, this.a);
      fnu.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acr $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      cuq $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.ax().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fpi)) {
            $$1.cd.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fY().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fpi $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cqw.f($$3)) {
            if (!$$2.e()) {
               cuq $$6 = $$1.cc.b($$3).g();
               if ($$6.e() || $$6.H() < $$2.H()) {
                  $$2.d(5);
               }
            }

            $$1.cc.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.cd.j && ($$0.b() != 0 || !$$4)) {
            $$1.cd.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(acp $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.j) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(ads $$0) {
      zj.a($$0, this, this.a);
      jd $$1 = $$0.b();
      if (this.t.c_($$1) instanceof drs $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dtc $$3 = this.t.a_($$1);
         drs $$4 = new drs($$1, $$3);
         $$4.a(this.t);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(acb $$0) {
      zj.a($$0, this, this.a);
      jd $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ub $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.H);
         }

         if ($$1x instanceof dqr && this.a.y instanceof fpd) {
            ((fpd)this.a.y).E();
         }
      });
   }

   @Override
   public void a(acq $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      if ($$1.cd != null && $$1.cd.j == $$0.b()) {
         $$1.cd.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afc $$0) {
      zj.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof btn $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsy)$$1.getFirst(), (cuq)$$1.getSecond()));
      }
   }

   @Override
   public void a(aco $$0) {
      zj.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acc $$0) {
      zj.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aca $$0) {
      zj.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adb $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      adb.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayo.d($$3 + 0.5F);
      if ($$2 == adb.b) {
         $$1.a(wz.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adb.c) {
         this.t.k().b(true);
         this.t.e(0.0F);
      } else if ($$2 == adb.d) {
         this.t.k().b(false);
         this.t.e(1.0F);
      } else if ($$2 == adb.e) {
         this.a.q.a(dct.a($$4));
      } else if ($$2 == adb.f) {
         this.a.a(new fog(true, () -> {
            this.a.s.h.b(new agt(agt.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adb.g) {
         fgs $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fni());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wz.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wz.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wz.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wz.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == adb.h) {
         this.t.a($$1, $$1.dt(), $$1.dx(), $$1.dz(), avp.aF, avq.h, 0.18F, 0.45F);
      } else if ($$2 == adb.i) {
         this.t.e($$3);
      } else if ($$2 == adb.j) {
         this.t.c($$3);
      } else if ($$2 == adb.k) {
         this.t.a($$1, $$1.dt(), $$1.dv(), $$1.dz(), avp.uV, avq.g, 1.0F, 1.0F);
      } else if ($$2 == adb.l) {
         this.t.a(lm.q, $$1.dt(), $$1.dv(), $$1.dz(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.t.a($$1, $$1.dt(), $$1.dv(), $$1.dz(), avp.hQ, avq.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adb.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == adb.n) {
         this.a.s.x($$3 == 1.0F);
      } else if ($$2 == adb.o && this.R != null) {
         this.R.c();
      }
   }

   private void a(geb $$0, fzf $$1, fob.a $$2) {
      this.R = new fzn($$0, $$1, this.a.f);
      this.a.a(new fob(this.R::b, $$2));
   }

   @Override
   public void a(adm $$0) {
      zj.a($$0, this, this.a);
      fic $$1 = this.a.j.i();
      eqr $$2 = $$0.b();
      eqt $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = eqt.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(adh $$0) {
      zj.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afz $$0) {
      zj.a($$0, this, this.a);
      this.x.a($$0);
   }

   @Override
   public void a(ael $$0) {
      zj.a($$0, this, this.a);
      akr $$1 = $$0.b();
      if ($$1 == null) {
         this.x.a(null, false);
      } else {
         ag $$2 = this.x.a($$1);
         this.x.a($$2, false);
      }
   }

   @Override
   public void a(acn $$0) {
      zj.a($$0, this, this.a);
      this.D = new CommandDispatcher($$0.a(ep.a(this.H, this.I)));
   }

   @Override
   public void a(afr $$0) {
      zj.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      zj.a($$0, this, this.a);
      this.y.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agc $$0) {
      zj.a($$0, this, this.a);
      this.E.a($$0.b());
      fga $$1 = this.a.s.m();
      $$1.a(this.E.b(), this.a.r.H_());
      this.W.a($$1, this.H);
   }

   @Override
   public void a(aeb $$0) {
      zj.a($$0, this, this.a);
      exc $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afu $$0) {
      zj.a($$0, this, this.a);
      if (!this.z.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aby $$0) {
      zj.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avw<?>> $$1 = (Entry<avw<?>>)$$4.next();
         avw<?> $$2 = (avw<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof foh $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(aee $$0) {
      zj.a($$0, this, this.a);
      fga $$1 = this.a.s.m();
      $$1.a($$0.f());
      aee.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akr $$3 : $$0.b()) {
               this.E.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akr $$4 : $$0.b()) {
               this.E.a($$4).ifPresent($$1::a);
            }

            for (akr $$5 : $$0.e()) {
               this.E.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akr $$6 : $$0.b()) {
               this.E.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fkt.a(this.a.aw(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fsg) {
         ((fsg)this.a.y).E();
      }
   }

   @Override
   public void a(agb $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 instanceof btn) {
         jm<brx> $$2 = $$0.e();
         brz $$3 = new brz($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((btn)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zx $$0) {
      zj.a($$0, this, this.a);
      fzx $$1 = new fzx();
      $$0.b().forEach($$1::a);
      $$1.a(this.H, this.b.e());
      List<cuq> $$2 = List.copyOf(ctb.e().l());
      this.W.a($$2);
   }

   @Override
   public void a(adw $$0) {
   }

   @Override
   public void a(adx $$0) {
   }

   @Override
   public void a(ady $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fnh($$0.e(), this.t.k().l()));
         } else {
            this.a.s.fW();
         }
      }
   }

   @Override
   public void a(ach $$0) {
      zj.a($$0, this, this.a);
      this.u.a($$0.e());
      this.u.a($$0.b());
   }

   @Override
   public void a(aet $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ade $$0) {
      zj.a($$0, this, this.a);
      dut $$1 = this.t.C_();
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
   public void a(aeo $$0) {
      zj.a($$0, this, this.a);
      this.t.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aep $$0) {
      zj.a($$0, this, this.a);
      this.t.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeq $$0) {
      zj.a($$0, this, this.a);
      this.t.C_().a($$0.b());
   }

   @Override
   public void a(aes $$0) {
      zj.a($$0, this, this.a);
      this.t.C_().c($$0.b());
   }

   @Override
   public void a(aer $$0) {
      zj.a($$0, this, this.a);
      this.t.C_().b($$0.b());
   }

   @Override
   public void a(acl $$0) {
      zj.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aem $$0) {
      zj.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fzt::b).ifPresent(this.c::a);
         fzu.b(this.c);
      }
   }

   @Override
   public void a(act $$0) {
      zj.a($$0, this, this.a);
      this.y.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aen $$0) {
      zj.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afm $$0) {
      zj.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afk $$0) {
      zj.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afn $$0) {
      zj.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aft $$0) {
      zj.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeg $$0) {
      zj.a($$0, this, this.a);
      if ($$0.a(this.t) instanceof btn $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adz $$0) {
      zj.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aL().f($$1);
         fzq $$2 = this.v.remove($$1);
         if ($$2 != null) {
            this.w.remove($$2);
         }
      }
   }

   @Override
   public void a(aea $$0) {
      zj.a($$0, this, this.a);

      for (aea.b $$1 : $$0.f()) {
         fzq $$2 = new fzq(Objects.requireNonNull($$1.b()), this.D());
         if (this.v.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aL().a($$2);
         }
      }

      for (aea.b $$3 : $$0.e()) {
         fzq $$4 = this.v.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aea.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aea.a $$0, aea.b $$1, fzq $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cz().equals($$1.a())) {
               this.a.s.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.w.add($$2);
            } else {
               this.w.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
      }
   }

   private void a(aea.b $$0, fzq $$1) {
      GameProfile $$2 = $$1.a();
      azb $$3 = this.a.aS();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.D());
      } else {
         xq.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xq $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cna.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.D());
            }
         } else {
            $$1.a(this.D());
         }
      }
   }

   private boolean D() {
      return this.a.aT() && this.S;
   }

   @Override
   public void a(adu $$0) {
      zj.a($$0, this, this.a);
      cmx $$1 = this.a.s;
      $$1.fZ().b = $$0.e();
      $$1.fZ().d = $$0.g();
      $$1.fZ().a = $$0.b();
      $$1.fZ().c = $$0.f();
      $$1.fZ().a($$0.h());
      $$1.fZ().b($$0.i());
   }

   @Override
   public void a(afp $$0) {
      zj.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afo $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(ace $$0) {
      zj.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(acs $$0) {
      zj.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gt().b($$0.b());
      } else {
         this.a.s.gt().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adp $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahh($$1));
      }
   }

   @Override
   public void a(adq $$0) {
      zj.a($$0, this, this.a);
      cuq $$1 = this.a.s.b($$0.b());
      fpa.a $$2 = fpa.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fpa($$2));
      }
   }

   @Override
   public void a(aaj $$0) {
      if ($$0 instanceof aas $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aar $$2) {
         ((git)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aax $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aaz $$4) {
         ((gjb)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aav $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aat $$6) {
         gih.a $$7 = new gih.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aau $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aay $$9) {
         giz $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aap $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aag $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aaf $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aaq $$14) {
         this.a.k.o.a($$14.b(), this.t.Z());
      } else if ($$0 instanceof aan $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aao) {
         this.a.k.r.a();
      } else if ($$0 instanceof aaw $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aal $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aam $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aai $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aaj $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aff $$0) {
      zj.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.V.a($$1, eyj.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         exy $$2 = this.V.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.V.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afi $$0) {
      zj.a($$0, this, this.a);
      String $$1 = $$0.e();
      eyf $$2 = eyf.c($$0.b());
      exy $$3 = this.V.a($$1);
      if ($$3 != null) {
         eye $$4 = this.V.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aeh $$0) {
      zj.a($$0, this, this.a);
      String $$1 = $$0.e();
      eyf $$2 = eyf.c($$0.b());
      if ($$1 == null) {
         this.V.b($$2);
      } else {
         exy $$3 = this.V.a($$1);
         if ($$3 != null) {
            this.V.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aey $$0) {
      zj.a($$0, this, this.a);
      String $$1 = $$0.e();
      exy $$2 = $$1 == null ? null : this.V.a($$1);
      this.V.a($$0.b(), $$2);
   }

   @Override
   public void a(afh $$0) {
      zj.a($$0, this, this.a);
      afh.a $$1 = $$0.e();
      eyb $$2;
      if ($$1 == afh.a.a) {
         $$2 = this.V.c($$0.f());
      } else {
         $$2 = this.V.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afh.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eyi.b $$2x = eyi.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eyi.a $$3x = eyi.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afh.a $$5 = $$0.b();
      if ($$5 == afh.a.a) {
         for (String $$6 : $$0.g()) {
            this.V.a($$6, $$2);
         }
      } else if ($$5 == afh.a.b) {
         for (String $$7 : $$0.g()) {
            this.V.b($$7, $$2);
         }
      }

      if ($$1 == afh.a.b) {
         this.V.d($$2);
      }
   }

   @Override
   public void a(adi $$0) {
      zj.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.t.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            l.warn("Could not spawn particle effect {}", $$0.m());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.l(); $$5++) {
            double $$6 = this.C.k() * (double)$$0.h();
            double $$7 = this.C.k() * (double)$$0.i();
            double $$8 = this.C.k() * (double)$$0.j();
            double $$9 = this.C.k() * (double)$$0.k();
            double $$10 = this.C.k() * (double)$$0.k();
            double $$11 = this.C.k() * (double)$$0.k();

            try {
               this.t.a($$0.m(), $$0.b(), $$0.e() + $$6, $$0.f() + $$7, $$0.g() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               l.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zj.a($$0, this, this.a);
      bsr $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof btn)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            but $$2 = ((btn)$$1).eS();

            for (aga.a $$3 : $$0.e()) {
               bus $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (buu $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adt $$0) {
      zj.a($$0, this, this.a);
      cpu $$1 = this.a.s.cd;
      if ($$1.j == $$0.e()) {
         this.E.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fsg) {
               fsa $$2 = ((fsg)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adj $$0) {
      zj.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adk $$3 = $$0.f();
      this.t.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adk $$2) {
      eot $$3 = this.t.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, ddf.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, ddf.b, $$7, $$8, $$9);
      $$3.a(new dcd($$0, $$1), true);
   }

   @Override
   public void a(adn $$0) {
      zj.a($$0, this, this.a);
      cpu $$1 = this.a.s.cd;
      if ($$0.b() == $$1.j && $$1 instanceof cre $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aew $$0) {
      zj.a($$0, this, this.a);
      this.A = $$0.b();
      this.a.m.b(this.A);
      this.t.i().a($$0.b());
   }

   @Override
   public void a(afj $$0) {
      zj.a($$0, this, this.a);
      this.B = $$0.b();
      this.t.h(this.B);
   }

   @Override
   public void a(aev $$0) {
      zj.a($$0, this, this.a);
      this.t.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abz $$0) {
      zj.a($$0, this, this.a);
      this.t.b($$0.b());
   }

   @Override
   public void a(acg $$0) {
      zj.a($$0, this, this.a);

      for (zg<? super abu> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aed $$0) {
      zj.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof cne $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(acj $$0) {
      this.O.a();
   }

   @Override
   public void a(aci $$0) {
      this.O.a($$0.b());
      this.b(new ags(this.O.b()));
   }

   @Override
   public void a(acv $$0) {
      this.a.aN().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajj $$0) {
      this.P.a($$0);
   }

   private void a(int $$0, int $$1, eot $$2, ddf $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kf.a($$0, $$8, $$1), $$9 ? new dvd((byte[])$$6.next().clone()) : new dvd());
            this.t.c($$0, $$8, $$1);
         }
      }
   }

   public vt k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.U;
   }

   public Collection<fzq> l() {
      return this.w;
   }

   public Collection<fzq> m() {
      return this.v.values();
   }

   public Collection<UUID> n() {
      return this.v.keySet();
   }

   @Nullable
   public fzq a(UUID $$0) {
      return this.v.get($$0);
   }

   @Nullable
   public fzq a(String $$0) {
      for (fzq $$1 : this.v.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.s;
   }

   public fza p() {
      return this.x;
   }

   public CommandDispatcher<ey> q() {
      return this.D;
   }

   public fzf r() {
      return this.t;
   }

   public fge s() {
      return this.z;
   }

   public UUID t() {
      return this.F;
   }

   public Set<akq<dcw>> u() {
      return this.G;
   }

   public ka.b v() {
      return this.H;
   }

   public void a(xp $$0, boolean $$1) {
      xl $$2 = $$0.l();
      if ($$2 != null && this.M.a($$2, $$1) && this.M.c() > 64) {
         this.E();
      }
   }

   private void E() {
      int $$0 = this.M.a();
      if ($$0 > 0) {
         this.b(new agn($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axl.c.a();
      xh.a $$3 = this.M.b();
      xl $$4 = this.L.pack(new xs($$0, $$1, $$2, $$3.a()));
      this.b(new agq($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xr<ey> $$1 = xr.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ago($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axl.c.a();
         xh.a $$4 = this.M.b();
         fa $$5 = fa.a($$1, $$3x -> {
            xs $$4x = new xs($$3x, $$2, $$3, $$4.a());
            return this.L.pack($$4x);
         });
         this.b(new agp($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xr.a(this.e($$0))) {
         this.b(new ago($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ey> e(String $$0) {
      return this.D.parse($$0, this.y);
   }

   @Override
   public void d() {
      if (this.b.h()) {
         fzr $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.e();
      if (this.a.aN().f()) {
         this.P.a();
      }

      this.Q.a();
      this.e.a();
      if (this.R != null) {
         this.R.a();
      }
   }

   public void a(cmz $$0) {
      if (this.a.b(this.s.getId())) {
         if (this.K == null || !this.K.c().equals($$0)) {
            this.K = xk.a($$0);
            this.L = this.K.a(this.s.getId());
            this.b(new agr(this.K.a().a()));
         }
      }
   }

   @Nullable
   public fzt w() {
      return this.c;
   }

   public cpl x() {
      return this.I;
   }

   public boolean a(cpl $$0) {
      return $$0.a(this.x());
   }

   public eyg y() {
      return this.V;
   }

   public cwt z() {
      return this.J;
   }

   public void A() {
      this.W.a();
   }

   public fzw B() {
      return this.W;
   }

   public alj C() {
      return this.k;
   }
}
