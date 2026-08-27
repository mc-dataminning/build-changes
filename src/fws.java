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

public class fws extends fwo implements abq, wl {
   private static final Logger i = LogUtils.getLogger();
   private static final wx j = wx.c("multiplayer.unsecureserver.toast.title");
   private static final wx k = wx.c("multiplayer.unsecureserver.toast");
   private static final wx l = wx.c("multiplayer.disconnect.invalid_packet");
   private static final wx m = wx.c("multiplayer.disconnect.chat_validation_failed");
   private static final wx n = wx.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fwr q;
   private fwr.a r;
   private final Map<UUID, fxc> s = Maps.newHashMap();
   private final Set<fxc> t = new ReferenceOpenHashSet();
   private final fwm u;
   private final fwu v;
   private final fdq w = new fdq(this);
   private int x = 3;
   private int y = 3;
   private final ayk z = ayk.b();
   private CommandDispatcher<ej> A = new CommandDispatcher();
   private final cxx B;
   private final UUID C = UUID.randomUUID();
   private Set<akl<dax>> D;
   private final jl.b E;
   private final coj F;
   @Nullable
   private xi G;
   private xr.c H = xr.c.a;
   private xf I = new xf(20);
   private xk J = xk.a();
   private final fwl K = new fwl();
   private final fxb L;
   private final fww M;
   @Nullable
   private fwz N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final evo R = new evo();

   public fws(fdz $$0, vv $$1, fwv $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fwm($$0, this.e);
      this.v = new fwu(this, $$0);
      this.L = new fxb(this, $$0.aQ().m());
      this.B = new cxx(this.E);
      this.M = new fww(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }
   }

   public fwu h() {
      return this.v;
   }

   public void i() {
      this.Q = true;
      this.j();
      this.e.c();
   }

   public void j() {
      this.q = null;
      this.N = null;
   }

   public cxx k() {
      return this.B;
   }

