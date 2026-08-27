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

public class fur extends fun implements aba, vw {
   private static final Logger i = LogUtils.getLogger();
   private static final wi j = wi.c("multiplayer.unsecureserver.toast.title");
   private static final wi k = wi.c("multiplayer.unsecureserver.toast");
   private static final wi l = wi.c("multiplayer.disconnect.invalid_packet");
   private static final wi m = wi.c("multiplayer.disconnect.chat_validation_failed");
   private static final wi n = wi.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fuq q;
   private fuq.a r;
   private final Map<UUID, fvb> s = Maps.newHashMap();
   private final Set<fvb> t = new ReferenceOpenHashSet();
   private final ful u;
   private final fut v;
   private final fbp w = new fbp(this);
   private int x = 3;
   private int y = 3;
   private final axt z = axt.b();
   private CommandDispatcher<ea> A = new CommandDispatcher();
   private final cvv B;
   private final UUID C = UUID.randomUUID();
   private Set<aju<czg>> D;
   private final jb.b E;
   private final cmn F;
   @Nullable
   private wt G;
   private xc.c H = xc.c.a;
   private wq I = new wq(20);
   private wv J = wv.a();
   private final fuk K = new fuk();
   private final fva L;
   private final fuv M;
   @Nullable
   private fuy N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final etn R = new etn();

   public fur(fby $$0, vg $$1, fuu $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new ful($$0, this.e);
      this.v = new fut(this, $$0);
      this.L = new fva(this, $$0.aP().m());
      this.B = new cvv(this.E);
      this.M = new fuv(this, $$0.aP());
   }

