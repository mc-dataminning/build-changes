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

public class gtf extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 2;
   private final ffg m;
   private boolean n = true;
   private int o = -1;
   @Nullable
   private dbw p;
   @Nullable
   private gti q;
   @Nullable
   private UUID r;
   private int s = 0;

   public gtf(Thread $$0, ffg $$1, epx.c $$2, aua $$3, amc $$4, alz $$5, arp $$6) {
      super($$0, $$2, $$3, $$4, $$1.Z(), $$1.as(), $$5, $$6);
      this.b($$1.Y());
      this.c($$1.K());
      this.a(new gte(this, this.bd(), this.g));
      this.m = $$1;
   }

   @Override
   public boolean e() {
      k.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.U();
      this.t_();
      GameProfile $$0 = this.S();
      String $$1 = this.bb().e();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean D() {
      return this.n;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.n;
      this.n = ffg.Q().ah();
      bnj $$2 = this.aT();
      if (!$$1 && this.n) {
         $$2.a("autoSave");
         k.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = ffg.Q().L() != null;
      if ($$3 && this.n) {
         this.b();
      } else {
         if ($$1 && !this.n) {
            this.F();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.m.m.e().c());
         if ($$4 != this.ah().p()) {
            k.info("Changing view distance to {}, from {}", $$4, this.ah().p());
            this.ah().a($$4);
         }

         int $$5 = Math.max(2, this.m.m.f().c());
         if ($$5 != this.s) {
            k.info("Changing simulation distance to {}, from {}", $$5, this.s);
            this.ah().b($$5);
            this.s = $$5;
         }
      }
   }

   protected blv a() {
      return this.m.aP().l();
   }

   @Override
   public boolean g() {
      return true;
   }

   private void b() {
      for (arg $$0 : this.ah().t()) {
         $$0.a(awk.l);
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
   public File C() {
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
      $$0.a("Is Modded", () -> this.P().b());
      $$0.a("Launched Version", this.m::i);
      return $$0;
   }

   @Override
   public ayy P() {
      return ffg.e().a(super.P());
   }

   @Override
   public boolean a(@Nullable dbw $$0, boolean $$1, int $$2) {
      try {
         this.m.aT();
         this.m.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fxx $$1x = this.m.L();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.m);
         this.ai().a(null, $$2);
         k.info("Started serving on {}", $$2);
         this.o = $$2;
         this.q = new gti(this.af(), $$2 + "");
         this.q.start();
         this.p = $$0;
         this.ah().b($$1);
         int $$3 = this.c(this.m.s.gb());
         this.m.s.a($$3);

         for (arg $$4 : this.ah().t()) {
            this.aH().a($$4);
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
         for (arg $$1 : Lists.newArrayList(this.ah().t())) {
            if (!$$1.cz().equals(this.r)) {
               this.ah().c($$1);
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
   public int R() {
      return this.o;
   }

   @Override
   public void a(dbw $$0) {
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
      return this.S() != null && $$0.getName().equalsIgnoreCase(this.S().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.m.m.g().c() * (double)$$0);
   }

   @Override
   public boolean aZ() {
      return this.m.m.ae;
   }

   @Nullable
   @Override
   public dbw bf() {
      return this.r() ? (dbw)MoreObjects.firstNonNull(this.p, this.j.k()) : null;
   }

   @Override
   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = super.b($$0, $$1, $$2);
      this.c();
      return $$3;
   }

   private void c() {
      if (this.f.b()) {
         fjn.a(this.m);
      }
   }

   @Override
   public void a(dbg $$0) {
      this.c();
      fjn.a(this.m, $$0);
   }

   @Override
   public void b(dbg $$0) {
      this.c();
      fjn.b(this.m, $$0);
   }
}
