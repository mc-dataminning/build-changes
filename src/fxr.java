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

public class fxr extends fxn implements ace, wz {
   private static final Logger i = LogUtils.getLogger();
   private static final xl j = xl.c("multiplayer.unsecureserver.toast.title");
   private static final xl k = xl.c("multiplayer.unsecureserver.toast");
   private static final xl l = xl.c("multiplayer.disconnect.invalid_packet");
   private static final xl m = xl.c("multiplayer.disconnect.chat_validation_failed");
   private static final xl n = xl.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fxq q;
   private fxq.a r;
   private final Map<UUID, fyb> s = Maps.newHashMap();
   private final Set<fyb> t = new ReferenceOpenHashSet();
   private final fxl u;
   private final fxt v;
   private final fer w = new fer(this);
   private int x = 3;
   private int y = 3;
   private final azc z = azc.b();
   private CommandDispatcher<eu> A = new CommandDispatcher();
   private final cyt B;
   private final UUID C = UUID.randomUUID();
   private Set<ala<dbt>> D;
   private final jw.b E;
   private final cpg F;
   private final cwk G;
   @Nullable
   private xw H;
   private yf.c I = yf.c.a;
   private xt J = new xt(20);
   private xy K = xy.a();
   private final fxk L = new fxk();
   private final fya M;
   private final fxv N;
   @Nullable
   private fxy O;
   private boolean P;
   private boolean Q = false;
   private volatile boolean R;
   private final ewq S = new ewq();

   public fxr(ffa $$0, wj $$1, fxu $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fxl($$0, this.e);
      this.v = new fxt(this, $$0);
      this.M = new fya(this, $$0.aP().m());
      this.B = new cyt(this.E);
      this.N = new fxv(this, $$0.aP());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.G = cwk.a(this.F);
   }

   public fxt h() {
      return this.v;
   }

   public void i() {
      this.R = true;
      this.j();
      this.e.c();
   }

   public void j() {
      this.q = null;
      this.O = null;
   }

   public cyt k() {
      return this.B;
   }

