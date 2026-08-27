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

public class fvn extends fvj implements abk, wg {
   private static final Logger i = LogUtils.getLogger();
   private static final ws j = ws.c("multiplayer.unsecureserver.toast.title");
   private static final ws k = ws.c("multiplayer.unsecureserver.toast");
   private static final ws l = ws.c("multiplayer.disconnect.invalid_packet");
   private static final ws m = ws.c("multiplayer.disconnect.chat_validation_failed");
   private static final ws n = ws.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fvm q;
   private fvm.a r;
   private final Map<UUID, fvx> s = Maps.newHashMap();
   private final Set<fvx> t = new ReferenceOpenHashSet();
   private final fvh u;
   private final fvp v;
   private final fcl w = new fcl(this);
   private int x = 3;
   private int y = 3;
   private final ayd z = ayd.b();
   private CommandDispatcher<eh> A = new CommandDispatcher();
   private final cwj B;
   private final UUID C = UUID.randomUUID();
   private Set<ake<czu>> D;
   private final jj.b E;
   private final cmy F;
   @Nullable
   private xd G;
   private xm.c H = xm.c.a;
   private xa I = new xa(20);
   private xf J = xf.a();
   private final fvg K = new fvg();
   private final fvw L;
   private final fvr M;
   @Nullable
   private fvu N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final euj R = new euj();

   public fvn(fcu $$0, vq $$1, fvq $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fvh($$0, this.e);
      this.v = new fvp(this, $$0);
      this.L = new fvw(this, $$0.aP().m());
      this.B = new cwj(this.E);
      this.M = new fvr(this, $$0.aP());
   }

