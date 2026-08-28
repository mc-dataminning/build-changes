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

public class fxu extends fxq implements ach, xc {
   private static final Logger i = LogUtils.getLogger();
   private static final xo j = xo.c("multiplayer.unsecureserver.toast.title");
   private static final xo k = xo.c("multiplayer.unsecureserver.toast");
   private static final xo l = xo.c("multiplayer.disconnect.invalid_packet");
   private static final xo m = xo.c("multiplayer.disconnect.chat_validation_failed");
   private static final xo n = xo.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fxt q;
   private fxt.a r;
   private final Map<UUID, fye> s = Maps.newHashMap();
   private final Set<fye> t = new ReferenceOpenHashSet();
   private final fxo u;
   private final fxw v;
   private final feu w = new feu(this);
   private int x = 3;
   private int y = 3;
   private final azf z = azf.b();
   private CommandDispatcher<eu> A = new CommandDispatcher();
   private final cyw B;
   private final UUID C = UUID.randomUUID();
   private Set<ald<dbw>> D;
   private final jw.b E;
   private final cpj F;
   private final cwn G;
   @Nullable
   private xz H;
   private yi.c I = yi.c.a;
   private xw J = new xw(20);
   private yb K = yb.a();
   private final fxn L = new fxn();
   private final fyd M;
   private final fxy N;
   @Nullable
   private fyb O;
   private boolean P;
   private boolean Q = false;
   private volatile boolean R;
   private final ewt S = new ewt();

   public fxu(ffd $$0, wj $$1, fxx $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fxo($$0, this.e);
      this.v = new fxw(this, $$0);
      this.M = new fyd(this, $$0.aP().m());
      this.B = new cyw(this.E);
      this.N = new fxy(this, $$0.aP());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.G = cwn.a(this.F);
   }

   public fxw g() {
      return this.v;
   }

   public void h() {
      this.R = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.q = null;
      this.O = null;
   }

   public cyw j() {
      return this.B;
   }