   @Override
   public void a(adh $$0) {
      zh.a($$0, this, this.a);
      this.a.q = new fxa(this.a, this);
      afy $$1 = $$0.m();
      List<akl<dax>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      akl<dax> $$3 = $$1.b();
      ix<dut> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fwr.a $$7 = new fwr.a(bpr.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fwr(this, $$7, $$3, $$4, this.x, this.y, this.a::aJ, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new avs(), new fdm());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cA = new gbl(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.q);
      this.a.s.u($$0.j());
      this.a.s.b($$0.k());
      this.a.s.v($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.G = null;
      this.I = new xf(20);
      this.J = xk.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fih $$8 = fih.a(this.a, fih.a.j, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(abr $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bru b(abr $$0) {
      bsa<?> $$1 = $$0.f();
      if ($$1 == bsa.by) {
         fxc $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gbn(this.q, $$2.a());
         }
      } else {
         return $$1.a((dax)this.q);
      }
   }

   private void a(bru $$0) {
      if ($$0 instanceof cnr $$1) {
         this.a.ak().a((grj)(new grc($$1)));
      } else if ($$0 instanceof cef $$2) {
         boolean $$3 = $$2.Z_();
         gqw $$4;
         if ($$3) {
            $$4 = new gqu($$2);
         } else {
            $$4 = new gqv($$2);
         }

         this.a.ak().a((grk)$$4);
      }
   }

   @Override
   public void a(abs $$0) {
      zh.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bru $$4 = new bse(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(aew $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(aeu $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(afr $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
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
   public void a(afs $$0) {
      zh.a($$0, this, this.a);
      if (this.a.r != null) {
         bqf $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(aft $$0) {
      zh.a($$0, this, this.a);
      if (this.a.r != null) {
         bqf $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aep $$0) {
      zh.a($$0, this, this.a);
      if (clv.d($$0.b())) {
         this.a.s.gc().k = $$0.b();
      }
   }

   @Override
   public void a(adk $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               aib $$2 = $$1.aj();
               euk $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.M_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.L_(), $$6, $$7, 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(aee $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aea $$0) {
      zh.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bru.c.b));
   }

   @Override
   public void a(ady $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      euk $$2 = $$1.ds();
      boolean $$3 = $$0.j().contains(btc.a);
      boolean $$4 = $$0.j().contains(btc.b);
      boolean $$5 = $$0.j().contains(btc.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.du() + $$0.b();
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
         $$11 = $$1.dw() + $$0.e();
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
         $$15 = $$1.dA() + $$0.f();
         $$1.af = $$1.af + $$0.f();
         $$1.N = $$1.N + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.af = $$15;
         $$1.N = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(btc.e)) {
         $$1.s($$1.dH() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(btc.d)) {
         $$1.r($$1.dF() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new agf($$0.i()));
      this.b.a(new ahb.b($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH(), false));
   }

   @Override
   public void a(aef $$0) {
      zh.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(adc $$0) {
      zh.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adg $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dth $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acg $$0) {
      zh.a($$0, this, this.a);

      for (acg.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acg.a $$2 : $$0.b()) {
         this.q.a(new dae($$2.b().e, $$2.b().f));
      }

      for (acg.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.an(); $$6 < this.q.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adb $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dth $$0, int $$1, int $$2) {
      emj $$3 = this.q.i().p();
      dti[] $$4 = $$0.d();
      dae $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dti $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jq.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(acw $$0) {
      zh.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(acw $$0) {
      dae $$1 = $$0.b();
      this.q.a(() -> {
         emj $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jq $$3 = jq.a($$1, $$2);
            $$1x.a(dbg.b, $$3, null);
            $$1x.a(dbg.a, $$3, null);
         }

         for (int $$4 = this.q.an(); $$4 < this.q.ao(); $$4++) {
            $$1x.a(jq.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abz $$0) {
      zh.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afl $$0) {
      zh.a($$0, this, this.a);
      this.a.ba().d();
      this.B();
      fga.b $$1 = this.a.l.d().k();
      this.a.c(new foz(n, this.b));
      this.b.a(abf.b, new fwp(this.a, this.b, new fwv(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h, $$1)));
      this.b(agq.a);
      this.b.a(abf.a);
   }

   @Override
   public void a(afq $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      bso $$2 = (bso)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bse) {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avh.iH, avi.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avh.nC, avi.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fzs(this.a.aq(), this.a.aR(), this.q, $$1, $$2));
         if ($$1 instanceof cig $$3) {
            cto $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.q.a($$0.b(), bru.c.b);
            }
         } else if (!($$1 instanceof bse)) {
            this.q.a($$0.b(), bru.c.b);
         }
      }
   }

   @Override
   public void a(afn $$0) {
      zh.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adr $$0) {
      zh.a($$0, this, this.a);
      Optional<xq> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fxc $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            xo $$4 = $$3.b();
            xs $$5;
            if ($$4 != null) {
               $$5 = new xs($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xs.a($$2);
            }

            xn $$7 = new xn($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(act $$0) {
      zh.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acs $$0) {
      zh.a($$0, this, this.a);
      Optional<xj> $$1 = $$0.b().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.I.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(abt $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bso $$2 = (bso)$$1;
            $$2.a(bpt.a);
         } else if ($$0.e() == 3) {
            bso $$3 = (bso)$$1;
            $$3.a(bpt.b);
         } else if ($$0.e() == 2) {
            clw $$4 = (clw)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, ky.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, ky.r);
         }
      }
   }

   @Override
   public void a(acz $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afg $$0) {
      zh.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aes $$0) {
      zh.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afb $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bH();

         for (int $$3 : $$0.b()) {
            bru $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cnt) {
                     this.a.s.O = $$1.dF();
                     this.a.s.r($$1.dF());
                     this.a.s.n($$1.dF());
                  }

                  wx $$5 = wx.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aev $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 instanceof bsq) {
         ((bsq)$$1).s($$0.e());
      }
   }

   private static cto a(clw $$0) {
      for (bpt $$1 : bpt.values()) {
         cto $$2 = $$0.b($$1);
         if ($$2.a(ctr.vt)) {
            return $$2;
         }
      }

      return new cto(ctr.vt);
   }

   @Override
   public void a(acu $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((grj)(new grb((ciy)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ky.ak, 30);
               this.q.a($$1.du(), $$1.dw(), $$1.dA(), avh.zw, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((clw)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((grj)(new grf((cgv)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acq $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(aez $$0) {
      zh.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gm().a($$0.e());
      this.a.s.gm().b($$0.f());
   }

   @Override
   public void a(aey $$0) {
      zh.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aed $$0) {
      zh.a($$0, this, this.a);
      afy $$1 = $$0.b();
      akl<dax> $$2 = $$1.b();
      ix<dut> $$3 = $$1.a();
      gbm $$4 = this.a.s;
      if ($$2 != $$4.dP().ae()) {
         Map<eoh, eoj> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fwr.a $$8 = new fwr.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fwr(this, $$8, $$2, $$3, this.x, this.y, this.a::aJ, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.ge()) {
         $$4.r();
      }

      gbm $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bV(), $$4.cb());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.al());
      this.a.s = $$9;
      if ($$2 != $$4.dP().ae()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<ajv.c<?>> $$11 = $$4.ap().c();
         if ($$11 != null) {
            $$9.ap().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eW().a($$4.eW());
      }

      $$9.A();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cA = new gbl(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gs());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cH = $$4.cH;
      $$9.cI = $$4.cI;
      if (this.a.y instanceof fkw || this.a.y instanceof fkw.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(acv $$0) {
      zh.a($$0, this, this.a);
      dap $$1 = new dap(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.ds().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(acy $$0) {
      zh.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cgi $$2) {
         gbm $$3 = this.a.s;
         bqd $$4 = new bqd($$0.e());
         cpt $$5 = new cpt($$0.b(), $$3.gc(), $$4, $$2);
         $$3.cc = $$5;
         this.a.a(new fnv($$5, $$3.gc(), $$2));
      }
   }

   @Override
   public void a(adn $$0) {
      zh.a($$0, this, this.a);
      fll.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acn $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      cto $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fnl)) {
            $$1.cc.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.gc().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fnl $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cpu.f($$3)) {
            if (!$$2.e()) {
               cto $$6 = $$1.cb.b($$3).g();
               if ($$6.e() || $$6.I() < $$2.I()) {
                  $$2.d(5);
               }
            }

            $$1.cb.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.cc.j && ($$0.b() != 0 || !$$4)) {
            $$1.cc.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(acl $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cc.j) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(ado $$0) {
      zh.a($$0, this, this.a);
      io $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dpq $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         drb $$3 = this.q.a_($$1);
         dpq $$4 = new dpq($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(abx $$0) {
      zh.a($$0, this, this.a);
      io $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ud $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.E);
         }

         if ($$1x instanceof doq && this.a.y instanceof fng) {
            ((fng)this.a.y).E();
         }
      });
   }

   @Override
   public void a(acm $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      if ($$1.cc != null && $$1.cc.j == $$0.b()) {
         $$1.cc.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aex $$0) {
      zh.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bso $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsb)$$1.getFirst(), (cto)$$1.getSecond()));
      }
   }

   @Override
   public void a(ack $$0) {
      zh.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(aby $$0) {
      zh.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abw $$0) {
      zh.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acx $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      acx.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayd.d($$3 + 0.5F);
      if ($$2 == acx.b) {
         $$1.a(wx.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acx.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == acx.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == acx.e) {
         this.a.q.a(dau.a($$4));
      } else if ($$2 == acx.f) {
         if ($$4 == 0) {
            this.a.s.h.b(new ago(ago.a.a));
            this.a.a(new flw(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fmg(true, () -> {
               this.a.s.h.b(new ago(ago.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == acx.g) {
         fed $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fkx());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wx.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wx.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wx.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wx.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == acx.h) {
         this.q.a($$1, $$1.du(), $$1.dy(), $$1.dA(), avh.aF, avi.h, 0.18F, 0.45F);
      } else if ($$2 == acx.i) {
         this.q.e($$3);
      } else if ($$2 == acx.j) {
         this.q.c($$3);
      } else if ($$2 == acx.k) {
         this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avh.uS, avi.g, 1.0F, 1.0F);
      } else if ($$2 == acx.l) {
         this.q.a(ky.q, $$1.du(), $$1.dw(), $$1.dA(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avh.hQ, avi.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acx.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == acx.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == acx.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(gbm $$0, fwr $$1) {
      this.N = new fwz($$0, $$1, this.a.f);
      this.a.a(new flw(this.N::b));
   }

   @Override
   public void a(adi $$0) {
      zh.a($$0, this, this.a);
      ffp $$1 = this.a.j.j();
      eoh $$2 = $$0.b();
      eoj $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = eoj.a($$0.e(), $$0.f(), this.a.r.ae());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(add $$0) {
      zh.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afu $$0) {
      zh.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aeg $$0) {
      zh.a($$0, this, this.a);
      akm $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(acj $$0) {
      zh.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(ea.a(this.E, this.F)));
   }

   @Override
   public void a(afm $$0) {
      zh.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aci $$0) {
      zh.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(afx $$0) {
      zh.a($$0, this, this.a);
      this.B.a($$0.b());
      fdm $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(grv.c, $$1.b());
   }

   @Override
   public void a(adx $$0) {
      zh.a($$0, this, this.a);
      euk $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afp $$0) {
      zh.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abu $$0) {
      zh.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avo<?>> $$1 = (Entry<avo<?>>)$$4.next();
         avo<?> $$2 = (avo<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fmh $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(adz $$0) {
      zh.a($$0, this, this.a);
      fdm $$1 = this.a.s.m();
      $$1.a($$0.f());
      adz.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akm $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akm $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (akm $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akm $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fig.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fps) {
         ((fps)this.a.y).E();
      }
   }

   @Override
   public void a(afw $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 instanceof bso) {
         ix<bra> $$2 = $$0.e();
         brc $$3 = new brc($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bso)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zt $$0) {
      zh.a($$0, this, this.a);
      fxi $$1 = new fxi();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(ads $$0) {
   }

   @Override
   public void a(adt $$0) {
   }

   @Override
   public void a(adu $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fkw($$0.e(), this.q.k().l()));
         } else {
            this.a.s.ga();
         }
      }
   }

   @Override
   public void a(acd $$0) {
      zh.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(aeo $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ada $$0) {
      zh.a($$0, this, this.a);
      dss $$1 = this.q.C_();
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
      zh.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aek $$0) {
      zh.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ael $$0) {
      zh.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(aen $$0) {
      zh.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(aem $$0) {
      zh.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(ach $$0) {
      zh.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aeh $$0) {
      zh.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fxf::b).ifPresent(this.c::a);
         fxg.b(this.c);
      }
   }

   @Override
   public void a(acp $$0) {
      zh.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aei $$0) {
      zh.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afh $$0) {
      zh.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zh.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afi $$0) {
      zh.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afo $$0) {
      zh.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeb $$0) {
      zh.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bso $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adv $$0) {
      zh.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         fxc $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(adw $$0) {
      zh.a($$0, this, this.a);

      for (adw.b $$1 : $$0.f()) {
         fxc $$2 = new fxc(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (adw.b $$3 : $$0.e()) {
         fxc $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adw.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adw.a $$0, adw.b $$1, fxc $$2) {
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
               this.t.add($$2);
            } else {
               this.t.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
      }
   }

   private void a(adw.b $$0, fxc $$1) {
      GameProfile $$2 = $$1.a();
      ayp $$3 = this.a.aW();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         xo.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xo $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (clz.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.a.aX() && this.O;
   }

   @Override
   public void a(adq $$0) {
      zh.a($$0, this, this.a);
      clw $$1 = this.a.s;
      $$1.gd().b = $$0.e();
      $$1.gd().d = $$0.g();
      $$1.gd().a = $$0.b();
      $$1.gd().c = $$0.f();
      $$1.gd().a($$0.h());
      $$1.gd().b($$0.i());
   }

   @Override
   public void a(afk $$0) {
      zh.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afj $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aca $$0) {
      zh.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(aco $$0) {
      zh.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gx().b($$0.b());
      } else {
         this.a.s.gx().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adl $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahc($$1));
      }
   }

   @Override
   public void a(adm $$0) {
      zh.a($$0, this, this.a);
      cto $$1 = this.a.s.b($$0.b());
      fnd.a $$2 = fnd.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fnd($$2));
      }
   }

   @Override
   public void a(aaf $$0) {
      if ($$0 instanceof aao $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aan $$2) {
         ((ggd)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aat $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aav $$4) {
         ((ggl)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aar $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aap $$6) {
         gfr.a $$7 = new gfr.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aaq $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aau $$9) {
         ggj $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aal $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aac $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aab $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aam $$14) {
         this.a.k.o.a($$14.b(), this.q.Y());
      } else if ($$0 instanceof aaj $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aak) {
         this.a.k.r.a();
      } else if ($$0 instanceof aas $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aah $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aai $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aae $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aaf $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afa $$0) {
      zh.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, evr.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         evg $$2 = this.R.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.R.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afd $$0) {
      zh.a($$0, this, this.a);
      String $$1 = $$0.e();
      evn $$2 = evn.c($$0.b());
      evg $$3 = this.R.a($$1);
      if ($$3 != null) {
         evm $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aec $$0) {
      zh.a($$0, this, this.a);
      String $$1 = $$0.e();
      evn $$2 = evn.c($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         evg $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aet $$0) {
      zh.a($$0, this, this.a);
      String $$1 = $$0.e();
      evg $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(afc $$0) {
      zh.a($$0, this, this.a);
      afc.a $$1 = $$0.e();
      evj $$2;
      if ($$1 == afc.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afc.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         evq.b $$2x = evq.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         evq.a $$3x = evq.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afc.a $$5 = $$0.b();
      if ($$5 == afc.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == afc.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == afc.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(ade $$0) {
      zh.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.q.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            i.warn("Could not spawn particle effect {}", $$0.m());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.l(); $$5++) {
            double $$6 = this.z.k() * (double)$$0.h();
            double $$7 = this.z.k() * (double)$$0.i();
            double $$8 = this.z.k() * (double)$$0.j();
            double $$9 = this.z.k() * (double)$$0.k();
            double $$10 = this.z.k() * (double)$$0.k();
            double $$11 = this.z.k() * (double)$$0.k();

            try {
               this.q.a($$0.m(), $$0.b(), $$0.e() + $$6, $$0.f() + $$7, $$0.g() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               i.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(afv $$0) {
      zh.a($$0, this, this.a);
      bru $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bso)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            btt $$2 = ((bso)$$1).eW();

            for (afv.a $$3 : $$0.e()) {
               bts $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (btu $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adp $$0) {
      zh.a($$0, this, this.a);
      cot $$1 = this.a.s.cc;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fps) {
               fpm $$2 = ((fps)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adf $$0) {
      zh.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adg $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adg $$2) {
      emj $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dbg.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dbg.b, $$7, $$8, $$9);
      $$3.a(new dae($$0, $$1), true);
   }

   @Override
   public void a(adj $$0) {
      zh.a($$0, this, this.a);
      cot $$1 = this.a.s.cc;
      if ($$0.b() == $$1.j && $$1 instanceof cqc $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aer $$0) {
      zh.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(afe $$0) {
      zh.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aeq $$0) {
      zh.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abv $$0) {
      zh.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(acc $$0) {
      zh.a($$0, this, this.a);

      for (ze<? super abq> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(acf $$0) {
      this.K.a();
   }

   @Override
   public void a(ace $$0) {
      this.K.a($$0.b());
      this.b(new agn(this.K.b()));
   }

   @Override
   public void a(acr $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aje $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, emj $$2, dbg $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jq.a($$0, $$8, $$1), $$9 ? new dtc((byte[])$$6.next().clone()) : new dtc());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public vv l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fxc> m() {
      return this.t;
   }

   public Collection<fxc> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fxc a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fxc a(String $$0) {
      for (fxc $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fwm q() {
      return this.u;
   }

   public CommandDispatcher<ej> r() {
      return this.A;
   }

   public fwr s() {
      return this.q;
   }

   public fdq t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<akl<dax>> v() {
      return this.D;
   }

   public jl.b w() {
      return this.E;
   }

   public void a(xn $$0, boolean $$1) {
      xj $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new agi($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axc.c.a();
      xf.a $$3 = this.I.b();
      xj $$4 = this.H.pack(new xq($$0, $$1, $$2, $$3.a()));
      this.b(new agl($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xp<ej> $$1 = xp.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agj($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axc.c.a();
         xf.a $$4 = this.I.b();
         el $$5 = el.a($$1, $$3x -> {
            xq $$4x = new xq($$3x, $$2, $$3, $$4.a());
            return this.H.pack($$4x);
         });
         this.b(new agk($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xp.a(this.e($$0))) {
         this.b(new agj($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ej> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fxd $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aQ().f()) {
         this.L.a();
      }

      this.M.a();
      this.e.a();
      if (this.N != null) {
         this.N.a();
      }
   }

   public void a(cly $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = xi.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new agm(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fxf x() {
      return this.c;
   }

   public coj y() {
      return this.F;
   }

   public boolean a(coj $$0) {
      return $$0.a(this.y());
   }

   public evo z() {
      return this.R;
   }
}
