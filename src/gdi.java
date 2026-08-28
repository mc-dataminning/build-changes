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

public class gdi extends gde implements acf, wx {
   private static final Logger k = LogUtils.getLogger();
   private static final xj l = xj.c("multiplayer.unsecureserver.toast.title");
   private static final xj m = xj.c("multiplayer.unsecureserver.toast");
   private static final xj n = xj.c("multiplayer.disconnect.invalid_packet");
   private static final xj o = xj.c("connect.reconfiguring");
   private static final int p = 64;
   private final GameProfile q;
   private gdh r;
   private gdh.a s;
   private final Map<UUID, gds> t = Maps.newHashMap();
   private final Set<gds> u = new ReferenceOpenHashSet();
   private final gdc v;
   private final gdk w;
   private final fjt x = new fjt(this);
   private int y = 3;
   private int z = 3;
   private final azu A = azu.b();
   private CommandDispatcher<fb> B = new CommandDispatcher();
   private final dbe C;
   private final UUID D = UUID.randomUUID();
   private Set<ali<dfm>> E;
   private final ke.b F;
   private final crq G;
   private final cyk H;
   private dtv I;
   @Nullable
   private xu J;
   private yd.c K = yd.c.a;
   private xr L = new xr(20);
   private xw M = xw.a();
   @Nullable
   private CompletableFuture<Optional<cow>> N;
   @Nullable
   private ara O;
   private final gdb P = new gdb();
   private final gdr Q;
   private final gdm R;
   @Nullable
   private gdp S;
   private boolean T;
   private boolean U = false;
   private volatile boolean V;
   private final fbd W = new fbd();
   private final gdy X = new gdy();