   @Override
   public void a(ady $$0) {
      zy.a($$0, this, this.a);
      this.a.q = new fyc(this.a, this);
      agq $$1 = $$0.m();
      List<ald<dbw>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      ald<dbw> $$3 = $$1.b();
      ji<dvs> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fxt.a $$7 = new fxt.a(bqp.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fxt(this, $$7, $$3, $$4, this.x, this.y, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.q, fmz.a.c);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new awk(), new feq());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cA = new gcn(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.q, fmz.a.c);
      this.a.s.u($$0.j());
      this.a.s.b($$0.k());
      this.a.s.v($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.H = null;
      this.J = new xw(20);
      this.K = yb.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.P = $$0.n();
      if (this.c != null && !this.Q && !this.A()) {
         fjk $$8 = fjk.a(this.a, fjk.a.j, j, k);
         this.a.ax().a($$8);
         this.Q = true;
      }
   }

   @Override
   public void a(aci $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bss b(aci $$0) {
      bsy<?> $$1 = $$0.f();
      if ($$1 == bsy.by) {
         fye $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gcp(this.q, $$2.a());
         }
      } else {
         return $$1.a((dbw)this.q);
      }
   }

   private void a(bss $$0) {
      if ($$0 instanceof cor $$1) {
         this.a.aj().a((gsl)(new gse($$1)));
      } else if ($$0 instanceof cfe $$2) {
         boolean $$3 = $$2.Z_();
         gry $$4;
         if ($$3) {
            $$4 = new grw($$2);
         } else {
            $$4 = new grx($$2);
         }

         this.a.aj().a((gsm)$$4);
      }
   }

   @Override
   public void a(acj $$0) {
      zy.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bss $$4 = new btd(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(afo $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(afm $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(agj $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
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
   public void a(agk $$0) {
      zy.a($$0, this, this.a);
      if (this.a.r != null) {
         brd $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agl $$0) {
      zy.a($$0, this, this.a);
      if (this.a.r != null) {
         brd $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afh $$0) {
      zy.a($$0, this, this.a);
      if (cmu.d($$0.b())) {
         this.a.s.gc().k = $$0.b();
      }
   }

   @Override
   public void a(aeb $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               ait $$2 = $$1.aj();
               evp $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aew $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aes $$0) {
      zy.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bss.c.b));
   }

   @Override
   public void a(aep $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      evp $$2 = $$1.ds();
      boolean $$3 = $$0.j().contains(bub.a);
      boolean $$4 = $$0.j().contains(bub.b);
      boolean $$5 = $$0.j().contains(bub.c);
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
      if ($$0.j().contains(bub.e)) {
         $$1.s($$1.dH() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(bub.d)) {
         $$1.r($$1.dF() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new agx($$0.i()));
      this.b.a(new aht.b($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH(), false));
   }

   @Override
   public void a(aex $$0) {
      zy.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(adt $$0) {
      zy.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adx $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dug $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acx $$0) {
      zy.a($$0, this, this.a);

      for (acx.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acx.a $$2 : $$0.b()) {
         this.q.a(new dbd($$2.b().e, $$2.b().f));
      }

      for (acx.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.ao(); $$6 < this.q.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, ads $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dug $$0, int $$1, int $$2) {
      eni $$3 = this.q.i().p();
      duh[] $$4 = $$0.d();
      dbd $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         duh $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(kb.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(adn $$0) {
      zy.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(adn $$0) {
      dbd $$1 = $$0.b();
      this.q.a(() -> {
         eni $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kb $$3 = kb.a($$1, $$2);
            $$1x.a(dcf.b, $$3, null);
            $$1x.a(dcf.a, $$3, null);
         }

         for (int $$4 = this.q.ao(); $$4 < this.q.ap(); $$4++) {
            $$1x.a(kb.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acq $$0) {
      zy.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agd $$0) {
      zy.a($$0, this, this.a);
      this.a.aY().d();
      this.B();
      fhd.b $$1 = this.a.l.d().k();
      this.a.c(new fqb(n, this.b));
      this.b.a(abw.b, new fxr(this.a, this.b, new fxx(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h, $$1)));
      this.b(ahi.a);
      this.b.a(abw.a);
   }

   @Override
   public void a(agi $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      btn $$2 = (btn)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof btd) {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avz.iH, awa.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avz.nC, awa.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gau(this.a.ap(), this.a.aQ(), this.q, $$1, $$2));
         if ($$1 instanceof cjf $$3) {
            cun $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.q.a($$0.b(), bss.c.b);
            }
         } else if (!($$1 instanceof btd)) {
            this.q.a($$0.b(), bss.c.b);
         }
      }
   }

   @Override
   public void a(agf $$0) {
      zy.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aei $$0) {
      zy.a($$0, this, this.a);
      Optional<yh> $$1 = $$0.g().a(this.K);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.K.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fye $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
         } else {
            yf $$4 = $$3.b();
            yj $$5;
            if ($$4 != null) {
               $$5 = new yj($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yj.a($$2);
            }

            ye $$7 = new ye($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aY().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aY().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(adk $$0) {
      zy.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adj $$0) {
      zy.a($$0, this, this.a);
      Optional<ya> $$1 = $$0.b().a(this.K);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get());
         if (!this.a.aY().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(ack $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            btn $$2 = (btn)$$1;
            $$2.a(bqr.a);
         } else if ($$0.e() == 3) {
            btn $$3 = (btn)$$1;
            $$3.a(bqr.b);
         } else if ($$0.e() == 2) {
            cmv $$4 = (cmv)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, li.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, li.r);
         }
      }
   }

   @Override
   public void a(adq $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afy $$0) {
      zy.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afk $$0) {
      zy.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aft $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bH();

         for (int $$3 : $$0.b()) {
            bss $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cot) {
                     this.a.s.O = $$1.dF();
                     this.a.s.r($$1.dF());
                     this.a.s.n($$1.dF());
                  }

                  xo $$5 = xo.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afn $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 instanceof btp) {
         ((btp)$$1).s($$0.e());
      }
   }

   private static cun a(cmv $$0) {
      for (bqr $$1 : bqr.values()) {
         cun $$2 = $$0.b($$1);
         if ($$2.a(cuq.vt)) {
            return $$2;
         }
      }

      return new cun(cuq.vt);
   }

   @Override
   public void a(adl $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gsl)(new gsd((cjx)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, li.ak, 30);
               this.q.a($$1.du(), $$1.dw(), $$1.dA(), avz.zw, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cmv)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gsl)(new gsh((chu)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(afr $$0) {
      zy.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gm().a($$0.e());
      this.a.s.gm().b($$0.f());
   }

   @Override
   public void a(afq $$0) {
      zy.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aev $$0) {
      zy.a($$0, this, this.a);
      agq $$1 = $$0.b();
      ald<dbw> $$2 = $$1.b();
      ji<dvs> $$3 = $$1.a();
      gco $$4 = this.a.s;
      ald<dbw> $$5 = $$4.dP().af();
      boolean $$6 = $$2 != $$5;
      fmz.a $$7 = this.a($$4.eB(), $$2, $$5);
      if ($$6) {
         Map<epg, epi> $$8 = this.q.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         fxt.a $$11 = new fxt.a(this.r.q(), this.r.l(), $$10);
         this.r = $$11;
         this.q = new fxt(this, $$11, $$2, $$3, this.x, this.y, this.a::aI, this.a.f, $$9, $$1.c());
         this.q.a($$8);
         this.a.a(this.q, $$7);
      }

      this.a.t = null;
      if ($$4.ge()) {
         $$4.r();
      }

      gco $$12;
      if ($$0.a((byte)2)) {
         $$12 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bV(), $$4.cb());
      } else {
         $$12 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$12, this.q, $$7);
      $$12.e($$4.al());
      this.a.s = $$12;
      if ($$6) {
         this.a.s().b();
      }

      this.a.t = $$12;
      if ($$0.a((byte)2)) {
         List<akn.c<?>> $$14 = $$4.ap().c();
         if ($$14 != null) {
            $$12.ap().a($$14);
         }
      }

      if ($$0.a((byte)1)) {
         $$12.eW().a($$4.eW());
      }

      $$12.A();
      this.q.c($$12);
      $$12.r(-180.0F);
      $$12.cA = new gcn(this.a.m);
      this.a.q.a($$12);
      $$12.u($$4.gs());
      $$12.b($$4.o());
      $$12.a($$1.h());
      $$12.f($$1.i());
      $$12.cH = $$4.cH;
      $$12.cI = $$4.cI;
      if (this.a.y instanceof flz || this.a.y instanceof flz.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   private fmz.a a(boolean $$0, ald<dbw> $$1, ald<dbw> $$2) {
      fmz.a $$3 = fmz.a.c;
      if (!$$0) {
         if ($$1 == dbw.i || $$2 == dbw.i) {
            $$3 = fmz.a.a;
         } else if ($$1 == dbw.j || $$2 == dbw.j) {
            $$3 = fmz.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adm $$0) {
      zy.a($$0, this, this.a);
      dbo $$1 = new dbo(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.h(this.a.s.ds().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adp $$0) {
      zy.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof chh $$2) {
         gco $$3 = this.a.s;
         brb $$4 = new brb($$0.e());
         cqs $$5 = new cqs($$0.b(), $$3.gc(), $$4, $$2);
         $$3.cb = $$5;
         this.a.a(new foz($$5, $$3.gc(), $$2));
      }
   }

   @Override
   public void a(aee $$0) {
      zy.a($$0, this, this.a);
      fmo.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ade $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      cun $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof foo)) {
            $$1.cb.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.gc().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof foo $$5) {
            $$4 = !$$5.F();
         }

         if ($$0.b() == 0 && cqt.f($$3)) {
            if (!$$2.e()) {
               cun $$6 = $$1.ca.b($$3).g();
               if ($$6.e() || $$6.I() < $$2.I()) {
                  $$2.d(5);
               }
            }

            $$1.ca.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.cb.j && ($$0.b() != 0 || !$$4)) {
            $$1.cb.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(adc $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.ca.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cb.j) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aef $$0) {
      zy.a($$0, this, this.a);
      iz $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dqp $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dsa $$3 = this.q.a_($$1);
         dqp $$4 = new dqp($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(aco $$0) {
      zy.a($$0, this, this.a);
      iz $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ur $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.E);
         }

         if ($$1x instanceof dpp && this.a.y instanceof foj) {
            ((foj)this.a.y).F();
         }
      });
   }

   @Override
   public void a(add $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      if ($$1.cb != null && $$1.cb.j == $$0.b()) {
         $$1.cb.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afp $$0) {
      zy.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof btn $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsz)$$1.getFirst(), (cun)$$1.getSecond()));
      }
   }

   @Override
   public void a(adb $$0) {
      zy.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acp $$0) {
      zy.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acn $$0) {
      zy.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ado $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      ado.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayx.d($$3 + 0.5F);
      if ($$2 == ado.b) {
         $$1.a(xo.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ado.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == ado.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == ado.e) {
         this.a.q.a(dbt.a($$4));
      } else if ($$2 == ado.f) {
         if ($$4 == 0) {
            this.a.s.cz.b(new ahg(ahg.a.a));
            this.a.a(new fmz(() -> false, fmz.a.b));
         } else if ($$4 == 1) {
            this.a.a(new fnj(true, () -> {
               this.a.s.cz.b(new ahg(ahg.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == ado.g) {
         ffh $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fma());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(xo.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(xo.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(xo.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(xo.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == ado.h) {
         this.q.a($$1, $$1.du(), $$1.dy(), $$1.dA(), avz.aF, awa.h, 0.18F, 0.45F);
      } else if ($$2 == ado.i) {
         this.q.e($$3);
      } else if ($$2 == ado.j) {
         this.q.c($$3);
      } else if ($$2 == ado.k) {
         this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avz.uS, awa.g, 1.0F, 1.0F);
      } else if ($$2 == ado.l) {
         this.q.a(li.q, $$1.du(), $$1.dw(), $$1.dA(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avz.hQ, awa.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ado.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == ado.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == ado.o && this.O != null) {
         this.O.c();
      }
   }

   private void a(gco $$0, fxt $$1, fmz.a $$2) {
      this.O = new fyb($$0, $$1, this.a.f);
      this.a.a(new fmz(this.O::b, $$2));
   }

   @Override
   public void a(adz $$0) {
      zy.a($$0, this, this.a);
      fgs $$1 = this.a.j.i();
      epg $$2 = $$0.b();
      epi $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = epi.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(adu $$0) {
      zy.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agm $$0) {
      zy.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aey $$0) {
      zy.a($$0, this, this.a);
      ale $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(ada $$0) {
      zy.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(el.a(this.E, this.F)));
   }

   @Override
   public void a(age $$0) {
      zy.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zy.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agp $$0) {
      zy.a($$0, this, this.a);
      this.B.a($$0.b());
      feq $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gsx.c, $$1.b());
   }

   @Override
   public void a(aeo $$0) {
      zy.a($$0, this, this.a);
      evp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agh $$0) {
      zy.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acl $$0) {
      zy.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awg<?>> $$1 = (Entry<awg<?>>)$$4.next();
         awg<?> $$2 = (awg<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fnk $$4x) {
         $$4x.E();
      }
   }

   @Override
   public void a(aer $$0) {
      zy.a($$0, this, this.a);
      feq $$1 = this.a.s.m();
      $$1.a($$0.f());
      aer.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (ale $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ale $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (ale $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ale $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fjj.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fqu) {
         ((fqu)this.a.y).F();
      }
   }

   @Override
   public void a(ago $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 instanceof btn) {
         ji<bry> $$2 = $$0.e();
         bsa $$3 = new bsa($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((btn)$$1).c($$3, null);
      }
   }

   @Override
   public void a(aak $$0) {
      zy.a($$0, this, this.a);
      fyk $$1 = new fyk();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(aej $$0) {
   }

   @Override
   public void a(aek $$0) {
   }

   @Override
   public void a(ael $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new flz($$0.e(), this.q.k().l()));
         } else {
            this.a.s.ga();
         }
      }
   }

   @Override
   public void a(acu $$0) {
      zy.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(afg $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adr $$0) {
      zy.a($$0, this, this.a);
      dtr $$1 = this.q.C_();
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
   public void a(afb $$0) {
      zy.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afc $$0) {
      zy.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afd $$0) {
      zy.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zy.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(afe $$0) {
      zy.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(acy $$0) {
      zy.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aez $$0) {
      zy.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fyh::b).ifPresent(this.c::a);
         fyi.b(this.c);
      }
   }

   @Override
   public void a(adg $$0) {
      zy.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afa $$0) {
      zy.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afz $$0) {
      zy.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zy.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(aga $$0) {
      zy.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agg $$0) {
      zy.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aet $$0) {
      zy.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof btn $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aem $$0) {
      zy.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fye $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(aen $$0) {
      zy.a($$0, this, this.a);

      for (aen.b $$1 : $$0.f()) {
         fye $$2 = new fye(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (aen.b $$3 : $$0.e()) {
         fye $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aen.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aen.a $$0, aen.b $$1, fye $$2) {
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

   private void a(aen.b $$0, fye $$1) {
      GameProfile $$2 = $$1.a();
      azk $$3 = this.a.aU();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         yf.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               yf $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cmy.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.a.aV() && this.P;
   }

   @Override
   public void a(aeh $$0) {
      zy.a($$0, this, this.a);
      cmv $$1 = this.a.s;
      $$1.gd().b = $$0.e();
      $$1.gd().d = $$0.g();
      $$1.gd().a = $$0.b();
      $$1.gd().c = $$0.f();
      $$1.gd().a($$0.h());
      $$1.gd().b($$0.i());
   }

   @Override
   public void a(agc $$0) {
      zy.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agb $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acr $$0) {
      zy.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(adf $$0) {
      zy.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gx().b($$0.b());
      } else {
         this.a.s.gx().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aec $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahu($$1));
      }
   }

   @Override
   public void a(aed $$0) {
      zy.a($$0, this, this.a);
      cun $$1 = this.a.s.b($$0.b());
      fog.a $$2 = fog.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fog($$2));
      }
   }

   @Override
   public void a(aaw $$0) {
      if ($$0 instanceof abf $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abe $$2) {
         ((ghf)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof abk $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof abm $$4) {
         ((ghn)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof abi $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof abg $$6) {
         ggt.a $$7 = new ggt.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof abh $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof abl $$9) {
         ghl $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof abc $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aat $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aas $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof abd $$14) {
         this.a.k.o.a($$14.b(), this.q.Z());
      } else if ($$0 instanceof aba $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof abb) {
         this.a.k.r.a();
      } else if ($$0 instanceof abj $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aay $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aaz $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aav $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aaw $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afs $$0) {
      zy.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.S.a($$1, eww.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         ewl $$2 = this.S.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.S.j($$2);
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
      zy.a($$0, this, this.a);
      String $$1 = $$0.e();
      ews $$2 = ews.c($$0.b());
      ewl $$3 = this.S.a($$1);
      if ($$3 != null) {
         ewr $$4 = this.S.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aeu $$0) {
      zy.a($$0, this, this.a);
      String $$1 = $$0.e();
      ews $$2 = ews.c($$0.b());
      if ($$1 == null) {
         this.S.b($$2);
      } else {
         ewl $$3 = this.S.a($$1);
         if ($$3 != null) {
            this.S.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afl $$0) {
      zy.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewl $$2 = $$1 == null ? null : this.S.a($$1);
      this.S.a($$0.b(), $$2);
   }

   @Override
   public void a(afu $$0) {
      zy.a($$0, this, this.a);
      afu.a $$1 = $$0.e();
      ewo $$2;
      if ($$1 == afu.a.a) {
         $$2 = this.S.c($$0.f());
      } else {
         $$2 = this.S.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afu.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         ewv.b $$2x = ewv.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         ewv.a $$3x = ewv.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afu.a $$5 = $$0.b();
      if ($$5 == afu.a.a) {
         for (String $$6 : $$0.g()) {
            this.S.a($$6, $$2);
         }
      } else if ($$5 == afu.a.b) {
         for (String $$7 : $$0.g()) {
            this.S.b($$7, $$2);
         }
      }

      if ($$1 == afu.a.b) {
         this.S.d($$2);
      }
   }

   @Override
   public void a(adv $$0) {
      zy.a($$0, this, this.a);
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
   public void a(agn $$0) {
      zy.a($$0, this, this.a);
      bss $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof btn)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bus $$2 = ((btn)$$1).eW();

            for (agn.a $$3 : $$0.e()) {
               bur $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (but $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aeg $$0) {
      zy.a($$0, this, this.a);
      cps $$1 = this.a.s.cb;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fqu) {
               fqo $$2 = ((fqu)this.a.y).I();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adw $$0) {
      zy.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adx $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adx $$2) {
      eni $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dcf.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dcf.b, $$7, $$8, $$9);
      $$3.a(new dbd($$0, $$1), true);
   }

   @Override
   public void a(aea $$0) {
      zy.a($$0, this, this.a);
      cps $$1 = this.a.s.cb;
      if ($$0.b() == $$1.j && $$1 instanceof crb $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afj $$0) {
      zy.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(afw $$0) {
      zy.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(afi $$0) {
      zy.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      zy.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(act $$0) {
      zy.a($$0, this, this.a);

      for (zv<? super ach> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aeq $$0) {
      zy.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof cnc $$2) {
         $$2.c = $$0.e();
         $$2.d = $$0.f();
         $$2.e = $$0.g();
      }
   }

   @Override
   public void a(acw $$0) {
      this.L.a();
   }

   @Override
   public void a(acv $$0) {
      this.L.a($$0.b());
      this.b(new ahf(this.L.b()));
   }

   @Override
   public void a(adi $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajw $$0) {
      this.M.a($$0);
   }

   private void a(int $$0, int $$1, eni $$2, dcf $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kb.a($$0, $$8, $$1), $$9 ? new dub((byte[])$$6.next().clone()) : new dub());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public wj k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.R;
   }

   public Collection<fye> l() {
      return this.t;
   }

   public Collection<fye> m() {
      return this.s.values();
   }

   public Collection<UUID> n() {
      return this.s.keySet();
   }

   @Nullable
   public fye a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fye a(String $$0) {
      for (fye $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.p;
   }

   public fxo p() {
      return this.u;
   }

   public CommandDispatcher<eu> q() {
      return this.A;
   }

   public fxt r() {
      return this.q;
   }

   public feu s() {
      return this.w;
   }

   public UUID t() {
      return this.C;
   }

   public Set<ald<dbw>> u() {
      return this.D;
   }

   public jw.b v() {
      return this.E;
   }

   public void a(ye $$0, boolean $$1) {
      ya $$2 = $$0.l();
      if ($$2 != null && this.J.a($$2, $$1) && this.J.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.J.a();
      if ($$0 > 0) {
         this.b(new aha($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axv.c.a();
      xw.a $$3 = this.J.b();
      ya $$4 = this.I.pack(new yh($$0, $$1, $$2, $$3.a()));
      this.b(new ahd($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yg<eu> $$1 = yg.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahb($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axv.c.a();
         xw.a $$4 = this.J.b();
         ew $$5 = ew.a($$1, $$3x -> {
            yh $$4x = new yh($$3x, $$2, $$3, $$4.a());
            return this.I.pack($$4x);
         });
         this.b(new ahc($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yg.a(this.e($$0))) {
         this.b(new ahb($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<eu> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void d() {
      if (this.b.h()) {
         fyf $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.e();
      if (this.a.aP().f()) {
         this.M.a();
      }

      this.N.a();
      this.e.a();
      if (this.O != null) {
         this.O.a();
      }
   }

   public void a(cmx $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.H == null || !this.H.c().equals($$0)) {
            this.H = xz.a($$0);
            this.I = this.H.a(this.p.getId());
            this.b(new ahe(this.H.a().a()));
         }
      }
   }

   @Nullable
   public fyh w() {
      return this.c;
   }

   public cpj x() {
      return this.F;
   }

   public boolean a(cpj $$0) {
      return $$0.a(this.x());
   }

   public ewt y() {
      return this.S;
   }

   public cwn z() {
      return this.G;
   }
}