   public fvp h() {
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

   public cwj k() {
      return this.B;
   }

   @Override
   public void a(adb $$0) {
      zc.a($$0, this, this.a);
      this.a.q = new fvv(this.a, this);
      afs $$1 = $$0.m();
      List<ake<czu>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      ake<czu> $$3 = $$1.b();
      iv<dtq> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fvm.a $$7 = new fvm.a(bon.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fvm(this, $$7, $$3, $$4, this.x, this.y, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new avk(), new fch());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cx());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cx = new gaf(this.a.m);
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
      this.I = new xa(20);
      this.J = xf.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fhc $$8 = fhc.a(this.a, fhc.a.j, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(abl $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bql b(abl $$0) {
      bqr<?> $$1 = $$0.f();
      if ($$1 == bqr.bx) {
         fvx $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gah(this.q, $$2.a());
         }
      } else {
         return $$1.a((czu)this.q);
      }
   }

   private void a(bql $$0) {
      if ($$0 instanceof cmg $$1) {
         this.a.ak().a((gqb)(new gpu($$1)));
      } else if ($$0 instanceof ccu $$2) {
         boolean $$3 = $$2.Z_();
         gpo $$4;
         if ($$3) {
            $$4 = new gpm($$2);
         } else {
            $$4 = new gpn($$2);
         }

         this.a.ak().a((gqc)$$4);
      }
   }

   @Override
   public void a(abm $$0) {
      zc.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bql $$4 = new bqu(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(aeq $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(aeo $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(afl $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
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
   public void a(afm $$0) {
      zc.a($$0, this, this.a);
      if (this.a.r != null) {
         bpb $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afn $$0) {
      zc.a($$0, this, this.a);
      if (this.a.r != null) {
         bpb $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aej $$0) {
      zc.a($$0, this, this.a);
      if (ckk.d($$0.b())) {
         this.a.s.ga().l = $$0.b();
      }
   }

   @Override
   public void a(ade $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cY()) {
            if ($$0.j()) {
               ahu $$2 = $$1.ah();
               etf $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(ady $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(adu $$0) {
      zc.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bql.c.b));
   }

   @Override
   public void a(ads $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      etf $$2 = $$1.dq();
      boolean $$3 = $$0.j().contains(brr.a);
      boolean $$4 = $$0.j().contains(brr.b);
      boolean $$5 = $$0.j().contains(brr.c);
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
      if ($$0.j().contains(brr.e)) {
         $$1.s($$1.dF() + $$19);
         $$1.P += $$19;
      } else {
         $$1.s($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(brr.d)) {
         $$1.r($$1.dD() + $$18);
         $$1.O += $$18;
      } else {
         $$1.r($$18);
         $$1.O = $$18;
      }

      this.b.a(new afz($$0.i()));
      this.b.a(new agu.b($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF(), false));
   }

   @Override
   public void a(adz $$0) {
      zc.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(acw $$0) {
      zc.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      ada $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dse $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(aca $$0) {
      zc.a($$0, this, this.a);

      for (aca.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (aca.a $$2 : $$0.b()) {
         this.q.a(new czb($$2.b().e, $$2.b().f));
      }

      for (aca.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.an(); $$6 < this.q.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, acv $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dse $$0, int $$1, int $$2) {
      elg $$3 = this.q.i().p();
      dsf[] $$4 = $$0.d();
      czb $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dsf $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jo.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(acq $$0) {
      zc.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(acq $$0) {
      czb $$1 = $$0.b();
      this.q.a(() -> {
         elg $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jo $$3 = jo.a($$1, $$2);
            $$1x.a(dad.b, $$3, null);
            $$1x.a(dad.a, $$3, null);
         }

         for (int $$4 = this.q.an(); $$4 < this.q.ao(); $$4++) {
            $$1x.a(jo.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abt $$0) {
      zc.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aff $$0) {
      zc.a($$0, this, this.a);
      this.a.c(new fnt(n, this.b));
      this.b.a(aaz.b, new fvk(this.a, this.b, new fvq(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(agj.a);
      this.b.a(aaz.a);
   }

   @Override
   public void a(afk $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      bre $$2 = (bre)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bqu) {
            this.q.a($$1.ds(), $$1.du(), $$1.dy(), auz.iC, ava.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.ds(), $$1.du(), $$1.dy(), auz.ns, ava.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fym(this.a.aq(), this.a.aQ(), this.q, $$1, $$2));
         if ($$1 instanceof cgv $$3) {
            csd $$4 = $$3.p();
            if (!$$4.d()) {
               $$4.g($$0.f());
            }

            if ($$4.d()) {
               this.q.a($$0.b(), bql.c.b);
            }
         } else if (!($$1 instanceof bqu)) {
            this.q.a($$0.b(), bql.c.b);
         }
      }
   }

   @Override
   public void a(afh $$0) {
      zc.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adl $$0) {
      zc.a($$0, this, this.a);
      Optional<xl> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fvx $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            xj $$4 = $$3.b();
            xn $$5;
            if ($$4 != null) {
               $$5 = new xn($$0.e(), $$2, $$4.c());
            } else {
               $$5 = xn.a($$2);
            }

            xi $$7 = new xi($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(acn $$0) {
      zc.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acm $$0) {
      zc.a($$0, this, this.a);
      Optional<xe> $$1 = $$0.b().a(this.J);
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
   public void a(abn $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bre $$2 = (bre)$$1;
            $$2.a(bop.a);
         } else if ($$0.e() == 3) {
            bre $$3 = (bre)$$1;
            $$3.a(bop.b);
         } else if ($$0.e() == 2) {
            ckl $$4 = (ckl)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, kw.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, kw.r);
         }
      }
   }

   @Override
   public void a(act $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(afa $$0) {
      zc.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aem $$0) {
      zc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aev $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bF();

         for (int $$3 : $$0.b()) {
            bql $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cmi) {
                     this.a.s.O = $$1.dD();
                     this.a.s.r($$1.dD());
                     this.a.s.n($$1.dD());
                  }

                  ws $$5 = ws.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aY().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aep $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 instanceof brg) {
         ((brg)$$1).s($$0.e());
      }
   }

   private static csd a(ckl $$0) {
      for (bop $$1 : bop.values()) {
         csd $$2 = $$0.b($$1);
         if ($$2.a(csg.vt)) {
            return $$2;
         }
      }

      return new csd(csg.vt);
   }

   @Override
   public void a(aco $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((gqb)(new gpt((chn)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, kw.ah, 30);
               this.q.a($$1.ds(), $$1.du(), $$1.dy(), auz.zk, $$1.dc(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((ckl)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((gqb)(new gpx((cfk)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(ack $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(aet $$0) {
      zc.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gk().a($$0.e());
      this.a.s.gk().b($$0.f());
   }

   @Override
   public void a(aes $$0) {
      zc.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adx $$0) {
      zc.a($$0, this, this.a);
      afs $$1 = $$0.b();
      ake<czu> $$2 = $$1.b();
      iv<dtq> $$3 = $$1.a();
      gag $$4 = this.a.s;
      if ($$2 != $$4.dN().ae()) {
         Map<enc, ene> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fvm.a $$8 = new fvm.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fvm(this, $$8, $$2, $$3, this.x, this.y, this.a::aI, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.gc()) {
         $$4.r();
      }

      gag $$9;
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
         List<ajo.c<?>> $$11 = $$4.an().c();
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
      $$9.cx = new gaf(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gq());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cF = $$4.cF;
      $$9.cG = $$4.cG;
      if (this.a.y instanceof fjr || this.a.y instanceof fjr.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(acp $$0) {
      zc.a($$0, this, this.a);
      czm $$1 = new czm(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dq().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(acs $$0) {
      zc.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cex $$2) {
         gag $$3 = this.a.s;
         boz $$4 = new boz($$0.e());
         coh $$5 = new coh($$0.b(), $$3.ga(), $$4, $$2);
         $$3.cc = $$5;
         this.a.a(new fmq($$5, $$3.ga(), $$2));
      }
   }

   @Override
   public void a(adh $$0) {
      zc.a($$0, this, this.a);
      fkg.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ach $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      csd $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fmg)) {
            $$1.cc.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.ga().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fmg $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.b() == 0 && coi.f($$3)) {
            if (!$$2.d()) {
               csd $$6 = $$1.cb.b($$3).g();
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
   public void a(acf $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cb.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cc.j) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adi $$0) {
      zc.a($$0, this, this.a);
      im $$1 = $$0.b();
      if (this.q.c_($$1) instanceof don $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dpy $$3 = this.q.a_($$1);
         don $$4 = new don($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(abr $$0) {
      zc.a($$0, this, this.a);
      im $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ty $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof dnn && this.a.y instanceof fmb) {
            ((fmb)this.a.y).E();
         }
      });
   }

   @Override
   public void a(acg $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      if ($$1.cc != null && $$1.cc.j == $$0.b()) {
         $$1.cc.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aer $$0) {
      zc.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bre $$2) {
         $$0.e().forEach($$1 -> $$2.a((bqs)$$1.getFirst(), (csd)$$1.getSecond()));
      }
   }

   @Override
   public void a(ace $$0) {
      zc.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(abs $$0) {
      zc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abq $$0) {
      zc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acr $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      acr.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = axw.d($$3 + 0.5F);
      if ($$2 == acr.b) {
         $$1.a(ws.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acr.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == acr.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == acr.e) {
         this.a.q.a(czr.a($$4));
      } else if ($$2 == acr.f) {
         if ($$4 == 0) {
            this.a.s.h.b(new agh(agh.a.a));
            this.a.a(new fkr(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new flb(true, () -> {
               this.a.s.h.b(new agh(agh.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == acr.g) {
         fcy $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fjs());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(ws.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(ws.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(ws.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(ws.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == acr.h) {
         this.q.a($$1, $$1.ds(), $$1.dw(), $$1.dy(), auz.aF, ava.h, 0.18F, 0.45F);
      } else if ($$2 == acr.i) {
         this.q.e($$3);
      } else if ($$2 == acr.j) {
         this.q.c($$3);
      } else if ($$2 == acr.k) {
         this.q.a($$1, $$1.ds(), $$1.du(), $$1.dy(), auz.uG, ava.g, 1.0F, 1.0F);
      } else if ($$2 == acr.l) {
         this.q.a(kw.q, $$1.ds(), $$1.du(), $$1.dy(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.ds(), $$1.du(), $$1.dy(), auz.hL, ava.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acr.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == acr.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == acr.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(gag $$0, fvm $$1) {
      this.N = new fvu($$0, $$1, this.a.f);
      this.a.a(new fkr(this.N::b));
   }

   @Override
   public void a(adc $$0) {
      zc.a($$0, this, this.a);
      fek $$1 = this.a.j.j();
      enc $$2 = $$0.b();
      ene $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = ene.a($$0.e(), $$0.f(), this.a.r.ae());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(acx $$0) {
      zc.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afo $$0) {
      zc.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(aea $$0) {
      zc.a($$0, this, this.a);
      akf $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(acd $$0) {
      zc.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dy.a(this.E, this.F)));
   }

   @Override
   public void a(afg $$0) {
      zc.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      zc.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(afr $$0) {
      zc.a($$0, this, this.a);
      this.B.a($$0.b());
      fch $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gqn.c, $$1.b());
   }

   @Override
   public void a(adr $$0) {
      zc.a($$0, this, this.a);
      etf $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afj $$0) {
      zc.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abo $$0) {
      zc.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avg<?>> $$1 = (Entry<avg<?>>)$$4.next();
         avg<?> $$2 = (avg<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof flc $$4x) {
         $$4x.D();
      }
   }

   @Override
   public void a(adt $$0) {
      zc.a($$0, this, this.a);
      fch $$1 = this.a.s.m();
      $$1.a($$0.f());
      adt.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akf $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akf $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (akf $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akf $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fhb.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fom) {
         ((fom)this.a.y).E();
      }
   }

   @Override
   public void a(afq $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 instanceof bre) {
         iv<bpv> $$2 = $$0.e();
         bpx $$3 = new bpx($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bre)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zo $$0) {
      zc.a($$0, this, this.a);
      fwd $$1 = new fwd();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(adm $$0) {
   }

   @Override
   public void a(adn $$0) {
   }

   @Override
   public void a(ado $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fjr($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fY();
         }
      }
   }

   @Override
   public void a(abx $$0) {
      zc.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(aei $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(acu $$0) {
      zc.a($$0, this, this.a);
      drp $$1 = this.q.C_();
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
   public void a(aed $$0) {
      zc.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aee $$0) {
      zc.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aef $$0) {
      zc.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(aeh $$0) {
      zc.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(aeg $$0) {
      zc.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(acb $$0) {
      zc.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aeb $$0) {
      zc.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fwa::b).ifPresent(this.c::a);
         fwb.b(this.c);
      }
   }

   @Override
   public void a(acj $$0) {
      zc.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aec $$0) {
      zc.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(afb $$0) {
      zc.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(aez $$0) {
      zc.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afc $$0) {
      zc.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afi $$0) {
      zc.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(adv $$0) {
      zc.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bre $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(adp $$0) {
      zc.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fvx $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(adq $$0) {
      zc.a($$0, this, this.a);

      for (adq.b $$1 : $$0.f()) {
         fvx $$2 = new fvx(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (adq.b $$3 : $$0.e()) {
         fvx $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adq.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adq.a $$0, adq.b $$1, fvx $$2) {
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

   private void a(adq.b $$0, fvx $$1) {
      GameProfile $$2 = $$1.a();
      ayi $$3 = this.a.aV();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         xj.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xj $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cko.b var7) {
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
   public void a(adk $$0) {
      zc.a($$0, this, this.a);
      ckl $$1 = this.a.s;
      $$1.gb().b = $$0.e();
      $$1.gb().d = $$0.g();
      $$1.gb().a = $$0.b();
      $$1.gb().c = $$0.f();
      $$1.gb().a($$0.h());
      $$1.gb().b($$0.i());
   }

   @Override
   public void a(afe $$0) {
      zc.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afd $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(abu $$0) {
      zc.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(aci $$0) {
      zc.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gv().b($$0.b());
      } else {
         this.a.s.gv().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adf $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.a.s.cX();
      if ($$1 != this.a.s && $$1.cY()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new agv($$1));
      }
   }

   @Override
   public void a(adg $$0) {
      zc.a($$0, this, this.a);
      csd $$1 = this.a.s.b($$0.b());
      fly.a $$2 = fly.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fly($$2));
      }
   }

   @Override
   public void a(aaa $$0) {
      if ($$0 instanceof aaj $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aai $$2) {
         ((gex)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aao $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aaq $$4) {
         ((gff)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aam $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aak $$6) {
         gel.a $$7 = new gel.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aal $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aap $$9) {
         gfd $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aag $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof zx $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof zw $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aah $$14) {
         this.a.k.o.a($$14.b(), this.q.Y());
      } else if ($$0 instanceof aae $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof aaf) {
         this.a.k.r.a();
      } else if ($$0 instanceof aan $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof aac $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof aad $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof zz $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(aaa $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aeu $$0) {
      zc.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, eum.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         eub $$2 = this.R.a($$1);
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
   public void a(aex $$0) {
      zc.a($$0, this, this.a);
      String $$1 = $$0.e();
      eui $$2 = eui.c($$0.b());
      eub $$3 = this.R.a($$1);
      if ($$3 != null) {
         euh $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(adw $$0) {
      zc.a($$0, this, this.a);
      String $$1 = $$0.e();
      eui $$2 = eui.c($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         eub $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aen $$0) {
      zc.a($$0, this, this.a);
      String $$1 = $$0.e();
      eub $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(aew $$0) {
      zc.a($$0, this, this.a);
      aew.a $$1 = $$0.e();
      eue $$2;
      if ($$1 == aew.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<aew.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eul.b $$2x = eul.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eul.a $$3x = eul.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      aew.a $$5 = $$0.b();
      if ($$5 == aew.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == aew.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == aew.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(acy $$0) {
      zc.a($$0, this, this.a);
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
   public void a(afp $$0) {
      zc.a($$0, this, this.a);
      bql $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bre)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bsi $$2 = ((bre)$$1).eU();

            for (afp.a $$3 : $$0.e()) {
               bsh $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bsj $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adj $$0) {
      zc.a($$0, this, this.a);
      cnh $$1 = this.a.s.cc;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fom) {
               fog $$2 = ((fom)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(acz $$0) {
      zc.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      ada $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, ada $$2) {
      elg $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dad.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dad.b, $$7, $$8, $$9);
      $$3.a(new czb($$0, $$1), true);
   }

   @Override
   public void a(add $$0) {
      zc.a($$0, this, this.a);
      cnh $$1 = this.a.s.cc;
      if ($$0.b() == $$1.j && $$1 instanceof cor $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(ael $$0) {
      zc.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(aey $$0) {
      zc.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(aek $$0) {
      zc.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abp $$0) {
      zc.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(abw $$0) {
      zc.a($$0, this, this.a);

      for (yz<? super abk> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(abz $$0) {
      this.K.a();
   }

   @Override
   public void a(aby $$0) {
      this.K.a($$0.b());
      this.b(new agg(this.K.b()));
   }

   @Override
   public void a(acl $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aix $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, elg $$2, dad $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jo.a($$0, $$8, $$1), $$9 ? new drz((byte[])$$6.next().clone()) : new drz());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public vq l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fvx> m() {
      return this.t;
   }

   public Collection<fvx> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fvx a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fvx a(String $$0) {
      for (fvx $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fvh q() {
      return this.u;
   }

   public CommandDispatcher<eh> r() {
      return this.A;
   }

   public fvm s() {
      return this.q;
   }

   public fcl t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<ake<czu>> v() {
      return this.D;
   }

   public jj.b w() {
      return this.E;
   }

   public void a(xi $$0, boolean $$1) {
      xe $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new agc($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awu.c.a();
      xa.a $$3 = this.I.b();
      xe $$4 = this.H.pack(new xl($$0, $$1, $$2, $$3.a()));
      this.b(new age($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = awu.c.a();
      xa.a $$3 = this.I.b();
      ej $$4 = ej.a(xk.a(this.e($$0)), $$3x -> {
         xl $$4x = new xl($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new agd($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (xk.a(this.e($$0)).a().isEmpty()) {
         xa.a $$1 = this.I.b();
         this.b(new agd($$0, Instant.now(), 0L, ej.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<eh> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fvy $$0 = this.a.w();
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

   public void a(ckn $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = xd.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new agf(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fwa x() {
      return this.c;
   }

   public cmy y() {
      return this.F;
   }

   public boolean a(cmy $$0) {
      return $$0.a(this.y());
   }

   public euj z() {
      return this.R;
   }
}
