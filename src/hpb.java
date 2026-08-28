import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class hpb extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 2;
   private final fqq n;
   private boolean o = true;
   private int p = -1;
   @Nullable
   private dkg q;
   @Nullable
   private hpe r;
   @Nullable
   private UUID s;
   private int t = 0;

   public hpb(Thread $$0, fqq $$1, fah.c $$2, auz $$3, amq $$4, amm $$5, asm $$6) {
      super($$0, $$2, $$3, $$4, $$1.Z(), $$1.au(), $$5, $$6);
      this.b($$1.Y());
      this.c($$1.K());
      this.a(new hpa(this, this.bb(), this.g));
      this.n = $$1;
   }

   @Override
   public boolean e() {
      l.info("Starting integrated minecraft server version {}", ac.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.V();
      this.u_();
      GameProfile $$0 = this.T();
      String $$1 = this.aZ().e();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean E() {
      return this.o;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.o;
      this.o = fqq.Q().ai();
      brm $$2 = brl.a();
      if (!$$1 && this.o) {
         $$2.a("autoSave");
         l.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = fqq.Q().L() != null;
      if ($$3 && this.o) {
         this.b();
      } else {
         if ($$1 && !this.o) {
            this.H();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.n.n.e().c());
         if ($$4 != this.ag().p()) {
            l.info("Changing view distance to {}, from {}", $$4, this.ag().p());
            this.ag().a($$4);
         }

         int $$5 = Math.max(2, this.n.n.f().c());
         if ($$5 != this.t) {
            l.info("Changing simulation distance to {}, from {}", $$5, this.t);
            this.ag().b($$5);
            this.t = $$5;
         }
      }
   }

   protected bpn a() {
      return this.n.aQ().l();
   }

   @Override
   public boolean g() {
      return true;
   }

   private void b() {
      for (asc $$0 : this.ag().t()) {
         $$0.a(axi.l);
      }
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   public Path D() {
      return this.n.q.toPath();
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public int o() {
      return 0;
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public void a(p $$0) {
      this.n.b($$0);
   }

   @Override
   public ae a(ae $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.Q().b());
      $$0.a("Launched Version", this.n::i);
      return $$0;
   }

   @Override
   public azy Q() {
      return fqq.e().a(super.Q());
   }

   @Override
   public boolean a(@Nullable dkg $$0, boolean $$1, int $$2) {
      try {
         this.n.aU();
         this.n.L().v();
         this.ah().a(null, $$2);
         l.info("Started serving on {}", $$2);
         this.p = $$2;
         this.r = new hpe(this.ae(), $$2 + "");
         this.r.start();
         this.q = $$0;
         this.ag().b($$1);
         int $$3 = this.c(this.n.t.gi());
         this.n.t.a($$3);

         for (asc $$4 : this.ag().t()) {
            this.aG().a($$4);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void v() {
      super.v();
      if (this.r != null) {
         this.r.interrupt();
         this.r = null;
      }
   }

   @Override
   public void a(boolean $$0) {
      this.h(() -> {
         for (asc $$1 : Lists.newArrayList(this.ag().t())) {
            if (!$$1.cG().equals(this.s)) {
               this.ag().c($$1);
            }
         }
      });
      super.a($$0);
      if (this.r != null) {
         this.r.interrupt();
         this.r = null;
      }
   }

   @Override
   public boolean r() {
      return this.p > -1;
   }

   @Override
   public int S() {
      return this.p;
   }

   @Override
   public void a(dkg $$0) {
      super.a($$0);
      this.q = null;
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public int k() {
      return 2;
   }

   @Override
   public int l() {
      return 2;
   }

   public void a(UUID $$0) {
      this.s = $$0;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return this.T() != null && $$0.getName().equalsIgnoreCase(this.T().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.n.n.g().c() * (double)$$0);
   }

   @Override
   public boolean aX() {
      return this.n.n.ad;
   }

   @Nullable
   @Override
   public dkg bd() {
      return this.r() && !this.v_() ? (dkg)MoreObjects.firstNonNull(this.q, this.j.k()) : null;
   }

   @Override
   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = super.b($$0, $$1, $$2);
      this.d();
      return $$3;
   }

   private void d() {
      if (this.f.b()) {
         this.n.execute(() -> fwh.a(this.n));
      }
   }

   @Override
   public void a(Throwable $$0, efg $$1, djo $$2) {
      super.a($$0, $$1, $$2);
      this.d();
      this.n.execute(() -> fwh.a(this.n, $$2));
   }

   @Override
   public void b(Throwable $$0, efg $$1, djo $$2) {
      super.b($$0, $$1, $$2);
      this.d();
      this.n.execute(() -> fwh.b(this.n, $$2));
   }
}
