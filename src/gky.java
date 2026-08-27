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

public class gky extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 2;
   private final exh m;
   private boolean n = true;
   private int o = -1;
   @Nullable
   private cvk p;
   @Nullable
   private glb q;
   @Nullable
   private UUID r;
   private int s = 0;

   public gky(Thread $$0, exh $$1, eil.c $$2, arl $$3, aju $$4, ajr $$5, apf $$6) {
      super($$0, $$2, $$3, $$4, $$1.X(), $$1.ar(), $$5, $$6);
      this.b($$1.W());
      this.c($$1.I());
      this.a(new gkx(this, this.ba(), this.g));
      this.m = $$1;
   }

   @Override
   public boolean e() {
      k.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.R();
      this.u_();
      GameProfile $$0 = this.P();
      String $$1 = this.aY().e();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean A() {
      return this.n;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.n;
      this.n = exh.O().ag();
      bil $$2 = this.aR();
      if (!$$1 && this.n) {
         $$2.a("autoSave");
         k.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = exh.O().J() != null;
      if ($$3 && this.n) {
         this.a();
      } else {
         if ($$1 && !this.n) {
            this.C();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.m.m.e().c());
         if ($$4 != this.ae().p()) {
            k.info("Changing view distance to {}, from {}", $$4, this.ae().p());
            this.ae().a($$4);
         }

         int $$5 = Math.max(2, this.m.m.f().c());
         if ($$5 != this.s) {
            k.info("Changing simulation distance to {}, from {}", $$5, this.s);
            this.ae().b($$5);
            this.s = $$5;
         }
      }
   }

   @Override
   public void a(long $$0) {
      this.m.aN().b($$0);
   }

   private void a() {
      for (aow $$0 : this.ae().t()) {
         $$0.a(atu.l);
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
   public File z() {
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
      $$0.a("Is Modded", () -> this.M().b());
      $$0.a("Launched Version", this.m::h);
      return $$0;
   }

   @Override
   public awg M() {
      return exh.e().a(super.M());
   }

   @Override
   public boolean a(@Nullable cvk $$0, boolean $$1, int $$2) {
      try {
         this.m.aR();
         this.m.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fpy $$1x = this.m.J();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.m);
         this.af().a(null, $$2);
         k.info("Started serving on {}", $$2);
         this.o = $$2;
         this.q = new glb(this.ac(), $$2 + "");
         this.q.start();
         this.p = $$0;
         this.ae().b($$1);
         int $$3 = this.c(this.m.s.fS());
         this.m.s.a($$3);

         for (aow $$4 : this.ae().t()) {
            this.aE().a($$4);
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
         for (aow $$1 : Lists.newArrayList(this.ae().t())) {
            if (!$$1.cw().equals(this.r)) {
               this.ae().c($$1);
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
   public int O() {
      return this.o;
   }

   @Override
   public void a(cvk $$0) {
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
      return this.P() != null && $$0.getName().equalsIgnoreCase(this.P().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.m.m.g().c() * (double)$$0);
   }

   @Override
   public boolean aW() {
      return this.m.m.af;
   }

   @Nullable
   @Override
   public cvk bb() {
      return this.p() ? (cvk)MoreObjects.firstNonNull(this.p, this.j.k()) : null;
   }
}
