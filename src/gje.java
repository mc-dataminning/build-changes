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

public class gje extends gja implements abs, wk {
   private static final Logger l = LogUtils.getLogger();
   private static final ww m = ww.c("multiplayer.unsecureserver.toast.title");
   private static final ww n = ww.c("multiplayer.unsecureserver.toast");
   private static final ww o = ww.c("multiplayer.disconnect.invalid_packet");
   private static final ww p = ww.c("connect.reconfiguring");
   private static final int q = 64;
   public static final int k = 64;
   private final GameProfile r;
   private gjd s;
   private gjd.a t;
   private final Map<UUID, gjp> u = Maps.newHashMap();
   private final Set<gjp> v = new ReferenceOpenHashSet();
   private final giy w;
   private final gjh x;
   private final fnu y = new fnu(this);
   private int z = 3;
   private int A = 3;
   private final azt B = azt.b();
   private CommandDispatcher<en> C = new CommandDispatcher();
   private gjf D = new gjf(Map.of(), ddw.b.a());
   private final UUID E = UUID.randomUUID();
   private Set<ald<dip>> F;
   private final js.b G;
   private final cub H;
   private final dan I;
   private dxm J;
   private OptionalInt K = OptionalInt.empty();
   @Nullable
   private xh L;
   private xq.c M = xq.c.a;
   private xe N = new xe(20);
   private xj O = xj.a();
   @Nullable
   private CompletableFuture<Optional<cqu>> P;
   @Nullable
   private aqy Q;
   private final gix R = new gix();
   private final gjo S;
   private final gjj T;
   @Nullable
   private gjm U;
   private boolean V;
   private boolean W = false;
   private volatile boolean X;
   private final ffb Y = new ffb();
   private final gjv Z = new gjv();
   private final List<WeakReference<giw<?, ?>>> aa = new ArrayList<>();

