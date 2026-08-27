import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class gcf extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 2;
   private final eqn p;
   private boolean q = true;
   private int r = -1;
   @Nullable
   private cph s;
   @Nullable
   private gci t;
   @Nullable
   private UUID u;
   private int v = 0;

   public gcf(Thread $$0, eqn $$1, ebv.c $$2, amv $$3, afk $$4, afh $$5, aks $$6) {
      super($$0, $$2, $$3, $$4, $$1.W(), $$1.ar(), $$5, $$6);
      this.b($$1.U().g());
      this.c($$1.H());
      this.a(new gce(this, this.aW(), this.i));
      this.p = $$1;
   }

   @Override
   public boolean e() {
      n.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.P();
      this.n_();
      GameProfile $$0 = this.N();
      String $$1 = this.aU().g();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.q;
      this.q = eqn.N().af();
      bde $$2 = this.aN();
      if (!$$1 && this.q) {
         $$2.a("autoSave");
         n.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = eqn.N().I() != null;
      if ($$3 && this.q) {
         this.a();
      } else {
         if ($$1 && !this.q) {
            this.A();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.p.m.d().c());
         if ($$4 != this.ac().p()) {
            n.info("Changing view distance to {}, from {}", $$4, this.ac().p());
            this.ac().a($$4);
         }

         int $$5 = Math.max(2, this.p.m.e().c());
         if ($$5 != this.v) {
            n.info("Changing simulation distance to {}, from {}", $$5, this.v);
            this.ac().b($$5);
            this.v = $$5;
         }
      }
   }

   private void a() {
      for (akj $$0 : this.ac().t()) {
         $$0.a(ape.l);
      }
   }

   @Override
   public boolean k() {
      return true;
   }

   @Override
   public boolean N_() {
      return true;
   }

   @Override
   public File z() {
      return this.p.p;
   }

   @Override
   public boolean l() {
      return false;
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public void a(o $$0) {
      this.p.b($$0);
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.K().b());
      $$0.a("Launched Version", this.p::g);
      return $$0;
   }

   @Override
   public arn K() {
      return eqn.d().a(super.K());
   }

   @Override
   public boolean a(@Nullable cph $$0, boolean $$1, int $$2) {
      try {
         this.p.aQ();
         this.p.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fif $$1x = this.p.I();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.p);
         this.ad().a(null, $$2);
         n.info("Started serving on {}", $$2);
         this.r = $$2;
         this.t = new gci(this.aa(), $$2 + "");
         this.t.start();
         this.s = $$0;
         this.ac().b($$1);
         int $$3 = this.c(this.p.t.fP());
         this.p.t.a($$3);

         for (akj $$4 : this.ac().t()) {
            this.aC().a($$4);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void t() {
      super.t();
      if (this.t != null) {
         this.t.interrupt();
         this.t = null;
      }
   }

   @Override
   public void a(boolean $$0) {
      this.h(() -> {
         for (akj $$1 : Lists.newArrayList(this.ac().t())) {
            if (!$$1.cv().equals(this.u)) {
               this.ac().c($$1);
            }
         }
      });
      super.a($$0);
      if (this.t != null) {
         this.t.interrupt();
         this.t = null;
      }
   }

   @Override
   public boolean p() {
      return this.r > -1;
   }

   @Override
   public int M() {
      return this.r;
   }

   @Override
   public void a(cph $$0) {
      super.a($$0);
      this.s = null;
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   public int i() {
      return 2;
   }

   @Override
   public int j() {
      return 2;
   }

   public void a(UUID $$0) {
      this.u = $$0;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return this.N() != null && $$0.getName().equalsIgnoreCase(this.N().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.p.m.f().c() * (double)$$0);
   }

   @Override
   public boolean aS() {
      return this.p.m.ai;
   }

   @Nullable
   @Override
   public cph aX() {
      return this.p() ? (cph)MoreObjects.firstNonNull(this.s, this.m.m()) : null;
   }
}
