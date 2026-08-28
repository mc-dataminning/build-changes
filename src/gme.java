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
import java.lang.ref.WeakReference;
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
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gme extends gma implements aby, wq {
   private static final Logger l = LogUtils.getLogger();
   private static final xc m = xc.c("multiplayer.unsecureserver.toast.title");
   private static final xc n = xc.c("multiplayer.unsecureserver.toast");
   private static final xc o = xc.c("multiplayer.disconnect.invalid_packet");
   private static final xc p = xc.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private gmd s;
   private gmd.a t;
   private final Map<UUID, gmp> u = Maps.newHashMap();
   private final Set<gmp> v = new ReferenceOpenHashSet();
   private final gly w;
   private final gmh x;
   private final fqu y = new fqu(this);
   private int z = 3;
   private int A = 3;
   private final azz B = azz.b();
   private CommandDispatcher<ep> C = new CommandDispatcher();
   private gmf D = new gmf(Map.of(), dfe.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<alj<djz>> F;
   private final ju.b G;
   private final cvj H;
   private final dbv I;
   private dzd J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xn L;
   private xw.c M = xw.c.a;
   private xk N = new xk(20);
   private xp O = xp.a();
   @Nullable
   private CompletableFuture<Optional<csc>> P;
   @Nullable
   private are Q;
   private final glx R = new glx();
   private final gmo S;
   private final gmj T;
   @Nullable
   private gmm U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final fgx Y = new fgx();
   private final gmv Z = new gmv();
   private final List<WeakReference<glw<?, ?>>> aa = new ArrayList<>();

   public gme(frf $$0, vv $$1, gmi $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new gly($$0, this.e);
      this.x = new gmh(this, $$0);
      this.S = new gmo(this, $$0.aQ().m());
      this.T = new gmj(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = dbv.a(this.H);
      this.J = dzd.a($$2.c(), this.H);
   }

   public gmh g() {
      return this.x;
   }

   public void h() {
      this.X = true;
      this.i();
      this.e.c();
   }

   public void i() {
      this.F();
      this.s = null;
      this.U = null;
   }

   private void F() {
      for (WeakReference<glw<?, ?>> $$0 : this.aa) {
         glw<?, ?> $$1 = $$0.get();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.aa.clear();
   }

   public des j() {
      return this.D;
   }

   @Override
   public void a(adp $$0) {
      zm.a($$0, this, this.a);
      this.a.r = new gmn(this.a, this);
      ago $$1 = $$0.m();
      List<alj<djz>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      alj<djz> $$3 = $$1.b();
      jg<efd> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gmd.a $$8 = new gmd.a(buq.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gmd(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, gad.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new axc(), new fqq());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.z();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new gra(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, gad.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new xk(20);
      this.O = xp.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.G()) {
         fww $$9 = fww.a(this.a, fww.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(abz $$0) {
      zm.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bwv $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bwv b(abz $$0) {
      bxe<?> $$1 = $$0.f();
      if ($$1 == bxe.bT) {
         gmp $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new grc(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bxd.r);
      }
   }

   private void a(bwv $$0) {
      if ($$0 instanceof cum $$1) {
         this.a.ak().a((hoz)(new hos($$1)));
      } else if ($$0 instanceof cjn $$2) {
         boolean $$3 = $$2.ae_();
         hom $$4;
         if ($$3) {
            $$4 = new hok($$2);
         } else {
            $$4 = new hol($$2);
         }

         this.a.ak().a((hpa)$$4);
      }
   }

   @Override
   public void a(afj $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.k($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afh $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.ar().a($$0.e());
      }
   }

   @Override
   public void a(adc $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         ffs $$2 = $$0.e().a();
         $$1.am().e($$2);
         if (!$$1.dg()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.dt().g($$2) > 4096.0;
            if (this.s.a($$1) && !$$5) {
               $$1.d($$2, $$3, $$4);
            } else {
               $$1.b($$2, $$3, $$4);
            }

            if ($$1.bQ() && $$1.A(this.a.t)) {
               $$1.j(this.a.t);
               this.a.t.bx();
            }

            $$1.d($$0.f());
         }
      }
   }

   @Override
   public void a(agg $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ahs.b(this.a.t.dA(), this.a.t.dC(), this.a.t.dG(), this.a.t.dL(), this.a.t.dN(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(byk.a) || $$0.f().contains(byk.b) || $$0.f().contains(byk.c);
         boolean $$3 = this.s.a($$1) || !$$1.dg() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.bx();
            if ($$1.dg()) {
               this.b.a(aht.a($$1));
            }
         }
      }
   }

   @Override
   public void a(agi $$0) {
      zm.a($$0, this, this.a);
      if (this.a.s != null) {
         bvc $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agj $$0) {
      zm.a($$0, this, this.a);
      if (this.a.s != null) {
         bvc $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afn $$0) {
      zm.a($$0, this, this.a);
      if (cry.e($$0.b())) {
         this.a.t.gj().c($$0.b());
      }
   }

   @Override
   public void a(ads $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.dg()) {
            aix $$2 = $$1.am();
            ffs $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               aix $$4 = $$1.am();
               ffs $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$4.e($$5);
               if ($$0.i()) {
                  $$1.d($$5, $$0.g(), $$0.h());
               } else {
                  $$1.d($$5, $$1.dL(), $$1.dN());
               }
            } else if ($$0.i()) {
               $$1.d($$1.dt(), $$0.g(), $$0.h());
            }

            $$1.d($$0.k());
         }
      }
   }

   @Override
   public void a(adt $$0) {
      zm.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof cum $$2) {
         if ($$2.f() instanceof cvb $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aer $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aen $$0) {
      zm.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bwv $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.an(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bwv.d.b);
         }
      });
   }

   @Override
   public void a(aeh $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      if (!$$1.bY()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new agv($$0.b()));
      this.b.a(new ahs.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   private static boolean a(byj $$0, Set<byk> $$1, bwv $$2, boolean $$3) {
      byj $$4 = byj.a($$2);
      byj $$5 = byj.a($$4, $$0, $$1);
      boolean $$6 = $$4.a().g($$5.a()) > 4096.0;
      if ($$3 && !$$6) {
         $$2.d($$5.a(), $$5.c(), $$5.d());
         $$2.i($$5.b());
         return true;
      } else {
         $$2.b($$5.a());
         $$2.i($$5.b());
         $$2.w($$5.c());
         $$2.x($$5.d());
         byj $$7 = new byj($$2.bA(), ffs.c, $$2.N, $$2.O);
         byj $$8 = byj.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aei $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bz();
      this.b.a(new ahs.c($$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(aes $$0) {
      zm.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(adk $$0) {
      zm.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      ado $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         edn $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zm.a($$0, this, this.a);

      for (acn.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (acn.a $$2 : $$0.b()) {
         this.s.a(new dje($$2.b().h, $$2.b().i));
      }

      for (acn.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.aq(); $$6 <= this.s.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adj $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(edn $$0, int $$1, int $$2) {
      exf $$3 = this.s.h().q();
      edo[] $$4 = $$0.d();
      dje $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         edo $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(jz.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.aq(), $$2 - 1, $$1 + 1, this.s.ar(), $$2 + 1);
   }

   @Override
   public void a(ade $$0) {
      zm.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(ade $$0) {
      dje $$1 = $$0.b();
      this.s.a(() -> {
         exf $$1x = this.s.B_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jz $$3 = jz.a($$1, $$2);
            $$1x.a(dki.b, $$3, null);
            $$1x.a(dki.a, $$3, null);
         }

         for (int $$4 = this.s.aq(); $$4 <= this.s.ar(); $$4++) {
            $$1x.a(jz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acg $$0) {
      zm.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aga $$0) {
      zm.a($$0, this, this.a);
      this.a.aZ().d();
      this.H();
      fuo.b $$1 = this.a.m.d().k();
      this.a.c(new gda(p, this.b));
      this.b.a(abn.d, new gmb(this.a, this.b, new gmi(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahh.a);
      this.b.a(abn.b);
   }

   @Override
   public void a(agf $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      bxw $$2 = (bxw)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bxj) {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awr.jf, aws.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awr.oj, aws.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gpg(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof coe $$3) {
            daa $$4 = $$3.f();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bwv.d.b);
            }
         } else if (!($$1 instanceof bxj)) {
            this.s.a($$0.b(), bwv.d.b);
         }
      }
   }

   @Override
   public void a(agc $$0) {
      zm.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aea $$0) {
      zm.a($$0, this, this.a);
      Optional<xv> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gmp $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.f(), $$0.j());
         } else {
            xt $$4 = $$3.b();
            xx $$5;
            if ($$4 != null) {
               $$5 = new xx($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xx.a($$2);
            }

            xs $$7 = new xs($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aZ().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aZ().a($$2, $$0.f(), $$0.j());
            }
         }
      }
   }

   @Override
   public void a(ada $$0) {
      zm.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zm.a($$0, this, this.a);
      Optional<xo> $$1 = $$0.b().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.N.a($$1.get());
         if (!this.a.aZ().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(aca $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bxw $$2 = (bxw)$$1;
            $$2.a(bus.a);
         } else if ($$0.e() == 3) {
            bxw $$3 = (bxw)$$1;
            $$3.a(bus.b);
         } else if ($$0.e() == 2) {
            crz $$4 = (crz)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lz.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lz.r);
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(afv $$0) {
      zm.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(aff $$0) {
      zm.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afp $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bN();

         for (int $$3 : $$0.b()) {
            bwv $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cuk) {
                        this.a.t.N = $$1.dL();
                        this.a.t.w($$1.dL());
                        this.a.t.r($$1.dL());
                     }

                     xc $$5 = xc.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afi $$0) {
      zm.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bxu $$2) {
         $$2.e_($$0.e());
      }
   }

   private static daa a(crz $$0) {
      for (bus $$1 : bus.values()) {
         daa $$2 = $$0.b($$1);
         if ($$2.c(kl.H)) {
            return $$2;
         }
      }

      return new daa(dae.wE);
   }

   @Override
   public void a(adb $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hoz)(new hor((cox)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lz.an, 30);
               this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awr.AD, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((crz)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hoz)(new hov((cml)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acx $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afm $$0) {
      zm.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gu().a($$0.e());
      this.a.t.gu().b($$0.f());
   }

   @Override
   public void a(afl $$0) {
      zm.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeq $$0) {
      zm.a($$0, this, this.a);
      ago $$1 = $$0.b();
      alj<djz> $$2 = $$1.b();
      jg<efd> $$3 = $$1.a();
      grb $$4 = this.a.t;
      alj<djz> $$5 = $$4.dV().aj();
      boolean $$6 = $$2 != $$5;
      gad.a $$7 = this.a($$4.eH(), $$2, $$5);
      if ($$6) {
         Map<ezj, ezl> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gmd.a $$12 = new gmd.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gmd(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gm()) {
         $$4.p();
      }

      grb $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m(), $$4.cc(), $$4.ci());
      } else {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ao());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akr.c<?>> $$15 = $$4.ar().c();
         if ($$15 != null) {
            $$13.ar().a($$15);
         }

         $$13.i($$4.dy());
         $$13.w($$4.dL());
         $$13.x($$4.dN());
      } else {
         $$13.z();
         $$13.w(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.fa().a($$4.fa());
      } else {
         $$13.fa().b($$4.fa());
      }

      this.s.d($$13);
      $$13.k = new gra(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gA());
      $$13.b($$4.n());
      $$13.a($$1.h());
      $$13.f($$1.i());
      $$13.cw = $$4.cw;
      $$13.cx = $$4.cx;
      if (this.a.z instanceof fzj || this.a.z instanceof fzj.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private gad.a a(boolean $$0, alj<djz> $$1, alj<djz> $$2) {
      gad.a $$3 = gad.a.c;
      if (!$$0) {
         if ($$1 == djz.j || $$2 == djz.j) {
            $$3 = gad.a.a;
         } else if ($$1 == djz.k || $$2 == djz.k) {
            $$3 = gad.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(add $$0) {
      zm.a($$0, this, this.a);
      ffs $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), aws.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(adg $$0) {
      zm.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof clv $$2) {
         grb $$3 = this.a.t;
         int $$4 = $$0.e();
         bva $$5 = new bva(clv.v($$4));
         cwu $$6 = new cwu($$0.b(), $$3.gj(), $$5, $$2, $$4);
         $$3.bR = $$6;
         this.a.a(new gbu($$6, $$3.gj(), $$2, $$4));
      }
   }

   @Override
   public void a(adw $$0) {
      zm.a($$0, this, this.a);
      fzw.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(acu $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      daa $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof gbk $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cwv.e($$3) && !$$2.f()) {
            daa $$7 = $$1.bQ.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bQ.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bR.l && ($$0.b() != 0 || !$$5)) {
         $$1.bR.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof gbk) {
         $$1.bQ.a($$3, $$2);
         $$1.bQ.d();
      }
   }

   @Override
   public void a(afe $$0) {
      zm.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof gbk)) {
         this.a.t.bR.b($$0.b());
      }
   }

   @Override
   public void a(afq $$0) {
      zm.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acs $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bQ.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bR.l) {
         $$1.bR.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adx $$0) {
      zm.a($$0, this, this.a);
      iw $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dzs $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(ace $$0) {
      zm.a($$0, this, this.a);
      iw $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         $$1x.c($$0.f(), this.G);
         if ($$1x instanceof dyp && this.a.z instanceof gbf) {
            ((gbf)this.a.z).G();
         }
      });
   }

   @Override
   public void a(act $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      if ($$1.bR != null && $$1.bR.l == $$0.b()) {
         $$1.bR.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afk $$0) {
      zm.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bxw $$2) {
         $$0.e().forEach($$1 -> $$2.a((bxf)$$1.getFirst(), (daa)$$1.getSecond()));
      }
   }

   @Override
   public void a(acr $$0) {
      zm.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(acf $$0) {
      zm.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acd $$0) {
      zm.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adf $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      adf.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azq.d($$3 + 0.5F);
      if ($$2 == adf.b) {
         $$1.a(xc.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adf.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == adf.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == adf.e) {
         this.a.r.a(djw.a($$4));
      } else if ($$2 == adf.f) {
         this.a.a(new gai(true, () -> {
            this.a.t.j.b(new ahe(ahe.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adf.g) {
         frj $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fzk());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xc.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xc.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xc.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xc.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adf.h) {
         this.s.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awr.aF, aws.h, 0.18F, 0.45F);
      } else if ($$2 == adf.i) {
         this.s.e($$3);
      } else if ($$2 == adf.j) {
         this.s.c($$3);
      } else if ($$2 == adf.k) {
         this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awr.vJ, aws.g, 1.0F, 1.0F);
      } else if ($$2 == adf.l) {
         this.s.a(lz.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awr.io, aws.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adf.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adf.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adf.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(grb $$0, gmd $$1, gad.a $$2) {
      this.U = new gmm($$0, $$1, this.a.f);
      this.a.a(new gad(this.U::b, $$2));
   }

   @Override
   public void a(adq $$0) {
      zm.a($$0, this, this.a);
      ezj $$1 = $$0.b();
      ezl $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = ezl.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adl $$0) {
      zm.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agk $$0) {
      zm.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aet $$0) {
      zm.a($$0, this, this.a);
      alk $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         aj $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(acq $$0) {
      zm.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(eg.a(this.G, this.H)));
   }

   @Override
   public void a(agb $$0) {
      zm.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acp $$0) {
      zm.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agn $$0) {
      zm.a($$0, this, this.a);
      this.D = new gmf($$0.b(), $$0.e());
   }

   @Override
   public void a(aeg $$0) {
      zm.a($$0, this, this.a);
      ffs $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(age $$0) {
      zm.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(acb $$0) {
      zm.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<awy<?>> $$1 = (Entry<awy<?>>)$$4.next();
         awy<?> $$2 = (awy<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof gaj $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aek $$0) {
      zm.a($$0, this, this.a);
      fqq $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (aek.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fwv.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(ael $$0) {
      zm.a($$0, this, this.a);
      fqq $$1 = this.a.t.m();

      for (dfz $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aem $$0) {
      zm.a($$0, this, this.a);
      fqq $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(fqq $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof gej $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agm $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 instanceof bxw) {
         jg<bvx> $$2 = $$0.e();
         bvz $$3 = new bvz($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bxw)$$1).c($$3, null);
      }
   }

   private <T> jt.a<T> a(alj<? extends jt<? extends T>> $$0, axx.a $$1) {
      jt<T> $$2 = this.G.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aaa $$0) {
      zm.a($$0, this, this.a);
      List<jt.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || jx.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(jt.a::d);
      this.J = dzd.a(this.G, this.H);
      List<daa> $$3 = List.copyOf(cys.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(aeb $$0) {
   }

   @Override
   public void a(aec $$0) {
   }

   @Override
   public void a(aed $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new fzj($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gg();
         }
      }
   }

   @Override
   public void a(ack $$0) {
      zm.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(afb $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adi $$0) {
      zm.a($$0, this, this.a);
      ecy $$1 = this.s.E_();
      $$1.d($$0.b(), $$0.e());
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
   public void a(aew $$0) {
      zm.a($$0, this, this.a);
      this.s.E_().d($$0.e(), $$0.b());
   }

   @Override
   public void a(aex $$0) {
      zm.a($$0, this, this.a);
      this.s.E_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aey $$0) {
      zm.a($$0, this, this.a);
      this.s.E_().a($$0.b());
   }

   @Override
   public void a(afa $$0) {
      zm.a($$0, this, this.a);
      this.s.E_().c($$0.b());
   }

   @Override
   public void a(aez $$0) {
      zm.a($$0, this, this.a);
      this.s.E_().b($$0.b());
   }

   @Override
   public void a(aco $$0) {
      zm.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aeu $$0) {
      zm.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gms::b).ifPresent(this.c::a);
         gmt.b(this.c);
      }
   }

   @Override
   public void a(acw $$0) {
      zm.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aev $$0) {
      zm.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afw $$0) {
      zm.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afu $$0) {
      zm.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zm.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agd $$0) {
      zm.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aeo $$0) {
      zm.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bxw $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(aee $$0) {
      zm.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gmp $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(aef $$0) {
      zm.a($$0, this, this.a);

      for (aef.b $$1 : $$0.f()) {
         gmp $$2 = new gmp(Objects.requireNonNull($$1.b()), this.G());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aef.b $$3 : $$0.e()) {
         gmp $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aef.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aef.a $$0, aef.b $$1, gmp $$2) {
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
               this.v.add($$2);
            } else {
               this.v.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
            break;
         case h:
            $$2.b($$1.g());
            break;
         case g:
            $$2.b($$1.h());
      }
   }

   private void a(aef.b $$0, gmp $$1) {
      GameProfile $$2 = $$1.a();
      baf $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.G());
      } else {
         xt.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xt $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (csd.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.G());
            }
         } else {
            $$1.a(this.G());
         }
      }
   }

   private boolean G() {
      return this.a.aW() && this.V;
   }

   @Override
   public void a(adz $$0) {
      zm.a($$0, this, this.a);
      crz $$1 = this.a.t;
      $$1.gk().b = $$0.e();
      $$1.gk().d = $$0.g();
      $$1.gk().a = $$0.b();
      $$1.gk().c = $$0.f();
      $$1.gk().a($$0.h());
      $$1.gk().b($$0.i());
   }

   @Override
   public void a(afz $$0) {
      zm.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afy $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(ach $$0) {
      zm.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(acv $$0) {
      zm.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gF().a($$0.b());
      } else {
         this.a.t.gF().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adu $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.a.t.df();
      if ($$1 != this.a.t && $$1.dg()) {
         ffs $$2 = $$0.b();
         ffs $$3;
         if ($$1.bQ()) {
            $$3 = $$1.R_().a();
         } else {
            $$3 = $$1.dt();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bQ()) {
               $$1.R_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(aht.a($$1));
      }
   }

   @Override
   public void a(adv $$0) {
      zm.a($$0, this, this.a);
      daa $$1 = this.a.t.b($$0.b());
      gbc.a $$2 = gbc.a.a($$1);
      if ($$2 != null) {
         this.a.a(new gbc($$2));
      }
   }

   @Override
   public void a(aam $$0) {
      if ($$0 instanceof aav $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aau $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof aba $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abb $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abd $$5) {
         ((gww)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aay $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aaw $$7) {
         gvz.a $$8 = new gvz.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aax $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abc $$10) {
         gwu $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aas $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aaj $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aai $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aat $$15) {
         this.a.l.p.a($$15.b(), this.s.ae());
      } else if ($$0 instanceof aaq $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aar) {
         this.a.l.s.a();
      } else if ($$0 instanceof aaz $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aao $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aap $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aal $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aam $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afo $$0) {
      zm.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, fha.c, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fgp $$2 = this.Y.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.Y.j($$2);
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
      zm.a($$0, this, this.a);
      String $$1 = $$0.e();
      fgw $$2 = fgw.c($$0.b());
      fgp $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fgv $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aep $$0) {
      zm.a($$0, this, this.a);
      String $$1 = $$0.e();
      fgw $$2 = fgw.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fgp $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afg $$0) {
      zm.a($$0, this, this.a);
      String $$1 = $$0.e();
      fgp $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(afr $$0) {
      zm.a($$0, this, this.a);
      afr.a $$1 = $$0.e();
      fgs $$2;
      if ($$1 == afr.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afr.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         $$2.a($$1x.d());
         $$2.a($$1x.e());
         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afr.a $$5 = $$0.b();
      if ($$5 == afr.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == afr.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == afr.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(adm $$0) {
      zm.a($$0, this, this.a);
      if ($$0.m() == 0) {
         double $$1 = (double)($$0.l() * $$0.i());
         double $$2 = (double)($$0.l() * $$0.j());
         double $$3 = (double)($$0.l() * $$0.k());

         try {
            this.s.a($$0.n(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            l.warn("Could not spawn particle effect {}", $$0.n());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.m(); $$5++) {
            double $$6 = this.B.k() * (double)$$0.i();
            double $$7 = this.B.k() * (double)$$0.j();
            double $$8 = this.B.k() * (double)$$0.k();
            double $$9 = this.B.k() * (double)$$0.l();
            double $$10 = this.B.k() * (double)$$0.l();
            double $$11 = this.B.k() * (double)$$0.l();

            try {
               this.s.a($$0.n(), $$0.b(), $$0.e(), $$0.f() + $$6, $$0.g() + $$7, $$0.h() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               l.warn("Could not spawn particle effect {}", $$0.n());
               return;
            }
         }
      }
   }

   @Override
   public void a(agl $$0) {
      zm.a($$0, this, this.a);
      bwv $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bxw)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            byz $$2 = ((bxw)$$1).fa();

            for (agl.a $$3 : $$0.e()) {
               byy $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bza $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ady $$0) {
      zm.a($$0, this, this.a);
      cvs $$1 = this.a.t.bR;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gej $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adn $$0) {
      zm.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      ado $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, ado $$2, boolean $$3) {
      exf $$4 = this.s.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dki.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dki.b, $$8, $$9, $$10, $$3);
      $$4.a(new dje($$0, $$1), true);
   }

   @Override
   public void a(adr $$0) {
      zm.a($$0, this, this.a);
      cvs $$1 = this.a.t.bR;
      if ($$0.b() == $$1.l && $$1 instanceof cxd $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afd $$0) {
      zm.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(aft $$0) {
      zm.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(afc $$0) {
      zm.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      zm.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acj $$0) {
      zm.a($$0, this, this.a);

      for (zj<? super aby> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aej $$0) {
      zm.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof csi $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(acm $$0) {
      this.R.a();
   }

   @Override
   public void a(acl $$0) {
      this.R.a($$0.b());
      this.b(new ahd(this.R.b()));
   }

   @Override
   public void a(acy $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aka $$0) {
      this.S.a($$0);
   }

   @Override
   public void a(agh $$0) {
      zm.a($$0, this, this.a);
      if (this.a.z instanceof gcl $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   private void a(int $$0, int $$1, exf $$2, dki $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, jz.a($$0, $$9, $$1), $$10 ? new edi((byte[])$$6.next().clone()) : new edi());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vv k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gmp> l() {
      return this.v;
   }

   public Collection<gmp> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gmp a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gmp a(String $$0) {
      for (gmp $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public gly p() {
      return this.w;
   }

   public CommandDispatcher<ep> q() {
      return this.C;
   }

   public gmd r() {
      return this.s;
   }

   public fqu s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<alj<djz>> u() {
      return this.F;
   }

   public ju.b v() {
      return this.G;
   }

   public void a(xo $$0, boolean $$1) {
      if (this.N.a($$0, $$1) && this.N.c() > 64) {
         this.H();
      }
   }

   private void H() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new agy($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayn.c.a();
      xk.a $$3 = this.N.b();
      xo $$4 = this.M.pack(new xv($$0, $$1, $$2, $$3.a()));
      this.b(new ahb($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xu<ep> $$1 = xu.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agz($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayn.c.a();
         xk.a $$4 = this.N.b();
         er $$5 = er.a($$1, $$3x -> {
            xv $$4x = new xv($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new aha($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xu.a(this.e($$0))) {
         this.b(new agz($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ep> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(are $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new aad($$0));
         this.Q = $$0;
      }
   }

   @Override
   public void d() {
      if (this.L != null && this.a.w().b()) {
         this.w();
      }

      if (this.P != null && this.P.isDone()) {
         this.P.join().ifPresent(this::a);
         this.P = null;
      }

      this.e();
      if (this.a.aQ().f()) {
         this.S.a();
      }

      this.T.a();
      this.e.a();
      if (this.U != null) {
         this.U.a();
         if (this.U.b() && !this.a.t.gJ()) {
            this.b.a(new aic());
            this.a.t.v(true);
         }
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(csc $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xn.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new ahc(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gms x() {
      return this.c;
   }

   public cvj y() {
      return this.H;
   }

   public boolean a(cvj $$0) {
      return $$0.a(this.y());
   }

   public fgx z() {
      return this.Y;
   }

   public dbv A() {
      return this.I;
   }

   public dzd B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public gmv D() {
      return this.Z;
   }

   public amc E() {
      return this.j;
   }

   public void a(glw<?, ?> $$0) {
      this.aa.add(new WeakReference<>($$0));
   }
}