   public gje(fof $$0, vp $$1, gji $$2) {
      super($$0, $$1, $$2);
      this.r = $$2.a();
      this.G = $$2.c();
      this.H = $$2.d();
      this.w = new giy($$0, this.e);
      this.x = new gjh(this, $$0);
      this.S = new gjo(this, $$0.aQ().m());
      this.T = new gjj(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.I = dan.a(this.H);
      this.J = dxm.a($$2.c(), this.H);
   }

   public gjh g() {
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
      for (WeakReference<giw<?, ?>> $$0 : this.aa) {
         giw<?, ?> $$1 = $$0.get();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.aa.clear();
   }

   public ddk j() {
      return this.D;
   }

   @Override
   public void a(adj $$0) {
      zg.a($$0, this, this.a);
      this.a.r = new gjn(this.a, this);
      agi $$1 = $$0.m();
      List<ald<dip>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.F = Sets.newLinkedHashSet($$2);
      ald<dip> $$3 = $$1.b();
      je<edl> $$4 = $$1.a();
      this.z = $$0.h();
      this.A = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      gjd.a $$8 = new gjd.a(btv.c, $$0.e(), $$6);
      this.t = $$8;
      this.s = new gjd(this, $$8, $$3, $$4, this.z, this.A, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.s, fxg.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.s, new aww(), new fnq());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.z();
      this.a.t.e($$0.b());
      this.s.d(this.a.t);
      this.a.t.k = new gnz(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.s, fxg.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.c($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.L = null;
      this.N = new xe(20);
      this.O = xj.a();
      if (this.b.h()) {
         this.w();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.V = $$0.n();
      if (this.c != null && !this.W && !this.G()) {
         ftz $$9 = ftz.a(this.a, ftz.a.k, m, n);
         this.a.aA().a($$9);
         this.W = true;
      }
   }

   @Override
   public void a(abt $$0) {
      zg.a($$0, this, this.a);
      if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
         this.K = OptionalInt.empty();
      }

      bwa $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.s.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bwa b(abt $$0) {
      bwj<?> $$1 = $$0.f();
      if ($$1 == bwj.bS) {
         gjp $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gob(this.s, $$2.a());
         }
      } else {
         return $$1.a(this.s, bwi.r);
      }
   }

   private void a(bwa $$0) {
      if ($$0 instanceof cte $$1) {
         this.a.ak().a((hlw)(new hlp($$1)));
      } else if ($$0 instanceof cip $$2) {
         boolean $$3 = $$2.W_();
         hlj $$4;
         if ($$3) {
            $$4 = new hlh($$2);
         } else {
            $$4 = new hli($$2);
         }

         this.a.ak().a((hlx)$$4);
      }
   }

   @Override
   public void a(afd $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.l($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afb $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(acw $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         fdw $$2 = $$0.e().a();
         $$1.ap().e($$2);
         if (!$$1.dg()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.dt().g($$2) > 4096.0;
            if (this.s.a($$1) && !$$5) {
               $$1.d($$2, $$3, $$4);
            } else {
               $$1.b($$2, $$3, $$4);
            }

            if ($$1.bR() && $$1.A(this.a.t)) {
               $$1.j(this.a.t);
               this.a.t.by();
            }

            $$1.d($$0.f());
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 == null) {
         if (this.K.isPresent() && this.K.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ahm.b(this.a.t.dA(), this.a.t.dC(), this.a.t.dG(), this.a.t.dL(), this.a.t.dN(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(bxn.a) || $$0.f().contains(bxn.b) || $$0.f().contains(bxn.c);
         boolean $$3 = this.s.a($$1) || !$$1.dg() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.by();
            if ($$1.dg()) {
               this.b.a(ahn.a($$1));
            }
         }
      }
   }

   @Override
   public void a(agc $$0) {
      zg.a($$0, this, this.a);
      if (this.a.s != null) {
         buh $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agd $$0) {
      zg.a($$0, this, this.a);
      if (this.a.s != null) {
         buh $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afh $$0) {
      zg.a($$0, this, this.a);
      if (cqr.d($$0.b())) {
         this.a.t.gi().j = $$0.b();
      }
   }

   @Override
   public void a(adm $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = $$0.a(this.s);
      if ($$1 != null) {
         if ($$1.dg()) {
            air $$2 = $$1.ap();
            fdw $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               air $$4 = $$1.ap();
               fdw $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(adn $$0) {
      zg.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof cte $$2) {
         if ($$2.f() instanceof ctt $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(ael $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = $$0.a(this.s);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aeh $$0) {
      zg.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bwa $$1 = this.s.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.aq(), $$0x);
               this.K = OptionalInt.of($$0x);
            }

            this.s.a($$0x, bwa.e.b);
         }
      });
   }

   @Override
   public void a(aeb $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      if (!$$1.bZ()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new agp($$0.b()));
      this.b.a(new ahm.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   private static boolean a(bxm $$0, Set<bxn> $$1, bwa $$2, boolean $$3) {
      bxm $$4 = bxm.a($$2);
      bxm $$5 = bxm.a($$4, $$0, $$1);
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
         bxm $$7 = new bxm($$2.bB(), fdw.c, $$2.N, $$2.O);
         bxm $$8 = bxm.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aec $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bA();
      this.b.a(new ahm.c($$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(aem $$0) {
      zg.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.s.b($$0x, $$1, 19));
   }

   @Override
   public void a(ade $$0) {
      zg.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adi $$3 = $$0.g();
      this.s.a(() -> {
         this.a($$1, $$2, $$3, false);
         ebv $$3x = this.s.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(ach $$0) {
      zg.a($$0, this, this.a);

      for (ach.a $$1 : $$0.b()) {
         this.s.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (ach.a $$2 : $$0.b()) {
         this.s.a(new dhw($$2.b().h, $$2.b().i));
      }

      for (ach.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.s.aq(); $$6 <= this.s.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, add $$2) {
      this.s.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(ebv $$0, int $$1, int $$2) {
      evk $$3 = this.s.h().q();
      ebw[] $$4 = $$0.d();
      dhw $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         ebw $$7 = $$4[$$6];
         int $$8 = this.s.h($$6);
         $$3.a(jx.a($$5, $$8), $$7.c());
      }

      this.s.b($$1 - 1, this.s.aq(), $$2 - 1, $$1 + 1, this.s.ar(), $$2 + 1);
   }

   @Override
   public void a(acy $$0) {
      zg.a($$0, this, this.a);
      this.s.h().a($$0.b());
      this.b($$0);
   }

   private void b(acy $$0) {
      dhw $$1 = $$0.b();
      this.s.a(() -> {
         evk $$1x = this.s.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jx $$3 = jx.a($$1, $$2);
            $$1x.a(diy.b, $$3, null);
            $$1x.a(diy.a, $$3, null);
         }

         for (int $$4 = this.s.aq(); $$4 <= this.s.ar(); $$4++) {
            $$1x.a(jx.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aca $$0) {
      zg.a($$0, this, this.a);
      this.s.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afu $$0) {
      zg.a($$0, this, this.a);
      this.a.aZ().d();
      this.H();
      frr.b $$1 = this.a.m.d().k();
      this.a.c(new gad(p, this.b));
      this.b.a(abh.d, new gjb(this.a, this.b, new gji(this.r, this.e, this.G, this.H, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(ahb.a);
      this.b.a(abh.b);
   }

   @Override
   public void a(afz $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      bwz $$2 = (bwz)this.s.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bwo) {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awl.jc, awm.h, 0.1F, (this.B.i() - this.B.i()) * 0.35F + 0.9F, false);
         } else {
            this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awl.of, awm.h, 0.2F, (this.B.i() - this.B.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gmf(this.a.aq(), this.s, $$1, $$2));
         if ($$1 instanceof cmx $$3) {
            cys $$4 = $$3.f();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.s.a($$0.b(), bwa.e.b);
            }
         } else if (!($$1 instanceof bwo)) {
            this.s.a($$0.b(), bwa.e.b);
         }
      }
   }

   @Override
   public void a(afw $$0) {
      zg.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adu $$0) {
      zg.a($$0, this, this.a);
      Optional<xp> $$1 = $$0.g().a(this.O);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.O.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         gjp $$3 = this.a($$2);
         if ($$3 == null) {
            l.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            xn $$4 = $$3.b();
            xr $$5;
            if ($$4 != null) {
               $$5 = new xr($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xr.a($$2);
            }

            xm $$7 = new xm($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(acu $$0) {
      zg.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(act $$0) {
      zg.a($$0, this, this.a);
      Optional<xi> $$1 = $$0.b().a(this.O);
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
   public void a(abu $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bwz $$2 = (bwz)$$1;
            $$2.a(btx.a);
         } else if ($$0.e() == 3) {
            bwz $$3 = (bwz)$$1;
            $$3.a(btx.b);
         } else if ($$0.e() == 2) {
            cqs $$4 = (cqs)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lx.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lx.r);
         }
      }
   }

   @Override
   public void a(adb $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(afp $$0) {
      zg.a($$0, this, this.a);
      this.s.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(aez $$0) {
      zg.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afj $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bO();

         for (int $$3 : $$0.b()) {
            bwa $$4 = this.s.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.K = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof ctc) {
                        this.a.t.N = $$1.dL();
                        this.a.t.w($$1.dL());
                        this.a.t.r($$1.dL());
                     }

                     ww $$5 = ww.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afc $$0) {
      zg.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwx $$2) {
         $$2.e_($$0.e());
      }
   }

   private static cys a(cqs $$0) {
      for (btx $$1 : btx.values()) {
         cys $$2 = $$0.b($$1);
         if ($$2.c(kj.H)) {
            return $$2;
         }
      }

      return new cys(cyw.wx);
   }

   @Override
   public void a(acv $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = $$0.a(this.s);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hlw)(new hlo((cnp)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lx.an, 30);
               this.s.a($$1.dA(), $$1.dC(), $$1.dG(), awl.Ax, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cqs)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hlw)(new hls((clk)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acr $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.s));
      }
   }

   @Override
   public void a(afg $$0) {
      zg.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gt().a($$0.e());
      this.a.t.gt().b($$0.f());
   }

   @Override
   public void a(aff $$0) {
      zg.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aek $$0) {
      zg.a($$0, this, this.a);
      agi $$1 = $$0.b();
      ald<dip> $$2 = $$1.b();
      je<edl> $$3 = $$1.a();
      goa $$4 = this.a.t;
      ald<dip> $$5 = $$4.dV().aj();
      boolean $$6 = $$2 != $$5;
      fxg.a $$7 = this.a($$4.eG(), $$2, $$5);
      if ($$6) {
         Map<exn, exp> $$8 = this.s.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         gjd.a $$12 = new gjd.a(this.t.q(), this.t.l(), $$10);
         this.t = $$12;
         this.s = new gjd(this, $$12, $$2, $$3, this.z, this.A, this.a.f, $$9, $$1.c(), $$11);
         this.s.a($$8);
         this.a.a(this.s, $$7);
      }

      this.a.u = null;
      if ($$4.gl()) {
         $$4.p();
      }

      goa $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m(), $$4.cd(), $$4.cj());
      } else {
         $$13 = this.a.r.a(this.s, $$4.l(), $$4.m());
      }

      this.a($$13, this.s, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<akl.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.i($$4.dy());
         $$13.w($$4.dL());
         $$13.x($$4.dN());
      } else {
         $$13.z();
         $$13.w(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.eZ().a($$4.eZ());
      } else {
         $$13.eZ().b($$4.eZ());
      }

      this.s.d($$13);
      $$13.k = new gnz(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gz());
      $$13.b($$4.n());
      $$13.c($$1.h());
      $$13.f($$1.i());
      $$13.cv = $$4.cv;
      $$13.cw = $$4.cw;
      if (this.a.z instanceof fwm || this.a.z instanceof fwm.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fxg.a a(boolean $$0, ald<dip> $$1, ald<dip> $$2) {
      fxg.a $$3 = fxg.a.c;
      if (!$$0) {
         if ($$1 == dip.j || $$2 == dip.j) {
            $$3 = fxg.a.a;
         } else if ($$1 == dip.k || $$2 == dip.k) {
            $$3 = fxg.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acx $$0) {
      zg.a($$0, this, this.a);
      fdw $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awm.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(ada $$0) {
      zg.a($$0, this, this.a);
      if (this.s.a($$0.f()) instanceof ckx $$2) {
         goa $$3 = this.a.t;
         int $$4 = $$0.e();
         buf $$5 = new buf(ckx.v($$4));
         cvm $$6 = new cvm($$0.b(), $$3.gi(), $$5, $$2, $$4);
         $$3.bQ = $$6;
         this.a.a(new fyx($$6, $$3.gi(), $$2, $$4));
      }
   }

   @Override
   public void a(adq $$0) {
      zg.a($$0, this, this.a);
      fwz.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(aco $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      cys $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof fyn $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cvn.e($$3) && !$$2.f()) {
            cys $$7 = $$1.bP.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bP.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bQ.l && ($$0.b() != 0 || !$$5)) {
         $$1.bQ.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof fyn) {
         $$1.bP.a($$3, $$2);
         $$1.bP.d();
      }
   }

   @Override
   public void a(aey $$0) {
      zg.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof fyn)) {
         this.a.t.bQ.b($$0.b());
      }
   }

   @Override
   public void a(afk $$0) {
      zg.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gi().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bP.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bQ.l) {
         $$1.bQ.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adr $$0) {
      zg.a($$0, this, this.a);
      iu $$1 = $$0.b();
      if (this.s.c_($$1) instanceof dyb $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.s.c_($$1), $$1);
      }
   }

   @Override
   public void a(aby $$0) {
      zg.a($$0, this, this.a);
      iu $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         $$1x.c($$0.f(), this.G);
         if ($$1x instanceof dwy && this.a.z instanceof fyi) {
            ((fyi)this.a.z).G();
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      if ($$1.bQ != null && $$1.bQ.l == $$0.b()) {
         $$1.bQ.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afe $$0) {
      zg.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof bwz $$2) {
         $$0.e().forEach($$1 -> $$2.a((bwk)$$1.getFirst(), (cys)$$1.getSecond()));
      }
   }

   @Override
   public void a(acl $$0) {
      zg.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(abz $$0) {
      zg.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abx $$0) {
      zg.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acz $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      acz.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azk.d($$3 + 0.5F);
      if ($$2 == acz.b) {
         $$1.a(ww.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acz.c) {
         this.s.k().b(true);
         this.s.e(0.0F);
      } else if ($$2 == acz.d) {
         this.s.k().b(false);
         this.s.e(1.0F);
      } else if ($$2 == acz.e) {
         this.a.r.a(dim.a($$4));
      } else if ($$2 == acz.f) {
         this.a.a(new fxl(true, () -> {
            this.a.t.j.b(new agy(agy.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == acz.g) {
         foj $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fwn());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(ww.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(ww.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(ww.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(ww.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == acz.h) {
         this.s.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awl.aF, awm.h, 0.18F, 0.45F);
      } else if ($$2 == acz.i) {
         this.s.e($$3);
      } else if ($$2 == acz.j) {
         this.s.c($$3);
      } else if ($$2 == acz.k) {
         this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awl.vF, awm.g, 1.0F, 1.0F);
      } else if ($$2 == acz.l) {
         this.s.a(lx.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.s.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awl.il, awm.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acz.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == acz.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == acz.o && this.U != null) {
         this.U.c();
      }
   }

   private void a(goa $$0, gjd $$1, fxg.a $$2) {
      this.U = new gjm($$0, $$1, this.a.f);
      this.a.a(new fxg(this.U::b, $$2));
   }

   @Override
   public void a(adk $$0) {
      zg.a($$0, this, this.a);
      exn $$1 = $$0.b();
      exp $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = exp.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.b($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(adf $$0) {
      zg.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(age $$0) {
      zg.a($$0, this, this.a);
      this.w.a($$0);
   }

   @Override
   public void a(aen $$0) {
      zg.a($$0, this, this.a);
      ale $$1 = $$0.b();
      if ($$1 == null) {
         this.w.a(null, false);
      } else {
         ai $$2 = this.w.a($$1);
         this.w.a($$2, false);
      }
   }

   @Override
   public void a(ack $$0) {
      zg.a($$0, this, this.a);
      this.C = new CommandDispatcher($$0.a(ee.a(this.G, this.H)));
   }

   @Override
   public void a(afv $$0) {
      zg.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acj $$0) {
      zg.a($$0, this, this.a);
      this.x.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agh $$0) {
      zg.a($$0, this, this.a);
      this.D = new gjf($$0.b(), $$0.e());
   }

   @Override
   public void a(aea $$0) {
      zg.a($$0, this, this.a);
      fdw $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afy $$0) {
      zg.a($$0, this, this.a);
      if (!this.y.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abv $$0) {
      zg.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<aws<?>> $$1 = (Entry<aws<?>>)$$4.next();
         aws<?> $$2 = (aws<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fxm $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aee $$0) {
      zg.a($$0, this, this.a);
      fnq $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (aee.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fty.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aef $$0) {
      zg.a($$0, this, this.a);
      fnq $$1 = this.a.t.m();

      for (der $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aeg $$0) {
      zg.a($$0, this, this.a);
      fnq $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(fnq $$0) {
      $$0.c();
      this.Z.a($$0, this.s);
      if (this.a.z instanceof gbm $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agg $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 instanceof bwz) {
         je<bvc> $$2 = $$0.e();
         bve $$3 = new bve($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.l();
         }

         ((bwz)$$1).c($$3, null);
      }
   }

   private <T> jr.a<T> a(ald<? extends jr<? extends T>> $$0, axr.a $$1) {
      jr<T> $$2 = this.G.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(zu $$0) {
      zg.a($$0, this, this.a);
      List<jr.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || jv.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(jr.a::d);
      this.J = dxm.a(this.G, this.H);
      List<cys> $$3 = List.copyOf(cxk.e().l());
      this.Z.a($$3);
   }

   @Override
   public void a(adv $$0) {
   }

   @Override
   public void a(adw $$0) {
   }

   @Override
   public void a(adx $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new fwm($$0.e(), this.s.k().l()));
         } else {
            this.a.t.gf();
         }
      }
   }

   @Override
   public void a(ace $$0) {
      zg.a($$0, this, this.a);
      this.t.a($$0.e());
      this.t.a($$0.b());
   }

   @Override
   public void a(aev $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = $$0.a(this.s);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adc $$0) {
      zg.a($$0, this, this.a);
      ebg $$1 = this.s.A_();
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
      zg.a($$0, this, this.a);
      this.s.A_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aer $$0) {
      zg.a($$0, this, this.a);
      this.s.A_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aes $$0) {
      zg.a($$0, this, this.a);
      this.s.A_().a($$0.b());
   }

   @Override
   public void a(aeu $$0) {
      zg.a($$0, this, this.a);
      this.s.A_().c($$0.b());
   }

   @Override
   public void a(aet $$0) {
      zg.a($$0, this, this.a);
      this.s.A_().b($$0.b());
   }

   @Override
   public void a(aci $$0) {
      zg.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(aeo $$0) {
      zg.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gjs::b).ifPresent(this.c::a);
         gjt.b(this.c);
      }
   }

   @Override
   public void a(acq $$0) {
      zg.a($$0, this, this.a);
      this.x.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aep $$0) {
      zg.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(afq $$0) {
      zg.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(afo $$0) {
      zg.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(afr $$0) {
      zg.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afx $$0) {
      zg.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aei $$0) {
      zg.a($$0, this, this.a);
      if ($$0.a(this.s) instanceof bwz $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ady $$0) {
      zg.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gjp $$2 = this.u.remove($$1);
         if ($$2 != null) {
            this.v.remove($$2);
         }
      }
   }

   @Override
   public void a(adz $$0) {
      zg.a($$0, this, this.a);

      for (adz.b $$1 : $$0.f()) {
         gjp $$2 = new gjp(Objects.requireNonNull($$1.b()), this.G());
         if (this.u.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (adz.b $$3 : $$0.e()) {
         gjp $$4 = this.u.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adz.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adz.a $$0, adz.b $$1, gjp $$2) {
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

   private void a(adz.b $$0, gjp $$1) {
      GameProfile $$2 = $$1.a();
      azz $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.G());
      } else {
         xn.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xn $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cqv.b var7) {
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
   public void a(adt $$0) {
      zg.a($$0, this, this.a);
      cqs $$1 = this.a.t;
      $$1.gj().b = $$0.e();
      $$1.gj().d = $$0.g();
      $$1.gj().a = $$0.b();
      $$1.gj().c = $$0.f();
      $$1.gj().a($$0.h());
      $$1.gj().b($$0.i());
   }

   @Override
   public void a(aft $$0) {
      zg.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afs $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acb $$0) {
      zg.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(acp $$0) {
      zg.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gE().a($$0.b());
      } else {
         this.a.t.gE().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ado $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.a.t.df();
      if ($$1 != this.a.t && $$1.dg()) {
         fdw $$2 = $$0.b();
         fdw $$3;
         if ($$1.bR()) {
            $$3 = $$1.N_().a();
         } else {
            $$3 = $$1.dt();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bR()) {
               $$1.N_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(ahn.a($$1));
      }
   }

   @Override
   public void a(adp $$0) {
      zg.a($$0, this, this.a);
      cys $$1 = this.a.t.b($$0.b());
      fyf.a $$2 = fyf.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fyf($$2));
      }
   }

   @Override
   public void a(aag $$0) {
      if ($$0 instanceof aap $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aao $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof aau $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof aav $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof aax $$5) {
         ((gtw)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof aas $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof aaq $$7) {
         gsz.a $$8 = new gsz.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof aar $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof aaw $$10) {
         gtu $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aam $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aad $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aac $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aan $$15) {
         this.a.l.p.a($$15.b(), this.s.ae());
      } else if ($$0 instanceof aak $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof aal) {
         this.a.l.s.a();
      } else if ($$0 instanceof aat $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof aai $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof aaj $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof aaf $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aag $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afi $$0) {
      zg.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Y.a($$1, ffe.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fet $$2 = this.Y.a($$1);
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
   public void a(afm $$0) {
      zg.a($$0, this, this.a);
      String $$1 = $$0.e();
      ffa $$2 = ffa.c($$0.b());
      fet $$3 = this.Y.a($$1);
      if ($$3 != null) {
         fez $$4 = this.Y.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aej $$0) {
      zg.a($$0, this, this.a);
      String $$1 = $$0.e();
      ffa $$2 = ffa.c($$0.b());
      if ($$1 == null) {
         this.Y.b($$2);
      } else {
         fet $$3 = this.Y.a($$1);
         if ($$3 != null) {
            this.Y.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afa $$0) {
      zg.a($$0, this, this.a);
      String $$1 = $$0.e();
      fet $$2 = $$1 == null ? null : this.Y.a($$1);
      this.Y.a($$0.b(), $$2);
   }

   @Override
   public void a(afl $$0) {
      zg.a($$0, this, this.a);
      afl.a $$1 = $$0.e();
      few $$2;
      if ($$1 == afl.a.a) {
         $$2 = this.Y.c($$0.f());
      } else {
         $$2 = this.Y.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afl.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         ffd.b $$2x = ffd.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         ffd.a $$3x = ffd.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afl.a $$5 = $$0.b();
      if ($$5 == afl.a.a) {
         for (String $$6 : $$0.g()) {
            this.Y.a($$6, $$2);
         }
      } else if ($$5 == afl.a.b) {
         for (String $$7 : $$0.g()) {
            this.Y.b($$7, $$2);
         }
      }

      if ($$1 == afl.a.b) {
         this.Y.d($$2);
      }
   }

   @Override
   public void a(adg $$0) {
      zg.a($$0, this, this.a);
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
   public void a(agf $$0) {
      zg.a($$0, this, this.a);
      bwa $$1 = this.s.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bwz)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            byc $$2 = ((bwz)$$1).eZ();

            for (agf.a $$3 : $$0.e()) {
               byb $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (byd $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ads $$0) {
      zg.a($$0, this, this.a);
      cuk $$1 = this.a.t.bQ;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gbm $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zg.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adi $$3 = $$0.f();
      this.s.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adi $$2, boolean $$3) {
      evk $$4 = this.s.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, diy.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, diy.b, $$8, $$9, $$10, $$3);
      $$4.a(new dhw($$0, $$1), true);
   }

   @Override
   public void a(adl $$0) {
      zg.a($$0, this, this.a);
      cuk $$1 = this.a.t.bQ;
      if ($$0.b() == $$1.l && $$1 instanceof cvv $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aex $$0) {
      zg.a($$0, this, this.a);
      this.z = $$0.b();
      this.a.n.b(this.z);
      this.s.h().a($$0.b());
   }

   @Override
   public void a(afn $$0) {
      zg.a($$0, this, this.a);
      this.A = $$0.b();
      this.s.i(this.A);
   }

   @Override
   public void a(aew $$0) {
      zg.a($$0, this, this.a);
      this.s.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abw $$0) {
      zg.a($$0, this, this.a);
      this.s.b($$0.b());
   }

   @Override
   public void a(acd $$0) {
      zg.a($$0, this, this.a);

      for (zd<? super abs> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aed $$0) {
      zg.a($$0, this, this.a);
      if (this.s.a($$0.b()) instanceof cra $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(acg $$0) {
      this.R.a();
   }

   @Override
   public void a(acf $$0) {
      this.R.a($$0.b());
      this.b(new agx(this.R.b()));
   }

   @Override
   public void a(acs $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aju $$0) {
      this.S.a($$0);
   }

   @Override
   public void a(agb $$0) {
      zg.a($$0, this, this.a);
      if (this.a.z instanceof fzo $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   private void a(int $$0, int $$1, evk $$2, diy $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, jx.a($$0, $$9, $$1), $$10 ? new ebq((byte[])$$6.next().clone()) : new ebq());
            if ($$7) {
               this.s.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vp k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.X;
   }

   public Collection<gjp> l() {
      return this.v;
   }

   public Collection<gjp> m() {
      return this.u.values();
   }

   public Collection<UUID> n() {
      return this.u.keySet();
   }

   @Nullable
   public gjp a(UUID $$0) {
      return this.u.get($$0);
   }

   @Nullable
   public gjp a(String $$0) {
      for (gjp $$1 : this.u.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.r;
   }

   public giy p() {
      return this.w;
   }

   public CommandDispatcher<en> q() {
      return this.C;
   }

   public gjd r() {
      return this.s;
   }

   public fnu s() {
      return this.y;
   }

   public UUID t() {
      return this.E;
   }

   public Set<ald<dip>> u() {
      return this.F;
   }

   public js.b v() {
      return this.G;
   }

   public void a(xm $$0, boolean $$1) {
      xi $$2 = $$0.l();
      if ($$2 != null && this.N.a($$2, $$1) && this.N.c() > 64) {
         this.H();
      }
   }

   private void H() {
      int $$0 = this.N.a();
      if ($$0 > 0) {
         this.b(new ags($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayh.c.a();
      xe.a $$3 = this.N.b();
      xi $$4 = this.M.pack(new xp($$0, $$1, $$2, $$3.a()));
      this.b(new agv($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xo<en> $$1 = xo.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agt($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayh.c.a();
         xe.a $$4 = this.N.b();
         ep $$5 = ep.a($$1, $$3x -> {
            xp $$4x = new xp($$3x, $$2, $$3, $$4.a());
            return this.M.pack($$4x);
         });
         this.b(new agu($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xo.a(this.e($$0))) {
         this.b(new agt($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<en> e(String $$0) {
      return this.C.parse($$0, this.x);
   }

   public void a(aqy $$0) {
      if (!$$0.equals(this.Q)) {
         this.b(new zx($$0));
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
         if (this.U.b() && !this.a.t.gI()) {
            this.b.a(new ahw());
            this.a.t.v(true);
         }
      }
   }

   public void w() {
      this.P = this.a.w().a();
   }

   private void a(cqu $$0) {
      if (this.a.b(this.r.getId())) {
         if (this.L == null || !this.L.c().equals($$0)) {
            this.L = xh.a($$0);
            this.M = this.L.a(this.r.getId());
            this.b(new agw(this.L.a().a()));
         }
      }
   }

   @Nullable
   public gjs x() {
      return this.c;
   }

   public cub y() {
      return this.H;
   }

   public boolean a(cub $$0) {
      return $$0.a(this.y());
   }

   public ffb z() {
      return this.Y;
   }

   public dan A() {
      return this.I;
   }

   public dxm B() {
      return this.J;
   }

   public void C() {
      this.Z.a();
   }

   public gjv D() {
      return this.Z;
   }

   public alw E() {
      return this.j;
   }

   public void a(giw<?, ?> $$0) {
      this.aa.add(new WeakReference<>($$0));
   }
}
