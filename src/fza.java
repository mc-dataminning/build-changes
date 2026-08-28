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

public class fza extends fyw implements abt, wm {
   private static final Logger l = LogUtils.getLogger();
   private static final wy m = wy.c("multiplayer.unsecureserver.toast.title");
   private static final wy n = wy.c("multiplayer.unsecureserver.toast");
   private static final wy o = wy.c("multiplayer.disconnect.invalid_packet");
   private static final wy p = wy.c("multiplayer.disconnect.chat_validation_failed");
   private static final wy q = wy.c("connect.reconfiguring");
   private static final int r = 64;
   private final GameProfile s;
   private fyz t;
   private fyz.a u;
   private final Map<UUID, fzk> v = Maps.newHashMap();
   private final Set<fzk> w = new ReferenceOpenHashSet();
   private final fyu x;
   private final fzc y;
   private final ffy z = new ffy(this);
   private int A = 3;
   private int B = 3;
   private final ayv C = ayv.b();
   private CommandDispatcher<ey> D = new CommandDispatcher();
   private final czb E;
   private final UUID F = UUID.randomUUID();
   private Set<akp<dcu>> G;
   private final ka.b H;
   private final cpj I;
   private final cwr J;
   @Nullable
   private xj K;
   private xs.c L = xs.c.a;
   private xg M = new xg(20);
   private xl N = xl.a();
   private final fyt O = new fyt();
   private final fzj P;
   private final fze Q;
   @Nullable
   private fzh R;
   private boolean S;
   private boolean T = false;
   private volatile boolean U;
   private final eya V = new eya();
   private final fzq W = new fzq();

   public fza(fgi $$0, vs $$1, fzd $$2) {
      super($$0, $$1, $$2);
      this.s = $$2.a();
      this.H = $$2.c();
      this.I = $$2.d();
      this.x = new fyu($$0, this.e);
      this.y = new fzc(this, $$0);
      this.P = new fzj(this, $$0.aN().m());
      this.E = new czb(this.H);
      this.Q = new fze(this, $$0.aN());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.J = cwr.a(this.I);
   }

   public fzc g() {
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

   public czb j() {
      return this.E;
   }

   @Override
   public void a(adk $$0) {
      zi.a($$0, this, this.a);
      this.a.q = new fzi(this.a, this);
      agc $$1 = $$0.m();
      List<akp<dcu>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.G = Sets.newLinkedHashSet($$2);
      akp<dcu> $$3 = $$1.b();
      jm<dwv> $$4 = $$1.a();
      this.A = $$0.h();
      this.B = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fyz.a $$7 = new fyz.a(bqn.c, $$0.e(), $$6);
      this.u = $$7;
      this.t = new fyz(this, $$7, $$3, $$4, this.A, this.B, this.a::aH, this.a.f, $$5, $$1.c());
      this.a.a(this.t, fnv.a.c);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.t, new avz(), new ffu());
         this.a.s.s(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cA());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.t.c(this.a.s);
      this.a.s.cB = new gdu(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.t, fnv.a.c);
      this.a.s.v($$0.j());
      this.a.s.b($$0.k());
      this.a.s.c($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.K = null;
      this.M = new xg(20);
      this.N = xl.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.aZ().a(this.a);
      this.S = $$0.n();
      if (this.c != null && !this.T && !this.D()) {
         fko $$8 = fko.a(this.a, fko.a.k, m, n);
         this.a.aw().a($$8);
         this.T = true;
      }
   }

   @Override
   public void a(abu $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.t.c($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bsq b(abu $$0) {
      bsw<?> $$1 = $$0.f();
      if ($$1 == bsw.by) {
         fzk $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gdw(this.t, $$2.a());
         }
      } else {
         return $$1.a((dcu)this.t);
      }
   }

   private void a(bsq $$0) {
      if ($$0 instanceof cor $$1) {
         this.a.aj().a((gtt)(new gtm($$1)));
      } else if ($$0 instanceof cfd $$2) {
         boolean $$3 = $$2.Z_();
         gtg $$4;
         if ($$3) {
            $$4 = new gte($$2);
         } else {
            $$4 = new gtf($$2);
         }

         this.a.aj().a((gtu)$$4);
      }
   }

   @Override
   public void a(abv $$0) {
      zi.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bsq $$4 = new btb(this.t, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.s(0.0F);
      $$4.t(0.0F);
      $$4.e($$0.b());
      this.t.c($$4);
   }

   @Override
   public void a(afa $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aey $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.ar().a($$0.e());
      }
   }

   @Override
   public void a(afv $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.db()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.e($$0.j());
         }
      }
   }