   public fut h() {
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

   public cvv k() {
      return this.B;
   }

   @Override
   public void a(acr $$0) {
      ys.a($$0, this, this.a);
      this.a.q = new fuz(this.a, this);
      afi $$1 = $$0.m();
      List<aju<czg>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      aju<czg> $$3 = $$1.b();
      in<dta> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fuq.a $$7 = new fuq.a(boc.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fuq(this, $$7, $$3, $$4, this.x, this.y, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new ava(), new fbl());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cw = new fzj(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.q);
      this.a.s.t($$0.j());
      this.a.s.b($$0.k());
      this.a.s.u($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.G = null;
      this.I = new wq(20);
      this.J = wv.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fgg $$8 = fgg.a(this.a, fgg.a.j, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(abb $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bqa b(abb $$0) {
      bqg<?> $$1 = $$0.f();
      if ($$1 == bqg.bx) {
         fvb $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new fzl(this.q, $$2.a());
         }
      } else {
         return $$1.a((czg)this.q);
      }
   }

   private void a(bqa $$0) {
      if ($$0 instanceof clv $$1) {
         this.a.ak().a((gpf)(new goy($$1)));
      } else if ($$0 instanceof ccj $$2) {
         boolean $$3 = $$2.Z_();
         gos $$4;
         if ($$3) {
            $$4 = new goq($$2);
         } else {
            $$4 = new gor($$2);
         }

         this.a.ak().a((gpg)$$4);
      }
   }

   @Override
   public void a(abc $$0) {
      ys.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bqa $$4 = new bqj(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(aeg $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(aee $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(afb $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cX()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(afc $$0) {
      ys.a($$0, this, this.a);
      if (this.a.r != null) {
         boq $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afd $$0) {
      ys.a($$0, this, this.a);
      if (this.a.r != null) {
         boq $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(adz $$0) {
      ys.a($$0, this, this.a);
      if (cjz.d($$0.b())) {
         this.a.s.fZ().l = $$0.b();
      }
   }

   @Override
   public void a(acu $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.j()) {
               ahk $$2 = $$1.ah();
               esj $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.M_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.L_(), $$6, $$7, 3);
            }

            $$1.c($$0.k());
         }
      }
   }

   @Override
   public void a(ado $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(adk $$0) {
      ys.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bqa.c.b));
   }

   @Override
   public void a(adi $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      esj $$2 = $$1.dp();
      boolean $$3 = $$0.j().contains(brg.a);
      boolean $$4 = $$0.j().contains(brg.b);
      boolean $$5 = $$0.j().contains(brg.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dr() + $$0.b();
         $$1.ac = $$1.ac + $$0.b();
         $$1.K = $$1.K + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ac = $$7;
         $$1.K = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dt() + $$0.e();
         $$1.ad = $$1.ad + $$0.e();
         $$1.L = $$1.L + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.ad = $$11;
         $$1.L = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dx() + $$0.f();
         $$1.ae = $$1.ae + $$0.f();
         $$1.M = $$1.M + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.ae = $$15;
         $$1.M = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(brg.e)) {
         $$1.s($$1.dE() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.j().contains(brg.d)) {
         $$1.r($$1.dC() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new afp($$0.i()));
      this.b.a(new agk.b($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE(), false));
   }

   @Override
   public void a(adp $$0) {
      ys.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(acm $$0) {
      ys.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      acq $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dro $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(abq $$0) {
      ys.a($$0, this, this.a);

      for (abq.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (abq.a $$2 : $$0.b()) {
         this.q.a(new cyn($$2.b().e, $$2.b().f));
      }

      for (abq.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.an(); $$6 < this.q.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, acl $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dro $$0, int $$1, int $$2) {
      ekq $$3 = this.q.i().p();
      drp[] $$4 = $$0.d();
      cyn $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         drp $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jg.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(acg $$0) {
      ys.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(acg $$0) {
      cyn $$1 = $$0.b();
      this.q.a(() -> {
         ekq $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jg $$3 = jg.a($$1, $$2);
            $$1x.a(czp.b, $$3, null);
            $$1x.a(czp.a, $$3, null);
         }

         for (int $$4 = this.q.an(); $$4 < this.q.ao(); $$4++) {
            $$1x.a(jg.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abj $$0) {
      ys.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aev $$0) {
      ys.a($$0, this, this.a);
      this.a.c(new fmx(n, this.b));
      this.b.a(aap.b, new fuo(this.a, this.b, new fuu(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(afz.a);
      this.b.a(aap.a);
   }

   @Override
   public void a(afa $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      bqt $$2 = (bqt)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bqj) {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), auo.iC, aup.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), auo.nn, aup.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fxq(this.a.aq(), this.a.aQ(), this.q, $$1, $$2));
         if ($$1 instanceof cgk $$3) {
            crs $$4 = $$3.p();
            if (!$$4.d()) {
               $$4.g($$0.f());
            }

            if ($$4.d()) {
               this.q.a($$0.b(), bqa.c.b);
            }
         } else if (!($$1 instanceof bqj)) {
            this.q.a($$0.b(), bqa.c.b);
         }
      }
   }

   @Override
   public void a(aex $$0) {
      ys.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adb $$0) {
      ys.a($$0, this, this.a);
      Optional<xb> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fvb $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            wz $$4 = $$3.b();
            xd $$5;
            if ($$4 != null) {
               $$5 = new xd($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xd.a($$2);
            }

            wy $$7 = new wy($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(acd $$0) {
      ys.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      ys.a($$0, this, this.a);
      Optional<wu> $$1 = $$0.b().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.I.a($$1.get());
         if (!this.a.aZ().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(abd $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bqt $$2 = (bqt)$$1;
            $$2.a(boe.a);
         } else if ($$0.e() == 3) {
            bqt $$3 = (bqt)$$1;
            $$3.a(boe.b);
         } else if ($$0.e() == 2) {
            cka $$4 = (cka)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, kn.g);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, kn.s);
         }
      }
   }

   @Override
   public void a(acj $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(aeq $$0) {
      ys.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aec $$0) {
      ys.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ael $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bE();

         for (int $$3 : $$0.b()) {
            bqa $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof clx) {
                     this.a.s.N = $$1.dC();
                     this.a.s.r($$1.dC());
                     this.a.s.n($$1.dC());
                  }

                  wi $$5 = wi.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aY().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aef $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 instanceof bqv) {
         ((bqv)$$1).s($$0.e());
      }
   }

   private static crs a(cka $$0) {
      for (boe $$1 : boe.values()) {
         crs $$2 = $$0.b($$1);
         if ($$2.a(crv.vr)) {
            return $$2;
         }
      }

      return new crs(crv.vr);
   }

   @Override
   public void a(ace $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((gpf)(new gox((chc)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, kn.ai, 30);
               this.q.a($$1.dr(), $$1.dt(), $$1.dx(), auo.zd, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cka)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((gpf)(new gpb((cez)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(aca $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(aej $$0) {
      ys.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gj().a($$0.e());
      this.a.s.gj().b($$0.f());
   }

   @Override
   public void a(aei $$0) {
      ys.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adn $$0) {
      ys.a($$0, this, this.a);
      afi $$1 = $$0.b();
      aju<czg> $$2 = $$1.b();
      in<dta> $$3 = $$1.a();
      fzk $$4 = this.a.s;
      if ($$2 != $$4.dM().ae()) {
         Map<emm, emo> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fuq.a $$8 = new fuq.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fuq(this, $$8, $$2, $$3, this.x, this.y, this.a::aI, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.gb()) {
         $$4.r();
      }

      fzk $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dM().ae()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<aje.c<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eT().a($$4.eT());
      }

      $$9.A();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cw = new fzj(this.a.m);
      this.a.q.a($$9);
      $$9.t($$4.gp());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cE = $$4.cE;
      $$9.cF = $$4.cF;
      if (this.a.y instanceof fiv || this.a.y instanceof fiv.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(acf $$0) {
      ys.a($$0, this, this.a);
      cyy $$1 = new cyy(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dp().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(aci $$0) {
      ys.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cem $$2) {
         fzk $$3 = this.a.s;
         boo $$4 = new boo($$0.e());
         cnw $$5 = new cnw($$0.b(), $$3.fZ(), $$4, $$2);
         $$3.ca = $$5;
         this.a.a(new flu($$5, $$3.fZ(), $$2));
      }
   }

   @Override
   public void a(acx $$0) {
      ys.a($$0, this, this.a);
      fjk.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(abx $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      crs $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof flk)) {
            $$1.ca.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fZ().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof flk $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cnx.f($$3)) {
            if (!$$2.d()) {
               crs $$6 = $$1.bZ.b($$3).g();
               if ($$6.d() || $$6.G() < $$2.G()) {
                  $$2.d(5);
               }
            }

            $$1.bZ.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.ca.j && ($$0.b() != 0 || !$$4)) {
            $$1.ca.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(abv $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.bZ.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.ca.j) {
         $$1.ca.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(acy $$0) {
      ys.a($$0, this, this.a);
      id $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dny $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dpi $$3 = this.q.a_($$1);
         dny $$4 = new dny($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(abh $$0) {
      ys.a($$0, this, this.a);
      id $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         to $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof dmy && this.a.y instanceof flf) {
            ((flf)this.a.y).E();
         }
      });
   }

   @Override
   public void a(abw $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      if ($$1.ca != null && $$1.ca.j == $$0.b()) {
         $$1.ca.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aeh $$0) {
      ys.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bqt $$2) {
         $$0.e().forEach($$1 -> $$2.a((bqh)$$1.getFirst(), (crs)$$1.getSecond()));
      }
   }

   @Override
   public void a(abu $$0) {
      ys.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(abi $$0) {
      ys.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abg $$0) {
      ys.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ach $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      ach.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = axm.d($$3 + 0.5F);
      if ($$2 == ach.b) {
         $$1.a(wi.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ach.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == ach.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == ach.e) {
         this.a.q.a(czd.a($$4));
      } else if ($$2 == ach.f) {
         if ($$4 == 0) {
            this.a.s.cv.b(new afx(afx.a.a));
            this.a.a(new fjv(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fkf(true, () -> {
               this.a.s.cv.b(new afx(afx.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == ach.g) {
         fcc $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fiw());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wi.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wi.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wi.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wi.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == ach.h) {
         this.q.a($$1, $$1.dr(), $$1.dv(), $$1.dx(), auo.aF, aup.h, 0.18F, 0.45F);
      } else if ($$2 == ach.i) {
         this.q.e($$3);
      } else if ($$2 == ach.j) {
         this.q.c($$3);
      } else if ($$2 == ach.k) {
         this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), auo.uz, aup.g, 1.0F, 1.0F);
      } else if ($$2 == ach.l) {
         this.q.a(kn.r, $$1.dr(), $$1.dt(), $$1.dx(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), auo.hL, aup.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ach.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == ach.n) {
         this.a.s.u($$3 == 1.0F);
      } else if ($$2 == ach.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(fzk $$0, fuq $$1) {
      this.N = new fuy($$0, $$1, this.a.f);
      this.a.a(new fjv(this.N::b));
   }

   @Override
   public void a(acs $$0) {
      ys.a($$0, this, this.a);
      fdo $$1 = this.a.j.k();
      emm $$2 = $$0.b();
      emo $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = emo.a($$0.e(), $$0.f(), this.a.r.ae());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(acn $$0) {
      ys.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afe $$0) {
      ys.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(adq $$0) {
      ys.a($$0, this, this.a);
      ajv $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(abt $$0) {
      ys.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dr.a(this.E, this.F)));
   }

   @Override
   public void a(aew $$0) {
      ys.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(abs $$0) {
      ys.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(afh $$0) {
      ys.a($$0, this, this.a);
      this.B.a($$0.b());
      fbl $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gpr.c, $$1.b());
   }

   @Override
   public void a(adh $$0) {
      ys.a($$0, this, this.a);
      esj $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(aez $$0) {
      ys.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abe $$0) {
      ys.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<auv<?>> $$1 = (Entry<auv<?>>)$$4.next();
         auv<?> $$2 = (auv<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fkg $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(adj $$0) {
      ys.a($$0, this, this.a);
      fbl $$1 = this.a.s.m();
      $$1.a($$0.f());
      adj.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (ajv $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ajv $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (ajv $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ajv $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fgf.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fnq) {
         ((fnq)this.a.y).E();
      }
   }

   @Override
   public void a(afg $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 instanceof bqt) {
         in<bpk> $$2 = $$0.e();
         bpm $$3 = new bpm($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.j();
         }

         ((bqt)$$1).c($$3, null);
      }
   }

   @Override
   public void a(ze $$0) {
      ys.a($$0, this, this.a);
      fvh $$1 = new fvh();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(adc $$0) {
   }

   @Override
   public void a(add $$0) {
   }

   @Override
   public void a(ade $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fiv($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fX();
         }
      }
   }

   @Override
   public void a(abn $$0) {
      ys.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(ady $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ack $$0) {
      ys.a($$0, this, this.a);
      dqz $$1 = this.q.C_();
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
   public void a(adt $$0) {
      ys.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(adu $$0) {
      ys.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adv $$0) {
      ys.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(adx $$0) {
      ys.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(adw $$0) {
      ys.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(abr $$0) {
      ys.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(adr $$0) {
      ys.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fve::b).ifPresent(this.c::a);
         fvf.b(this.c);
      }
   }

   @Override
   public void a(abz $$0) {
      ys.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ads $$0) {
      ys.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(aer $$0) {
      ys.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(aep $$0) {
      ys.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(aes $$0) {
      ys.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aey $$0) {
      ys.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(adl $$0) {
      ys.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bqt $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adf $$0) {
      ys.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fvb $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(adg $$0) {
      ys.a($$0, this, this.a);

      for (adg.b $$1 : $$0.f()) {
         fvb $$2 = new fvb(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (adg.b $$3 : $$0.e()) {
         fvb $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adg.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adg.a $$0, adg.b $$1, fvb $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cw().equals($$1.a())) {
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

   private void a(adg.b $$0, fvb $$1) {
      GameProfile $$2 = $$1.a();
      axy $$3 = this.a.aV();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         wz.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               wz $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (ckd.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.a.aW() && this.O;
   }

   @Override
   public void a(ada $$0) {
      ys.a($$0, this, this.a);
      cka $$1 = this.a.s;
      $$1.ga().b = $$0.e();
      $$1.ga().d = $$0.g();
      $$1.ga().a = $$0.b();
      $$1.ga().c = $$0.f();
      $$1.ga().a($$0.h());
      $$1.ga().b($$0.i());
   }

   @Override
   public void a(aeu $$0) {
      ys.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(aet $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(abk $$0) {
      ys.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(aby $$0) {
      ys.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gu().b($$0.b());
      } else {
         this.a.s.gu().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(acv $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new agl($$1));
      }
   }

   @Override
   public void a(acw $$0) {
      ys.a($$0, this, this.a);
      crs $$1 = this.a.s.b($$0.b());
      flc.a $$2 = flc.a.a($$1);
      if ($$2 != null) {
         this.a.a(new flc($$2));
      }
   }

   @Override
   public void a(zq $$0) {
      if ($$0 instanceof zz $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof zy $$2) {
         ((geb)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aae $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aag $$4) {
         ((gej)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aac $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aaa $$6) {
         gdp.a $$7 = new gdp.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aab $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aaf $$9) {
         geh $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof zw $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof zn $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof zm $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof zx $$14) {
         this.a.k.o.a($$14.b(), this.q.Y());
      } else if ($$0 instanceof zu $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof zv) {
         this.a.k.r.a();
      } else if ($$0 instanceof aad $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof zs $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof zt $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof zp $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(zq $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aek $$0) {
      ys.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, etq.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         etf $$2 = this.R.a($$1);
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
   public void a(aen $$0) {
      ys.a($$0, this, this.a);
      String $$1 = $$0.e();
      etm $$2 = etm.c($$0.b());
      etf $$3 = this.R.a($$1);
      if ($$3 != null) {
         etl $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(adm $$0) {
      ys.a($$0, this, this.a);
      String $$1 = $$0.e();
      etm $$2 = etm.c($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         etf $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aed $$0) {
      ys.a($$0, this, this.a);
      String $$1 = $$0.e();
      etf $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(aem $$0) {
      ys.a($$0, this, this.a);
      aem.a $$1 = $$0.e();
      eti $$2;
      if ($$1 == aem.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<aem.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         etp.b $$2x = etp.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         etp.a $$3x = etp.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      aem.a $$5 = $$0.b();
      if ($$5 == aem.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == aem.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == aem.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(aco $$0) {
      ys.a($$0, this, this.a);
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
   public void a(aff $$0) {
      ys.a($$0, this, this.a);
      bqa $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bqt)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            brx $$2 = ((bqt)$$1).eT();

            for (aff.a $$3 : $$0.e()) {
               brw $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bry $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(acz $$0) {
      ys.a($$0, this, this.a);
      cmw $$1 = this.a.s.ca;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fnq) {
               fnk $$2 = ((fnq)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(acp $$0) {
      ys.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      acq $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, acq $$2) {
      ekq $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, czp.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, czp.b, $$7, $$8, $$9);
      $$3.a(new cyn($$0, $$1), true);
   }

   @Override
   public void a(act $$0) {
      ys.a($$0, this, this.a);
      cmw $$1 = this.a.s.ca;
      if ($$0.b() == $$1.j && $$1 instanceof cof $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aeb $$0) {
      ys.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(aeo $$0) {
      ys.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aea $$0) {
      ys.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abf $$0) {
      ys.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(abm $$0) {
      ys.a($$0, this, this.a);

      for (yp<? super aba> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(abp $$0) {
      this.K.a();
   }

   @Override
   public void a(abo $$0) {
      this.K.a($$0.b());
      this.b(new afw(this.K.b()));
   }

   @Override
   public void a(acb $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ain $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, ekq $$2, czp $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jg.a($$0, $$8, $$1), $$9 ? new drj((byte[])$$6.next().clone()) : new drj());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public vg l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fvb> m() {
      return this.t;
   }

   public Collection<fvb> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fvb a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fvb a(String $$0) {
      for (fvb $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public ful q() {
      return this.u;
   }

   public CommandDispatcher<ea> r() {
      return this.A;
   }

   public fuq s() {
      return this.q;
   }

   public fbp t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<aju<czg>> v() {
      return this.D;
   }

   public jb.b w() {
      return this.E;
   }

   public void a(wy $$0, boolean $$1) {
      wu $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new afs($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awk.c.a();
      wq.a $$3 = this.I.b();
      wu $$4 = this.H.pack(new xb($$0, $$1, $$2, $$3.a()));
      this.b(new afu($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awk.c.a();
      wq.a $$3 = this.I.b();
      ec $$4 = ec.a(xa.a(this.e($$0)), $$3x -> {
         xb $$4x = new xb($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new aft($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (xa.a(this.e($$0)).a().isEmpty()) {
         wq.a $$1 = this.I.b();
         this.b(new aft($$0, Instant.now(), 0L, ec.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ea> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fvc $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aP().f()) {
         this.L.a();
      }

      this.M.a();
      this.e.a();
      if (this.N != null) {
         this.N.a();
      }
   }

   public void a(ckc $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = wt.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new afv(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fve x() {
      return this.c;
   }

   public cmn y() {
      return this.F;
   }

   public boolean a(cmn $$0) {
      return $$0.a(this.y());
   }

   public etn z() {
      return this.R;
   }
}
