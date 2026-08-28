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

public class fye extends fya implements abn, wi {
   private static final Logger j = LogUtils.getLogger();
   private static final wu k = wu.c("multiplayer.unsecureserver.toast.title");
   private static final wu l = wu.c("multiplayer.unsecureserver.toast");
   private static final wu m = wu.c("multiplayer.disconnect.invalid_packet");
   private static final wu n = wu.c("multiplayer.disconnect.chat_validation_failed");
   private static final wu o = wu.c("connect.reconfiguring");
   private static final int p = 64;
   private final GameProfile q;
   private fyd r;
   private fyd.a s;
   private final Map<UUID, fyo> t = Maps.newHashMap();
   private final Set<fyo> u = new ReferenceOpenHashSet();
   private final fxy v;
   private final fyg w;
   private final ffe x = new ffe(this);
   private int y = 3;
   private int z = 3;
   private final aym A = aym.b();
   private CommandDispatcher<ev> B = new CommandDispatcher();
   private final cyk C;
   private final UUID D = UUID.randomUUID();
   private Set<akj<dcd>> E;
   private final jx.b F;
   private final cov G;
   private final cwa H;
   @Nullable
   private xf I;
   private xo.c J = xo.c.a;
   private xc K = new xc(20);
   private xh L = xh.a();
   private final fxx M = new fxx();
   private final fyn N;
   private final fyi O;
   @Nullable
   private fyl P;
   private boolean Q;
   private boolean R = false;
   private volatile boolean S;
   private final exd T = new exd();
   private final fyu U = new fyu();

   public fye(ffn $$0, vp $$1, fyh $$2) {
      super($$0, $$1, $$2);
      this.q = $$2.a();
      this.F = $$2.c();
      this.G = $$2.d();
      this.v = new fxy($$0, this.e);
      this.w = new fyg(this, $$0);
      this.N = new fyn(this, $$0.aP().m());
      this.C = new cyk(this.F);
      this.O = new fyi(this, $$0.aP());
      if ($$2.i() != null) {
         $$0.l.d().a($$2.i());
      }

      this.H = cwa.a(this.G);
   }

