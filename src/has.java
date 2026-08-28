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

public class has extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 2;
   private final fib n;
   private boolean o = true;
   private int p = -1;
   @Nullable
   private ddp q;
   @Nullable
   private hav r;
   @Nullable
   private UUID s;
   private int t = 0;

   public has(Thread $$0, fib $$1, esh.c $$2, aud $$3, ama $$4, alw $$5, arq $$6) {
      super($$0, $$2, $$3, $$4, $$1.Z(), $$1.at(), $$5, $$6);
      this.b($$1.Y());
      this.c($$1.K());
      this.a(new har(this, this.bc(), this.g));
      this.n = $$1;
   }

   @Override
   public boolean e() {
      l.info("Starting integrated minecraft server version {}", ab.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.V();
      this.s_();
      GameProfile $$0 = this.T();
      String $$1 = this.ba().e();
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
      this.o = fib.Q().ah();
      bny $$2 = this.aS();
      if (!$$1 && this.o) {
         $$2.a("autoSave");
         l.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = fib.Q().L() != null;
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

   protected bmk a() {
      return this.n.aQ().l();
   }

   @Override
   public boolean g() {
      return true;
   }

   private void b() {
      for (arh $$0 : this.ag().t()) {
         $$0.a(awn.l);
      }
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public boolean J_() {
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
   public void a(o $$0) {
      this.n.b($$0);
   }

   @Override
   public ac a(ac $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.Q().b());
      $$0.a("Launched Version", this.n::i);
      return $$0;
   }

   @Override
   public azb Q() {
      return fib.e().a(super.Q());
   }

   @Override
   public boolean a(@Nullable ddp $$0, boolean $$1, int $$2) {
      try {
         this.n.aU();
         this.n.L().w();
         this.ah().a(null, $$2);
         l.info("Started serving on {}", $$2);
         this.p = $$2;
         this.r = new hav(this.ae(), $$2 + "");
         this.r.start();
         this.q = $$0;
         this.ag().b($$1);
         int $$3 = this.c(this.n.t.gb());
         this.n.t.a($$3);

         for (arh $$4 : this.ag().t()) {
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
         for (arh $$1 : Lists.newArrayList(this.ag().t())) {
            if (!$$1.cD().equals(this.s)) {
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
   public void a(ddp $$0) {
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
   public boolean aY() {
      return this.n.n.ad;
   }

   @Nullable
   @Override
   public ddp be() {
      return this.r() ? (ddp)MoreObjects.firstNonNull(this.q, this.j.k()) : null;
   }

   @Override
   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = super.b($$0, $$1, $$2);
      this.c();
      return $$3;
   }

   private void c() {
      if (this.f.b()) {
         this.n.execute(() -> fmj.a(this.n));
      }
   }

   @Override
   public void a(Throwable $$0, dxp $$1, dcy $$2) {
      super.a($$0, $$1, $$2);
      this.c();
      this.n.execute(() -> fmj.a(this.n, $$2));
   }

   @Override
   public void b(Throwable $$0, dxp $$1, dcy $$2) {
      super.b($$0, $$1, $$2);
      this.c();
      this.n.execute(() -> fmj.b(this.n, $$2));
   }
}
