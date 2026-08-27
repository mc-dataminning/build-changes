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

public class fzo extends fzk implements abw, ws {
   private static final Logger i = LogUtils.getLogger();
   private static final xe j = xe.c("multiplayer.unsecureserver.toast.title");
   private static final xe k = xe.c("multiplayer.unsecureserver.toast");
   private static final xe l = xe.c("multiplayer.disconnect.invalid_packet");
   private static final xe m = xe.c("multiplayer.disconnect.chat_validation_failed");
   private static final xe n = xe.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fzn q;
   private fzn.a r;
   private final Map<UUID, fzy> s = Maps.newHashMap();
   private final Set<fzy> t = new ReferenceOpenHashSet();
   private final fzi u;
   private final fzq v;
   private final fga w = new fga(this);
   private int x = 3;
   private int y = 3;
   private final ayt z = ayt.b();
   private CommandDispatcher<em> A = new CommandDispatcher();
   private final czd B;
   private final UUID C = UUID.randomUUID();
   private Set<aks<dca>> D;
   private final jo.b E;
   private final cop F;
   @Nullable
   private xp G;
   private xy.c H = xy.c.a;
   private xm I = new xm(20);
   private xr J = xr.a();
   private final fzh K = new fzh();
   private final fzx L;
   private final fzs M;
   @Nullable
   private fzv N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final exy R = new exy();

   public fzo(fgj $$0, wc $$1, fzr $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fzi($$0, this.e);
      this.v = new fzq(this, $$0);
      this.L = new fzx(this, $$0.aQ().m());
      this.B = new czd(this.E);
      this.M = new fzs(this, $$0.aQ());
   }

   public fzq h() {
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

   public czd k() {
      return this.B;
   }

   @Override
   public void a(ado $$0) {
      zo.a($$0, this, this.a);
      this.a.q = new fzw(this.a, this);
      agg $$1 = $$0.m();
      List<aks<dca>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      aks<dca> $$3 = $$1.b();
      ja<dwu> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fzn.a $$7 = new fzn.a(bpx.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fzn(this, $$7, $$3, $$4, this.x, this.y, this.a::aJ, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new awa(), new ffw());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cE());
         }
      }

      this.a.k.a();
      this.a.s.y();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.i = new geh(this.a.m);
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
      if ($$1.j() != null) {
         this.a.s.aL = $$1.j();
         this.a.s.aM = 60;
      }

