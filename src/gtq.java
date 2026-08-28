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

public class gtq extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 2;
   private final fft m;
   private boolean n = true;
   private int o = -1;
   @Nullable
   private dcc p;
   @Nullable
   private gtt q;
   @Nullable
   private UUID r;
   private int s = 0;

   public gtq(Thread $$0, fft $$1, eqi.c $$2, ath $$3, alh $$4, ale $$5, aqw $$6) {
      super($$0, $$2, $$3, $$4, $$1.Z(), $$1.as(), $$5, $$6);
      this.b($$1.Y());
      this.c($$1.K());
      this.a(new gtp(this, this.be(), this.g));
      this.m = $$1;
   }

   @Override
   public boolean e() {
      k.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.V();
      this.t_();
      GameProfile $$0 = this.T();
      String $$1 = this.bc().e();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean E() {
      return this.n;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.n;
      this.n = fft.Q().ah();
      bmu $$2 = this.aU();
      if (!$$1 && this.n) {
         $$2.a("autoSave");
         k.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = fft.Q().L() != null;
      if ($$3 && this.n) {
         this.b();
      } else {
         if ($$1 && !this.n) {
            this.G();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.m.m.e().c());
         if ($$4 != this.ai().p()) {
            k.info("Changing view distance to {}, from {}", $$4, this.ai().p());
            this.ai().a($$4);
         }

         int $$5 = Math.max(2, this.m.m.f().c());
         if ($$5 != this.s) {
            k.info("Changing simulation distance to {}, from {}", $$5, this.s);
            this.ai().b($$5);
            this.s = $$5;
         }
      }
   }

   protected blg a() {
      return this.m.aP().l();
   }

   @Override
   public boolean g() {
      return true;
   }

   private void b() {
      for (aqn $$0 : this.ai().t()) {
         $$0.a(avr.l);
      }
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public File D() {
      return this.m.p;
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
      this.m.b($$0);
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.Q().b());
      $$0.a("Launched Version", this.m::i);
      return $$0;
   }

   @Override
   public ayf Q() {
      return fft.e().a(super.Q());
   }

   @Override
   public boolean a(@Nullable dcc $$0, boolean $$1, int $$2) {
      try {
         this.m.aT();
         this.m.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fyk $$1x = this.m.L();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.m);
         this.aj().a(null, $$2);
         k.info("Started serving on {}", $$2);
         this.o = $$2;
         this.q = new gtt(this.ag(), $$2 + "");
         this.q.start();
         this.p = $$0;
         this.ai().b($$1);
         int $$3 = this.c(this.m.s.fY());
         this.m.s.a($$3);

         for (aqn $$4 : this.ai().t()) {
            this.aI().a($$4);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void v() {
      super.v();
      if (this.q != null) {
         this.q.interrupt();
         this.q = null;
      }
   }

   @Override
   public void a(boolean $$0) {
      this.h(() -> {
         for (aqn $$1 : Lists.newArrayList(this.ai().t())) {
            if (!$$1.cA().equals(this.r)) {
               this.ai().c($$1);
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
   public boolean r() {
      return this.o > -1;
   }

   @Override
   public int S() {
      return this.o;
   }

   @Override
   public void a(dcc $$0) {
      super.a($$0);
      this.p = null;
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
      this.r = $$0;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return this.T() != null && $$0.getName().equalsIgnoreCase(this.T().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.m.m.g().c() * (double)$$0);
   }

   @Override
   public boolean ba() {
      return this.m.m.ae;
   }

   @Nullable
   @Override
   public dcc bg() {
      return this.r() ? (dcc)MoreObjects.firstNonNull(this.p, this.j.k()) : null;
   }

   @Override
   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = super.b($$0, $$1, $$2);
      this.c();
      return $$3;
   }

   private void c() {
      if (this.f.b()) {
         fka.a(this.m);
      }
   }

   @Override
   public void a(dbm $$0) {
      this.c();
      fka.a(this.m, $$0);
   }

   @Override
   public void b(dbm $$0) {
      this.c();
      fka.b(this.m, $$0);
   }
}