   public gdi(fke $$0, wd $$1, gdl $$2) {
      super($$0, $$1, $$2);
      this.q = $$2.a();
      this.F = $$2.c();
      this.G = $$2.d();
      this.v = new gdc($$0, this.e);
      this.w = new gdk(this, $$0);
      this.Q = new gdr(this, $$0.aQ().m());
      this.C = new dbe(this.F);
      this.R = new gdm(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.H = cyk.a(this.G);
      this.I = dtv.a($$2.c(), this.G);
   }

   public gdk g() {
      return this.w;
   }

   public void h() {
      this.V = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.r = null;
      this.S = null;
   }

   public dbe j() {
      return this.C;
   }

   @Override
   public void a(adw $$0) {
      zt.a($$0, this, this.a);
      this.a.r = new gdq(this.a, this);
      agr $$1 = $$0.m();
      List<ali<dfm>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.E = Sets.newLinkedHashSet($$2);
      ali<dfm> $$3 = $$1.b();
      jq<dzq> $$4 = $$1.a();
      this.y = $$0.h();
      this.z = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gdh.a $$8 = new gdh.a(bsh.c, $$0.e(), $$6);
      this.s = $$8;
      this.r = new gdh(this, $$8, $$3, $$4, this.y, this.z, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.r, fru.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.r, new awy(), new fjp());
         this.a.t.v(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.B();
      this.a.t.e($$0.b());
      this.r.d(this.a.t);
      this.a.t.j = new gib(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.r, fru.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.J = null;
      this.L = new xr(20);
      this.M = xw.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.T = $$0.n();
      if (this.c != null && !this.U && !this.F()) {
         fom $$9 = fom.a(this.a, fom.a.k, l, m);
         this.a.aA().a($$9);
         this.U = true;
      }
   }

   @Override
   public void a(acg $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.r.d($$1);
         this.a($$1);
      } else {
         k.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bul b(acg $$0) {
      bus<?> $$1 = $$0.f();
      if ($$1 == bus.bO) {
         gds $$2 = this.a($$0.e());
         if ($$2 == null) {
            k.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gid(this.r, $$2.a());
         }
      } else {
         return $$1.a(this.r, bur.r);
      }
   }

   private void a(bul $$0) {
      if ($$0 instanceof cqt $$1) {
         this.a.ak().a((hdb)(new hcu($$1)));
      } else if ($$0 instanceof cgz $$2) {
         boolean $$3 = $$2.ac_();
         hco $$4;
         if ($$3) {
            $$4 = new hcm($$2);
         } else {
            $$4 = new hcn($$2);
         }

         this.a.ak().a((hdc)$$4);
      }
   }

   @Override
   public void a(ach $$0) {
      zt.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bul $$4 = new bux(this.r, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.v(0.0F);
      $$4.w(0.0F);
      $$4.e($$0.b());
      this.r.d($$4);
   }

   @Override
   public void a(afn $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afl $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(agk $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.di()) {
            float $$5 = $$0.h();
            float $$6 = $$0.i();
            if (this.r.a($$1)) {
               $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            } else {
               $$1.b($$2, $$3, $$4, $$5, $$6);
            }

            $$1.d($$0.j());
         }
      }
   }

   @Override
   public void a(agl $$0) {
      zt.a($$0, this, this.a);
      if (this.a.s != null) {
         bst $$1 = this.a.s.t();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agm $$0) {
      zt.a($$0, this, this.a);
      if (this.a.s != null) {
         bst $$1 = this.a.s.t();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afr $$0) {
      zt.a($$0, this, this.a);
      if (cot.d($$0.b())) {
         this.a.t.gg().j = $$0.b();
      }
   }

   @Override
   public void a(adz $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = $$0.a(this.r);
      if ($$1 != null) {
         if (!$$1.di()) {
            if ($$0.j()) {
               aiw $$2 = $$1.ap();
               ezy $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? $$0.g() : $$1.q_();
               float $$5 = $$0.i() ? $$0.h() : $$1.g_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               $$1.a($$1.f_(), $$1.P_(), $$1.Q_(), $$0.g(), $$0.h(), 3);
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(aea $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = $$0.a(this.r);
      if ($$1 instanceof cqt $$2) {
         if (!$$1.di() && $$2.j() instanceof cri $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aev $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = $$0.a(this.r);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aer $$0) {
      zt.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.r.a($$0x, bul.c.b));
   }

   @Override
   public void a(aeo $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      bvu $$2 = bvu.a($$1);
      bvu $$3 = bvu.a($$0);
      bvu $$4 = bvu.a($$2, $$3, $$0.i());
      $$1.b($$4.a());
      $$1.h($$4.b());
      $$1.v($$4.c());
      $$1.w($$4.d());
      bvu $$5 = new bvu($$1.bC(), $$1.dy(), $$1.N, $$1.O);
      bvu $$6 = bvu.a($$5, $$3, $$0.i());
      $$1.c($$6.a(), $$6.c(), $$6.d());
      this.b.a(new agy($$0.b()));
      this.b.a(new ahv.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(aew $$0) {
      zt.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.r.b($$0x, $$1, 19));
   }

   @Override
   public void a(adr $$0) {
      zt.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adv $$3 = $$0.g();
      this.r.a(() -> {
         this.a($$1, $$2, $$3, false);
         dya $$3x = this.r.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acv $$0) {
      zt.a($$0, this, this.a);

      for (acv.a $$1 : $$0.b()) {
         this.r.h().a($$1.b().g, $$1.b().h, $$1.a());
      }

      for (acv.a $$2 : $$0.b()) {
         this.r.a(new des($$2.b().g, $$2.b().h));
      }

      for (acv.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.r.an(); $$6 <= this.r.ao(); $$6++) {
                  this.a.f.b($$3.b().g + $$4, $$6, $$3.b().h + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adq $$2) {
      this.r.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dya $$0, int $$1, int $$2) {
      erk $$3 = this.r.h().p();
      dyb[] $$4 = $$0.d();
      des $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dyb $$7 = $$4[$$6];
         int $$8 = this.r.h($$6);
         $$3.a(kj.a($$5, $$8), $$7.c());
      }

      this.r.b($$1 - 1, this.r.an(), $$2 - 1, $$1 + 1, this.r.ao(), $$2 + 1);
   }

   @Override
   public void a(adl $$0) {
      zt.a($$0, this, this.a);
      this.r.h().a($$0.b());
      this.b($$0);
   }

   private void b(adl $$0) {
      des $$1 = $$0.b();
      this.r.a(() -> {
         erk $$1x = this.r.B_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kj $$3 = kj.a($$1, $$2);
            $$1x.a(dfv.b, $$3, null);
            $$1x.a(dfv.a, $$3, null);
         }

         for (int $$4 = this.r.an(); $$4 <= this.r.ao(); $$4++) {
            $$1x.a(kj.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aco $$0) {
      zt.a($$0, this, this.a);
      this.r.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(age $$0) {
      zt.a($$0, this, this.a);
      this.a.ba().d();
      this.G();
      fme.b $$1 = this.a.m.d().k();
      this.a.c(new fup(o, this.b));
      this.b.a(abu.d, new gdf(this.a, this.b, new gdl(this.q, this.e, this.F, this.G, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahk.a);
      this.b.a(abu.b);
   }

   @Override
   public void a(agj $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      bvh $$2 = (bvh)this.r.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bux) {
            this.r.a($$1.dA(), $$1.dC(), $$1.dG(), awn.iI, awo.h, 0.1F, (this.A.i() - this.A.i()) * 0.35F + 0.9F, false);
         } else {
            this.r.a($$1.dA(), $$1.dC(), $$1.dG(), awn.nB, awo.h, 0.2F, (this.A.i() - this.A.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new ggi(this.a.aq(), this.a.aR(), this.r, $$1, $$2));
         if ($$1 instanceof clc $$3) {
            cwm $$4 = $$3.j();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.r.a($$0.b(), bul.c.b);
            }
         } else if (!($$1 instanceof bux)) {
            this.r.a($$0.b(), bul.c.b);
         }
      }
   }

   @Override
   public void a(agg $$0) {
      zt.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeh $$0) {
      zt.a($$0, this, this.a);
      Optional<yc> $$1 = $$0.g().a(this.M);
      if ($$1.isEmpty()) {
         this.b.a(n);
      } else {
         this.M.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gds $$3 = this.a($$2);
         if ($$3 == null) {
            k.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.ba().a($$2, $$0.j());
         } else {
            ya $$4 = $$3.b();
            ye $$5;
            if ($$4 != null) {
               $$5 = new ye($$0.e(), $$2, $$4.c());
            } else {
               $$5 = ye.a($$2);
            }

            xz $$7 = new xz($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(adi $$0) {
      zt.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adh $$0) {
      zt.a($$0, this, this.a);
      Optional<xv> $$1 = $$0.b().a(this.M);
      if ($$1.isEmpty()) {
         this.b.a(n);
      } else {
         this.L.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(aci $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bvh $$2 = (bvh)$$1;
            $$2.a(bsj.a);
         } else if ($$0.e() == 3) {
            bvh $$3 = (bvh)$$1;
            $$3.a(bsj.b);
         } else if ($$0.e() == 2) {
            cou $$4 = (cou)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, ls.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, ls.r);
         }
      }
   }

   @Override
   public void a(ado $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.p($$0.e());
      }
   }

   @Override
   public void a(afz $$0) {
      zt.a($$0, this, this.a);
      this.r.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afj $$0) {
      zt.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aft $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.e());
      if ($$1 == null) {
         k.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bP();

         for (int $$3 : $$0.b()) {
            bul $$4 = this.r.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cqr) {
                     this.a.t.N = $$1.dL();
                     this.a.t.v($$1.dL());
                     this.a.t.q($$1.dL());
                  }

                  xj $$5 = xj.a("mount.onboard", this.a.n.A.k());
                  this.a.m.a($$5, false);
                  this.a.aZ().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(afm $$0) {
      zt.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof bvf $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cwm a(cou $$0) {
      for (bsj $$1 : bsj.values()) {
         cwm $$2 = $$0.b($$1);
         if ($$2.b(ku.H)) {
            return $$2;
         }
      }

      return new cwm(cwq.vL);
   }

   @Override
   public void a(adj $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = $$0.a(this.r);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hdb)(new hct((clu)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ls.ak, 30);
               this.r.a($$1.dA(), $$1.dC(), $$1.dG(), awn.zD, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cou)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hdb)(new hcx((cjp)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adf $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.r));
      }
   }

   @Override
   public void a(afq $$0) {
      zt.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gr().a($$0.e());
      this.a.t.gr().b($$0.f());
   }

   @Override
   public void a(afp $$0) {
      zt.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeu $$0) {
      zt.a($$0, this, this.a);
      agr $$1 = $$0.b();
      ali<dfm> $$2 = $$1.b();
      jq<dzq> $$3 = $$1.a();
      gic $$4 = this.a.t;
      ali<dfm> $$5 = $$4.dV().ag();
      boolean $$6 = $$2 != $$5;
      fru.a $$7 = this.a($$4.eE(), $$2, $$5);
      if ($$6) {
         Map<etn, etp> $$8 = this.r.k();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gdh.a $$12 = new gdh.a(this.s.q(), this.s.l(), $$10);
         this.s = $$12;
         this.r = new gdh(this, $$12, $$2, $$3, this.y, this.z, this.a.f, $$9, $$1.c(), $$11);
         this.r.a($$8);
         this.a.a(this.r, $$7);
      }

      this.a.u = null;
      if ($$4.gi()) {
         $$4.p();
      }

      gic $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.r, $$4.m(), $$4.n(), $$4.cd(), $$4.cj());
      } else {
         $$13 = this.a.r.a(this.r, $$4.m(), $$4.n());
      }

      this.a($$13, this.r, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akq.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.h($$4.dy());
         $$13.v($$4.dL());
         $$13.w($$4.dN());
      } else {
         $$13.B();
         $$13.v(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.eW().a($$4.eW());
      } else {
         $$13.eW().b($$4.eW());
      }

      this.r.d($$13);
      $$13.j = new gib(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gx());
      $$13.b($$4.t());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cF = $$4.cF;
      $$13.cG = $$4.cG;
      if (this.a.z instanceof fra || this.a.z instanceof fra.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fru.a a(boolean $$0, ali<dfm> $$1, ali<dfm> $$2) {
      fru.a $$3 = fru.a.c;
      if (!$$0) {
         if ($$1 == dfm.j || $$2 == dfm.j) {
            $$3 = fru.a.a;
         } else if ($$1 == dfm.k || $$2 == dfm.k) {
            $$3 = fru.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adk $$0) {
      zt.a($$0, this, this.a);
      ezy $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awo.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::i);
   }

   @Override
   public void a(adn $$0) {
      zt.a($$0, this, this.a);
      if (this.r.a($$0.f()) instanceof cjc $$2) {
         gic $$3 = this.a.t;
         int $$4 = $$0.e();
         bsr $$5 = new bsr(cjc.v($$4));
         ctb $$6 = new ctb($$0.b(), $$3.gg(), $$5, $$2, $$4);
         $$3.cc = $$6;
         this.a.a(new ftl($$6, $$3.gg(), $$2, $$4));
      }
   }

   @Override
   public void a(aed $$0) {
      zt.a($$0, this, this.a);
      frn.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adc $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      cwm $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof ftb $$4) {
         $$5 = !$$4.J();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (ctc.e($$3) && !$$2.f()) {
            cwm $$7 = $$1.cb.b($$3).g();
            if ($$7.f() || $$7.L() < $$2.L()) {
               $$2.d(5);
            }
         }

         $$1.cb.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cc.l && ($$0.b() != 0 || !$$5)) {
         $$1.cc.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof ftb) {
         $$1.cb.a($$3, $$2);
         $$1.cb.d();
      }
   }

   @Override
   public void a(afi $$0) {
      zt.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof ftb)) {
         this.a.t.cc.b($$0.b());
      }
   }

   @Override
   public void a(afu $$0) {
      zt.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gg().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ada $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cc.l) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aee $$0) {
      zt.a($$0, this, this.a);
      jh $$1 = $$0.b();
      if (this.r.c_($$1) instanceof duk $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         k.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.r.c_($$1), $$1);
      }
   }

   @Override
   public void a(acm $$0) {
      zt.a($$0, this, this.a);
      jh $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         ul $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.F);
         }

         if ($$1x instanceof dti && this.a.z instanceof fsw) {
            ((fsw)this.a.z).J();
         }
      });
   }

   @Override
   public void a(adb $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      if ($$1.cc != null && $$1.cc.l == $$0.b()) {
         $$1.cc.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afo $$0) {
      zt.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof bvh $$2) {
         $$0.e().forEach($$1 -> $$2.a((but)$$1.getFirst(), (cwm)$$1.getSecond()));
      }
   }

   @Override
   public void a(acz $$0) {
      zt.a($$0, this, this.a);
      this.a.t.f();
   }

   @Override
   public void a(acn $$0) {
      zt.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acl $$0) {
      zt.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adm $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      adm.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azm.d($$3 + 0.5F);
      if ($$2 == adm.b) {
         $$1.a(xj.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adm.c) {
         this.r.j().b(true);
         this.r.e(0.0F);
      } else if ($$2 == adm.d) {
         this.r.j().b(false);
         this.r.e(1.0F);
      } else if ($$2 == adm.e) {
         this.a.r.a(dfj.a($$4));
      } else if ($$2 == adm.f) {
         this.a.a(new frz(true, () -> {
            this.a.t.i.b(new ahh(ahh.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adm.g) {
         fki $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new frb());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xj.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xj.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xj.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xj.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adm.h) {
         this.r.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awn.aF, awo.h, 0.18F, 0.45F);
      } else if ($$2 == adm.i) {
         this.r.e($$3);
      } else if ($$2 == adm.j) {
         this.r.c($$3);
      } else if ($$2 == adm.k) {
         this.r.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.uU, awo.g, 1.0F, 1.0F);
      } else if ($$2 == adm.l) {
         this.r.a(ls.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.r.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.hR, awo.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adm.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adm.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adm.o && this.S != null) {
         this.S.c();
      }
   }

   private void a(gic $$0, gdh $$1, fru.a $$2) {
      this.S = new gdp($$0, $$1, this.a.f);
      this.a.a(new fru(this.S::b, $$2));
   }

   @Override
   public void a(adx $$0) {
      zt.a($$0, this, this.a);
      etn $$1 = $$0.b();
      etp $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = etp.a($$0.e(), $$0.f(), this.a.s.ag());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(ads $$0) {
      zt.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agn $$0) {
      zt.a($$0, this, this.a);
      this.v.a($$0);
   }

   @Override
   public void a(aex $$0) {
      zt.a($$0, this, this.a);
      alj $$1 = $$0.b();
      if ($$1 == null) {
         this.v.a(null, false);
      } else {
         ah $$2 = this.v.a($$1);
         this.v.a($$2, false);
      }
   }

   @Override
   public void a(acy $$0) {
      zt.a($$0, this, this.a);
      this.B = new CommandDispatcher($$0.a(es.a(this.F, this.G)));
   }

   @Override
   public void a(agf $$0) {
      zt.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acx $$0) {
      zt.a($$0, this, this.a);
      this.w.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agq $$0) {
      zt.a($$0, this, this.a);
      this.C.a($$0.b());
      fjp $$1 = this.a.t.n();
      $$1.a(this.C.d(), this.a.s.J_());
      this.X.a($$1, this.F);
   }

   @Override
   public void a(aen $$0) {
      zt.a($$0, this, this.a);
      ezy $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agi $$0) {
      zt.a($$0, this, this.a);
      if (!this.x.a($$0.b(), $$0.e())) {
         k.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acj $$0) {
      zt.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awu<?>> $$1 = (Entry<awu<?>>)$$4.next();
         awu<?> $$2 = (awu<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.m().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fsa $$4x) {
         $$4x.G();
      }
   }

   @Override
   public void a(aeq $$0) {
      zt.a($$0, this, this.a);
      fjp $$1 = this.a.t.n();
      $$1.a($$0.f());
      aeq.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (alj $$3 : $$0.b()) {
               this.C.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (alj $$4 : $$0.b()) {
               this.C.a($$4).ifPresent($$1::a);
            }

            for (alj $$5 : $$0.e()) {
               this.C.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (alj $$6 : $$0.b()) {
               this.C.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fol.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fvz) {
         ((fvz)this.a.z).M();
      }
   }

   @Override
   public void a(agp $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 instanceof bvh) {
         jq<bto> $$2 = $$0.e();
         btq $$3 = new btq($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bvh)$$1).c($$3, null);
      }
   }

   private <T> kd.a<T> a(ali<? extends kd<? extends T>> $$0, axu.a $$1) {
      kd<T> $$2 = this.F.e($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aah $$0) {
      zt.a($$0, this, this.a);
      List<kd.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kh.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(kd.a::c);
      this.I = dtv.a(this.F, this.G);
      List<cwm> $$3 = List.copyOf(cvc.e().l());
      this.X.a($$3);
   }

   @Override
   public void a(aei $$0) {
   }

   @Override
   public void a(aej $$0) {
   }

   @Override
   public void a(aek $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.t()) {
            this.a.a(new fra($$0.e(), this.r.j().l()));
         } else {
            this.a.t.ge();
         }
      }
   }

   @Override
   public void a(acs $$0) {
      zt.a($$0, this, this.a);
      this.s.a($$0.e());
      this.s.a($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adp $$0) {
      zt.a($$0, this, this.a);
      dxl $$1 = this.r.E_();
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
   public void a(afa $$0) {
      zt.a($$0, this, this.a);
      this.r.E_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(afb $$0) {
      zt.a($$0, this, this.a);
      this.r.E_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afc $$0) {
      zt.a($$0, this, this.a);
      this.r.E_().a($$0.b());
   }

   @Override
   public void a(afe $$0) {
      zt.a($$0, this, this.a);
      this.r.E_().c($$0.b());
   }

   @Override
   public void a(afd $$0) {
      zt.a($$0, this, this.a);
      this.r.E_().b($$0.b());
   }

   @Override
   public void a(acw $$0) {
      zt.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aey $$0) {
      zt.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gdv::b).ifPresent(this.c::a);
         gdw.b(this.c);
      }
   }

   @Override
   public void a(ade $$0) {
      zt.a($$0, this, this.a);
      this.w.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aez $$0) {
      zt.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(aga $$0) {
      zt.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afy $$0) {
      zt.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(agb $$0) {
      zt.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agh $$0) {
      zt.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aes $$0) {
      zt.a($$0, this, this.a);
      if ($$0.a(this.r) instanceof bvh $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ael $$0) {
      zt.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gds $$2 = this.t.remove($$1);
         if ($$2 != null) {
            this.u.remove($$2);
         }
      }
   }

   @Override
   public void a(aem $$0) {
      zt.a($$0, this, this.a);

      for (aem.b $$1 : $$0.f()) {
         gds $$2 = new gds(Objects.requireNonNull($$1.b()), this.F());
         if (this.t.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aem.b $$3 : $$0.e()) {
         gds $$4 = this.t.get($$3.a());
         if ($$4 == null) {
            k.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aem.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aem.a $$0, aem.b $$1, gds $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cG().equals($$1.a())) {
               this.a.t.a($$1.e());
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
            break;
         case g:
            $$2.b($$1.g());
      }
   }

   private void a(aem.b $$0, gds $$1) {
      GameProfile $$2 = $$1.a();
      azz $$3 = this.a.aW();
      if ($$3 == null) {
         k.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.F());
      } else {
         ya.a $$4 = $$0.h();
         if ($$4 != null) {
            try {
               ya $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cox.b var7) {
               k.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.F());
            }
         } else {
            $$1.a(this.F());
         }
      }
   }

   private boolean F() {
      return this.a.aX() && this.T;
   }

   @Override
   public void a(aeg $$0) {
      zt.a($$0, this, this.a);
      cou $$1 = this.a.t;
      $$1.gh().b = $$0.e();
      $$1.gh().d = $$0.g();
      $$1.gh().a = $$0.b();
      $$1.gh().c = $$0.f();
      $$1.gh().a($$0.h());
      $$1.gh().b($$0.i());
   }

   @Override
   public void a(agd $$0) {
      zt.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agc $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acp $$0) {
      zt.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(add $$0) {
      zt.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gC().a($$0.b());
      } else {
         this.a.t.gC().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aeb $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.a.t.dg();
      if ($$1 != this.a.t && $$1.di()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new ahw($$1));
      }
   }

   @Override
   public void a(aec $$0) {
      zt.a($$0, this, this.a);
      cwm $$1 = this.a.t.b($$0.b());
      fst.a $$2 = fst.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fst($$2));
      }
   }

   @Override
   public void a(aat $$0) {
      if ($$0 instanceof abc $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abb $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abh $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abi $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abk $$5) {
         ((gnx)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abf $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abd $$7) {
         gna.a $$8 = new gna.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abe $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abj $$10) {
         gnv $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aaz $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aaq $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aap $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aba $$15) {
         this.a.l.p.a($$15.b(), this.r.ab());
      } else if ($$0 instanceof aax $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aay) {
         this.a.l.s.a();
      } else if ($$0 instanceof abg $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aav $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aaw $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aas $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aat $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afs $$0) {
      zt.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.W.a($$1, fbg.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fav $$2 = this.W.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.W.j($$2);
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
      zt.a($$0, this, this.a);
      String $$1 = $$0.e();
      fbc $$2 = fbc.c($$0.b());
      fav $$3 = this.W.a($$1);
      if ($$3 != null) {
         fbb $$4 = this.W.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         k.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aet $$0) {
      zt.a($$0, this, this.a);
      String $$1 = $$0.e();
      fbc $$2 = fbc.c($$0.b());
      if ($$1 == null) {
         this.W.b($$2);
      } else {
         fav $$3 = this.W.a($$1);
         if ($$3 != null) {
            this.W.e($$2, $$3);
         } else {
            k.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afk $$0) {
      zt.a($$0, this, this.a);
      String $$1 = $$0.e();
      fav $$2 = $$1 == null ? null : this.W.a($$1);
      this.W.a($$0.b(), $$2);
   }

   @Override
   public void a(afv $$0) {
      zt.a($$0, this, this.a);
      afv.a $$1 = $$0.e();
      fay $$2;
      if ($$1 == afv.a.a) {
         $$2 = this.W.c($$0.f());
      } else {
         $$2 = this.W.b($$0.f());
         if ($$2 == null) {
            k.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afv.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         fbf.b $$2x = fbf.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         fbf.a $$3x = fbf.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afv.a $$5 = $$0.b();
      if ($$5 == afv.a.a) {
         for (String $$6 : $$0.g()) {
            this.W.a($$6, $$2);
         }
      } else if ($$5 == afv.a.b) {
         for (String $$7 : $$0.g()) {
            this.W.b($$7, $$2);
         }
      }

      if ($$1 == afv.a.b) {
         this.W.d($$2);
      }
   }

   @Override
   public void a(adt $$0) {
      zt.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.r.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            k.warn("Could not spawn particle effect {}", $$0.m());
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
               k.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(ago $$0) {
      zt.a($$0, this, this.a);
      bul $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bvh)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bwm $$2 = ((bvh)$$1).eW();

            for (ago.a $$3 : $$0.e()) {
               bwl $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  k.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bwn $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aef $$0) {
      zt.a($$0, this, this.a);
      crz $$1 = this.a.t.cc;
      if ($$1.l == $$0.e()) {
         this.C.a($$0.b()).ifPresent($$0x -> {
            if (this.a.z instanceof fvz $$2) {
               $$2.N().a($$0x);
            }
         });
      }
   }

   @Override
   public void a(adu $$0) {
      zt.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adv $$3 = $$0.f();
      this.r.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adv $$2, boolean $$3) {
      erk $$4 = this.r.h().p();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dfv.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dfv.b, $$8, $$9, $$10, $$3);
      $$4.a(new des($$0, $$1), true);
   }

   @Override
   public void a(ady $$0) {
      zt.a($$0, this, this.a);
      crz $$1 = this.a.t.cc;
      if ($$0.b() == $$1.l && $$1 instanceof ctk $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afh $$0) {
      zt.a($$0, this, this.a);
      this.y = $$0.b();
      this.a.n.b(this.y);
      this.r.h().a($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zt.a($$0, this, this.a);
      this.z = $$0.b();
      this.r.i(this.z);
   }

   @Override
   public void a(afg $$0) {
      zt.a($$0, this, this.a);
      this.r.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(ack $$0) {
      zt.a($$0, this, this.a);
      this.r.b($$0.b());
   }

   @Override
   public void a(acr $$0) {
      zt.a($$0, this, this.a);

      for (zq<? super acf> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aep $$0) {
      zt.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof cpc $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(acu $$0) {
      this.P.a();
   }

   @Override
   public void a(act $$0) {
      this.P.a($$0.b());
      this.b(new ahg(this.P.b()));
   }

   @Override
   public void a(adg $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajz $$0) {
      this.Q.a($$0);
   }

   private void a(int $$0, int $$1, erk $$2, dfv $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, kj.a($$0, $$9, $$1), $$10 ? new dxv((byte[])$$6.next().clone()) : new dxv());
            if ($$7) {
               this.r.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wd k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.V;
   }

   public Collection<gds> l() {
      return this.u;
   }

   public Collection<gds> m() {
      return this.t.values();
   }

   public Collection<UUID> n() {
      return this.t.keySet();
   }

   @Nullable
   public gds a(UUID $$0) {
      return this.t.get($$0);
   }

   @Nullable
   public gds a(String $$0) {
      for (gds $$1 : this.t.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.q;
   }

   public gdc p() {
      return this.v;
   }

   public CommandDispatcher<fb> q() {
      return this.B;
   }

   public gdh r() {
      return this.r;
   }

   public fjt s() {
      return this.x;
   }

   public UUID t() {
      return this.D;
   }

   public Set<ali<dfm>> u() {
      return this.E;
   }

   public ke.b v() {
      return this.F;
   }

   public void a(xz $$0, boolean $$1) {
      xv $$2 = $$0.l();
      if ($$2 != null && this.L.a($$2, $$1) && this.L.c() > 64) {
         this.G();
      }
   }

   private void G() {
      int $$0 = this.L.a();
      if ($$0 > 0) {
         this.b(new ahb($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayk.c.a();
      xr.a $$3 = this.L.b();
      xv $$4 = this.K.pack(new yc($$0, $$1, $$2, $$3.a()));
      this.b(new ahe($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yb<fb> $$1 = yb.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahc($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayk.c.a();
         xr.a $$4 = this.L.b();
         fd $$5 = fd.a($$1, $$3x -> {
            yc $$4x = new yc($$3x, $$2, $$3, $$4.a());
            return this.K.pack($$4x);
         });
         this.b(new ahd($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!yb.a(this.e($$0))) {
         this.b(new ahc($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<fb> e(String $$0) {
      return this.B.parse($$0, this.w);
   }

   public void a(ara $$0) {
      if (!$$0.equals(this.O)) {
         this.b(new aak($$0));
         this.O = $$0;
      }
   }

   @Override
   public void d() {
      if (this.J != null && this.a.w().b()) {
         this.w();
      }

      if (this.N != null && this.N.isDone()) {
         this.N.join().ifPresent(this::a);
         this.N = null;
      }

      this.e();
      if (this.a.aQ().f()) {
         this.Q.a();
      }

      this.R.a();
      this.e.a();
      if (this.S != null) {
         this.S.a();
      }
   }

   public void w() {
      this.N = this.a.w().a();
   }

   private void a(cow $$0) {
      if (this.a.b(this.q.getId())) {
         if (this.J == null || !this.J.c().equals($$0)) {
            this.J = xu.a($$0);
            this.K = this.J.a(this.q.getId());
            this.b(new ahf(this.J.a().a()));
         }
      }
   }

   @Nullable
   public gdv x() {
      return this.c;
   }

   public crq y() {
      return this.G;
   }

   public boolean a(crq $$0) {
      return $$0.a(this.y());
   }

   public fbd z() {
      return this.W;
   }

   public cyk A() {
      return this.H;
   }

   public dtv B() {
      return this.I;
   }

   public void C() {
      this.X.a();
   }

   public gdy D() {
      return this.X;
   }

   public amb E() {
      return this.j;
   }
}
