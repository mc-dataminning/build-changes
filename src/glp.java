import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
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

public class glp extends gll implements acf, wu {
   private static final Logger l = LogUtils.getLogger();
   private static final xg m = xg.c("multiplayer.unsecureserver.toast.title");
   private static final xg n = xg.c("multiplayer.unsecureserver.toast");
   private static final xg o = xg.c("multiplayer.disconnect.invalid_packet");
   private static final xg p = xg.c("connect.reconfiguring");
   private static final xg q = xg.c("multiplayer.disconnect.bad_chat_index");
   private static final int r = 64;
   public static final int k = 64;
   private final GameProfile s;
   private glo t;
   private glo.a u;
   private final Map<UUID, gma> v = Maps.newHashMap();
   private final Set<gma> w = new ReferenceOpenHashSet();
   private final glj x;
   private final gls y;
   private final fqf z = new fqf(this);
   private int A = 3;
   private int B = 3;
   private final bai C = bai.b();
   private CommandDispatcher<ep> D = new CommandDispatcher();
   private glq E = new glq(Map.of(), dfo.b.a());
   private final UUID F = UUID.randomUUID();
   private Set<alq<dkj>> G;
   private final ju.b H;
   private final cvs I;
   private final dcf J;
   private dzn K;
   private final wa.a L;
   private OptionalInt M = OptionalInt.empty();
   @Nullable
   private xr N;
   private ya.c O = ya.c.a;
   private int P;
   private xo Q = new xo(20);
   private xt R = xt.a();
   @Nullable
   private CompletableFuture<Optional<csl>> S;
   @Nullable
   private arl T;
   private final gli U = new gli();
   private final glz V;
   private final glu W;
   @Nullable
   private glx X;
   private boolean Y;
   private boolean Z = false;
   private volatile boolean aa;
   private final fhh ab = new fhh();
   private final gmg ac = new gmg();
   private final List<WeakReference<glh<?, ?>>> ad = new ArrayList<>();

   public glp(fqq $$0, vv $$1, glt $$2) {
      super($$0, $$1, $$2);
      this.s = $$2.a();
      this.H = $$2.c();
      alp<HashCode> $$3 = this.H.a(azp.c);
      this.L = $$1x -> ((HashCode)$$1x.a($$3).getOrThrow($$1xx -> new IllegalArgumentException("Failed to hash " + $$1x + ": " + $$1xx))).asInt();
      this.I = $$2.d();
      this.x = new glj($$0, this.e);
      this.y = new gls(this, $$0);
      this.V = new glz(this, $$0.aQ().m());
      this.W = new glu(this, $$0.aQ());
      if ($$2.i() != null) {
         $$0.m.d().a($$2.i());
      }

      this.J = dcf.a(this.I);
      this.K = dzn.a($$2.c(), this.I);
   }

   public gls f() {
      return this.y;
   }

   public void g() {
      this.aa = true;
      this.h();
      this.e.c();
   }

   public void h() {
      this.F();
      this.t = null;
      this.X = null;
   }

   private void F() {
      for (WeakReference<glh<?, ?>> $$0 : this.ad) {
         glh<?, ?> $$1 = $$0.get();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.ad.clear();
   }

   public dfc i() {
      return this.E;
   }

   @Override
   public void a(adw $$0) {
      zr.a($$0, this, this.a);
      this.a.r = new gly(this.a, this);
      agv $$1 = $$0.m();
      List<alq<dkj>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.G = Sets.newLinkedHashSet($$2);
      alq<dkj> $$3 = $$1.b();
      jg<efn> $$4 = $$1.a();
      this.A = $$0.h();
      this.B = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      glo.a $$8 = new glo.a(buz.c, $$0.e(), $$6);
      this.u = $$8;
      this.t = new glo(this, $$8, $$3, $$4, this.A, this.B, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.t, fzo.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.t, new axj(), new fqb());
         this.a.t.w(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.t.cG());
         }
      }

      this.a.l.a();
      this.a.t.A();
      this.a.t.e($$0.b());
      this.t.d(this.a.t);
      this.a.t.k = new gql(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.t, fzo.a.c);
      this.a.t.u($$0.j());
      this.a.t.b($$0.k());
      this.a.t.x($$0.l());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.N = null;
      this.P = 0;
      this.Q = new xo(20);
      this.R = xt.a();
      if (this.b.h()) {
         this.v();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.Y = $$0.n();
      if (this.c != null && !this.Z && !this.G()) {
         fwh $$9 = fwh.a(this.a, fwh.a.k, m, n);
         this.a.aA().a($$9);
         this.Z = true;
      }
   }

