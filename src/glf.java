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

public class glf extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 2;
   private final exo m;
   private boolean n = true;
   private int o = -1;
   @Nullable
   private cvo p;
   @Nullable
   private gli q;
   @Nullable
   private UUID r;
   private int s = 0;

   public glf(Thread $$0, exo $$1, eis.c $$2, arm $$3, aju $$4, ajr $$5, apg $$6) {
      super($$0, $$2, $$3, $$4, $$1.Y(), $$1.as(), $$5, $$6);
      this.b($$1.X());
      this.c($$1.J());
      this.a(new gle(this, this.bc(), this.g));
      this.m = $$1;
   }

   @Override
   public boolean e() {
      k.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.T();
      this.u_();
      GameProfile $$0 = this.R();
      String $$1 = this.ba().e();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean B() {
      return this.n;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.n;
      this.n = exo.P().ah();
      bin $$2 = this.aT();
      if (!$$1 && this.n) {
         $$2.a("autoSave");
         k.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = exo.P().K() != null;
      if ($$3 && this.n) {
         this.a();
      } else {
         if ($$1 && !this.n) {
            this.E();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.m.m.e().c());
         if ($$4 != this.ag().p()) {
            k.info("Changing view distance to {}, from {}", $$4, this.ag().p());
            this.ag().a($$4);
         }

         int $$5 = Math.max(2, this.m.m.f().c());
         if ($$5 != this.s) {
            k.info("Changing simulation distance to {}, from {}", $$5, this.s);
            this.ag().b($$5);
            this.s = $$5;
         }
      }
   }

   @Nullable
   @Override
   public bhx D() {
      return this.m.aO().k();
   }

   private void a() {
      for (aox $$0 : this.ag().t()) {
         $$0.a(atv.l);
      }
   }

   @Override
   public boolean k() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public File A() {
      return this.m.p;
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
      this.m.b($$0);
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.O().b());
      $$0.a("Launched Version", this.m::h);
      return $$0;
   }

   @Override
   public awh O() {
      return exo.e().a(super.O());
   }

   @Override
   public boolean a(@Nullable cvo $$0, boolean $$1, int $$2) {
      try {
         this.m.aS();
         this.m.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fqf $$1x = this.m.K();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.m);
         this.ah().a(null, $$2);
         k.info("Started serving on {}", $$2);
         this.o = $$2;
         this.q = new gli(this.ae(), $$2 + "");
         this.q.start();
         this.p = $$0;
         this.ag().b($$1);
         int $$3 = this.c(this.m.s.fS());
         this.m.s.a($$3);

         for (aox $$4 : this.ag().t()) {
            this.aG().a($$4);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void t() {
      super.t();
      if (this.q != null) {
         this.q.interrupt();
         this.q = null;
      }
   }

   @Override
   public void a(boolean $$0) {
      this.h(() -> {
         for (aox $$1 : Lists.newArrayList(this.ag().t())) {
            if (!$$1.cw().equals(this.r)) {
               this.ag().c($$1);
            }
         }
      });
      super.a($$0);
      if (this.q != null) {
         this.q.interrupt();
         this.q = null;
      }
   }

   @Override
   public boolean p() {
      return this.o > -1;
   }

   @Override
   public int Q() {
      return this.o;
   }

   @Override
   public void a(cvo $$0) {
      super.a($$0);
      this.p = null;
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
      this.r = $$0;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return this.R() != null && $$0.getName().equalsIgnoreCase(this.R().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.m.m.g().c() * (double)$$0);
   }

   @Override
   public boolean aY() {
      return this.m.m.af;
   }

   @Nullable
   @Override
   public cvo bd() {
      return this.p() ? (cvo)MoreObjects.firstNonNull(this.p, this.j.k()) : null;
   }
}
