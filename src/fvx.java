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

public class fvx extends fvt implements abm, wi {
   private static final Logger i = LogUtils.getLogger();
   private static final wu j = wu.c("multiplayer.unsecureserver.toast.title");
   private static final wu k = wu.c("multiplayer.unsecureserver.toast");
   private static final wu l = wu.c("multiplayer.disconnect.invalid_packet");
   private static final wu m = wu.c("multiplayer.disconnect.chat_validation_failed");
   private static final wu n = wu.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fvw q;
   private fvw.a r;
   private final Map<UUID, fwh> s = Maps.newHashMap();
   private final Set<fwh> t = new ReferenceOpenHashSet();
   private final fvr u;
   private final fvz v;
   private final fcv w = new fcv(this);
   private int x = 3;
   private int y = 3;
   private final ayg z = ayg.b();
   private CommandDispatcher<ei> A = new CommandDispatcher();
   private final cxg B;
   private final UUID C = UUID.randomUUID();
   private Set<akg<dad>> D;
   private final jk.b E;
   private final cnu F;
   @Nullable
   private xf G;
   private xo.c H = xo.c.a;
   private xc I = new xc(20);
   private xh J = xh.a();
   private final fvq K = new fvq();
   private final fwg L;
   private final fwb M;
   @Nullable
   private fwe N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final eut R = new eut();

   public fvx(fde $$0, vs $$1, fwa $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fvr($$0, this.e);
      this.v = new fvz(this, $$0);
      this.L = new fwg(this, $$0.aQ().m());
      this.B = new cxg(this.E);
      this.M = new fwb(this, $$0.aQ());
   }

