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

public class fxy extends fxu implements aci, xd {
   private static final Logger j = LogUtils.getLogger();
   private static final xp k = xp.c("multiplayer.unsecureserver.toast.title");
   private static final xp l = xp.c("multiplayer.unsecureserver.toast");
   private static final xp m = xp.c("multiplayer.disconnect.invalid_packet");
   private static final xp n = xp.c("multiplayer.disconnect.chat_validation_failed");
   private static final xp o = xp.c("connect.reconfiguring");
   private static final int p = 64;
   private final GameProfile q;
   private fxx r;
   private fxx.a s;
   private final Map<UUID, fyi> t = Maps.newHashMap();
   private final Set<fyi> u = new ReferenceOpenHashSet();
   private final fxs v;
   private final fya w;
   private final fey x = new fey(this);
   private int y = 3;
   private int z = 3;
   private final azh A = azh.b();
   private CommandDispatcher<eu> B = new CommandDispatcher();
   private final cza C;
   private final UUID D = UUID.randomUUID();
   private Set<ale<dca>> E;
   private final jw.b F;
   private final cpn G;
   private final cwr H;
   @Nullable
   private ya I;
   private yj.c J = yj.c.a;
   private xx K = new xx(20);
   private yc L = yc.a();
   private final fxr M = new fxr();
   private final fyh N;
   private final fyc O;
   @Nullable
   private fyf P;
   private boolean Q;
   private boolean R = false;
   private volatile boolean S;
   private final ewx T = new ewx();

   public fxy(ffh $$0, wk $$1, fyb $$2) {
      super($$0, $$1, $$2);
      this.q = $$2.a();
      this.F = $$2.c();
      this.G = $$2.d();
      this.v = new fxs($$0, this.e);
      this.w = new fya(this, $$0);
      this.N = new fyh(this, $$0.aP().m());
      this.C = new cza(this.F);
      this.O = new fyc(this, $$0.aP());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.H = cwr.a(this.G);
   }

   public fya g() {
      return this.w;
   }

   public void h() {
      this.S = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.r = null;
      this.P = null;
   }

   public cza j() {
      return this.C;
   }

   @Override
   public void a(adz $$0) {
      zz.a($$0, this, this.a);
      this.a.q = new fyg(this.a, this);
      agr $$1 = $$0.m();
      List<ale<dca>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.E = Sets.newLinkedHashSet($$2);
      ale<dca> $$3 = $$1.b();
      ji<dvw> $$4 = $$1.a();
      this.y = $$0.h();
      this.z = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fxx.a $$7 = new fxx.a(bqt.c, $$0.e(), $$6);
      this.s = $$7;
      this.r = new fxx(this, $$7, $$3, $$4, this.y, this.z, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.r, fnd.a.c);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.r, new awl(), new feu());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.r.c(this.a.s);
      this.a.s.cA = new gcr(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.r, fnd.a.c);
      this.a.s.u($$0.j());
      this.a.s.b($$0.k());
      this.a.s.v($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.I = null;
      this.K = new xx(20);
      this.L = yc.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.Q = $$0.n();
      if (this.c != null && !this.R && !this.A()) {
         fjo $$8 = fjo.a(this.a, fjo.a.j, k, l);
         this.a.ax().a($$8);
         this.R = true;
      }
   }