   @Override
   public void a(acg $$0) {
      zr.a($$0, this, this.a);
      if (this.M.isPresent() && this.M.getAsInt() == $$0.b()) {
         this.M = OptionalInt.empty();
      }

      bxe $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.t.d($$1);
         this.a($$1);
      } else {
         l.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bxe b(acg $$0) {
      bxn<?> $$1 = $$0.f();
      if ($$1 == bxn.bT) {
         gma $$2 = this.a($$0.e());
         if ($$2 == null) {
            l.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gqn(this.t, $$2.a());
         }
      } else {
         return $$1.a(this.t, bxm.r);
      }
   }

   private void a(bxe $$0) {
      if ($$0 instanceof cuv $$1) {
         this.a.ak().a((hon)(new hog($$1)));
      } else if ($$0 instanceof cjw $$2) {
         boolean $$3 = $$2.ac_();
         hoa $$4;
         if ($$3) {
            $$4 = new hny($$2);
         } else {
            $$4 = new hnz($$2);
         }

         this.a.ak().a((hoo)$$4);
      }
   }

   @Override
   public void a(afq $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.k($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afo $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.ar().a($$0.e());
      }
   }

   @Override
   public void a(adj $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         fgc $$2 = $$0.e().a();
         $$1.am().e($$2);
         if (!$$1.dg()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.dt().g($$2) > 4096.0;
            if (this.t.a($$1) && !$$5) {
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
   public void a(agn $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 == null) {
         if (this.M.isPresent() && this.M.getAsInt() == $$0.b()) {
            l.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new ahz.b(this.a.t.dA(), this.a.t.dC(), this.a.t.dG(), this.a.t.dL(), this.a.t.dN(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(byt.a) || $$0.f().contains(byt.b) || $$0.f().contains(byt.c);
         boolean $$3 = this.t.a($$1) || !$$1.dg() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.d($$0.g());
         if (!$$4 && $$1.A(this.a.t)) {
            $$1.j(this.a.t);
            this.a.t.bx();
            if ($$1.dg()) {
               this.b.a(aia.a($$1));
            }
         }
      }
   }

   @Override
   public void a(agp $$0) {
      zr.a($$0, this, this.a);
      if (this.a.s != null) {
         bvl $$1 = this.a.s.u();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(agq $$0) {
      zr.a($$0, this, this.a);
      if (this.a.s != null) {
         bvl $$1 = this.a.s.u();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(afu $$0) {
      zr.a($$0, this, this.a);
      if (csh.e($$0.b())) {
         this.a.t.gj().c($$0.b());
      }
   }

   @Override
   public void a(adz $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = $$0.a(this.t);
      if ($$1 != null) {
         if ($$1.dg()) {
            aje $$2 = $$1.am();
            fgc $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               aje $$4 = $$1.am();
               fgc $$5 = $$4.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aea $$0) {
      zr.a($$0, this, this.a);
      if ($$0.a(this.t) instanceof cuv $$2) {
         if ($$2.f() instanceof cvk $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(aey $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = $$0.a(this.t);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aeu $$0) {
      zr.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bxe $$1 = this.t.a($$0x);
         if ($$1 != null) {
            if ($$1.A(this.a.t)) {
               l.debug("Remove entity {}:{} that has player as passenger", $$1.an(), $$0x);
               this.M = OptionalInt.of($$0x);
            }

            this.t.a($$0x, bxe.d.b);
         }
      });
   }

   @Override
   public void a(aeo $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      if (!$$1.bY()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new ahc($$0.b()));
      this.b.a(new ahz.b($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN(), false, false));
   }

   private static boolean a(bys $$0, Set<byt> $$1, bxe $$2, boolean $$3) {
      bys $$4 = bys.a($$2);
      bys $$5 = bys.a($$4, $$0, $$1);
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
         bys $$7 = new bys($$2.bA(), fgc.c, $$2.N, $$2.O);
         bys $$8 = bys.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(aep $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      $$1.w($$0.b());
      $$1.x($$0.e());
      $$1.bz();
      this.b.a(new ahz.c($$1.dL(), $$1.dN(), false, false));
   }

   @Override
   public void a(aez $$0) {
      zr.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.t.b($$0x, $$1, 19));
   }

   @Override
   public void a(adr $$0) {
      zr.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      adv $$3 = $$0.g();
      this.t.a(() -> {
         this.a($$1, $$2, $$3, false);
         edx $$3x = this.t.h().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(acu $$0) {
      zr.a($$0, this, this.a);

      for (acu.a $$1 : $$0.b()) {
         this.t.h().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (acu.a $$2 : $$0.b()) {
         this.t.a(new djo($$2.b().h, $$2.b().i));
      }

      for (acu.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.t.aq(); $$6 <= this.t.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, adq $$2) {
      this.t.h().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(edx $$0, int $$1, int $$2) {
      exp $$3 = this.t.h().q();
      edy[] $$4 = $$0.d();
      djo $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         edy $$7 = $$4[$$6];
         int $$8 = this.t.h($$6);
         $$3.a(jz.a($$5, $$8), $$7.c());
      }

      this.t.b($$1 - 1, this.t.aq(), $$2 - 1, $$1 + 1, this.t.ar(), $$2 + 1);
   }

   @Override
   public void a(adl $$0) {
      zr.a($$0, this, this.a);
      this.t.h().a($$0.b());
      this.b($$0);
   }

   private void b(adl $$0) {
      djo $$1 = $$0.b();
      this.t.a(() -> {
         exp $$1x = this.t.B_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jz $$3 = jz.a($$1, $$2);
            $$1x.a(dks.b, $$3, null);
            $$1x.a(dks.a, $$3, null);
         }

         for (int $$4 = this.t.aq(); $$4 <= this.t.ar(); $$4++) {
            $$1x.a(jz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acn $$0) {
      zr.a($$0, this, this.a);
      this.t.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(agh $$0) {
      zr.a($$0, this, this.a);
      this.a.aZ().d();
      this.H();
      ftz.b $$1 = this.a.m.d().k();
      this.a.c(new gcl(p, this.b));
      this.b.a(abu.d, new glm(this.a, this.b, new glt(this.s, this.e, this.H, this.I, this.d, this.c, this.f, this.h, $$1, this.i, this.j)));
      this.b(aho.a);
      this.b.a(abu.b);
   }

   @Override
   public void a(agm $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      byf $$2 = (byf)this.t.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bxs) {
            this.t.a($$1.dA(), $$1.dC(), $$1.dG(), awy.jf, awz.h, 0.1F, (this.C.i() - this.C.i()) * 0.35F + 0.9F, false);
         } else {
            this.t.a($$1.dA(), $$1.dC(), $$1.dG(), awy.oj, awz.h, 0.2F, (this.C.i() - this.C.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gor(this.a.aq(), this.t, $$1, $$2));
         if ($$1 instanceof coo $$3) {
            dak $$4 = $$3.e();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.t.a($$0.b(), bxe.d.b);
            }
         } else if (!($$1 instanceof bxs)) {
            this.t.a($$0.b(), bxe.d.b);
         }
      }
   }

   @Override
   public void a(agj $$0) {
      zr.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeh $$0) {
      zr.a($$0, this, this.a);
      int $$1 = this.P++;
      if ($$0.b() != $$1) {
         l.error("Missing or out-of-order chat message from server, expected index {} but got {}", $$1, $$0.b());
         this.b.a(q);
      } else {
         Optional<xz> $$2 = $$0.h().a(this.R);
         if ($$2.isEmpty()) {
            l.error("Message from player with ID {} referenced unrecognized signature id", $$0.e());
            this.b.a(o);
         } else {
            this.R.a($$2.get(), $$0.g());
            UUID $$3 = $$0.e();
            gma $$4 = this.a($$3);
            if ($$4 == null) {
               l.error("Received player chat packet for unknown player with ID: {}", $$3);
               this.a.aZ().a($$3, $$0.g(), $$0.k());
            } else {
               xx $$5 = $$4.b();
               yb $$6;
               if ($$5 != null) {
                  $$6 = new yb($$0.f(), $$3, $$5.c());
               } else {
                  $$6 = yb.a($$3);
               }

               xw $$8 = new xw($$6, $$0.g(), $$2.get(), $$0.i(), $$0.j());
               $$8 = $$4.c().updateAndValidate($$8);
               if ($$8 != null) {
                  this.a.aZ().a($$8, $$4.a(), $$0.k());
               } else {
                  this.a.aZ().a($$3, $$0.g(), $$0.k());
               }
            }
         }
      }
   }

   @Override
   public void a(adh $$0) {
      zr.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adg $$0) {
      zr.a($$0, this, this.a);
      Optional<xs> $$1 = $$0.b().a(this.R);
      if ($$1.isEmpty()) {
         this.b.a(o);
      } else {
         this.Q.a($$1.get());
         if (!this.a.aZ().a($$1.get())) {
            this.a.m.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(ach $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            byf $$2 = (byf)$$1;
            $$2.a(bvb.a);
         } else if ($$0.e() == 3) {
            byf $$3 = (byf)$$1;
            $$3.a(bvb.b);
         } else if ($$0.e() == 2) {
            csi $$4 = (csi)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lz.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lz.r);
         }
      }
   }

   @Override
   public void a(ado $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(agc $$0) {
      zr.a($$0, this, this.a);
      this.t.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afm $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afw $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.e());
      if ($$1 == null) {
         l.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.A(this.a.t);
         $$1.bN();

         for (int $$3 : $$0.b()) {
            bxe $$4 = this.t.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.M = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cut) {
                        this.a.t.N = $$1.dL();
                        this.a.t.w($$1.dL());
                        this.a.t.r($$1.dL());
                     }

                     xg $$5 = xg.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aY().c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(afp $$0) {
      zr.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof byd $$2) {
         $$2.e_($$0.e());
      }
   }

   private static dak a(csi $$0) {
      for (bvb $$1 : bvb.values()) {
         dak $$2 = $$0.b($$1);
         if ($$2.c(kl.H)) {
            return $$2;
         }
      }

      return new dak(dao.wE);
   }

   @Override
   public void a(adi $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = $$0.a(this.t);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((hon)(new hof((cpg)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lz.an, 30);
               this.t.a($$1.dA(), $$1.dC(), $$1.dG(), awy.AD, $$1.dm(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((csi)this.a.t));
               }
               break;
            case 63:
               this.a.ak().a((hon)(new hoj((cmu)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(ade $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.t));
      }
   }

   @Override
   public void a(aft $$0) {
      zr.a($$0, this, this.a);
      this.a.t.J($$0.b());
      this.a.t.gu().a($$0.e());
      this.a.t.gu().b($$0.f());
   }

   @Override
   public void a(afs $$0) {
      zr.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aex $$0) {
      zr.a($$0, this, this.a);
      agv $$1 = $$0.b();
      alq<dkj> $$2 = $$1.b();
      jg<efn> $$3 = $$1.a();
      gqm $$4 = this.a.t;
      alq<dkj> $$5 = $$4.dV().aj();
      boolean $$6 = $$2 != $$5;
      fzo.a $$7 = this.a($$4.eH(), $$2, $$5);
      if ($$6) {
         Map<ezt, ezv> $$8 = this.t.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         glo.a $$12 = new glo.a(this.u.q(), this.u.l(), $$10);
         this.u = $$12;
         this.t = new glo(this, $$12, $$2, $$3, this.A, this.B, this.a.f, $$9, $$1.c(), $$11);
         this.t.a($$8);
         this.a.a(this.t, $$7);
      }

      this.a.u = null;
      if ($$4.gm()) {
         $$4.o();
      }

      gqm $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.t, $$4.l(), $$4.m(), $$4.cc(), $$4.ci());
      } else {
         $$13 = this.a.r.a(this.t, $$4.l(), $$4.m());
      }

      this.a($$13, this.t, $$7);
      $$13.e($$4.ao());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().b();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<aky.c<?>> $$15 = $$4.ar().c();
         if ($$15 != null) {
            $$13.ar().a($$15);
         }

         $$13.i($$4.dy());
         $$13.w($$4.dL());
         $$13.x($$4.dN());
      } else {
         $$13.A();
         $$13.w(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.fa().a($$4.fa());
      } else {
         $$13.fa().b($$4.fa());
      }

      this.t.d($$13);
      $$13.k = new gql(this.a.n);
      this.a.r.a($$13);
      $$13.u($$4.gB());
      $$13.b($$4.s());
      $$13.a($$1.h());
      $$13.f($$1.i());
      $$13.cw = $$4.cw;
      $$13.cx = $$4.cx;
      if (this.a.z instanceof fyu || this.a.z instanceof fyu.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private fzo.a a(boolean $$0, alq<dkj> $$1, alq<dkj> $$2) {
      fzo.a $$3 = fzo.a.c;
      if (!$$0) {
         if ($$1 == dkj.j || $$2 == dkj.j) {
            $$3 = fzo.a.a;
         } else if ($$1 == dkj.k || $$2 == dkj.k) {
            $$3 = fzo.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adk $$0) {
      zr.a($$0, this, this.a);
      fgc $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), awz.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(adn $$0) {
      zr.a($$0, this, this.a);
      if (this.t.a($$0.f()) instanceof cme $$2) {
         gqm $$3 = this.a.t;
         int $$4 = $$0.e();
         bvj $$5 = new bvj(cme.v($$4));
         cxd $$6 = new cxd($$0.b(), $$3.gj(), $$5, $$2, $$4);
         $$3.bR = $$6;
         this.a.a(new gbf($$6, $$3.gj(), $$2, $$4));
      }
   }

   @Override
   public void a(aed $$0) {
      zr.a($$0, this, this.a);
      fzh.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adb $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      dak $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      boolean $$5;
      if (this.a.z instanceof gav $$4) {
         $$5 = !$$4.G();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (cxe.e($$3) && !$$2.f()) {
            dak $$7 = $$1.bQ.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.bQ.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.bR.l && ($$0.b() != 0 || !$$5)) {
         $$1.bR.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof gav) {
         $$1.bQ.a($$3, $$2);
         $$1.bQ.d();
      }
   }

   @Override
   public void a(afl $$0) {
      zr.a($$0, this, this.a);
      this.a.aB().a($$0.b());
      if (!(this.a.z instanceof gav)) {
         this.a.t.bR.a($$0.b());
      }
   }

   @Override
   public void a(afx $$0) {
      zr.a($$0, this, this.a);
      this.a.aB().a($$0.e());
      this.a.t.gj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acz $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.bQ.a($$0.e(), $$0.f(), $$0.g());
      } else if ($$0.b() == $$1.bR.l) {
         $$1.bR.a($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aee $$0) {
      zr.a($$0, this, this.a);
      iw $$1 = $$0.b();
      if (this.t.c_($$1) instanceof eac $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         l.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.t.c_($$1), $$1);
      }
   }

   @Override
   public void a(acl $$0) {
      zr.a($$0, this, this.a);
      iw $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         $$1x.c($$0.f(), this.H);
         if ($$1x instanceof dyz && this.a.z instanceof gaq) {
            ((gaq)this.a.z).G();
         }
      });
   }

   @Override
   public void a(ada $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      if ($$1.bR != null && $$1.bR.l == $$0.b()) {
         $$1.bR.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(afr $$0) {
      zr.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof byf $$2) {
         $$0.e().forEach($$1 -> $$2.a((bxo)$$1.getFirst(), (dak)$$1.getSecond()));
      }
   }

   @Override
   public void a(acy $$0) {
      zr.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(acm $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ack $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adm $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      adm.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = azz.d($$3 + 0.5F);
      if ($$2 == adm.b) {
         $$1.a(xg.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adm.c) {
         this.t.k().b(true);
         this.t.e(0.0F);
      } else if ($$2 == adm.d) {
         this.t.k().b(false);
         this.t.e(1.0F);
      } else if ($$2 == adm.e) {
         this.a.r.a(dkg.a($$4));
      } else if ($$2 == adm.f) {
         this.a.a(new fzt(true, () -> {
            this.a.t.j.b(new ahl(ahl.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adm.g) {
         fqu $$5 = this.a.n;
         if ($$3 == 0.0F) {
            this.a.a(new fyv());
         } else if ($$3 == 101.0F) {
            this.a.m.d().a(xg.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k()));
         } else if ($$3 == 102.0F) {
            this.a.m.d().a(xg.a("demo.help.jump", $$5.z.k()));
         } else if ($$3 == 103.0F) {
            this.a.m.d().a(xg.a("demo.help.inventory", $$5.C.k()));
         } else if ($$3 == 104.0F) {
            this.a.m.d().a(xg.a("demo.day.6", $$5.M.k()));
         }
      } else if ($$2 == adm.h) {
         this.t.a($$1, $$1.dA(), $$1.dE(), $$1.dG(), awy.aF, awz.h, 0.18F, 0.45F);
      } else if ($$2 == adm.i) {
         this.t.e($$3);
      } else if ($$2 == adm.j) {
         this.t.c($$3);
      } else if ($$2 == adm.k) {
         this.t.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awy.vJ, awz.g, 1.0F, 1.0F);
      } else if ($$2 == adm.l) {
         this.t.a(lz.q, $$1.dA(), $$1.dC(), $$1.dG(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.t.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awy.io, awz.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adm.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adm.n) {
         this.a.t.x($$3 == 1.0F);
      } else if ($$2 == adm.o && this.X != null) {
         this.X.c();
      }
   }

   private void a(gqm $$0, glo $$1, fzo.a $$2) {
      this.X = new glx($$0, $$1, this.a.f);
      this.a.a(new fzo(this.X::b, $$2));
   }

   @Override
   public void a(adx $$0) {
      zr.a($$0, this, this.a);
      ezt $$1 = $$0.b();
      ezv $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = ezv.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.a($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(ads $$0) {
      zr.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(agr $$0) {
      zr.a($$0, this, this.a);
      this.x.a($$0);
   }

   @Override
   public void a(afa $$0) {
      zr.a($$0, this, this.a);
      alr $$1 = $$0.b();
      if ($$1 == null) {
         this.x.a(null, false);
      } else {
         aj $$2 = this.x.a($$1);
         this.x.a($$2, false);
      }
   }

   @Override
   public void a(acx $$0) {
      zr.a($$0, this, this.a);
      this.D = new CommandDispatcher($$0.a(eg.a(this.H, this.I)));
   }

   @Override
   public void a(agi $$0) {
      zr.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      zr.a($$0, this, this.a);
      this.y.a($$0.e(), $$0.b());
   }

   @Override
   public void a(agu $$0) {
      zr.a($$0, this, this.a);
      this.E = new glq($$0.b(), $$0.e());
   }

   @Override
   public void a(aen $$0) {
      zr.a($$0, this, this.a);
      fgc $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agl $$0) {
      zr.a($$0, this, this.a);
      if (!this.z.a($$0.b(), $$0.e())) {
         l.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aci $$0) {
      zr.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<axf<?>> $$1 = (Entry<axf<?>>)$$4.next();
         axf<?> $$2 = (axf<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof fzu $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(aer $$0) {
      zr.a($$0, this, this.a);
      fqb $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (aer.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            fwg.a(this.a.aA(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(aes $$0) {
      zr.a($$0, this, this.a);
      fqb $$1 = this.a.t.m();

      for (dgj $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(aet $$0) {
      zr.a($$0, this, this.a);
      fqb $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(fqb $$0) {
      $$0.c();
      this.ac.a($$0, this.t);
      if (this.a.z instanceof gdu $$1) {
         $$1.L();
      }
   }

   @Override
   public void a(agt $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 instanceof byf) {
         jg<bwg> $$2 = $$0.e();
         bwi $$3 = new bwi($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((byf)$$1).c($$3, null);
      }
   }

   private <T> jt.a<T> a(alq<? extends jt<? extends T>> $$0, aye.a $$1) {
      jt<T> $$2 = this.H.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aah $$0) {
      zr.a($$0, this, this.a);
      List<jt.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || jx.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(jt.a::d);
      this.K = dzn.a(this.H, this.I);
      List<dak> $$3 = List.copyOf(czc.e().l());
      this.ac.a($$3);
   }

   @Override
   public void a(aei $$0) {
   }

   @Override
   public void a(aej $$0) {
   }

   @Override
   public void a(aek $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.s()) {
            this.a.a(new fyu($$0.e(), this.t.k().l()));
         } else {
            this.a.t.gg();
         }
      }
   }

   @Override
   public void a(acr $$0) {
      zr.a($$0, this, this.a);
      this.u.a($$0.e());
      this.u.a($$0.b());
   }

   @Override
   public void a(afi $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = $$0.a(this.t);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(adp $$0) {
      zr.a($$0, this, this.a);
      edi $$1 = this.t.E_();
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
   public void a(afd $$0) {
      zr.a($$0, this, this.a);
      this.t.E_().d($$0.e(), $$0.b());
   }

   @Override
   public void a(afe $$0) {
      zr.a($$0, this, this.a);
      this.t.E_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aff $$0) {
      zr.a($$0, this, this.a);
      this.t.E_().a($$0.b());
   }

   @Override
   public void a(afh $$0) {
      zr.a($$0, this, this.a);
      this.t.E_().c($$0.b());
   }

   @Override
   public void a(afg $$0) {
      zr.a($$0, this, this.a);
      this.t.E_().b($$0.b());
   }

   @Override
   public void a(acv $$0) {
      zr.a($$0, this, this.a);
      this.a.m.c();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(afb $$0) {
      zr.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(gmd::b).ifPresent(this.c::a);
         gme.b(this.c);
      }
   }

   @Override
   public void a(add $$0) {
      zr.a($$0, this, this.a);
      this.y.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afc $$0) {
      zr.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(agd $$0) {
      zr.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(agb $$0) {
      zr.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(age $$0) {
      zr.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agk $$0) {
      zr.a($$0, this, this.a);
      this.a.m.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(aev $$0) {
      zr.a($$0, this, this.a);
      if ($$0.a(this.t) instanceof byf $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ael $$0) {
      zr.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aN().f($$1);
         gma $$2 = this.v.remove($$1);
         if ($$2 != null) {
            this.w.remove($$2);
         }
      }
   }

   @Override
   public void a(aem $$0) {
      zr.a($$0, this, this.a);

      for (aem.b $$1 : $$0.f()) {
         gma $$2 = new gma(Objects.requireNonNull($$1.b()), this.G());
         if (this.v.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aN().a($$2);
         }
      }

      for (aem.b $$3 : $$0.e()) {
         gma $$4 = this.v.get($$3.a());
         if ($$4 == null) {
            l.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aem.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aem.a $$0, aem.b $$1, gma $$2) {
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
               this.w.add($$2);
            } else {
               this.w.remove($$2);
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

   private void a(aem.b $$0, gma $$1) {
      GameProfile $$2 = $$1.a();
      bao $$3 = this.a.aV();
      if ($$3 == null) {
         l.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.G());
      } else {
         xx.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               xx $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (csm.b var7) {
               l.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.G());
            }
         } else {
            $$1.a(this.G());
         }
      }
   }

   private boolean G() {
      return this.a.aW() && this.Y;
   }

   @Override
   public void a(aeg $$0) {
      zr.a($$0, this, this.a);
      csi $$1 = this.a.t;
      $$1.gk().b = $$0.e();
      $$1.gk().d = $$0.g();
      $$1.gk().a = $$0.b();
      $$1.gk().c = $$0.f();
      $$1.gk().a($$0.h());
      $$1.gk().b($$0.i());
   }

   @Override
   public void a(agg $$0) {
      zr.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agf $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aco $$0) {
      zr.a($$0, this, this.a);
      this.a.m.j().a($$0);
   }

   @Override
   public void a(adc $$0) {
      zr.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gG().a($$0.b());
      } else {
         this.a.t.gG().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aeb $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.a.t.df();
      if ($$1 != this.a.t && $$1.dg()) {
         fgc $$2 = $$0.b();
         fgc $$3;
         if ($$1.bQ()) {
            $$3 = $$1.l_().a();
         } else {
            $$3 = $$1.dt();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bQ()) {
               $$1.l_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(aia.a($$1));
      }
   }

   @Override
   public void a(aec $$0) {
      zr.a($$0, this, this.a);
      dak $$1 = this.a.t.b($$0.b());
      gan.a $$2 = gan.a.a($$1);
      if ($$2 != null) {
         this.a.a(new gan($$2));
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
         ((gwh)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abf $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abd $$7) {
         gvk.a $$8 = new gvk.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abe $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abj $$10) {
         gwf $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof aaz $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof aaq $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aap $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof aba $$15) {
         this.a.l.p.a($$15.b(), this.t.ae());
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
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(afv $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.ab.a($$1, fhk.c, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fgz $$2 = this.ab.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.ab.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(afz $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fhg $$2 = fhg.c($$0.b());
      fgz $$3 = this.ab.a($$1);
      if ($$3 != null) {
         fhf $$4 = this.ab.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         l.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aew $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fhg $$2 = fhg.c($$0.b());
      if ($$1 == null) {
         this.ab.b($$2);
      } else {
         fgz $$3 = this.ab.a($$1);
         if ($$3 != null) {
            this.ab.e($$2, $$3);
         } else {
            l.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afn $$0) {
      zr.a($$0, this, this.a);
      String $$1 = $$0.e();
      fgz $$2 = $$1 == null ? null : this.ab.a($$1);
      this.ab.a($$0.b(), $$2);
   }

   @Override
   public void a(afy $$0) {
      zr.a($$0, this, this.a);
      afy.a $$1 = $$0.e();
      fhc $$2;
      if ($$1 == afy.a.a) {
         $$2 = this.ab.c($$0.f());
      } else {
         $$2 = this.ab.b($$0.f());
         if ($$2 == null) {
            l.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afy.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         $$2.a($$1x.d());
         $$2.a($$1x.e());
         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afy.a $$5 = $$0.b();
      if ($$5 == afy.a.a) {
         for (String $$6 : $$0.g()) {
            this.ab.a($$6, $$2);
         }
      } else if ($$5 == afy.a.b) {
         for (String $$7 : $$0.g()) {
            this.ab.b($$7, $$2);
         }
      }

      if ($$1 == afy.a.b) {
         this.ab.d($$2);
      }
   }

   @Override
   public void a(adt $$0) {
      zr.a($$0, this, this.a);
      if ($$0.m() == 0) {
         double $$1 = (double)($$0.l() * $$0.i());
         double $$2 = (double)($$0.l() * $$0.j());
         double $$3 = (double)($$0.l() * $$0.k());

         try {
            this.t.a($$0.n(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            l.warn("Could not spawn particle effect {}", $$0.n());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.m(); $$5++) {
            double $$6 = this.C.k() * (double)$$0.i();
            double $$7 = this.C.k() * (double)$$0.j();
            double $$8 = this.C.k() * (double)$$0.k();
            double $$9 = this.C.k() * (double)$$0.l();
            double $$10 = this.C.k() * (double)$$0.l();
            double $$11 = this.C.k() * (double)$$0.l();

            try {
               this.t.a($$0.n(), $$0.b(), $$0.e(), $$0.f() + $$6, $$0.g() + $$7, $$0.h() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               l.warn("Could not spawn particle effect {}", $$0.n());
               return;
            }
         }
      }
   }

   @Override
   public void a(ags $$0) {
      zr.a($$0, this, this.a);
      bxe $$1 = this.t.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof byf)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bzi $$2 = ((byf)$$1).fa();

            for (ags.a $$3 : $$0.e()) {
               bzh $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  l.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (bzj $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aef $$0) {
      zr.a($$0, this, this.a);
      cwb $$1 = this.a.t.bR;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gdu $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(adu $$0) {
      zr.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      adv $$3 = $$0.f();
      this.t.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, adv $$2, boolean $$3) {
      exp $$4 = this.t.h().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dks.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dks.b, $$8, $$9, $$10, $$3);
      $$4.a(new djo($$0, $$1), true);
   }

   @Override
   public void a(ady $$0) {
      zr.a($$0, this, this.a);
      cwb $$1 = this.a.t.bR;
      if ($$0.b() == $$1.l && $$1 instanceof cxm $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afk $$0) {
      zr.a($$0, this, this.a);
      this.A = $$0.b();
      this.a.n.b(this.A);
      this.t.h().a($$0.b());
   }

   @Override
   public void a(aga $$0) {
      zr.a($$0, this, this.a);
      this.B = $$0.b();
      this.t.i(this.B);
   }

   @Override
   public void a(afj $$0) {
      zr.a($$0, this, this.a);
      this.t.h().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acj $$0) {
      zr.a($$0, this, this.a);
      this.t.b($$0.b());
   }

   @Override
   public void a(acq $$0) {
      zr.a($$0, this, this.a);

      for (zo<? super acf> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aeq $$0) {
      zr.a($$0, this, this.a);
      if (this.t.a($$0.b()) instanceof csr $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(act $$0) {
      this.U.a();
   }

   @Override
   public void a(acs $$0) {
      this.U.a($$0.b());
      this.b(new ahk(this.U.b()));
   }

   @Override
   public void a(adf $$0) {
      this.a.aQ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(akh $$0) {
      this.V.a($$0);
   }

   @Override
   public void a(ago $$0) {
      zr.a($$0, this, this.a);
      if (this.a.z instanceof gbw $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   private void a(int $$0, int $$1, exp $$2, dks $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, jz.a($$0, $$9, $$1), $$10 ? new eds((byte[])$$6.next().clone()) : new eds());
            if ($$7) {
               this.t.c($$0, $$9, $$1);
            }
         }
      }
   }

   public vv j() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.aa;
   }

   public Collection<gma> k() {
      return this.w;
   }

   public Collection<gma> l() {
      return this.v.values();
   }

   public Collection<UUID> m() {
      return this.v.keySet();
   }

   @Nullable
   public gma a(UUID $$0) {
      return this.v.get($$0);
   }

   @Nullable
   public gma a(String $$0) {
      for (gma $$1 : this.v.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile n() {
      return this.s;
   }

   public glj o() {
      return this.x;
   }

   public CommandDispatcher<ep> p() {
      return this.D;
   }

   public glo q() {
      return this.t;
   }

   public fqf r() {
      return this.z;
   }

   public UUID s() {
      return this.F;
   }

   public Set<alq<dkj>> t() {
      return this.G;
   }

   public ju.b u() {
      return this.H;
   }

   public void a(xs $$0, boolean $$1) {
      if (this.Q.a($$0, $$1) && this.Q.c() > 64) {
         this.H();
      }
   }

   private void H() {
      int $$0 = this.Q.a();
      if ($$0 > 0) {
         this.b(new ahf($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ayv.c.a();
      xo.a $$3 = this.Q.b();
      xs $$4 = this.O.pack(new xz($$0, $$1, $$2, $$3.a()));
      this.b(new ahi($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xy<ep> $$1 = xy.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new ahg($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = ayv.c.a();
         xo.a $$4 = this.Q.b();
         er $$5 = er.a($$1, $$3x -> {
            xz $$4x = new xz($$3x, $$2, $$3, $$4.a());
            return this.O.pack($$4x);
         });
         this.b(new ahh($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xy.a(this.e($$0))) {
         this.b(new ahg($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ep> e(String $$0) {
      return this.D.parse($$0, this.y);
   }

   public void a(arl $$0) {
      if (!$$0.equals(this.T)) {
         this.b(new aak($$0));
         this.T = $$0;
      }
   }

   @Override
   public void d() {
      if (this.N != null && this.a.w().b()) {
         this.v();
      }

      if (this.S != null && this.S.isDone()) {
         this.S.join().ifPresent(this::a);
         this.S = null;
      }

      this.a();
      if (this.a.aQ().f()) {
         this.V.a();
      }

      this.W.a();
      this.e.a();
      if (this.X != null) {
         this.X.a();
         if (this.X.b() && !this.a.t.gK()) {
            this.b.a(new aij());
            this.a.t.v(true);
         }
      }
   }

   public void v() {
      this.S = this.a.w().a();
   }

   private void a(csl $$0) {
      if (this.a.b(this.s.getId())) {
         if (this.N == null || !this.N.c().equals($$0)) {
            this.N = xr.a($$0);
            this.O = this.N.a(this.s.getId());
            this.b(new ahj(this.N.a().a()));
         }
      }
   }

   @Nullable
   public gmd w() {
      return this.c;
   }

   public cvs x() {
      return this.I;
   }

   public boolean a(cvs $$0) {
      return $$0.a(this.x());
   }

   public fhh y() {
      return this.ab;
   }

   public dcf z() {
      return this.J;
   }

   public dzn A() {
      return this.K;
   }

   public void B() {
      this.ac.a();
   }

   public gmg C() {
      return this.ac;
   }

   public amj D() {
      return this.j;
   }

   public void a(glh<?, ?> $$0) {
      this.ad.add(new WeakReference<>($$0));
   }

   public wa.a E() {
      return this.L;
   }
}