      this.G = null;
      this.I = new xm(20);
      this.J = xr.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fkv $$8 = fkv.a(this.a, fkv.a.j, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(abx $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private brv b(abx $$0) {
      bsb<?> $$1 = $$0.f();
      if ($$1 == bsb.bE) {
         fzy $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gej(this.q, $$2.a());
         }
      } else {
         return $$1.a((dca)this.q);
      }
   }

   private void a(brv $$0) {
      if ($$0 instanceof cnw $$1) {
         this.a.ak().a((gum)(new guf($$1)));
      } else if ($$0 instanceof cef $$2) {
         boolean $$3 = $$2.aa_();
         gtz $$4;
         if ($$3) {
            $$4 = new gtx($$2);
         } else {
            $$4 = new gty($$2);
         }

         this.a.ak().a((gun)$$4);
      }
   }

   @Override
   public void a(aby $$0) {
      zo.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      brv $$4 = new bse(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(abz $$0) {
      zo.a($$0, this, this.a);
      coz $$1 = new coz(bsb.bH, this.q);
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      double $$4 = $$0.h();
      $$1.f($$2, $$3, $$4);
      $$1.e($$2, $$3, $$4);
      $$1.e($$0.b());
      $$1.a_($$0.e());
      $$1.r().a($$0.i());
      $$1.r().a($$0.j());
      this.q.c($$1);
   }

   @Override
   public void a(afd $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(afb $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(afz $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.df()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zo.a($$0, this, this.a);
      if (this.a.r != null) {
         bql $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agb $$0) {
      zo.a($$0, this, this.a);
      if (this.a.r != null) {
         bql $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aew $$0) {
      zo.a($$0, this, this.a);
      if (clx.d($$0.b())) {
         this.a.s.gl().k = $$0.b();
      }
   }

   @Override
   public void a(adr $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.df()) {
            if ($$0.j()) {
               aii $$2 = $$1.aj();
               ewu $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.N_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.M_(), $$6, $$7, 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(ael $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aeh $$0) {
      zo.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, brv.d.b));
   }

   @Override
   public void a(aef $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      ewu $$2 = $$1.dx();
      boolean $$3 = $$0.j().contains(btb.a);
      boolean $$4 = $$0.j().contains(btb.b);
      boolean $$5 = $$0.j().contains(btb.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dz() + $$0.b();
         $$1.ae = $$1.ae + $$0.b();
         $$1.M = $$1.M + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ae = $$7;
         $$1.M = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dB() + $$0.e();
         $$1.af = $$1.af + $$0.e();
         $$1.N = $$1.N + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.af = $$11;
         $$1.N = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dF() + $$0.f();
         $$1.ag = $$1.ag + $$0.f();
         $$1.O = $$1.O + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.ag = $$15;
         $$1.O = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(btb.e)) {
         $$1.s($$1.dM() + $$19);
         $$1.Q += $$19;
      } else {
         $$1.s($$19);
         $$1.Q = $$19;
      }

      if ($$0.j().contains(btb.d)) {
         $$1.r($$1.dK() + $$18);
         $$1.P += $$18;
      } else {
         $$1.r($$18);
         $$1.P = $$18;
      }

      this.b.a(new agn($$0.i()));
      this.b.a(new ahi.b($$1.dz(), $$1.dB(), $$1.dF(), $$1.dK(), $$1.dM(), false));
   }

   @Override
   public void a(aem $$0) {
      zo.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(adj $$0) {
      zo.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adn $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dvi $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zo.a($$0, this, this.a);

      for (acn.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acn.a $$2 : $$0.b()) {
         this.q.a(new dbh($$2.b().e, $$2.b().f));
      }

      for (acn.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.ao(); $$6 < this.q.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adi $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dvi $$0, int $$1, int $$2) {
      eot $$3 = this.q.i().p();
      dvj[] $$4 = $$0.e();
      dbh $$5 = $$0.g();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dvj $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jt.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(add $$0) {
      zo.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(add $$0) {
      dbh $$1 = $$0.b();
      this.q.a(() -> {
         eot $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jt $$3 = jt.a($$1, $$2);
            $$1x.a(dcj.b, $$3, null);
            $$1x.a(dcj.a, $$3, null);
         }

         for (int $$4 = this.q.ao(); $$4 < this.q.ap(); $$4++) {
            $$1x.a(jt.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acg $$0) {
      zo.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aft $$0) {
      zo.a($$0, this, this.a);
      this.a.c(new frs(n, this.b));
      this.b.a(abl.b, new fzl(this.a, this.b, new fzr(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(agx.a);
      this.b.a(abl.a);
   }

   @Override
   public void a(afy $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      bso $$2 = (bso)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bse) {
            this.q.a($$1.dz(), $$1.dB(), $$1.dF(), avo.iU, avq.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.dz(), $$1.dB(), $$1.dF(), avo.nS, avq.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gco(this.a.aq(), this.a.aR(), this.q, $$1, $$2));
         if ($$1 instanceof cig $$3) {
            cuh $$4 = $$3.p();
            if (!$$4.d()) {
               $$4.h($$0.f());
            }

            if ($$4.d()) {
               this.q.a($$0.b(), brv.d.b);
            }
         } else if (!($$1 instanceof bse)) {
            this.q.a($$0.b(), brv.d.b);
         }
      }
   }

   @Override
   public void a(afv $$0) {
      zo.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ady $$0) {
      zo.a($$0, this, this.a);
      Optional<xx> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fzy $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            xv $$4 = $$3.b();
            xz $$5;
            if ($$4 != null) {
               $$5 = new xz($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xz.a($$2);
            }

            xu $$7 = new xu($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(ada $$0) {
      zo.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zo.a($$0, this, this.a);
      Optional<xq> $$1 = $$0.b().a(this.J);
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
   public void a(aca $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bso $$2 = (bso)$$1;
            $$2.a(bpz.a);
         } else if ($$0.e() == 3) {
            bso $$3 = (bso)$$1;
            $$3.a(bpz.b);
         } else if ($$0.e() == 2) {
            cly $$4 = (cly)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lb.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lb.r);
         }
      }
   }

   @Override
   public void a(adg $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afn $$0) {
      zo.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aez $$0) {
      zo.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afi $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bM();

         for (int $$3 : $$0.b()) {
            brv $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cny) {
                     this.a.s.P = $$1.dK();
                     this.a.s.r($$1.dK());
                     this.a.s.n($$1.dK());
                  }

                  xe $$5 = xe.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afc $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 instanceof bsq) {
         ((bsq)$$1).t($$0.e());
      }
   }

   private static cuh a(cly $$0) {
      for (bpz $$1 : bpz.values()) {
         cuh $$2 = $$0.b($$1);
         if ($$2.a(cuk.xe)) {
            return $$2;
         }
      }

      return new cuh(cuk.xe);
   }

   @Override
   public void a(adb $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((gum)(new gue((ciy)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lb.ai, 30);
               this.q.a($$1.dz(), $$1.dB(), $$1.dF(), avo.zU, $$1.dj(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cly)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((gum)(new gui((cgv)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acx $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(afg $$0) {
      zo.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gx().a($$0.e());
      this.a.s.gx().b($$0.f());
   }

   @Override
   public void a(aff $$0) {
      zo.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aek $$0) {
      zo.a($$0, this, this.a);
      agg $$1 = $$0.b();
      aks<dca> $$2 = $$1.b();
      ja<dwu> $$3 = $$1.a();
      gei $$4 = this.a.s;
      if ($$2 != $$4.dU().af()) {
         Map<eqr, eqt> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fzn.a $$8 = new fzn.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fzn(this, $$8, $$2, $$3, this.x, this.y, this.a::aJ, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.gn()) {
         $$4.t();
      }

      gei $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.ca(), $$4.cg());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.al());
      this.a.s = $$9;
      if ($$2 != $$4.dU().af()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<akc.c<?>> $$11 = $$4.ap().c();
         if ($$11 != null) {
            $$9.ap().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.ff().a($$4.ff());
      }

      $$9.y();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.i = new geh(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gD());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cW = $$4.cW;
      $$9.cX = $$4.cX;
      if (this.a.y instanceof fnk || this.a.y instanceof fnk.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
      if ($$1.j() != null) {
         $$9.aL = $$1.j();
         $$9.aM = 60;
      }
   }

   @Override
   public void a(adc $$0) {
      zo.a($$0, this, this.a);
      dbs $$1 = new dbs(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dx().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(adf $$0) {
      zo.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cgi $$2) {
         gei $$3 = this.a.s;
         bqj $$4 = new bqj($$0.e());
         cqh $$5 = new cqh($$0.b(), $$3.gl(), $$4, $$2);
         $$3.cq = $$5;
         this.a.a(new fqn($$5, $$3.gl(), $$2));
      }
   }

   @Override
   public void a(adu $$0) {
      zo.a($$0, this, this.a);
      fnz.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acu $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      cuh $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fqc)) {
            $$1.cq.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.gl().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fqc $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && cqi.f($$3)) {
            if (!$$2.d()) {
               cuh $$6 = $$1.cp.b($$3).g();
               if ($$6.d() || $$6.G() < $$2.G()) {
                  $$2.d(5);
               }
            }

            $$1.cp.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.cq.j && ($$0.b() != 0 || !$$4)) {
            $$1.cq.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(acs $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cp.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cq.j) {
         $$1.cq.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adv $$0) {
      zo.a($$0, this, this.a);
      ir $$1 = $$0.b();
      if (this.q.c_($$1) instanceof drr $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dtc $$3 = this.q.a_($$1);
         drr $$4 = new drr($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(ace $$0) {
      zo.a($$0, this, this.a);
      ir $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         uk $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof dqm && this.a.y instanceof fpx) {
            ((fpx)this.a.y).E();
         }
      });
   }

   @Override
   public void a(act $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      if ($$1.cq != null && $$1.cq.j == $$0.b()) {
         $$1.cq.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afe $$0) {
      zo.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bso $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsc)$$1.getFirst(), (cuh)$$1.getSecond()));
      }
   }

   @Override
   public void a(acr $$0) {
      zo.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(acf $$0) {
      zo.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acd $$0) {
      zo.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ade $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      ade.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = aym.d($$3 + 0.5F);
      if ($$2 == ade.b) {
         $$1.a(xe.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == ade.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == ade.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == ade.e) {
         this.a.q.a(dbx.a($$4));
      } else if ($$2 == ade.f) {
         if ($$4 == 0) {
            this.a.s.h.b(new agv(agv.a.a));
            this.a.a(new fol(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fox(true, () -> {
               this.a.s.h.b(new agv(agv.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == ade.g) {
         fgn $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fnl());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(xe.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(xe.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(xe.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(xe.a("demo.day.6", $$5.P.k()));
         }
      } else if ($$2 == ade.h) {
         this.q.a($$1, $$1.dz(), $$1.dD(), $$1.dF(), avo.aK, avq.h, 0.18F, 0.45F);
      } else if ($$2 == ade.i) {
         this.q.e($$3);
      } else if ($$2 == ade.j) {
         this.q.c($$3);
      } else if ($$2 == ade.k) {
         this.q.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), avo.vq, avq.g, 1.0F, 1.0F);
      } else if ($$2 == ade.l) {
         this.q.a(lb.q, $$1.dz(), $$1.dB(), $$1.dF(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), avo.hS, avq.f, 1.0F, 1.0F);
         }
      } else if ($$2 == ade.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == ade.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == ade.o) {
         if (this.N != null) {
            this.N.c();
         }
      } else if ($$2 == ade.p) {
         this.a.a(new foi(() -> this.a.a(new fot())));
      }
   }

   private void a(gei $$0, fzn $$1) {
      this.N = new fzv($$0, $$1, this.a.f);
      this.a.a(new fol(this.N::b));
   }

   @Override
   public void a(adp $$0) {
      zo.a($$0, this, this.a);
      fid $$1 = this.a.j.j();
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
   public void a(adk $$0) {
      zo.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agc $$0) {
      zo.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aen $$0) {
      zo.a($$0, this, this.a);
      akt $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         ag $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(acq $$0) {
      zo.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(ed.a(this.E, this.F)));
   }

   @Override
   public void a(afu $$0) {
      zo.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acp $$0) {
      zo.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agf $$0) {
      zo.a($$0, this, this.a);
      this.B.a($$0.b());
      ffw $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.I_());
      this.a.a(guy.c, $$1.b());
   }

   @Override
   public void a(aee $$0) {
      zo.a($$0, this, this.a);
      ewu $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afx $$0) {
      zo.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acb $$0) {
      zo.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avw<?>> $$1 = (Entry<avw<?>>)$$4.next();
         avw<?> $$2 = (avw<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof foy $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(aeg $$0) {
      zo.a($$0, this, this.a);
      ffw $$1 = this.a.s.m();
      $$1.a($$0.f());
      aeg.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akt $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akt $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (akt $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akt $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fku.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fsl) {
         ((fsl)this.a.y).E();
      }
   }

   @Override
   public void a(age $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 instanceof bso) {
         ja<brf> $$2 = $$0.e();
         brh $$3 = new brh($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bso)$$1).c($$3, null);
      }
   }

   @Override
   public void a(aaa $$0) {
      zo.a($$0, this, this.a);
      gae $$1 = new gae();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(adz $$0) {
   }

   @Override
   public void a(aea $$0) {
   }

   @Override
   public void a(aeb $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fnk($$0.e(), this.q.k().l()));
         } else {
            this.a.s.gj();
         }
      }
   }

   @Override
   public void a(ack $$0) {
      zo.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(aev $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adh $$0) {
      zo.a($$0, this, this.a);
      dut $$1 = this.q.D_();
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
   public void a(aeq $$0) {
      zo.a($$0, this, this.a);
      this.q.D_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aer $$0) {
      zo.a($$0, this, this.a);
      this.q.D_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aes $$0) {
      zo.a($$0, this, this.a);
      this.q.D_().a($$0.b());
   }

   @Override
   public void a(aeu $$0) {
      zo.a($$0, this, this.a);
      this.q.D_().c($$0.b());
   }

   @Override
   public void a(aet $$0) {
      zo.a($$0, this, this.a);
      this.q.D_().b($$0.b());
   }

   @Override
   public void a(aco $$0) {
      zo.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aeo $$0) {
      zo.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gab::b).ifPresent(this.c::a);
         gac.b(this.c);
      }
   }

   @Override
   public void a(acw $$0) {
      zo.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aep $$0) {
      zo.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afo $$0) {
      zo.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afm $$0) {
      zo.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afp $$0) {
      zo.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afw $$0) {
      zo.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aei $$0) {
      zo.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bso $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aec $$0) {
      zo.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         fzy $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(aed $$0) {
      zo.a($$0, this, this.a);

      for (aed.b $$1 : $$0.f()) {
         fzy $$2 = new fzy(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aed.b $$3 : $$0.e()) {
         fzy $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aed.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aed.a $$0, aed.b $$1, fzy $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cE().equals($$1.a())) {
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

   private void a(aed.b $$0, fzy $$1) {
      GameProfile $$2 = $$1.a();
      ayy $$3 = this.a.aW();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         xv.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xv $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cmb.b var7) {
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
   public void a(adx $$0) {
      zo.a($$0, this, this.a);
      cly $$1 = this.a.s;
      $$1.gm().b = $$0.e();
      $$1.gm().d = $$0.g();
      $$1.gm().a = $$0.b();
      $$1.gm().c = $$0.f();
      $$1.gm().a($$0.h());
      $$1.gm().b($$0.i());
   }

   @Override
   public void a(afr $$0) {
      zo.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afs $$0) {
      zo.a($$0, this, this.a);

      for (afs.a $$1 : $$0.b()) {
         afr $$2 = $$1.b();
         this.a.r.a($$1.a(), $$2.f(), $$2.g(), $$2.h(), $$2.b().a(), $$2.e(), $$2.i(), $$2.j());
      }
   }

   @Override
   public void a(afq $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(ach $$0) {
      zo.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(acv $$0) {
      zo.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gI().b($$0.b());
      } else {
         this.a.s.gI().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ads $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.a.s.de();
      if ($$1 != this.a.s && $$1.df()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahj($$1));
      }
   }

   @Override
   public void a(adt $$0) {
      zo.a($$0, this, this.a);
      cuh $$1 = this.a.s.b($$0.b());
      fpu.a $$2 = fpu.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fpu($$2));
      }
   }

   @Override
   public void a(aam $$0) {
      if ($$0 instanceof aav $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aau $$2) {
         ((giz)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aba $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof abc $$4) {
         ((gjh)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aay $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aaw $$6) {
         gin.a $$7 = new gin.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aax $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof abb $$9) {
         gjf $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aas $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof aaj $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof aai $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aat $$14) {
         this.a.k.o.a($$14.b(), this.q.Z());
      } else if ($$0 instanceof aaq $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aar) {
         this.a.k.r.a();
      } else if ($$0 instanceof aaz $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aao $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aap $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aal $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aam $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afh $$0) {
      zo.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, eyb.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         exq $$2 = this.R.a($$1);
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
   public void a(afk $$0) {
      zo.a($$0, this, this.a);
      String $$1 = $$0.e();
      exx $$2 = exx.e($$0.b());
      exq $$3 = this.R.a($$1);
      if ($$3 != null) {
         exw $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aej $$0) {
      zo.a($$0, this, this.a);
      String $$1 = $$0.e();
      exx $$2 = exx.e($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         exq $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afa $$0) {
      zo.a($$0, this, this.a);
      String $$1 = $$0.e();
      exq $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(afj $$0) {
      zo.a($$0, this, this.a);
      afj.a $$1 = $$0.e();
      ext $$2;
      if ($$1 == afj.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afj.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eya.b $$2x = eya.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eya.a $$3x = eya.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afj.a $$5 = $$0.b();
      if ($$5 == afj.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == afj.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == afj.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(adl $$0) {
      zo.a($$0, this, this.a);
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
   public void a(agd $$0) {
      zo.a($$0, this, this.a);
      brv $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bso)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bts $$2 = ((bso)$$1).ff();

            for (agd.a $$3 : $$0.e()) {
               btr $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (btt $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adw $$0) {
      zo.a($$0, this, this.a);
      cpg $$1 = this.a.s.cq;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fsl) {
               fsf $$2 = ((fsl)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adm $$0) {
      zo.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adn $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, adn $$2) {
      eot $$3 = this.q.i().p();
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
   public void a(adq $$0) {
      zo.a($$0, this, this.a);
      cpg $$1 = this.a.s.cq;
      if ($$0.b() == $$1.j && $$1 instanceof cqq $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aey $$0) {
      zo.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(afl $$0) {
      zo.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aex $$0) {
      zo.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      zo.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(acj $$0) {
      zo.a($$0, this, this.a);

      for (zl<? super abw> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(acm $$0) {
      this.K.a();
   }

   @Override
   public void a(acl $$0) {
      this.K.a($$0.b());
      this.b(new agu(this.K.b()));
   }

   @Override
   public void a(acy $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajl $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, eot $$2, dcj $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jt.a($$0, $$8, $$1), $$9 ? new dvd((byte[])$$6.next().clone()) : new dvd());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public wc l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fzy> m() {
      return this.t;
   }

   public Collection<fzy> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fzy a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fzy a(String $$0) {
      for (fzy $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fzi q() {
      return this.u;
   }

   public CommandDispatcher<em> r() {
      return this.A;
   }

   public fzn s() {
      return this.q;
   }

   public fga t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<aks<dca>> v() {
      return this.D;
   }

   public jo.b w() {
      return this.E;
   }

   public void a(xu $$0, boolean $$1) {
      xq $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new agq($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axk.c.a();
      xm.a $$3 = this.I.b();
      xq $$4 = this.H.pack(new xx($$0, $$1, $$2, $$3.a()));
      this.b(new ags($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axk.c.a();
      xm.a $$3 = this.I.b();
      eo $$4 = eo.a(xw.a(this.e($$0)), $$3x -> {
         xx $$4x = new xx($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new agr($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (xw.a(this.e($$0)).a().isEmpty()) {
         xm.a $$1 = this.I.b();
         this.b(new agr($$0, Instant.now(), 0L, eo.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<em> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fzz $$0 = this.a.w();
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

   public void a(cma $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = xp.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new agt(this.G.a().a()));
         }
      }
   }

   @Nullable
   public gab x() {
      return this.c;
   }

   public cop y() {
      return this.F;
   }

   public boolean a(cop $$0) {
      return $$0.a(this.y());
   }

   public exy z() {
      return this.R;
   }
}