   @Override
   public void a(adv $$0) {
      zv.a($$0, this, this.a);
      this.a.q = new fxz(this.a, this);
      agn $$1 = $$0.m();
      List<ala<dbt>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      ala<dbt> $$3 = $$1.b();
      ji<dvp> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fxq.a $$7 = new fxq.a(bqm.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fxq(this, $$7, $$3, $$4, this.x, this.y, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new awh(), new fen());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cA = new gck(this.a.m);
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
      this.H = null;
      this.J = new xt(20);
      this.K = xy.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.P = $$0.n();
      if (this.c != null && !this.Q && !this.B()) {
         fjh $$8 = fjh.a(this.a, fjh.a.j, j, k);
         this.a.ax().a($$8);
         this.Q = true;
      }
   }

   @Override
   public void a(acf $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bsp b(acf $$0) {
      bsv<?> $$1 = $$0.f();
      if ($$1 == bsv.by) {
         fyb $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gcm(this.q, $$2.a());
         }
      } else {
         return $$1.a((dbt)this.q);
      }
   }

   private void a(bsp $$0) {
      if ($$0 instanceof coo $$1) {
         this.a.aj().a((gsi)(new gsb($$1)));
      } else if ($$0 instanceof cfb $$2) {
         boolean $$3 = $$2.Z_();
         grv $$4;
         if ($$3) {
            $$4 = new grt($$2);
         } else {
            $$4 = new gru($$2);
         }

         this.a.aj().a((gsj)$$4);
      }
   }

   @Override
   public void a(acg $$0) {
      zv.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bsp $$4 = new bta(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(afl $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(afj $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(agg $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
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
   public void a(agh $$0) {
      zv.a($$0, this, this.a);
      if (this.a.r != null) {
         bra $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agi $$0) {
      zv.a($$0, this, this.a);
      if (this.a.r != null) {
         bra $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afe $$0) {
      zv.a($$0, this, this.a);
      if (cmr.d($$0.b())) {
         this.a.s.gc().k = $$0.b();
      }
   }

   @Override
   public void a(ady $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               aiq $$2 = $$1.aj();
               evm $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aet $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aep $$0) {
      zv.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bsp.c.b));
   }

   @Override
   public void a(aem $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      evm $$2 = $$1.ds();
      boolean $$3 = $$0.j().contains(bty.a);
      boolean $$4 = $$0.j().contains(bty.b);
      boolean $$5 = $$0.j().contains(bty.c);
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
      if ($$0.j().contains(bty.e)) {
         $$1.s($$1.dH() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(bty.d)) {
         $$1.r($$1.dF() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new agu($$0.i()));
      this.b.a(new ahq.b($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH(), false));
   }

   @Override
   public void a(aeu $$0) {
      zv.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(adq $$0) {
      zv.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adu $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dud $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acu $$0) {
      zv.a($$0, this, this.a);

      for (acu.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acu.a $$2 : $$0.b()) {
         this.q.a(new dba($$2.b().e, $$2.b().f));
      }

      for (acu.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.ao(); $$6 < this.q.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adp $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dud $$0, int $$1, int $$2) {
      enf $$3 = this.q.i().p();
      due[] $$4 = $$0.d();
      dba $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         due $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(kb.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(adk $$0) {
      zv.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(adk $$0) {
      dba $$1 = $$0.b();
      this.q.a(() -> {
         enf $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kb $$3 = kb.a($$1, $$2);
            $$1x.a(dcc.b, $$3, null);
            $$1x.a(dcc.a, $$3, null);
         }

         for (int $$4 = this.q.ao(); $$4 < this.q.ap(); $$4++) {
            $$1x.a(kb.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zv.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aga $$0) {
      zv.a($$0, this, this.a);
      this.a.aY().d();
      this.C();
      fha.b $$1 = this.a.l.d().k();
      this.a.c(new fpy(n, this.b));
      this.b.a(abt.b, new fxo(this.a, this.b, new fxu(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h, $$1)));
      this.b(ahf.a);
      this.b.a(abt.a);
   }

   @Override
   public void a(agf $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      btk $$2 = (btk)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bta) {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avw.iH, avx.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.du(), $$1.dw(), $$1.dA(), avw.nC, avx.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gar(this.a.ap(), this.a.aQ(), this.q, $$1, $$2));
         if ($$1 instanceof cjc $$3) {
            cuk $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.q.a($$0.b(), bsp.c.b);
            }
         } else if (!($$1 instanceof bta)) {
            this.q.a($$0.b(), bsp.c.b);
         }
      }
   }

   @Override
   public void a(agc $$0) {
      zv.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aef $$0) {
      zv.a($$0, this, this.a);
      Optional<ye> $$1 = $$0.g().a(this.K);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.K.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fyb $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
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
               this.a.aY().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aY().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zv.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adg $$0) {
      zv.a($$0, this, this.a);
      Optional<xx> $$1 = $$0.b().a(this.K);
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
   public void a(ach $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            btk $$2 = (btk)$$1;
            $$2.a(bqo.a);
         } else if ($$0.e() == 3) {
            btk $$3 = (btk)$$1;
            $$3.a(bqo.b);
         } else if ($$0.e() == 2) {
            cms $$4 = (cms)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lj.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lj.r);
         }
      }
   }

   @Override
   public void a(adn $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afv $$0) {
      zv.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afh $$0) {
      zv.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afq $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bH();

         for (int $$3 : $$0.b()) {
            bsp $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof coq) {
                     this.a.s.O = $$1.dF();
                     this.a.s.r($$1.dF());
                     this.a.s.n($$1.dF());
                  }

                  xl $$5 = xl.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afk $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 instanceof btm) {
         ((btm)$$1).s($$0.e());
      }
   }

   private static cuk a(cms $$0) {
      for (bqo $$1 : bqo.values()) {
         cuk $$2 = $$0.b($$1);
         if ($$2.a(cun.vt)) {
            return $$2;
         }
      }

      return new cuk(cun.vt);
   }

   @Override
   public void a(adi $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gsi)(new gsa((cju)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lj.ak, 30);
               this.q.a($$1.du(), $$1.dw(), $$1.dA(), avw.zw, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cms)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gsi)(new gse((chr)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(ade $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(afo $$0) {
      zv.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gm().a($$0.e());
      this.a.s.gm().b($$0.f());
   }

   @Override
   public void a(afn $$0) {
      zv.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aes $$0) {
      zv.a($$0, this, this.a);
      agn $$1 = $$0.b();
      ala<dbt> $$2 = $$1.b();
      ji<dvp> $$3 = $$1.a();
      gcl $$4 = this.a.s;
      if ($$2 != $$4.dP().af()) {
         Map<epd, epf> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fxq.a $$8 = new fxq.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fxq(this, $$8, $$2, $$3, this.x, this.y, this.a::aI, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.ge()) {
         $$4.r();
      }

      gcl $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bV(), $$4.cb());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.al());
      this.a.s = $$9;
      if ($$2 != $$4.dP().af()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<akk.c<?>> $$11 = $$4.ap().c();
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
      $$9.cA = new gck(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gs());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cH = $$4.cH;
      $$9.cI = $$4.cI;
      if (this.a.y instanceof flw || this.a.y instanceof flw.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(adj $$0) {
      zv.a($$0, this, this.a);
      dbl $$1 = new dbl(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.h(this.a.s.ds().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adm $$0) {
      zv.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof che $$2) {
         gcl $$3 = this.a.s;
         bqy $$4 = new bqy($$0.e());
         cqp $$5 = new cqp($$0.b(), $$3.gc(), $$4, $$2);
         $$3.cb = $$5;
         this.a.a(new fow($$5, $$3.gc(), $$2));
      }
   }

   @Override
   public void a(aeb $$0) {
      zv.a($$0, this, this.a);
      fml.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adb $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      cuk $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fol)) {
            $$1.cb.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.gc().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fol $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cqq.f($$3)) {
            if (!$$2.e()) {
               cuk $$6 = $$1.ca.b($$3).g();
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
   public void a(acz $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.ca.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cb.j) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aec $$0) {
      zv.a($$0, this, this.a);
      iz $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dqm $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         drx $$3 = this.q.a_($$1);
         dqm $$4 = new dqm($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(acl $$0) {
      zv.a($$0, this, this.a);
      iz $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ur $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.E);
         }

         if ($$1x instanceof dpm && this.a.y instanceof fog) {
            ((fog)this.a.y).E();
         }
      });
   }

   @Override
   public void a(ada $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      if ($$1.cb != null && $$1.cb.j == $$0.b()) {
         $$1.cb.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afm $$0) {
      zv.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof btk $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsw)$$1.getFirst(), (cuk)$$1.getSecond()));
      }
   }

   @Override
   public void a(acy $$0) {
      zv.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acm $$0) {
      zv.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ack $$0) {
      zv.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adl $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      adl.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayu.d($$3 + 0.5F);
      if ($$2 == adl.b) {
         $$1.a(xl.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adl.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == adl.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == adl.e) {
         this.a.q.a(dbq.a($$4));
      } else if ($$2 == adl.f) {
         if ($$4 == 0) {
            this.a.s.cz.b(new ahd(ahd.a.a));
            this.a.a(new fmw(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fng(true, () -> {
               this.a.s.cz.b(new ahd(ahd.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == adl.g) {
         ffe $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new flx());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(xl.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(xl.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(xl.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(xl.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == adl.h) {
         this.q.a($$1, $$1.du(), $$1.dy(), $$1.dA(), avw.aF, avx.h, 0.18F, 0.45F);
      } else if ($$2 == adl.i) {
         this.q.e($$3);
      } else if ($$2 == adl.j) {
         this.q.c($$3);
      } else if ($$2 == adl.k) {
         this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avw.uS, avx.g, 1.0F, 1.0F);
      } else if ($$2 == adl.l) {
         this.q.a(lj.q, $$1.du(), $$1.dw(), $$1.dA(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avw.hQ, avx.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adl.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == adl.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == adl.o && this.O != null) {
         this.O.c();
      }
   }

   private void a(gcl $$0, fxq $$1) {
      this.O = new fxy($$0, $$1, this.a.f);
      this.a.a(new fmw(this.O::b));
   }

   @Override
   public void a(adw $$0) {
      zv.a($$0, this, this.a);
      fgp $$1 = this.a.j.j();
      epd $$2 = $$0.b();
      epf $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = epf.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(adr $$0) {
      zv.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agj $$0) {
      zv.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aev $$0) {
      zv.a($$0, this, this.a);
      alb $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(acx $$0) {
      zv.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(el.a(this.E, this.F)));
   }

   @Override
   public void a(agb $$0) {
      zv.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      zv.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agm $$0) {
      zv.a($$0, this, this.a);
      this.B.a($$0.b());
      fen $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gsu.c, $$1.b());
   }

   @Override
   public void a(ael $$0) {
      zv.a($$0, this, this.a);
      evm $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(age $$0) {
      zv.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aci $$0) {
      zv.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awd<?>> $$1 = (Entry<awd<?>>)$$4.next();
         awd<?> $$2 = (awd<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fnh $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(aeo $$0) {
      zv.a($$0, this, this.a);
      fen $$1 = this.a.s.m();
      $$1.a($$0.f());
      aeo.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (alb $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (alb $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (alb $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (alb $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fjg.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fqr) {
         ((fqr)this.a.y).E();
      }
   }

   @Override
   public void a(agl $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 instanceof btk) {
         ji<brv> $$2 = $$0.e();
         brx $$3 = new brx($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((btk)$$1).c($$3, null);
      }
   }

   @Override
   public void a(aah $$0) {
      zv.a($$0, this, this.a);
      fyh $$1 = new fyh();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(aeg $$0) {
   }

   @Override
   public void a(aeh $$0) {
   }

   @Override
   public void a(aei $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new flw($$0.e(), this.q.k().l()));
         } else {
            this.a.s.ga();
         }
      }
   }

   @Override
   public void a(acr $$0) {
      zv.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(afd $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ado $$0) {
      zv.a($$0, this, this.a);
      dto $$1 = this.q.C_();
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
      zv.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aez $$0) {
      zv.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afa $$0) {
      zv.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(afc $$0) {
      zv.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(afb $$0) {
      zv.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(acv $$0) {
      zv.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aew $$0) {
      zv.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fye::b).ifPresent(this.c::a);
         fyf.b(this.c);
      }
   }

   @Override
   public void a(add $$0) {
      zv.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aex $$0) {
      zv.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afw $$0) {
      zv.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afu $$0) {
      zv.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zv.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agd $$0) {
      zv.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeq $$0) {
      zv.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof btk $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aej $$0) {
      zv.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fyb $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(aek $$0) {
      zv.a($$0, this, this.a);

      for (aek.b $$1 : $$0.f()) {
         fyb $$2 = new fyb(Objects.requireNonNull($$1.b()), this.B());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (aek.b $$3 : $$0.e()) {
         fyb $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aek.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aek.a $$0, aek.b $$1, fyb $$2) {
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

   private void a(aek.b $$0, fyb $$1) {
      GameProfile $$2 = $$1.a();
      azh $$3 = this.a.aU();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.B());
      } else {
         yc.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               yc $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cmv.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.B());
            }
         } else {
            $$1.a(this.B());
         }
      }
   }

   private boolean B() {
      return this.a.aV() && this.P;
   }

   @Override
   public void a(aee $$0) {
      zv.a($$0, this, this.a);
      cms $$1 = this.a.s;
      $$1.gd().b = $$0.e();
      $$1.gd().d = $$0.g();
      $$1.gd().a = $$0.b();
      $$1.gd().c = $$0.f();
      $$1.gd().a($$0.h());
      $$1.gd().b($$0.i());
   }

   @Override
   public void a(afz $$0) {
      zv.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afy $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aco $$0) {
      zv.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(adc $$0) {
      zv.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gx().b($$0.b());
      } else {
         this.a.s.gx().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adz $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahr($$1));
      }
   }

   @Override
   public void a(aea $$0) {
      zv.a($$0, this, this.a);
      cuk $$1 = this.a.s.b($$0.b());
      fod.a $$2 = fod.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fod($$2));
      }
   }

   @Override
   public void a(aat $$0) {
      if ($$0 instanceof abc $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abb $$2) {
         ((ghc)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof abh $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof abj $$4) {
         ((ghk)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof abf $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof abd $$6) {
         ggq.a $$7 = new ggq.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof abe $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof abi $$9) {
         ghi $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aaz $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aaq $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aap $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aba $$14) {
         this.a.k.o.a($$14.b(), this.q.Z());
      } else if ($$0 instanceof aax $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aay) {
         this.a.k.r.a();
      } else if ($$0 instanceof abg $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aav $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aaw $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aas $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aat $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afp $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.S.a($$1, ewt.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         ewi $$2 = this.S.a($$1);
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
   public void a(afs $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewp $$2 = ewp.c($$0.b());
      ewi $$3 = this.S.a($$1);
      if ($$3 != null) {
         ewo $$4 = this.S.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aer $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewp $$2 = ewp.c($$0.b());
      if ($$1 == null) {
         this.S.b($$2);
      } else {
         ewi $$3 = this.S.a($$1);
         if ($$3 != null) {
            this.S.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afi $$0) {
      zv.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewi $$2 = $$1 == null ? null : this.S.a($$1);
      this.S.a($$0.b(), $$2);
   }

   @Override
   public void a(afr $$0) {
      zv.a($$0, this, this.a);
      afr.a $$1 = $$0.e();
      ewl $$2;
      if ($$1 == afr.a.a) {
         $$2 = this.S.c($$0.f());
      } else {
         $$2 = this.S.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afr.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         ews.b $$2x = ews.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         ews.a $$3x = ews.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afr.a $$5 = $$0.b();
      if ($$5 == afr.a.a) {
         for (String $$6 : $$0.g()) {
            this.S.a($$6, $$2);
         }
      } else if ($$5 == afr.a.b) {
         for (String $$7 : $$0.g()) {
            this.S.b($$7, $$2);
         }
      }

      if ($$1 == afr.a.b) {
         this.S.d($$2);
      }
   }

   @Override
   public void a(ads $$0) {
      zv.a($$0, this, this.a);
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
   public void a(agk $$0) {
      zv.a($$0, this, this.a);
      bsp $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof btk)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bup $$2 = ((btk)$$1).eW();

            for (agk.a $$3 : $$0.e()) {
               buo $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (buq $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aed $$0) {
      zv.a($$0, this, this.a);
      cpp $$1 = this.a.s.cb;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fqr) {
               fql $$2 = ((fqr)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adt $$0) {
      zv.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adu $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adu $$2) {
      enf $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dcc.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dcc.b, $$7, $$8, $$9);
      $$3.a(new dba($$0, $$1), true);
   }

   @Override
   public void a(adx $$0) {
      zv.a($$0, this, this.a);
      cpp $$1 = this.a.s.cb;
      if ($$0.b() == $$1.j && $$1 instanceof cqy $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afg $$0) {
      zv.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(aft $$0) {
      zv.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aff $$0) {
      zv.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acj $$0) {
      zv.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(acq $$0) {
      zv.a($$0, this, this.a);

      for (zs<? super ace> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aen $$0) {
      zv.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof cmz $$2) {
         $$2.c = $$0.e();
         $$2.d = $$0.f();
         $$2.e = $$0.g();
      }
   }

   @Override
   public void a(act $$0) {
      this.L.a();
   }

   @Override
   public void a(acs $$0) {
      this.L.a($$0.b());
      this.b(new ahc(this.L.b()));
   }

   @Override
   public void a(adf $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajt $$0) {
      this.M.a($$0);
   }

   private void a(int $$0, int $$1, enf $$2, dcc $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kb.a($$0, $$8, $$1), $$9 ? new dty((byte[])$$6.next().clone()) : new dty());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public wj l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.R;
   }

   public Collection<fyb> m() {
      return this.t;
   }

   public Collection<fyb> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fyb a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fyb a(String $$0) {
      for (fyb $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fxl q() {
      return this.u;
   }

   public CommandDispatcher<eu> r() {
      return this.A;
   }

   public fxq s() {
      return this.q;
   }

   public fer t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<ala<dbt>> v() {
      return this.D;
   }

   public jw.b w() {
      return this.E;
   }

   public void a(yb $$0, boolean $$1) {
      xx $$2 = $$0.l();
      if ($$2 != null && this.J.a($$2, $$1) && this.J.c() > 64) {
         this.C();
      }
   }

   private void C() {
      int $$0 = this.J.a();
      if ($$0 > 0) {
         this.b(new agx($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axs.c.a();
      xt.a $$3 = this.J.b();
      xx $$4 = this.I.pack(new ye($$0, $$1, $$2, $$3.a()));
      this.b(new aha($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yd<eu> $$1 = yd.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agy($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axs.c.a();
         xt.a $$4 = this.J.b();
         ew $$5 = ew.a($$1, $$3x -> {
            ye $$4x = new ye($$3x, $$2, $$3, $$4.a());
            return this.I.pack($$4x);
         });
         this.b(new agz($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yd.a(this.e($$0))) {
         this.b(new agy($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<eu> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fyc $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aP().f()) {
         this.M.a();
      }

      this.N.a();
      this.e.a();
      if (this.O != null) {
         this.O.a();
      }
   }

   public void a(cmu $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.H == null || !this.H.c().equals($$0)) {
            this.H = xw.a($$0);
            this.I = this.H.a(this.p.getId());
            this.b(new ahb(this.H.a().a()));
         }
      }
   }

   @Nullable
   public fye x() {
      return this.c;
   }

   public cpg y() {
      return this.F;
   }

   public boolean a(cpg $$0) {
      return $$0.a(this.y());
   }

   public ewq z() {
      return this.S;
   }

   public cwk A() {
      return this.G;
   }
}