   @Override
   public void a(acj $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.r.c($$1);
         this.a($$1);
      } else {
         j.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bsw b(acj $$0) {
      btc<?> $$1 = $$0.f();
      if ($$1 == btc.by) {
         fyi $$2 = this.a($$0.e());
         if ($$2 == null) {
            j.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gct(this.r, $$2.a());
         }
      } else {
         return $$1.a((dca)this.r);
      }
   }

   private void a(bsw $$0) {
      if ($$0 instanceof cov $$1) {
         this.a.aj().a((gsp)(new gsi($$1)));
      } else if ($$0 instanceof cfi $$2) {
         boolean $$3 = $$2.Z_();
         gsc $$4;
         if ($$3) {
            $$4 = new gsa($$2);
         } else {
            $$4 = new gsb($$2);
         }

         this.a.aj().a((gsq)$$4);
      }
   }

   @Override
   public void a(ack $$0) {
      zz.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bsw $$4 = new bth(this.r, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.r.c($$4);
   }

   @Override
   public void a(afp $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(afn $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(agk $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
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
   public void a(agl $$0) {
      zz.a($$0, this, this.a);
      if (this.a.r != null) {
         brh $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agm $$0) {
      zz.a($$0, this, this.a);
      if (this.a.r != null) {
         brh $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afi $$0) {
      zz.a($$0, this, this.a);
      if (cmy.d($$0.b())) {
         this.a.s.gc().k = $$0.b();
      }
   }

   @Override
   public void a(aec $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = $$0.a(this.r);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               aiu $$2 = $$1.aj();
               evt $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aex $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = $$0.a(this.r);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aet $$0) {
      zz.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.r.a($$0x, bsw.c.b));
   }

   @Override
   public void a(aeq $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      evt $$2 = $$1.ds();
      boolean $$3 = $$0.j().contains(buf.a);
      boolean $$4 = $$0.j().contains(buf.b);
      boolean $$5 = $$0.j().contains(buf.c);
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
      if ($$0.j().contains(buf.e)) {
         $$1.s($$1.dH() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(buf.d)) {
         $$1.r($$1.dF() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new agy($$0.i()));
      this.b.a(new ahu.b($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH(), false));
   }

   @Override
   public void a(aey $$0) {
      zz.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.r.b($$0x, $$1, 19));
   }

   @Override
   public void a(adu $$0) {
      zz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      ady $$3 = $$0.g();
      this.r.a(() -> {
         this.a($$1, $$2, $$3);
         duk $$3x = this.r.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acy $$0) {
      zz.a($$0, this, this.a);

      for (acy.a $$1 : $$0.b()) {
         this.r.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acy.a $$2 : $$0.b()) {
         this.r.a(new dbh($$2.b().e, $$2.b().f));
      }

      for (acy.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.r.ao(); $$6 < this.r.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adt $$2) {
      this.r.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(duk $$0, int $$1, int $$2) {
      enm $$3 = this.r.i().p();
      dul[] $$4 = $$0.d();
      dbh $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dul $$7 = $$4[$$6];
         int $$8 = this.r.g($$6);
         $$3.a(kb.a($$5, $$8), $$7.c());
         this.r.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(ado $$0) {
      zz.a($$0, this, this.a);
      this.r.i().a($$0.b());
      this.b($$0);
   }

   private void b(ado $$0) {
      dbh $$1 = $$0.b();
      this.r.a(() -> {
         enm $$1x = this.r.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kb $$3 = kb.a($$1, $$2);
            $$1x.a(dcj.b, $$3, null);
            $$1x.a(dcj.a, $$3, null);
         }

         for (int $$4 = this.r.ao(); $$4 < this.r.ap(); $$4++) {
            $$1x.a(kb.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acr $$0) {
      zz.a($$0, this, this.a);
      this.r.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(age $$0) {
      zz.a($$0, this, this.a);
      this.a.aY().d();
      this.B();
      fhh.b $$1 = this.a.l.d().k();
      this.a.c(new fqf(o, this.b));
      this.b.a(abx.b, new fxv(this.a, this.b, new fyb(this.q, this.e, this.F, this.G, this.d, this.c, this.f, this.i, $$1, this.h)));
      this.b(ahj.a);
      this.b.a(abx.a);
   }

   @Override
   public void a(agj $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      btr $$2 = (btr)this.r.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bth) {
            this.r.a($$1.du(), $$1.dw(), $$1.dA(), awa.iH, awb.h, 0.1F, (this.A.i() - this.A.i()) * 0.35F + 0.9F, false);
         } else {
            this.r.a($$1.du(), $$1.dw(), $$1.dA(), awa.nC, awb.h, 0.2F, (this.A.i() - this.A.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gay(this.a.ap(), this.a.aQ(), this.r, $$1, $$2));
         if ($$1 instanceof cjj $$3) {
            cur $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.r.a($$0.b(), bsw.c.b);
            }
         } else if (!($$1 instanceof bth)) {
            this.r.a($$0.b(), bsw.c.b);
         }
      }
   }

   @Override
   public void a(agg $$0) {
      zz.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aej $$0) {
      zz.a($$0, this, this.a);
      Optional<yi> $$1 = $$0.g().a(this.L);
      if ($$1.isEmpty()) {
         this.b.a(m);
      } else {
         this.L.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fyi $$3 = this.a($$2);
         if ($$3 == null) {
            j.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
         } else {
            yg $$4 = $$3.b();
            yk $$5;
            if ($$4 != null) {
               $$5 = new yk($$0.e(), $$2, $$4.c());
            } else {
               $$5 = yk.a($$2);
            }

            yf $$7 = new yf($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adl $$0) {
      zz.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adk $$0) {
      zz.a($$0, this, this.a);
      Optional<yb> $$1 = $$0.b().a(this.L);
      if ($$1.isEmpty()) {
         this.b.a(m);
      } else {
         this.K.a($$1.get());
         if (!this.a.aY().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(acl $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            btr $$2 = (btr)$$1;
            $$2.a(bqv.a);
         } else if ($$0.e() == 3) {
            btr $$3 = (btr)$$1;
            $$3.a(bqv.b);
         } else if ($$0.e() == 2) {
            cmz $$4 = (cmz)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, li.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, li.r);
         }
      }
   }

   @Override
   public void a(adr $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afz $$0) {
      zz.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(afl $$0) {
      zz.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afu $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.e());
      if ($$1 == null) {
         j.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bH();

         for (int $$3 : $$0.b()) {
            bsw $$4 = this.r.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cox) {
                     this.a.s.O = $$1.dF();
                     this.a.s.r($$1.dF());
                     this.a.s.n($$1.dF());
                  }

                  xp $$5 = xp.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afo $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 instanceof btt) {
         ((btt)$$1).s($$0.e());
      }
   }

   private static cur a(cmz $$0) {
      for (bqv $$1 : bqv.values()) {
         cur $$2 = $$0.b($$1);
         if ($$2.a(cuu.vt)) {
            return $$2;
         }
      }

      return new cur(cuu.vt);
   }

   @Override
   public void a(adm $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = $$0.a(this.r);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gsp)(new gsh((ckb)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, li.ak, 30);
               this.r.a($$1.du(), $$1.dw(), $$1.dA(), awa.zw, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cmz)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gsp)(new gsl((chy)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adi $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.r));
      }
   }

   @Override
   public void a(afs $$0) {
      zz.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gm().a($$0.e());
      this.a.s.gm().b($$0.f());
   }

   @Override
   public void a(afr $$0) {
      zz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aew $$0) {
      zz.a($$0, this, this.a);
      agr $$1 = $$0.b();
      ale<dca> $$2 = $$1.b();
      ji<dvw> $$3 = $$1.a();
      gcs $$4 = this.a.s;
      ale<dca> $$5 = $$4.dP().af();
      boolean $$6 = $$2 != $$5;
      fnd.a $$7 = this.a($$4.eB(), $$2, $$5);
      if ($$6) {
         Map<epk, epm> $$8 = this.r.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         fxx.a $$11 = new fxx.a(this.s.q(), this.s.l(), $$10);
         this.s = $$11;
         this.r = new fxx(this, $$11, $$2, $$3, this.y, this.z, this.a::aI, this.a.f, $$9, $$1.c());
         this.r.a($$8);
         this.a.a(this.r, $$7);
      }

      this.a.t = null;
      if ($$4.ge()) {
         $$4.r();
      }

      gcs $$12;
      if ($$0.a((byte)2)) {
         $$12 = this.a.q.a(this.r, $$4.j(), $$4.m(), $$4.bV(), $$4.cb());
      } else {
         $$12 = this.a.q.a(this.r, $$4.j(), $$4.m());
      }

      this.a($$12, this.r, $$7);
      $$12.e($$4.al());
      this.a.s = $$12;
      if ($$6) {
         this.a.s().b();
      }

      this.a.t = $$12;
      if ($$0.a((byte)2)) {
         List<ako.c<?>> $$14 = $$4.ap().c();
         if ($$14 != null) {
            $$12.ap().a($$14);
         }
      }

      if ($$0.a((byte)1)) {
         $$12.eW().a($$4.eW());
      }

      $$12.A();
      this.r.c($$12);
      $$12.r(-180.0F);
      $$12.cA = new gcr(this.a.m);
      this.a.q.a($$12);
      $$12.u($$4.gs());
      $$12.b($$4.o());
      $$12.a($$1.h());
      $$12.f($$1.i());
      $$12.cH = $$4.cH;
      $$12.cI = $$4.cI;
      if (this.a.y instanceof fmd || this.a.y instanceof fmd.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   private fnd.a a(boolean $$0, ale<dca> $$1, ale<dca> $$2) {
      fnd.a $$3 = fnd.a.c;
      if (!$$0) {
         if ($$1 == dca.i || $$2 == dca.i) {
            $$3 = fnd.a.a;
         } else if ($$1 == dca.j || $$2 == dca.j) {
            $$3 = fnd.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adn $$0) {
      zz.a($$0, this, this.a);
      dbs $$1 = new dbs(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.h(this.a.s.ds().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adq $$0) {
      zz.a($$0, this, this.a);
      if (this.r.a($$0.f()) instanceof chl $$2) {
         gcs $$3 = this.a.s;
         brf $$4 = new brf($$0.e());
         cqw $$5 = new cqw($$0.b(), $$3.gc(), $$4, $$2);
         $$3.cb = $$5;
         this.a.a(new fpd($$5, $$3.gc(), $$2));
      }
   }

   @Override
   public void a(aef $$0) {
      zz.a($$0, this, this.a);
      fms.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adf $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      cur $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fot)) {
            $$1.cb.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.gc().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fot $$5) {
            $$4 = !$$5.I();
         }

         if ($$0.b() == 0 && cqx.f($$3)) {
            if (!$$2.e()) {
               cur $$6 = $$1.ca.b($$3).g();
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
   public void a(add $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.ca.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cb.j) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aeg $$0) {
      zz.a($$0, this, this.a);
      iz $$1 = $$0.b();
      if (this.r.c_($$1) instanceof dqt $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dse $$3 = this.r.a_($$1);
         dqt $$4 = new dqt($$1, $$3);
         $$4.a(this.r);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(acp $$0) {
      zz.a($$0, this, this.a);
      iz $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         us $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.F);
         }

         if ($$1x instanceof dpt && this.a.y instanceof fon) {
            ((fon)this.a.y).I();
         }
      });
   }

   @Override
   public void a(ade $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      if ($$1.cb != null && $$1.cb.j == $$0.b()) {
         $$1.cb.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afq $$0) {
      zz.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof btr $$2) {
         $$0.e().forEach($$1 -> $$2.a((btd)$$1.getFirst(), (cur)$$1.getSecond()));
      }
   }

   @Override
   public void a(adc $$0) {
      zz.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acq $$0) {
      zz.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aco $$0) {
      zz.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adp $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      adp.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = ayz.d($$3 + 0.5F);
      if ($$2 == adp.b) {
         $$1.a(xp.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adp.c) {
         this.r.k().b(true);
         this.r.e(0.0F);
      } else if ($$2 == adp.d) {
         this.r.k().b(false);
         this.r.e(1.0F);
      } else if ($$2 == adp.e) {
         this.a.q.a(dbx.a($$4));
      } else if ($$2 == adp.f) {
         if ($$4 == 0) {
            this.a.s.cz.b(new ahh(ahh.a.a));
            this.a.a(new fnd(() -> false, fnd.a.b));
         } else if ($$4 == 1) {
            this.a.a(new fnn(true, () -> {
               this.a.s.cz.b(new ahh(ahh.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == adp.g) {
         ffl $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fme());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(xp.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(xp.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(xp.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(xp.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == adp.h) {
         this.r.a($$1, $$1.du(), $$1.dy(), $$1.dA(), awa.aF, awb.h, 0.18F, 0.45F);
      } else if ($$2 == adp.i) {
         this.r.e($$3);
      } else if ($$2 == adp.j) {
         this.r.c($$3);
      } else if ($$2 == adp.k) {
         this.r.a($$1, $$1.du(), $$1.dw(), $$1.dA(), awa.uS, awb.g, 1.0F, 1.0F);
      } else if ($$2 == adp.l) {
         this.r.a(li.q, $$1.du(), $$1.dw(), $$1.dA(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.r.a($$1, $$1.du(), $$1.dw(), $$1.dA(), awa.hQ, awb.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adp.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == adp.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == adp.o && this.P != null) {
         this.P.c();
      }
   }

   private void a(gcs $$0, fxx $$1, fnd.a $$2) {
      this.P = new fyf($$0, $$1, this.a.f);
      this.a.a(new fnd(this.P::b, $$2));
   }

   @Override
   public void a(aea $$0) {
      zz.a($$0, this, this.a);
      fgw $$1 = this.a.j.i();
      epk $$2 = $$0.b();
      epm $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = epm.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(adv $$0) {
      zz.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agn $$0) {
      zz.a($$0, this, this.a);
      this.v.a($$0);
   }

   @Override
   public void a(aez $$0) {
      zz.a($$0, this, this.a);
      alf $$1 = $$0.b();
      if ($$1 == null) {
         this.v.a(null, false);
      } else {
         af $$2 = this.v.a($$1);
         this.v.a($$2, false);
      }
   }

   @Override
   public void a(adb $$0) {
      zz.a($$0, this, this.a);
      this.B = new CommandDispatcher($$0.a(el.a(this.F, this.G)));
   }

   @Override
   public void a(agf $$0) {
      zz.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ada $$0) {
      zz.a($$0, this, this.a);
      this.w.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agq $$0) {
      zz.a($$0, this, this.a);
      this.C.a($$0.b());
      feu $$1 = this.a.s.m();
      $$1.a(this.C.b(), this.a.r.H_());
      this.a.a(gtb.c, $$1.b());
   }

   @Override
   public void a(aep $$0) {
      zz.a($$0, this, this.a);
      evt $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agi $$0) {
      zz.a($$0, this, this.a);
      if (!this.x.a($$0.b(), $$0.e())) {
         j.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acm $$0) {
      zz.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awh<?>> $$1 = (Entry<awh<?>>)$$4.next();
         awh<?> $$2 = (awh<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fno $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aes $$0) {
      zz.a($$0, this, this.a);
      feu $$1 = this.a.s.m();
      $$1.a($$0.f());
      aes.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (alf $$3 : $$0.b()) {
               this.C.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (alf $$4 : $$0.b()) {
               this.C.a($$4).ifPresent($$1::a);
            }

            for (alf $$5 : $$0.e()) {
               this.C.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (alf $$6 : $$0.b()) {
               this.C.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fjn.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fqy) {
         ((fqy)this.a.y).I();
      }
   }

   @Override
   public void a(agp $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 instanceof btr) {
         ji<bsc> $$2 = $$0.e();
         bse $$3 = new bse($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((btr)$$1).c($$3, null);
      }
   }

   @Override
   public void a(aal $$0) {
      zz.a($$0, this, this.a);
      fyo $$1 = new fyo();
      $$0.b().forEach($$1::a);
      $$1.a(this.F, this.b.e());
   }

   @Override
   public void a(aek $$0) {
   }

   @Override
   public void a(ael $$0) {
   }

   @Override
   public void a(aem $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fmd($$0.e(), this.r.k().l()));
         } else {
            this.a.s.ga();
         }
      }
   }

   @Override
   public void a(acv $$0) {
      zz.a($$0, this, this.a);
      this.s.a($$0.e());
      this.s.a($$0.b());
   }

   @Override
   public void a(afh $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ads $$0) {
      zz.a($$0, this, this.a);
      dtv $$1 = this.r.C_();
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
      zz.a($$0, this, this.a);
      this.r.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afd $$0) {
      zz.a($$0, this, this.a);
      this.r.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afe $$0) {
      zz.a($$0, this, this.a);
      this.r.C_().a($$0.b());
   }

   @Override
   public void a(afg $$0) {
      zz.a($$0, this, this.a);
      this.r.C_().c($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zz.a($$0, this, this.a);
      this.r.C_().b($$0.b());
   }

   @Override
   public void a(acz $$0) {
      zz.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(afa $$0) {
      zz.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fyl::b).ifPresent(this.c::a);
         fym.b(this.c);
      }
   }

   @Override
   public void a(adh $$0) {
      zz.a($$0, this, this.a);
      this.w.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afb $$0) {
      zz.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(aga $$0) {
      zz.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afy $$0) {
      zz.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(agb $$0) {
      zz.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agh $$0) {
      zz.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeu $$0) {
      zz.a($$0, this, this.a);
      if ($$0.a(this.r) instanceof btr $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aen $$0) {
      zz.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fyi $$2 = this.t.remove($$1);
         if ($$2 != null) {
            this.u.remove($$2);
         }
      }
   }

   @Override
   public void a(aeo $$0) {
      zz.a($$0, this, this.a);

      for (aeo.b $$1 : $$0.f()) {
         fyi $$2 = new fyi(Objects.requireNonNull($$1.b()), this.A());
         if (this.t.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (aeo.b $$3 : $$0.e()) {
         fyi $$4 = this.t.get($$3.a());
         if ($$4 == null) {
            j.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aeo.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aeo.a $$0, aeo.b $$1, fyi $$2) {
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
      }
   }

   private void a(aeo.b $$0, fyi $$1) {
      GameProfile $$2 = $$1.a();
      azm $$3 = this.a.aU();
      if ($$3 == null) {
         j.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         yg.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               yg $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cnc.b var7) {
               j.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.a.aV() && this.Q;
   }

   @Override
   public void a(aei $$0) {
      zz.a($$0, this, this.a);
      cmz $$1 = this.a.s;
      $$1.gd().b = $$0.e();
      $$1.gd().d = $$0.g();
      $$1.gd().a = $$0.b();
      $$1.gd().c = $$0.f();
      $$1.gd().a($$0.h());
      $$1.gd().b($$0.i());
   }

   @Override
   public void a(agd $$0) {
      zz.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agc $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acs $$0) {
      zz.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(adg $$0) {
      zz.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gx().b($$0.b());
      } else {
         this.a.s.gx().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aed $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahv($$1));
      }
   }

   @Override
   public void a(aee $$0) {
      zz.a($$0, this, this.a);
      cur $$1 = this.a.s.b($$0.b());
      fok.a $$2 = fok.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fok($$2));
      }
   }

   @Override
   public void a(aax $$0) {
      if ($$0 instanceof abg $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abf $$2) {
         ((ghj)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof abl $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof abn $$4) {
         ((ghr)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof abj $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof abh $$6) {
         ggx.a $$7 = new ggx.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof abi $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof abm $$9) {
         ghp $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof abd $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aau $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aat $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof abe $$14) {
         this.a.k.o.a($$14.b(), this.r.Z());
      } else if ($$0 instanceof abb $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof abc) {
         this.a.k.r.a();
      } else if ($$0 instanceof abk $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aaz $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aba $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aaw $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aax $$0) {
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aft $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.T.a($$1, exa.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         ewp $$2 = this.T.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.T.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afw $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      eww $$2 = eww.c($$0.b());
      ewp $$3 = this.T.a($$1);
      if ($$3 != null) {
         ewv $$4 = this.T.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         j.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aev $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      eww $$2 = eww.c($$0.b());
      if ($$1 == null) {
         this.T.b($$2);
      } else {
         ewp $$3 = this.T.a($$1);
         if ($$3 != null) {
            this.T.e($$2, $$3);
         } else {
            j.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afm $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewp $$2 = $$1 == null ? null : this.T.a($$1);
      this.T.a($$0.b(), $$2);
   }

   @Override
   public void a(afv $$0) {
      zz.a($$0, this, this.a);
      afv.a $$1 = $$0.e();
      ews $$2;
      if ($$1 == afv.a.a) {
         $$2 = this.T.c($$0.f());
      } else {
         $$2 = this.T.b($$0.f());
         if ($$2 == null) {
            j.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afv.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         ewz.b $$2x = ewz.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         ewz.a $$3x = ewz.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afv.a $$5 = $$0.b();
      if ($$5 == afv.a.a) {
         for (String $$6 : $$0.g()) {
            this.T.a($$6, $$2);
         }
      } else if ($$5 == afv.a.b) {
         for (String $$7 : $$0.g()) {
            this.T.b($$7, $$2);
         }
      }

      if ($$1 == afv.a.b) {
         this.T.d($$2);
      }
   }

   @Override
   public void a(adw $$0) {
      zz.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.r.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            j.warn("Could not spawn particle effect {}", $$0.m());
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
               j.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(ago $$0) {
      zz.a($$0, this, this.a);
      bsw $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof btr)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            buw $$2 = ((btr)$$1).eW();

            for (ago.a $$3 : $$0.e()) {
               buv $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  j.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bux $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      zz.a($$0, this, this.a);
      cpw $$1 = this.a.s.cb;
      if ($$1.j == $$0.e()) {
         this.C.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fqy) {
               fqs $$2 = ((fqy)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adx $$0) {
      zz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      ady $$3 = $$0.f();
      this.r.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, ady $$2) {
      enm $$3 = this.r.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dcj.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dcj.b, $$7, $$8, $$9);
      $$3.a(new dbh($$0, $$1), true);
   }

   @Override
   public void a(aeb $$0) {
      zz.a($$0, this, this.a);
      cpw $$1 = this.a.s.cb;
      if ($$0.b() == $$1.j && $$1 instanceof crf $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afk $$0) {
      zz.a($$0, this, this.a);
      this.y = $$0.b();
      this.a.m.b(this.y);
      this.r.i().a($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zz.a($$0, this, this.a);
      this.z = $$0.b();
      this.r.h(this.z);
   }

   @Override
   public void a(afj $$0) {
      zz.a($$0, this, this.a);
      this.r.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acn $$0) {
      zz.a($$0, this, this.a);
      this.r.b($$0.b());
   }

   @Override
   public void a(acu $$0) {
      zz.a($$0, this, this.a);

      for (zw<? super aci> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aer $$0) {
      zz.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof cng $$2) {
         $$2.d = $$0.e();
         $$2.e = $$0.f();
         $$2.f = $$0.g();
      }
   }

   @Override
   public void a(acx $$0) {
      this.M.a();
   }

   @Override
   public void a(acw $$0) {
      this.M.a($$0.b());
      this.b(new ahg(this.M.b()));
   }

   @Override
   public void a(adj $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajx $$0) {
      this.N.a($$0);
   }

   private void a(int $$0, int $$1, enm $$2, dcj $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kb.a($$0, $$8, $$1), $$9 ? new duf((byte[])$$6.next().clone()) : new duf());
            this.r.c($$0, $$8, $$1);
         }
      }
   }

   public wk k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.S;
   }

   public Collection<fyi> l() {
      return this.u;
   }

   public Collection<fyi> m() {
      return this.t.values();
   }

   public Collection<UUID> n() {
      return this.t.keySet();
   }

   @Nullable
   public fyi a(UUID $$0) {
      return this.t.get($$0);
   }

   @Nullable
   public fyi a(String $$0) {
      for (fyi $$1 : this.t.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.q;
   }

   public fxs p() {
      return this.v;
   }

   public CommandDispatcher<eu> q() {
      return this.B;
   }

   public fxx r() {
      return this.r;
   }

   public fey s() {
      return this.x;
   }

   public UUID t() {
      return this.D;
   }

   public Set<ale<dca>> u() {
      return this.E;
   }

   public jw.b v() {
      return this.F;
   }

   public void a(yf $$0, boolean $$1) {
      yb $$2 = $$0.l();
      if ($$2 != null && this.K.a($$2, $$1) && this.K.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.K.a();
      if ($$0 > 0) {
         this.b(new ahb($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axw.c.a();
      xx.a $$3 = this.K.b();
      yb $$4 = this.J.pack(new yi($$0, $$1, $$2, $$3.a()));
      this.b(new ahe($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yh<eu> $$1 = yh.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahc($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axw.c.a();
         xx.a $$4 = this.K.b();
         ew $$5 = ew.a($$1, $$3x -> {
            yi $$4x = new yi($$3x, $$2, $$3, $$4.a());
            return this.J.pack($$4x);
         });
         this.b(new ahd($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yh.a(this.e($$0))) {
         this.b(new ahc($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<eu> e(String $$0) {
      return this.B.parse($$0, this.w);
   }

   @Override
   public void d() {
      if (this.b.h()) {
         fyj $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.e();
      if (this.a.aP().f()) {
         this.N.a();
      }

      this.O.a();
      this.e.a();
      if (this.P != null) {
         this.P.a();
      }
   }

   public void a(cnb $$0) {
      if (this.a.b(this.q.getId())) {
         if (this.I == null || !this.I.c().equals($$0)) {
            this.I = ya.a($$0);
            this.J = this.I.a(this.q.getId());
            this.b(new ahf(this.I.a().a()));
         }
      }
   }

   @Nullable
   public fyl w() {
      return this.c;
   }

   public cpn x() {
      return this.G;
   }

   public boolean a(cpn $$0) {
      return $$0.a(this.x());
   }

   public ewx y() {
      return this.T;
   }

   public cwr z() {
      return this.H;
   }
}