   @Override
   public void a(afw $$0) {
      zi.a($$0, this, this.a);
      if (this.a.r != null) {
         brb $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afx $$0) {
      zi.a($$0, this, this.a);
      if (this.a.r != null) {
         brb $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aet $$0) {
      zi.a($$0, this, this.a);
      if (cmu.d($$0.b())) {
         this.a.s.fZ().k = $$0.b();
      }
   }

   @Override
   public void a(adn $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = $$0.a(this.t);
      if ($$1 != null) {
         if (!$$1.db()) {
            if ($$0.j()) {
               aif $$2 = $$1.al();
               eww $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.M_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.L_(), $$6, $$7, 3);
            }

            $$1.e($$0.k());
         }
      }
   }

   @Override
   public void a(aei $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = $$0.a(this.t);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aee $$0) {
      zi.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.t.a($$0x, bsq.c.b));
   }

   @Override
   public void a(aeb $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      eww $$2 = $$1.dt();
      boolean $$3 = $$0.j().contains(bua.a);
      boolean $$4 = $$0.j().contains(bua.b);
      boolean $$5 = $$0.j().contains(bua.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dv() + $$0.b();
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
         $$11 = $$1.dx() + $$0.e();
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
         $$15 = $$1.dB() + $$0.f();
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
      if ($$0.j().contains(bua.e)) {
         $$1.t($$1.dI() + $$19);
         $$1.P += $$19;
      } else {
         $$1.t($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(bua.d)) {
         $$1.s($$1.dG() + $$18);
         $$1.O += $$18;
      } else {
         $$1.s($$18);
         $$1.O = $$18;
      }

      this.b.a(new agj($$0.i()));
      this.b.a(new ahf.b($$1.dv(), $$1.dx(), $$1.dB(), $$1.dG(), $$1.dI(), false));
   }

   @Override
   public void a(aej $$0) {
      zi.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.t.b($$0x, $$1, 19));
   }

   @Override
   public void a(adf $$0) {
      zi.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adj $$3 = $$0.g();
      this.t.a(() -> {
         this.a($$1, $$2, $$3);
         dvg $$3x = this.t.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acj $$0) {
      zi.a($$0, this, this.a);

      for (acj.a $$1 : $$0.b()) {
         this.t.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acj.a $$2 : $$0.b()) {
         this.t.a(new dcb($$2.b().e, $$2.b().f));
      }

      for (acj.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.t.ao(); $$6 < this.t.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, ade $$2) {
      this.t.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dvg $$0, int $$1, int $$2) {
      eon $$3 = this.t.i().p();
      dvh[] $$4 = $$0.d();
      dcb $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dvh $$7 = $$4[$$6];
         int $$8 = this.t.g($$6);
         $$3.a(kf.a($$5, $$8), $$7.c());
         this.t.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(acz $$0) {
      zi.a($$0, this, this.a);
      this.t.i().a($$0.b());
      this.b($$0);
   }

   private void b(acz $$0) {
      dcb $$1 = $$0.b();
      this.t.a(() -> {
         eon $$1x = this.t.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kf $$3 = kf.a($$1, $$2);
            $$1x.a(ddd.b, $$3, null);
            $$1x.a(ddd.a, $$3, null);
         }

         for (int $$4 = this.t.ao(); $$4 < this.t.ap(); $$4++) {
            $$1x.a(kf.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acc $$0) {
      zi.a($$0, this, this.a);
      this.t.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afp $$0) {
      zi.a($$0, this, this.a);
      this.a.aW().d();
      this.E();
      fih.b $$1 = this.a.l.d().k();
      this.a.c(new fqq(q, this.b));
      this.b.a(abi.b, new fyx(this.a, this.b, new fzd(this.s, this.e, this.H, this.I, this.d, this.c, this.f, this.i, $$1, this.h, this.j, this.k)));
      this.b(agu.a);
      this.b.a(abi.a);
   }

   @Override
   public void a(afu $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      btl $$2 = (btl)this.t.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof btb) {
            this.t.a($$1.dv(), $$1.dx(), $$1.dB(), avo.iH, avp.h, 0.1F, (this.C.i() - this.C.i()) * 0.35F + 0.9F, false);
         } else {
            this.t.a($$1.dv(), $$1.dx(), $$1.dB(), avo.nC, avp.h, 0.2F, (this.C.i() - this.C.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gcb(this.a.ap(), this.a.aO(), this.t, $$1, $$2));
         if ($$1 instanceof cjf $$3) {
            cuo $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.t.a($$0.b(), bsq.c.b);
            }
         } else if (!($$1 instanceof btb)) {
            this.t.a($$0.b(), bsq.c.b);
         }
      }
   }

   @Override
   public void a(afr $$0) {
      zi.a($$0, this, this.a);
      this.a.aW().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adu $$0) {
      zi.a($$0, this, this.a);
      Optional<xr> $$1 = $$0.g().a(this.N);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fzk $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aW().a($$2, $$0.j());
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
               this.a.aW().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aW().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(acw $$0) {
      zi.a($$0, this, this.a);
      this.a.aW().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acv $$0) {
      zi.a($$0, this, this.a);
      Optional<xk> $$1 = $$0.b().a(this.N);
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
   public void a(abw $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            btl $$2 = (btl)$$1;
            $$2.a(bqp.a);
         } else if ($$0.e() == 3) {
            btl $$3 = (btl)$$1;
            $$3.a(bqp.b);
         } else if ($$0.e() == 2) {
            cmv $$4 = (cmv)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lm.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lm.r);
         }
      }
   }

   @Override
   public void a(adc $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.n($$0.e());
      }
   }

   @Override
   public void a(afk $$0) {
      zi.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aew $$0) {
      zi.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aff $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bI();

         for (int $$3 : $$0.b()) {
            bsq $$4 = this.t.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cot) {
                     this.a.s.O = $$1.dG();
                     this.a.s.s($$1.dG());
                     this.a.s.o($$1.dG());
                  }

                  wy $$5 = wy.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aez $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 instanceof btn) {
         ((btn)$$1).r($$0.e());
      }
   }

   private static cuo a(cmv $$0) {
      for (bqp $$1 : bqp.values()) {
         cuo $$2 = $$0.b($$1);
         if ($$2.a(cur.vt)) {
            return $$2;
         }
      }

      return new cuo(cur.vt);
   }

   @Override
   public void a(acx $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = $$0.a(this.t);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gtt)(new gtl((cjx)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lm.ak, 30);
               this.t.a($$1.dv(), $$1.dx(), $$1.dB(), avo.zz, $$1.df(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cmv)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gtt)(new gtp((cht)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(act $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.t));
      }
   }

   @Override
   public void a(afd $$0) {
      zi.a($$0, this, this.a);
      this.a.s.G($$0.b());
      this.a.s.gj().a($$0.e());
      this.a.s.gj().b($$0.f());
   }

   @Override
   public void a(afc $$0) {
      zi.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeh $$0) {
      zi.a($$0, this, this.a);
      agc $$1 = $$0.b();
      akp<dcu> $$2 = $$1.b();
      jm<dwv> $$3 = $$1.a();
      gdv $$4 = this.a.s;
      akp<dcu> $$5 = $$4.dQ().af();
      boolean $$6 = $$2 != $$5;
      fnv.a $$7 = this.a($$4.ey(), $$2, $$5);
      if ($$6) {
         Map<eql, eqn> $$8 = this.t.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         fyz.a $$11 = new fyz.a(this.u.q(), this.u.l(), $$10);
         this.u = $$11;
         this.t = new fyz(this, $$11, $$2, $$3, this.A, this.B, this.a::aH, this.a.f, $$9, $$1.c());
         this.t.a($$8);
         this.a.a(this.t, $$7);
      }

      this.a.t = null;
      if ($$4.gb()) {
         $$4.s();
      }

      gdv $$12;
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
         List<ajz.c<?>> $$14 = $$4.ar().c();
         if ($$14 != null) {
            $$12.ar().a($$14);
         }
      }

      if ($$0.a((byte)1)) {
         $$12.eT().a($$4.eT());
      } else {
         $$12.eT().b($$4.eT());
      }

      $$12.A();
      this.t.c($$12);
      $$12.s(-180.0F);
      $$12.cB = new gdu(this.a.m);
      this.a.q.a($$12);
      $$12.v($$4.gp());
      $$12.b($$4.o());
      $$12.a($$1.h());
      $$12.f($$1.i());
      $$12.cI = $$4.cI;
      $$12.cJ = $$4.cJ;
      if (this.a.y instanceof fnb || this.a.y instanceof fnb.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   private fnv.a a(boolean $$0, akp<dcu> $$1, akp<dcu> $$2) {
      fnv.a $$3 = fnv.a.c;
      if (!$$0) {
         if ($$1 == dcu.i || $$2 == dcu.i) {
            $$3 = fnv.a.a;
         } else if ($$1 == dcu.j || $$2 == dcu.j) {
            $$3 = fnv.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acy $$0) {
      zi.a($$0, this, this.a);
      dcm $$1 = new dcm(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.i(this.a.s.dt().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adb $$0) {
      zi.a($$0, this, this.a);
      if (this.t.a($$0.f()) instanceof chg $$2) {
         gdv $$3 = this.a.s;
         bqz $$4 = new bqz($$0.e());
         cqt $$5 = new cqt($$0.b(), $$3.fZ(), $$4, $$2);
         $$3.cd = $$5;
         this.a.a(new fpm($$5, $$3.fZ(), $$2));
      }
   }

   @Override
   public void a(adq $$0) {
      zi.a($$0, this, this.a);
      fno.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acq $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      cuo $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.ax().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fpc)) {
            $$1.cd.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fZ().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fpc $$5) {
            $$4 = !$$5.F();
         }

         if ($$0.b() == 0 && cqu.f($$3)) {
            if (!$$2.e()) {
               cuo $$6 = $$1.cc.b($$3).g();
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
   public void a(aco $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.j) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adr $$0) {
      zi.a($$0, this, this.a);
      jd $$1 = $$0.b();
      if (this.t.c_($$1) instanceof drq $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dta $$3 = this.t.a_($$1);
         drq $$4 = new drq($$1, $$3);
         $$4.a(this.t);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(aca $$0) {
      zi.a($$0, this, this.a);
      jd $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ua $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.H);
         }

         if ($$1x instanceof dqp && this.a.y instanceof fox) {
            ((fox)this.a.y).F();
         }
      });
   }

   @Override
   public void a(acp $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      if ($$1.cd != null && $$1.cd.j == $$0.b()) {
         $$1.cd.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afb $$0) {
      zi.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof btl $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsx)$$1.getFirst(), (cuo)$$1.getSecond()));
      }
   }

   @Override
   public void a(acn $$0) {
      zi.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acb $$0) {
      zi.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abz $$0) {
      zi.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ada $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      ada.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayn.d($$3 + 0.5F);
      if ($$2 == ada.b) {
         $$1.a(wy.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ada.c) {
         this.t.k().b(true);
         this.t.e(0.0F);
      } else if ($$2 == ada.d) {
         this.t.k().b(false);
         this.t.e(1.0F);
      } else if ($$2 == ada.e) {
         this.a.q.a(dcr.a($$4));
      } else if ($$2 == ada.f) {
         this.a.a(new foa(true, () -> {
            this.a.s.h.b(new ags(ags.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == ada.g) {
         fgm $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fnc());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wy.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wy.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wy.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wy.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == ada.h) {
         this.t.a($$1, $$1.dv(), $$1.dz(), $$1.dB(), avo.aF, avp.h, 0.18F, 0.45F);
      } else if ($$2 == ada.i) {
         this.t.e($$3);
      } else if ($$2 == ada.j) {
         this.t.c($$3);
      } else if ($$2 == ada.k) {
         this.t.a($$1, $$1.dv(), $$1.dx(), $$1.dB(), avo.uV, avp.g, 1.0F, 1.0F);
      } else if ($$2 == ada.l) {
         this.t.a(lm.q, $$1.dv(), $$1.dx(), $$1.dB(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.t.a($$1, $$1.dv(), $$1.dx(), $$1.dB(), avo.hQ, avp.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ada.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == ada.n) {
         this.a.s.c($$3 == 1.0F);
      } else if ($$2 == ada.o && this.R != null) {
         this.R.c();
      }
   }

   private void a(gdv $$0, fyz $$1, fnv.a $$2) {
      this.R = new fzh($$0, $$1, this.a.f);
      this.a.a(new fnv(this.R::b, $$2));
   }

   @Override
   public void a(adl $$0) {
      zi.a($$0, this, this.a);
      fhw $$1 = this.a.j.i();
      eql $$2 = $$0.b();
      eqn $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = eqn.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(adg $$0) {
      zi.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afy $$0) {
      zi.a($$0, this, this.a);
      this.x.a($$0);
   }

   @Override
   public void a(aek $$0) {
      zi.a($$0, this, this.a);
      akq $$1 = $$0.b();
      if ($$1 == null) {
         this.x.a(null, false);
      } else {
         ag $$2 = this.x.a($$1);
         this.x.a($$2, false);
      }
   }

   @Override
   public void a(acm $$0) {
      zi.a($$0, this, this.a);
      this.D = new CommandDispatcher($$0.a(ep.a(this.H, this.I)));
   }

   @Override
   public void a(afq $$0) {
      zi.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acl $$0) {
      zi.a($$0, this, this.a);
      this.y.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agb $$0) {
      zi.a($$0, this, this.a);
      this.E.a($$0.b());
      ffu $$1 = this.a.s.m();
      $$1.a(this.E.b(), this.a.r.H_());
      this.W.a($$1, this.H);
   }

   @Override
   public void a(aea $$0) {
      zi.a($$0, this, this.a);
      eww $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(aft $$0) {
      zi.a($$0, this, this.a);
      if (!this.z.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abx $$0) {
      zi.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avv<?>> $$1 = (Entry<avv<?>>)$$4.next();
         avv<?> $$2 = (avv<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fob $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aed $$0) {
      zi.a($$0, this, this.a);
      ffu $$1 = this.a.s.m();
      $$1.a($$0.f());
      aed.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akq $$3 : $$0.b()) {
               this.E.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akq $$4 : $$0.b()) {
               this.E.a($$4).ifPresent($$1::a);
            }

            for (akq $$5 : $$0.e()) {
               this.E.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akq $$6 : $$0.b()) {
               this.E.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fkn.a(this.a.aw(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fsa) {
         ((fsa)this.a.y).F();
      }
   }

   @Override
   public void a(aga $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 instanceof btl) {
         jm<brw> $$2 = $$0.e();
         bry $$3 = new bry($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((btl)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zw $$0) {
      zi.a($$0, this, this.a);
      fzr $$1 = new fzr();
      $$0.b().forEach($$1::a);
      $$1.a(this.H, this.b.e());
      List<cuo> $$2 = List.copyOf(csz.e().l());
      this.W.a($$2);
   }

   @Override
   public void a(adv $$0) {
   }

   @Override
   public void a(adw $$0) {
   }

   @Override
   public void a(adx $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fnb($$0.e(), this.t.k().l()));
         } else {
            this.a.s.fX();
         }
      }
   }

   @Override
   public void a(acg $$0) {
      zi.a($$0, this, this.a);
      this.u.a($$0.e());
      this.u.a($$0.b());
   }

   @Override
   public void a(aes $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(add $$0) {
      zi.a($$0, this, this.a);
      dur $$1 = this.t.C_();
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
   public void a(aen $$0) {
      zi.a($$0, this, this.a);
      this.t.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aeo $$0) {
      zi.a($$0, this, this.a);
      this.t.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aep $$0) {
      zi.a($$0, this, this.a);
      this.t.C_().a($$0.b());
   }

   @Override
   public void a(aer $$0) {
      zi.a($$0, this, this.a);
      this.t.C_().c($$0.b());
   }

   @Override
   public void a(aeq $$0) {
      zi.a($$0, this, this.a);
      this.t.C_().b($$0.b());
   }

   @Override
   public void a(ack $$0) {
      zi.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(ael $$0) {
      zi.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fzn::b).ifPresent(this.c::a);
         fzo.b(this.c);
      }
   }

   @Override
   public void a(acs $$0) {
      zi.a($$0, this, this.a);
      this.y.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aem $$0) {
      zi.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afl $$0) {
      zi.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afj $$0) {
      zi.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afm $$0) {
      zi.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afs $$0) {
      zi.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aef $$0) {
      zi.a($$0, this, this.a);
      if ($$0.a(this.t) instanceof btl $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ady $$0) {
      zi.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aL().f($$1);
         fzk $$2 = this.v.remove($$1);
         if ($$2 != null) {
            this.w.remove($$2);
         }
      }
   }

   @Override
   public void a(adz $$0) {
      zi.a($$0, this, this.a);

      for (adz.b $$1 : $$0.f()) {
         fzk $$2 = new fzk(Objects.requireNonNull($$1.b()), this.D());
         if (this.v.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aL().a($$2);
         }
      }

      for (adz.b $$3 : $$0.e()) {
         fzk $$4 = this.v.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adz.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adz.a $$0, adz.b $$1, fzk $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cA().equals($$1.a())) {
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

   private void a(adz.b $$0, fzk $$1) {
      GameProfile $$2 = $$1.a();
      aza $$3 = this.a.aS();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.D());
      } else {
         xp.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xp $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cmy.b var7) {
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
   public void a(adt $$0) {
      zi.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      $$1.ga().b = $$0.e();
      $$1.ga().d = $$0.g();
      $$1.ga().a = $$0.b();
      $$1.ga().c = $$0.f();
      $$1.ga().a($$0.h());
      $$1.ga().b($$0.i());
   }

   @Override
   public void a(afo $$0) {
      zi.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afn $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acd $$0) {
      zi.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(acr $$0) {
      zi.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gu().b($$0.b());
      } else {
         this.a.s.gu().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ado $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.a.s.da();
      if ($$1 != this.a.s && $$1.db()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahg($$1));
      }
   }

   @Override
   public void a(adp $$0) {
      zi.a($$0, this, this.a);
      cuo $$1 = this.a.s.b($$0.b());
      fou.a $$2 = fou.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fou($$2));
      }
   }

   @Override
   public void a(aai $$0) {
      if ($$0 instanceof aar $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aaq $$2) {
         ((gin)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aaw $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aay $$4) {
         ((giv)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aau $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aas $$6) {
         gib.a $$7 = new gib.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aat $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aax $$9) {
         git $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aao $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aaf $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aae $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aap $$14) {
         this.a.k.o.a($$14.b(), this.t.Z());
      } else if ($$0 instanceof aam $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aan) {
         this.a.k.r.a();
      } else if ($$0 instanceof aav $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aak $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aal $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aah $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aai $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afe $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.V.a($$1, eyd.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         exs $$2 = this.V.a($$1);
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
   public void a(afh $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      exz $$2 = exz.c($$0.b());
      exs $$3 = this.V.a($$1);
      if ($$3 != null) {
         exy $$4 = this.V.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aeg $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      exz $$2 = exz.c($$0.b());
      if ($$1 == null) {
         this.V.b($$2);
      } else {
         exs $$3 = this.V.a($$1);
         if ($$3 != null) {
            this.V.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aex $$0) {
      zi.a($$0, this, this.a);
      String $$1 = $$0.e();
      exs $$2 = $$1 == null ? null : this.V.a($$1);
      this.V.a($$0.b(), $$2);
   }

   @Override
   public void a(afg $$0) {
      zi.a($$0, this, this.a);
      afg.a $$1 = $$0.e();
      exv $$2;
      if ($$1 == afg.a.a) {
         $$2 = this.V.c($$0.f());
      } else {
         $$2 = this.V.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afg.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eyc.b $$2x = eyc.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eyc.a $$3x = eyc.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afg.a $$5 = $$0.b();
      if ($$5 == afg.a.a) {
         for (String $$6 : $$0.g()) {
            this.V.a($$6, $$2);
         }
      } else if ($$5 == afg.a.b) {
         for (String $$7 : $$0.g()) {
            this.V.b($$7, $$2);
         }
      }

      if ($$1 == afg.a.b) {
         this.V.d($$2);
      }
   }

   @Override
   public void a(adh $$0) {
      zi.a($$0, this, this.a);
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
   public void a(afz $$0) {
      zi.a($$0, this, this.a);
      bsq $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof btl)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bur $$2 = ((btl)$$1).eT();

            for (afz.a $$3 : $$0.e()) {
               buq $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bus $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ads $$0) {
      zi.a($$0, this, this.a);
      cps $$1 = this.a.s.cd;
      if ($$1.j == $$0.e()) {
         this.E.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fsa) {
               fru $$2 = ((fsa)this.a.y).G();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adi $$0) {
      zi.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adj $$3 = $$0.f();
      this.t.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adj $$2) {
      eon $$3 = this.t.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, ddd.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, ddd.b, $$7, $$8, $$9);
      $$3.a(new dcb($$0, $$1), true);
   }

   @Override
   public void a(adm $$0) {
      zi.a($$0, this, this.a);
      cps $$1 = this.a.s.cd;
      if ($$0.b() == $$1.j && $$1 instanceof crc $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aev $$0) {
      zi.a($$0, this, this.a);
      this.A = $$0.b();
      this.a.m.b(this.A);
      this.t.i().a($$0.b());
   }

   @Override
   public void a(afi $$0) {
      zi.a($$0, this, this.a);
      this.B = $$0.b();
      this.t.h(this.B);
   }

   @Override
   public void a(aeu $$0) {
      zi.a($$0, this, this.a);
      this.t.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aby $$0) {
      zi.a($$0, this, this.a);
      this.t.b($$0.b());
   }

   @Override
   public void a(acf $$0) {
      zi.a($$0, this, this.a);

      for (zf<? super abt> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aec $$0) {
      zi.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof cnc $$2) {
         $$2.d = $$0.e();
      }
   }

   @Override
   public void a(aci $$0) {
      this.O.a();
   }

   @Override
   public void a(ach $$0) {
      this.O.a($$0.b());
      this.b(new agr(this.O.b()));
   }

   @Override
   public void a(acu $$0) {
      this.a.aN().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aji $$0) {
      this.P.a($$0);
   }

   private void a(int $$0, int $$1, eon $$2, ddd $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kf.a($$0, $$8, $$1), $$9 ? new dvb((byte[])$$6.next().clone()) : new dvb());
            this.t.c($$0, $$8, $$1);
         }
      }
   }

   public vs k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.U;
   }

   public Collection<fzk> l() {
      return this.w;
   }

   public Collection<fzk> m() {
      return this.v.values();
   }

   public Collection<UUID> n() {
      return this.v.keySet();
   }

   @Nullable
   public fzk a(UUID $$0) {
      return this.v.get($$0);
   }

   @Nullable
   public fzk a(String $$0) {
      for (fzk $$1 : this.v.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.s;
   }

   public fyu p() {
      return this.x;
   }

   public CommandDispatcher<ey> q() {
      return this.D;
   }

   public fyz r() {
      return this.t;
   }

   public ffy s() {
      return this.z;
   }

   public UUID t() {
      return this.F;
   }

   public Set<akp<dcu>> u() {
      return this.G;
   }

   public ka.b v() {
      return this.H;
   }

   public void a(xo $$0, boolean $$1) {
      xk $$2 = $$0.l();
      if ($$2 != null && this.M.a($$2, $$1) && this.M.c() > 64) {
         this.E();
      }
   }

   private void E() {
      int $$0 = this.M.a();
      if ($$0 > 0) {
         this.b(new agm($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axk.c.a();
      xg.a $$3 = this.M.b();
      xk $$4 = this.L.pack(new xr($$0, $$1, $$2, $$3.a()));
      this.b(new agp($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xq<ey> $$1 = xq.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agn($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axk.c.a();
         xg.a $$4 = this.M.b();
         fa $$5 = fa.a($$1, $$3x -> {
            xr $$4x = new xr($$3x, $$2, $$3, $$4.a());
            return this.L.pack($$4x);
         });
         this.b(new ago($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xq.a(this.e($$0))) {
         this.b(new agn($$0));
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
         fzl $$0 = this.a.w();
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

   public void a(cmx $$0) {
      if (this.a.b(this.s.getId())) {
         if (this.K == null || !this.K.c().equals($$0)) {
            this.K = xj.a($$0);
            this.L = this.K.a(this.s.getId());
            this.b(new agq(this.K.a().a()));
         }
      }
   }

   @Nullable
   public fzn w() {
      return this.c;
   }

   public cpj x() {
      return this.I;
   }

   public boolean a(cpj $$0) {
      return $$0.a(this.x());
   }

   public eya y() {
      return this.V;
   }

   public cwr z() {
      return this.J;
   }

   public void A() {
      this.W.a();
   }

   public fzq B() {
      return this.W;
   }

   public ali C() {
      return this.k;
   }
}