   public fvz h() {
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

   public cxg k() {
      return this.B;
   }

   @Override
   public void a(add $$0) {
      ze.a($$0, this, this.a);
      this.a.q = new fwf(this.a, this);
      afu $$1 = $$0.m();
      List<akg<dad>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      akg<dad> $$3 = $$1.b();
      iw<dtz> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fvw.a $$7 = new fvw.a(bpj.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fvw(this, $$7, $$3, $$4, this.x, this.y, this.a::aJ, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new avn(), new fcr());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cx());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cA = new gap(this.a.m);
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
      this.I = new xc(20);
      this.J = xh.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fhm $$8 = fhm.a(this.a, fhm.a.j, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(abn $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private brh b(abn $$0) {
      brn<?> $$1 = $$0.f();
      if ($$1 == brn.bx) {
         fwh $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gar(this.q, $$2.a());
         }
      } else {
         return $$1.a((dad)this.q);
      }
   }

   private void a(brh $$0) {
      if ($$0 instanceof cnc $$1) {
         this.a.ak().a((gqm)(new gqf($$1)));
      } else if ($$0 instanceof cdq $$2) {
         boolean $$3 = $$2.Z_();
         gpz $$4;
         if ($$3) {
            $$4 = new gpx($$2);
         } else {
            $$4 = new gpy($$2);
         }

         this.a.ak().a((gqn)$$4);
      }
   }

   @Override
   public void a(abo $$0) {
      ze.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      brh $$4 = new brq(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(aes $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(aeq $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(afn $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cY()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(afo $$0) {
      ze.a($$0, this, this.a);
      if (this.a.r != null) {
         bpx $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afp $$0) {
      ze.a($$0, this, this.a);
      if (this.a.r != null) {
         bpx $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(ael $$0) {
      ze.a($$0, this, this.a);
      if (clg.d($$0.b())) {
         this.a.s.ga().k = $$0.b();
      }
   }

   @Override
   public void a(adg $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cY()) {
            if ($$0.j()) {
               ahw $$2 = $$1.ah();
               etp $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aea $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(adw $$0) {
      ze.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, brh.c.b));
   }

   @Override
   public void a(adu $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      etp $$2 = $$1.dq();
      boolean $$3 = $$0.j().contains(bsn.a);
      boolean $$4 = $$0.j().contains(bsn.b);
      boolean $$5 = $$0.j().contains(bsn.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.ds() + $$0.b();
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
         $$11 = $$1.du() + $$0.e();
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
         $$15 = $$1.dy() + $$0.f();
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
      if ($$0.j().contains(bsn.e)) {
         $$1.s($$1.dF() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(bsn.d)) {
         $$1.r($$1.dD() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new agb($$0.i()));
      this.b.a(new agw.b($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF(), false));
   }

   @Override
   public void a(aeb $$0) {
      ze.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(acy $$0) {
      ze.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adc $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dsn $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acc $$0) {
      ze.a($$0, this, this.a);

      for (acc.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acc.a $$2 : $$0.b()) {
         this.q.a(new czk($$2.b().e, $$2.b().f));
      }

      for (acc.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.an(); $$6 < this.q.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, acx $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dsn $$0, int $$1, int $$2) {
      elp $$3 = this.q.i().p();
      dso[] $$4 = $$0.d();
      czk $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dso $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jp.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(acs $$0) {
      ze.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(acs $$0) {
      czk $$1 = $$0.b();
      this.q.a(() -> {
         elp $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jp $$3 = jp.a($$1, $$2);
            $$1x.a(dam.b, $$3, null);
            $$1x.a(dam.a, $$3, null);
         }

         for (int $$4 = this.q.an(); $$4 < this.q.ao(); $$4++) {
            $$1x.a(jp.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abv $$0) {
      ze.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afh $$0) {
      ze.a($$0, this, this.a);
      this.a.c(new fod(n, this.b));
      this.b.a(abb.b, new fvu(this.a, this.b, new fwa(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(agl.a);
      this.b.a(abb.a);
   }

   @Override
   public void a(afm $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      bsa $$2 = (bsa)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof brq) {
            this.q.a($$1.ds(), $$1.du(), $$1.dy(), avc.iC, avd.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.ds(), $$1.du(), $$1.dy(), avc.ns, avd.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fyw(this.a.aq(), this.a.aR(), this.q, $$1, $$2));
         if ($$1 instanceof chr $$3) {
            csz $$4 = $$3.p();
            if (!$$4.d()) {
               $$4.h($$0.f());
            }

            if ($$4.d()) {
               this.q.a($$0.b(), brh.c.b);
            }
         } else if (!($$1 instanceof brq)) {
            this.q.a($$0.b(), brh.c.b);
         }
      }
   }

   @Override
   public void a(afj $$0) {
      ze.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adn $$0) {
      ze.a($$0, this, this.a);
      Optional<xn> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fwh $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            xl $$4 = $$3.b();
            xp $$5;
            if ($$4 != null) {
               $$5 = new xp($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xp.a($$2);
            }

            xk $$7 = new xk($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(acp $$0) {
      ze.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aco $$0) {
      ze.a($$0, this, this.a);
      Optional<xg> $$1 = $$0.b().a(this.J);
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
   public void a(abp $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bsa $$2 = (bsa)$$1;
            $$2.a(bpl.a);
         } else if ($$0.e() == 3) {
            bsa $$3 = (bsa)$$1;
            $$3.a(bpl.b);
         } else if ($$0.e() == 2) {
            clh $$4 = (clh)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, kx.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, kx.r);
         }
      }
   }

   @Override
   public void a(acv $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afc $$0) {
      ze.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aeo $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aex $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bF();

         for (int $$3 : $$0.b()) {
            brh $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cne) {
                     this.a.s.O = $$1.dD();
                     this.a.s.r($$1.dD());
                     this.a.s.n($$1.dD());
                  }

                  wu $$5 = wu.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aer $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 instanceof bsc) {
         ((bsc)$$1).s($$0.e());
      }
   }

   private static csz a(clh $$0) {
      for (bpl $$1 : bpl.values()) {
         csz $$2 = $$0.b($$1);
         if ($$2.a(ctc.vt)) {
            return $$2;
         }
      }

      return new csz(ctc.vt);
   }

   @Override
   public void a(acq $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((gqm)(new gqe((cij)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, kx.ah, 30);
               this.q.a($$1.ds(), $$1.du(), $$1.dy(), avc.zl, $$1.dc(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((clh)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((gqm)(new gqi((cgg)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acm $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(aev $$0) {
      ze.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gk().a($$0.e());
      this.a.s.gk().b($$0.f());
   }

   @Override
   public void a(aeu $$0) {
      ze.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adz $$0) {
      ze.a($$0, this, this.a);
      afu $$1 = $$0.b();
      akg<dad> $$2 = $$1.b();
      iw<dtz> $$3 = $$1.a();
      gaq $$4 = this.a.s;
      if ($$2 != $$4.dN().ae()) {
         Map<enn, enp> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fvw.a $$8 = new fvw.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fvw(this, $$8, $$2, $$3, this.x, this.y, this.a::aJ, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.gc()) {
         $$4.r();
      }

      gaq $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bT(), $$4.bZ());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dN().ae()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<ajq.c<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eU().a($$4.eU());
      }

      $$9.A();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cA = new gap(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gq());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cH = $$4.cH;
      $$9.cI = $$4.cI;
      if (this.a.y instanceof fkb || this.a.y instanceof fkb.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(acr $$0) {
      ze.a($$0, this, this.a);
      czv $$1 = new czv(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dq().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(acu $$0) {
      ze.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cft $$2) {
         gaq $$3 = this.a.s;
         bpv $$4 = new bpv($$0.e());
         cpe $$5 = new cpe($$0.b(), $$3.ga(), $$4, $$2);
         $$3.cc = $$5;
         this.a.a(new fna($$5, $$3.ga(), $$2));
      }
   }

   @Override
   public void a(adj $$0) {
      ze.a($$0, this, this.a);
      fkq.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acj $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      csz $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fmq)) {
            $$1.cc.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.ga().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fmq $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cpf.f($$3)) {
            if (!$$2.d()) {
               csz $$6 = $$1.cb.b($$3).g();
               if ($$6.d() || $$6.G() < $$2.G()) {
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
   public void a(ach $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cc.j) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adk $$0) {
      ze.a($$0, this, this.a);
      in $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dow $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dqh $$3 = this.q.a_($$1);
         dow $$4 = new dow($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(abt $$0) {
      ze.a($$0, this, this.a);
      in $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ua $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof dnw && this.a.y instanceof fml) {
            ((fml)this.a.y).E();
         }
      });
   }

   @Override
   public void a(aci $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      if ($$1.cc != null && $$1.cc.j == $$0.b()) {
         $$1.cc.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aet $$0) {
      ze.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bsa $$2) {
         $$0.e().forEach($$1 -> $$2.a((bro)$$1.getFirst(), (csz)$$1.getSecond()));
      }
   }

   @Override
   public void a(acg $$0) {
      ze.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(abu $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abs $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(act $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      act.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = axz.d($$3 + 0.5F);
      if ($$2 == act.b) {
         $$1.a(wu.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == act.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == act.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == act.e) {
         this.a.q.a(daa.a($$4));
      } else if ($$2 == act.f) {
         if ($$4 == 0) {
            this.a.s.h.b(new agj(agj.a.a));
            this.a.a(new flb(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fll(true, () -> {
               this.a.s.h.b(new agj(agj.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == act.g) {
         fdi $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fkc());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wu.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wu.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wu.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wu.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == act.h) {
         this.q.a($$1, $$1.ds(), $$1.dw(), $$1.dy(), avc.aF, avd.h, 0.18F, 0.45F);
      } else if ($$2 == act.i) {
         this.q.e($$3);
      } else if ($$2 == act.j) {
         this.q.c($$3);
      } else if ($$2 == act.k) {
         this.q.a($$1, $$1.ds(), $$1.du(), $$1.dy(), avc.uH, avd.g, 1.0F, 1.0F);
      } else if ($$2 == act.l) {
         this.q.a(kx.q, $$1.ds(), $$1.du(), $$1.dy(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.ds(), $$1.du(), $$1.dy(), avc.hL, avd.f, 1.0F, 1.0F);
         }
      } else if ($$2 == act.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == act.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == act.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(gaq $$0, fvw $$1) {
      this.N = new fwe($$0, $$1, this.a.f);
      this.a.a(new flb(this.N::b));
   }

   @Override
   public void a(ade $$0) {
      ze.a($$0, this, this.a);
      feu $$1 = this.a.j.j();
      enn $$2 = $$0.b();
      enp $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = enp.a($$0.e(), $$0.f(), this.a.r.ae());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(acz $$0) {
      ze.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afq $$0) {
      ze.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aec $$0) {
      ze.a($$0, this, this.a);
      akh $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(acf $$0) {
      ze.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dz.a(this.E, this.F)));
   }

   @Override
   public void a(afi $$0) {
      ze.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ace $$0) {
      ze.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(aft $$0) {
      ze.a($$0, this, this.a);
      this.B.a($$0.b());
      fcr $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gqy.c, $$1.b());
   }

   @Override
   public void a(adt $$0) {
      ze.a($$0, this, this.a);
      etp $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afl $$0) {
      ze.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abq $$0) {
      ze.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avj<?>> $$1 = (Entry<avj<?>>)$$4.next();
         avj<?> $$2 = (avj<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof flm $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(adv $$0) {
      ze.a($$0, this, this.a);
      fcr $$1 = this.a.s.m();
      $$1.a($$0.f());
      adv.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akh $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akh $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (akh $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akh $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fhl.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fox) {
         ((fox)this.a.y).E();
      }
   }

   @Override
   public void a(afs $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 instanceof bsa) {
         iw<bqr> $$2 = $$0.e();
         bqt $$3 = new bqt($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bsa)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zq $$0) {
      ze.a($$0, this, this.a);
      fwn $$1 = new fwn();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(ado $$0) {
   }

   @Override
   public void a(adp $$0) {
   }

   @Override
   public void a(adq $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fkb($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fY();
         }
      }
   }

   @Override
   public void a(abz $$0) {
      ze.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(aek $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(acw $$0) {
      ze.a($$0, this, this.a);
      dry $$1 = this.q.C_();
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
   public void a(aef $$0) {
      ze.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aeg $$0) {
      ze.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeh $$0) {
      ze.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(aej $$0) {
      ze.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(aei $$0) {
      ze.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(acd $$0) {
      ze.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aed $$0) {
      ze.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fwk::b).ifPresent(this.c::a);
         fwl.b(this.c);
      }
   }

   @Override
   public void a(acl $$0) {
      ze.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aee $$0) {
      ze.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afd $$0) {
      ze.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afb $$0) {
      ze.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afe $$0) {
      ze.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afk $$0) {
      ze.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(adx $$0) {
      ze.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bsa $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adr $$0) {
      ze.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         fwh $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(ads $$0) {
      ze.a($$0, this, this.a);

      for (ads.b $$1 : $$0.f()) {
         fwh $$2 = new fwh(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (ads.b $$3 : $$0.e()) {
         fwh $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (ads.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(ads.a $$0, ads.b $$1, fwh $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cx().equals($$1.a())) {
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

   private void a(ads.b $$0, fwh $$1) {
      GameProfile $$2 = $$1.a();
      ayl $$3 = this.a.aW();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         xl.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xl $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (clk.b var7) {
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
   public void a(adm $$0) {
      ze.a($$0, this, this.a);
      clh $$1 = this.a.s;
      $$1.gb().b = $$0.e();
      $$1.gb().d = $$0.g();
      $$1.gb().a = $$0.b();
      $$1.gb().c = $$0.f();
      $$1.gb().a($$0.h());
      $$1.gb().b($$0.i());
   }

   @Override
   public void a(afg $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(aff $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(abw $$0) {
      ze.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(ack $$0) {
      ze.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gv().b($$0.b());
      } else {
         this.a.s.gv().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adh $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.a.s.cX();
      if ($$1 != this.a.s && $$1.cY()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new agx($$1));
      }
   }

   @Override
   public void a(adi $$0) {
      ze.a($$0, this, this.a);
      csz $$1 = this.a.s.b($$0.b());
      fmi.a $$2 = fmi.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fmi($$2));
      }
   }

   @Override
   public void a(aac $$0) {
      if ($$0 instanceof aal $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aak $$2) {
         ((gfh)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aaq $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aas $$4) {
         ((gfp)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aao $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aam $$6) {
         gev.a $$7 = new gev.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aan $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aar $$9) {
         gfn $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aai $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof zz $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof zy $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aaj $$14) {
         this.a.k.o.a($$14.b(), this.q.Y());
      } else if ($$0 instanceof aag $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aah) {
         this.a.k.r.a();
      } else if ($$0 instanceof aap $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aae $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aaf $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aab $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aac $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aew $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, euw.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         eul $$2 = this.R.a($$1);
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
   public void a(aez $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      eus $$2 = eus.c($$0.b());
      eul $$3 = this.R.a($$1);
      if ($$3 != null) {
         eur $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(ady $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      eus $$2 = eus.c($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         eul $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aep $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      eul $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(aey $$0) {
      ze.a($$0, this, this.a);
      aey.a $$1 = $$0.e();
      euo $$2;
      if ($$1 == aey.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<aey.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         euv.b $$2x = euv.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         euv.a $$3x = euv.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      aey.a $$5 = $$0.b();
      if ($$5 == aey.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == aey.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == aey.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(ada $$0) {
      ze.a($$0, this, this.a);
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
   public void a(afr $$0) {
      ze.a($$0, this, this.a);
      brh $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bsa)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bte $$2 = ((bsa)$$1).eU();

            for (afr.a $$3 : $$0.e()) {
               btd $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (btf $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adl $$0) {
      ze.a($$0, this, this.a);
      cod $$1 = this.a.s.cc;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fox) {
               foq $$2 = ((fox)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adb $$0) {
      ze.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adc $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adc $$2) {
      elp $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dam.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dam.b, $$7, $$8, $$9);
      $$3.a(new czk($$0, $$1), true);
   }

   @Override
   public void a(adf $$0) {
      ze.a($$0, this, this.a);
      cod $$1 = this.a.s.cc;
      if ($$0.b() == $$1.j && $$1 instanceof cpn $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aen $$0) {
      ze.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(afa $$0) {
      ze.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aem $$0) {
      ze.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abr $$0) {
      ze.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(aby $$0) {
      ze.a($$0, this, this.a);

      for (zb<? super abm> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(acb $$0) {
      this.K.a();
   }

   @Override
   public void a(aca $$0) {
      this.K.a($$0.b());
      this.b(new agi(this.K.b()));
   }

   @Override
   public void a(acn $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aiz $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, elp $$2, dam $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jp.a($$0, $$8, $$1), $$9 ? new dsi((byte[])$$6.next().clone()) : new dsi());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public vs l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fwh> m() {
      return this.t;
   }

   public Collection<fwh> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fwh a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fwh a(String $$0) {
      for (fwh $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fvr q() {
      return this.u;
   }

   public CommandDispatcher<ei> r() {
      return this.A;
   }

   public fvw s() {
      return this.q;
   }

   public fcv t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<akg<dad>> v() {
      return this.D;
   }

   public jk.b w() {
      return this.E;
   }

   public void a(xk $$0, boolean $$1) {
      xg $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new age($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awx.c.a();
      xc.a $$3 = this.I.b();
      xg $$4 = this.H.pack(new xn($$0, $$1, $$2, $$3.a()));
      this.b(new agg($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awx.c.a();
      xc.a $$3 = this.I.b();
      ek $$4 = ek.a(xm.a(this.e($$0)), $$3x -> {
         xn $$4x = new xn($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new agf($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (xm.a(this.e($$0)).a().isEmpty()) {
         xc.a $$1 = this.I.b();
         this.b(new agf($$0, Instant.now(), 0L, ek.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ei> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fwi $$0 = this.a.w();
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

   public void a(clj $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = xf.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new agh(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fwk x() {
      return this.c;
   }

   public cnu y() {
      return this.F;
   }

   public boolean a(cnu $$0) {
      return $$0.a(this.y());
   }

   public eut z() {
      return this.R;
   }
}