   public fyg g() {
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

   public cyk j() {
      return this.C;
   }

   @Override
   public void a(ade $$0) {
      ze.a($$0, this, this.a);
      this.a.q = new fym(this.a, this);
      afw $$1 = $$0.m();
      List<akj<dcd>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.E = Sets.newLinkedHashSet($$2);
      akj<dcd> $$3 = $$1.b();
      jj<dvz> $$4 = $$1.a();
      this.y = $$0.h();
      this.z = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fyd.a $$7 = new fyd.a(bqa.c, $$0.e(), $$6);
      this.s = $$7;
      this.r = new fyd(this, $$7, $$3, $$4, this.y, this.z, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.r, fnb.a.c);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.r, new avq(), new ffa());
         this.a.s.s(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cz());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.r.c(this.a.s);
      this.a.s.cC = new gcy(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.r, fnb.a.c);
      this.a.s.u($$0.j());
      this.a.s.b($$0.k());
      this.a.s.v($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.I = null;
      this.K = new xc(20);
      this.L = xh.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.Q = $$0.n();
      if (this.c != null && !this.R && !this.C()) {
         fju $$8 = fju.a(this.a, fju.a.j, k, l);
         this.a.ax().a($$8);
         this.R = true;
      }
   }

   @Override
   public void a(abo $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.r.c($$1);
         this.a($$1);
      } else {
         j.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bsd b(abo $$0) {
      bsj<?> $$1 = $$0.f();
      if ($$1 == bsj.by) {
         fyo $$2 = this.a($$0.e());
         if ($$2 == null) {
            j.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gda(this.r, $$2.a());
         }
      } else {
         return $$1.a((dcd)this.r);
      }
   }

   private void a(bsd $$0) {
      if ($$0 instanceof coc $$1) {
         this.a.aj().a((gsw)(new gsp($$1)));
      } else if ($$0 instanceof cep $$2) {
         boolean $$3 = $$2.Z_();
         gsj $$4;
         if ($$3) {
            $$4 = new gsh($$2);
         } else {
            $$4 = new gsi($$2);
         }

         this.a.aj().a((gsx)$$4);
      }
   }

   @Override
   public void a(abp $$0) {
      ze.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bsd $$4 = new bso(this.r, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.s(0.0F);
      $$4.t(0.0F);
      $$4.e($$0.b());
      this.r.c($$4);
   }

   @Override
   public void a(aeu $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(aes $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.ap().a($$0.e());
      }
   }

   @Override
   public void a(afp $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
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
   public void a(afq $$0) {
      ze.a($$0, this, this.a);
      if (this.a.r != null) {
         bqo $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(afr $$0) {
      ze.a($$0, this, this.a);
      if (this.a.r != null) {
         bqo $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(aen $$0) {
      ze.a($$0, this, this.a);
      if (cmg.d($$0.b())) {
         this.a.s.fY().k = $$0.b();
      }
   }

   @Override
   public void a(adh $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = $$0.a(this.r);
      if ($$1 != null) {
         if (!$$1.da()) {
            if ($$0.j()) {
               ahz $$2 = $$1.aj();
               evz $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(aec $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = $$0.a(this.r);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(ady $$0) {
      ze.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.r.a($$0x, bsd.c.b));
   }

   @Override
   public void a(adv $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      evz $$2 = $$1.ds();
      boolean $$3 = $$0.j().contains(btm.a);
      boolean $$4 = $$0.j().contains(btm.b);
      boolean $$5 = $$0.j().contains(btm.c);
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
      if ($$0.j().contains(btm.e)) {
         $$1.t($$1.dH() + $$19);
         $$1.P += $$19;
      } else {
         $$1.t($$19);
         $$1.P = $$19;
      }

      if ($$0.j().contains(btm.d)) {
         $$1.s($$1.dF() + $$18);
         $$1.O += $$18;
      } else {
         $$1.s($$18);
         $$1.O = $$18;
      }

      this.b.a(new agd($$0.i()));
      this.b.a(new agz.b($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH(), false));
   }

   @Override
   public void a(aed $$0) {
      ze.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.r.b($$0x, $$1, 19));
   }

   @Override
   public void a(acz $$0) {
      ze.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      add $$3 = $$0.g();
      this.r.a(() -> {
         this.a($$1, $$2, $$3);
         dun $$3x = this.r.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(acd $$0) {
      ze.a($$0, this, this.a);

      for (acd.a $$1 : $$0.b()) {
         this.r.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (acd.a $$2 : $$0.b()) {
         this.r.a(new dbk($$2.b().e, $$2.b().f));
      }

      for (acd.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.r.ao(); $$6 < this.r.ap(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, acy $$2) {
      this.r.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dun $$0, int $$1, int $$2) {
      enq $$3 = this.r.i().p();
      duo[] $$4 = $$0.d();
      dbk $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         duo $$7 = $$4[$$6];
         int $$8 = this.r.g($$6);
         $$3.a(kc.a($$5, $$8), $$7.c());
         this.r.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(act $$0) {
      ze.a($$0, this, this.a);
      this.r.i().a($$0.b());
      this.b($$0);
   }

   private void b(act $$0) {
      dbk $$1 = $$0.b();
      this.r.a(() -> {
         enq $$1x = this.r.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            kc $$3 = kc.a($$1, $$2);
            $$1x.a(dcm.b, $$3, null);
            $$1x.a(dcm.a, $$3, null);
         }

         for (int $$4 = this.r.ao(); $$4 < this.r.ap(); $$4++) {
            $$1x.a(kc.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(abw $$0) {
      ze.a($$0, this, this.a);
      this.r.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(afj $$0) {
      ze.a($$0, this, this.a);
      this.a.aY().d();
      this.D();
      fhn.b $$1 = this.a.l.d().k();
      this.a.c(new fpu(o, this.b));
      this.b.a(abc.b, new fyb(this.a, this.b, new fyh(this.q, this.e, this.F, this.G, this.d, this.c, this.f, this.i, $$1, this.h)));
      this.b(ago.a);
      this.b.a(abc.a);
   }

   @Override
   public void a(afo $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      bsy $$2 = (bsy)this.r.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bso) {
            this.r.a($$1.du(), $$1.dw(), $$1.dA(), avf.iH, avg.h, 0.1F, (this.A.i() - this.A.i()) * 0.35F + 0.9F, false);
         } else {
            this.r.a($$1.du(), $$1.dw(), $$1.dA(), avf.nC, avg.h, 0.2F, (this.A.i() - this.A.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gbf(this.a.ap(), this.a.aQ(), this.r, $$1, $$2));
         if ($$1 instanceof cir $$3) {
            cua $$4 = $$3.p();
            if (!$$4.e()) {
               $$4.h($$0.f());
            }

            if ($$4.e()) {
               this.r.a($$0.b(), bsd.c.b);
            }
         } else if (!($$1 instanceof bso)) {
            this.r.a($$0.b(), bsd.c.b);
         }
      }
   }

   @Override
   public void a(afl $$0) {
      ze.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ado $$0) {
      ze.a($$0, this, this.a);
      Optional<xn> $$1 = $$0.g().a(this.L);
      if ($$1.isEmpty()) {
         this.b.a(m);
      } else {
         this.L.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fyo $$3 = this.a($$2);
         if ($$3 == null) {
            j.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
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
               this.a.aY().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aY().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(acq $$0) {
      ze.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acp $$0) {
      ze.a($$0, this, this.a);
      Optional<xg> $$1 = $$0.b().a(this.L);
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
   public void a(abq $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bsy $$2 = (bsy)$$1;
            $$2.a(bqc.a);
         } else if ($$0.e() == 3) {
            bsy $$3 = (bsy)$$1;
            $$3.a(bqc.b);
         } else if ($$0.e() == 2) {
            cmh $$4 = (cmh)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, lj.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, lj.r);
         }
      }
   }

   @Override
   public void a(acw $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.n($$0.e());
      }
   }

   @Override
   public void a(afe $$0) {
      ze.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(aeq $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aez $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.e());
      if ($$1 == null) {
         j.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bH();

         for (int $$3 : $$0.b()) {
            bsd $$4 = this.r.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof coe) {
                     this.a.s.O = $$1.dF();
                     this.a.s.s($$1.dF());
                     this.a.s.o($$1.dF());
                  }

                  wu $$5 = wu.a("mount.onboard", this.a.m.B.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aet $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 instanceof bta) {
         ((bta)$$1).r($$0.e());
      }
   }

   private static cua a(cmh $$0) {
      for (bqc $$1 : bqc.values()) {
         cua $$2 = $$0.b($$1);
         if ($$2.a(cud.vt)) {
            return $$2;
         }
      }

      return new cua(cud.vt);
   }

   @Override
   public void a(acr $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = $$0.a(this.r);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gsw)(new gso((cjj)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, lj.ak, 30);
               this.r.a($$1.du(), $$1.dw(), $$1.dA(), avf.zz, $$1.de(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cmh)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gsw)(new gss((chf)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(acn $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.r));
      }
   }

   @Override
   public void a(aex $$0) {
      ze.a($$0, this, this.a);
      this.a.s.G($$0.b());
      this.a.s.gi().a($$0.e());
      this.a.s.gi().b($$0.f());
   }

   @Override
   public void a(aew $$0) {
      ze.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeb $$0) {
      ze.a($$0, this, this.a);
      afw $$1 = $$0.b();
      akj<dcd> $$2 = $$1.b();
      jj<dvz> $$3 = $$1.a();
      gcz $$4 = this.a.s;
      akj<dcd> $$5 = $$4.dP().af();
      boolean $$6 = $$2 != $$5;
      fnb.a $$7 = this.a($$4.ex(), $$2, $$5);
      if ($$6) {
         Map<epo, epq> $$8 = this.r.l();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         fyd.a $$11 = new fyd.a(this.s.q(), this.s.l(), $$10);
         this.s = $$11;
         this.r = new fyd(this, $$11, $$2, $$3, this.y, this.z, this.a::aI, this.a.f, $$9, $$1.c());
         this.r.a($$8);
         this.a.a(this.r, $$7);
      }

      this.a.t = null;
      if ($$4.ga()) {
         $$4.r();
      }

      gcz $$12;
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
         List<ajt.c<?>> $$14 = $$4.ap().c();
         if ($$14 != null) {
            $$12.ap().a($$14);
         }
      }

      if ($$0.a((byte)1)) {
         $$12.eS().a($$4.eS());
      }

      $$12.A();
      this.r.c($$12);
      $$12.s(-180.0F);
      $$12.cC = new gcy(this.a.m);
      this.a.q.a($$12);
      $$12.u($$4.go());
      $$12.b($$4.o());
      $$12.a($$1.h());
      $$12.f($$1.i());
      $$12.cJ = $$4.cJ;
      $$12.cK = $$4.cK;
      if (this.a.y instanceof fmh || this.a.y instanceof fmh.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   private fnb.a a(boolean $$0, akj<dcd> $$1, akj<dcd> $$2) {
      fnb.a $$3 = fnb.a.c;
      if (!$$0) {
         if ($$1 == dcd.i || $$2 == dcd.i) {
            $$3 = fnb.a.a;
         } else if ($$1 == dcd.j || $$2 == dcd.j) {
            $$3 = fnb.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(acs $$0) {
      ze.a($$0, this, this.a);
      dbv $$1 = new dbv(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.h(this.a.s.ds().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(acv $$0) {
      ze.a($$0, this, this.a);
      if (this.r.a($$0.f()) instanceof cgs $$2) {
         gcz $$3 = this.a.s;
         bqm $$4 = new bqm($$0.e());
         cqf $$5 = new cqf($$0.b(), $$3.fY(), $$4, $$2);
         $$3.cd = $$5;
         this.a.a(new fos($$5, $$3.fY(), $$2));
      }
   }

   @Override
   public void a(adk $$0) {
      ze.a($$0, this, this.a);
      fmu.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(ack $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      cua $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof foh)) {
            $$1.cd.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fY().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof foh $$5) {
            $$4 = !$$5.G();
         }

         if ($$0.b() == 0 && cqg.f($$3)) {
            if (!$$2.e()) {
               cua $$6 = $$1.cc.b($$3).g();
               if ($$6.e() || $$6.H() < $$2.H()) {
                  $$2.d(5);
               }
            }

            $$1.cc.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.cd.j && ($$0.b() != 0 || !$$4)) {
            $$1.cd.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(aci $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.cc.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.cd.j) {
         $$1.cd.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adl $$0) {
      ze.a($$0, this, this.a);
      ja $$1 = $$0.b();
      if (this.r.c_($$1) instanceof dqx $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dsh $$3 = this.r.a_($$1);
         dqx $$4 = new dqx($$1, $$3);
         $$4.a(this.r);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(abu $$0) {
      ze.a($$0, this, this.a);
      ja $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         tx $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.c($$2, this.F);
         }

         if ($$1x instanceof dpx && this.a.y instanceof foc) {
            ((foc)this.a.y).G();
         }
      });
   }

   @Override
   public void a(acj $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      if ($$1.cd != null && $$1.cd.j == $$0.b()) {
         $$1.cd.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(aev $$0) {
      ze.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof bsy $$2) {
         $$0.e().forEach($$1 -> $$2.a((bsk)$$1.getFirst(), (cua)$$1.getSecond()));
      }
   }

   @Override
   public void a(ach $$0) {
      ze.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(abv $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abt $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acu $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      acu.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = aye.d($$3 + 0.5F);
      if ($$2 == acu.b) {
         $$1.a(wu.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == acu.c) {
         this.r.k().b(true);
         this.r.e(0.0F);
      } else if ($$2 == acu.d) {
         this.r.k().b(false);
         this.r.e(1.0F);
      } else if ($$2 == acu.e) {
         this.a.q.a(dca.a($$4));
      } else if ($$2 == acu.f) {
         if ($$4 == 0) {
            this.a.s.cB.b(new agm(agm.a.a));
            this.a.a(new fnb(() -> false, fnb.a.b));
         } else if ($$4 == 1) {
            this.a.a(new fng(true, () -> {
               this.a.s.cB.b(new agm(agm.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == acu.g) {
         ffr $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fmi());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(wu.a("demo.help.movement", $$5.w.k(), $$5.x.k(), $$5.y.k(), $$5.z.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(wu.a("demo.help.jump", $$5.A.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(wu.a("demo.help.inventory", $$5.D.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(wu.a("demo.day.6", $$5.N.k()));
         }
      } else if ($$2 == acu.h) {
         this.r.a($$1, $$1.du(), $$1.dy(), $$1.dA(), avf.aF, avg.h, 0.18F, 0.45F);
      } else if ($$2 == acu.i) {
         this.r.e($$3);
      } else if ($$2 == acu.j) {
         this.r.c($$3);
      } else if ($$2 == acu.k) {
         this.r.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avf.uV, avg.g, 1.0F, 1.0F);
      } else if ($$2 == acu.l) {
         this.r.a(lj.q, $$1.du(), $$1.dw(), $$1.dA(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.r.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avf.hQ, avg.f, 1.0F, 1.0F);
         }
      } else if ($$2 == acu.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == acu.n) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == acu.o && this.P != null) {
         this.P.c();
      }
   }

   private void a(gcz $$0, fyd $$1, fnb.a $$2) {
      this.P = new fyl($$0, $$1, this.a.f);
      this.a.a(new fnb(this.P::b, $$2));
   }

   @Override
   public void a(adf $$0) {
      ze.a($$0, this, this.a);
      fhc $$1 = this.a.j.i();
      epo $$2 = $$0.b();
      epq $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = epq.a($$0.e(), $$0.f(), this.a.r.af());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(ada $$0) {
      ze.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(afs $$0) {
      ze.a($$0, this, this.a);
      this.v.a($$0);
   }

   @Override
   public void a(aee $$0) {
      ze.a($$0, this, this.a);
      akk $$1 = $$0.b();
      if ($$1 == null) {
         this.v.a(null, false);
      } else {
         af $$2 = this.v.a($$1);
         this.v.a($$2, false);
      }
   }

   @Override
   public void a(acg $$0) {
      ze.a($$0, this, this.a);
      this.B = new CommandDispatcher($$0.a(em.a(this.F, this.G)));
   }

   @Override
   public void a(afk $$0) {
      ze.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acf $$0) {
      ze.a($$0, this, this.a);
      this.w.a($$0.e(), $$0.b());
   }

   @Override
   public void a(afv $$0) {
      ze.a($$0, this, this.a);
      this.C.a($$0.b());
      ffa $$1 = this.a.s.m();
      $$1.a(this.C.b(), this.a.r.H_());
      this.U.a($$1, this.F);
   }

   @Override
   public void a(adu $$0) {
      ze.a($$0, this, this.a);
      evz $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(afn $$0) {
      ze.a($$0, this, this.a);
      if (!this.x.a($$0.b(), $$0.e())) {
         j.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(abr $$0) {
      ze.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<avm<?>> $$1 = (Entry<avm<?>>)$$4.next();
         avm<?> $$2 = (avm<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fnh $$4x) {
         $$4x.F();
      }
   }

   @Override
   public void a(adx $$0) {
      ze.a($$0, this, this.a);
      ffa $$1 = this.a.s.m();
      $$1.a($$0.f());
      adx.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (akk $$3 : $$0.b()) {
               this.C.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (akk $$4 : $$0.b()) {
               this.C.a($$4).ifPresent($$1::a);
            }

            for (akk $$5 : $$0.e()) {
               this.C.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (akk $$6 : $$0.b()) {
               this.C.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fjt.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fre) {
         ((fre)this.a.y).G();
      }
   }

   @Override
   public void a(afu $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 instanceof bsy) {
         jj<brj> $$2 = $$0.e();
         brl $$3 = new brl($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((bsy)$$1).c($$3, null);
      }
   }

   @Override
   public void a(zq $$0) {
      ze.a($$0, this, this.a);
      fyv $$1 = new fyv();
      $$0.b().forEach($$1::a);
      $$1.a(this.F, this.b.e());
      List<cua> $$2 = List.copyOf(csm.e().l());
      this.U.a($$2);
   }

   @Override
   public void a(adp $$0) {
   }

   @Override
   public void a(adq $$0) {
   }

   @Override
   public void a(adr $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fmh($$0.e(), this.r.k().l()));
         } else {
            this.a.s.fW();
         }
      }
   }

   @Override
   public void a(aca $$0) {
      ze.a($$0, this, this.a);
      this.s.a($$0.e());
      this.s.a($$0.b());
   }

   @Override
   public void a(aem $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = $$0.a(this.r);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(acx $$0) {
      ze.a($$0, this, this.a);
      dty $$1 = this.r.C_();
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
   public void a(aeh $$0) {
      ze.a($$0, this, this.a);
      this.r.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(aei $$0) {
      ze.a($$0, this, this.a);
      this.r.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aej $$0) {
      ze.a($$0, this, this.a);
      this.r.C_().a($$0.b());
   }

   @Override
   public void a(ael $$0) {
      ze.a($$0, this, this.a);
      this.r.C_().c($$0.b());
   }

   @Override
   public void a(aek $$0) {
      ze.a($$0, this, this.a);
      this.r.C_().b($$0.b());
   }

   @Override
   public void a(ace $$0) {
      ze.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aef $$0) {
      ze.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fyr::b).ifPresent(this.c::a);
         fys.b(this.c);
      }
   }

   @Override
   public void a(acm $$0) {
      ze.a($$0, this, this.a);
      this.w.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aeg $$0) {
      ze.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(aff $$0) {
      ze.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(afd $$0) {
      ze.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(afg $$0) {
      ze.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afm $$0) {
      ze.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(adz $$0) {
      ze.a($$0, this, this.a);
      if ($$0.a(this.r) instanceof bsy $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ads $$0) {
      ze.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fyo $$2 = this.t.remove($$1);
         if ($$2 != null) {
            this.u.remove($$2);
         }
      }
   }

   @Override
   public void a(adt $$0) {
      ze.a($$0, this, this.a);

      for (adt.b $$1 : $$0.f()) {
         fyo $$2 = new fyo(Objects.requireNonNull($$1.b()), this.C());
         if (this.t.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (adt.b $$3 : $$0.e()) {
         fyo $$4 = this.t.get($$3.a());
         if ($$4 == null) {
            j.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (adt.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(adt.a $$0, adt.b $$1, fyo $$2) {
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

   private void a(adt.b $$0, fyo $$1) {
      GameProfile $$2 = $$1.a();
      ayr $$3 = this.a.aU();
      if ($$3 == null) {
         j.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.C());
      } else {
         xl.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               xl $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cmk.b var7) {
               j.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.C());
            }
         } else {
            $$1.a(this.C());
         }
      }
   }

   private boolean C() {
      return this.a.aV() && this.Q;
   }

   @Override
   public void a(adn $$0) {
      ze.a($$0, this, this.a);
      cmh $$1 = this.a.s;
      $$1.fZ().b = $$0.e();
      $$1.fZ().d = $$0.g();
      $$1.fZ().a = $$0.b();
      $$1.fZ().c = $$0.f();
      $$1.fZ().a($$0.h());
      $$1.fZ().b($$0.i());
   }

   @Override
   public void a(afi $$0) {
      ze.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(afh $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(abx $$0) {
      ze.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(acl $$0) {
      ze.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gt().b($$0.b());
      } else {
         this.a.s.gt().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(adi $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.a.s.cZ();
      if ($$1 != this.a.s && $$1.da()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new aha($$1));
      }
   }

   @Override
   public void a(adj $$0) {
      ze.a($$0, this, this.a);
      cua $$1 = this.a.s.b($$0.b());
      fnz.a $$2 = fnz.a.a($$1);
      if ($$2 != null) {
         this.a.a(new fnz($$2));
      }
   }

   @Override
   public void a(aac $$0) {
      if ($$0 instanceof aal $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof aak $$2) {
         ((ghq)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof aaq $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof aas $$4) {
         ((ghy)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof aao $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof aam $$6) {
         ghe.a $$7 = new ghe.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof aan $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof aar $$9) {
         ghw $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof aai $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof zz $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof zy $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof aaj $$14) {
         this.a.k.o.a($$14.b(), this.r.Z());
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
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aey $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.T.a($$1, exg.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         ewv $$2 = this.T.a($$1);
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
   public void a(afb $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      exc $$2 = exc.c($$0.b());
      ewv $$3 = this.T.a($$1);
      if ($$3 != null) {
         exb $$4 = this.T.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         j.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(aea $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      exc $$2 = exc.c($$0.b());
      if ($$1 == null) {
         this.T.b($$2);
      } else {
         ewv $$3 = this.T.a($$1);
         if ($$3 != null) {
            this.T.e($$2, $$3);
         } else {
            j.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(aer $$0) {
      ze.a($$0, this, this.a);
      String $$1 = $$0.e();
      ewv $$2 = $$1 == null ? null : this.T.a($$1);
      this.T.a($$0.b(), $$2);
   }

   @Override
   public void a(afa $$0) {
      ze.a($$0, this, this.a);
      afa.a $$1 = $$0.e();
      ewy $$2;
      if ($$1 == afa.a.a) {
         $$2 = this.T.c($$0.f());
      } else {
         $$2 = this.T.b($$0.f());
         if ($$2 == null) {
            j.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<afa.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         exf.b $$2x = exf.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         exf.a $$3x = exf.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      afa.a $$5 = $$0.b();
      if ($$5 == afa.a.a) {
         for (String $$6 : $$0.g()) {
            this.T.a($$6, $$2);
         }
      } else if ($$5 == afa.a.b) {
         for (String $$7 : $$0.g()) {
            this.T.b($$7, $$2);
         }
      }

      if ($$1 == afa.a.b) {
         this.T.d($$2);
      }
   }

   @Override
   public void a(adb $$0) {
      ze.a($$0, this, this.a);
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
   public void a(aft $$0) {
      ze.a($$0, this, this.a);
      bsd $$1 = this.r.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bsy)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bud $$2 = ((bsy)$$1).eS();

            for (aft.a $$3 : $$0.e()) {
               buc $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  j.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bue $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(adm $$0) {
      ze.a($$0, this, this.a);
      cpe $$1 = this.a.s.cd;
      if ($$1.j == $$0.e()) {
         this.C.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fre) {
               fqy $$2 = ((fre)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(adc $$0) {
      ze.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      add $$3 = $$0.f();
      this.r.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, add $$2) {
      enq $$3 = this.r.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, dcm.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, dcm.b, $$7, $$8, $$9);
      $$3.a(new dbk($$0, $$1), true);
   }

   @Override
   public void a(adg $$0) {
      ze.a($$0, this, this.a);
      cpe $$1 = this.a.s.cd;
      if ($$0.b() == $$1.j && $$1 instanceof cqo $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(aep $$0) {
      ze.a($$0, this, this.a);
      this.y = $$0.b();
      this.a.m.b(this.y);
      this.r.i().a($$0.b());
   }

   @Override
   public void a(afc $$0) {
      ze.a($$0, this, this.a);
      this.z = $$0.b();
      this.r.h(this.z);
   }

   @Override
   public void a(aeo $$0) {
      ze.a($$0, this, this.a);
      this.r.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(abs $$0) {
      ze.a($$0, this, this.a);
      this.r.b($$0.b());
   }

   @Override
   public void a(abz $$0) {
      ze.a($$0, this, this.a);

      for (zb<? super abn> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(adw $$0) {
      ze.a($$0, this, this.a);
      if (this.r.a($$0.b()) instanceof cmo $$2) {
         $$2.d = $$0.e();
         $$2.e = $$0.f();
         $$2.f = $$0.g();
      }
   }

   @Override
   public void a(acc $$0) {
      this.M.a();
   }

   @Override
   public void a(acb $$0) {
      this.M.a($$0.b());
      this.b(new agl(this.M.b()));
   }

   @Override
   public void a(aco $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ajc $$0) {
      this.N.a($$0);
   }

   private void a(int $$0, int $$1, enq $$2, dcm $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, kc.a($$0, $$8, $$1), $$9 ? new dui((byte[])$$6.next().clone()) : new dui());
            this.r.c($$0, $$8, $$1);
         }
      }
   }

   public vp k() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.S;
   }

   public Collection<fyo> l() {
      return this.u;
   }

   public Collection<fyo> m() {
      return this.t.values();
   }

   public Collection<UUID> n() {
      return this.t.keySet();
   }

   @Nullable
   public fyo a(UUID $$0) {
      return this.t.get($$0);
   }

   @Nullable
   public fyo a(String $$0) {
      for (fyo $$1 : this.t.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile o() {
      return this.q;
   }

   public fxy p() {
      return this.v;
   }

   public CommandDispatcher<ev> q() {
      return this.B;
   }

   public fyd r() {
      return this.r;
   }

   public ffe s() {
      return this.x;
   }

   public UUID t() {
      return this.D;
   }

   public Set<akj<dcd>> u() {
      return this.E;
   }

   public jx.b v() {
      return this.F;
   }

   public void a(xk $$0, boolean $$1) {
      xg $$2 = $$0.l();
      if ($$2 != null && this.K.a($$2, $$1) && this.K.c() > 64) {
         this.D();
      }
   }

   private void D() {
      int $$0 = this.K.a();
      if ($$0 > 0) {
         this.b(new agg($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = axb.c.a();
      xc.a $$3 = this.K.b();
      xg $$4 = this.J.pack(new xn($$0, $$1, $$2, $$3.a()));
      this.b(new agj($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      xm<ev> $$1 = xm.b(this.e($$0));
      if ($$1.a().isEmpty()) {
         this.b(new agh($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = axb.c.a();
         xc.a $$4 = this.K.b();
         ex $$5 = ex.a($$1, $$3x -> {
            xn $$4x = new xn($$3x, $$2, $$3, $$4.a());
            return this.J.pack($$4x);
         });
         this.b(new agi($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public boolean d(String $$0) {
      if (!xm.a(this.e($$0))) {
         this.b(new agh($$0));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<ev> e(String $$0) {
      return this.B.parse($$0, this.w);
   }

   @Override
   public void d() {
      if (this.b.h()) {
         fyp $$0 = this.a.w();
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

   public void a(cmj $$0) {
      if (this.a.b(this.q.getId())) {
         if (this.I == null || !this.I.c().equals($$0)) {
            this.I = xf.a($$0);
            this.J = this.I.a(this.q.getId());
            this.b(new agk(this.I.a().a()));
         }
      }
   }

   @Nullable
   public fyr w() {
      return this.c;
   }

   public cov x() {
      return this.G;
   }

   public boolean a(cov $$0) {
      return $$0.a(this.x());
   }

   public exd y() {
      return this.T;
   }

   public cwa z() {
      return this.H;
   }

   public void A() {
      this.U.a();
   }

   public fyu B() {
      return this.U;
   }
}
