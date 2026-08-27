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

public class ghn extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 2;
   private final euk n;
   private boolean o = true;
   private int p = -1;
   @Nullable
   private csv q;
   @Nullable
   private ghq r;
   @Nullable
   private UUID s;
   private int t = 0;

   public ghn(Thread $$0, euk $$1, efu.c $$2, apd $$3, ahp $$4, ahm $$5, amz $$6) {
      super($$0, $$2, $$3, $$4, $$1.W(), $$1.aq(), $$5, $$6);
      this.b($$1.V());
      this.c($$1.H());
      this.a(new ghm(this, this.ba(), this.h));
      this.n = $$1;
   }

   @Override
   public boolean e() {
      l.info("Starting integrated minecraft server version {}", aa.b().c());
      this.d(true);
      this.f(true);
      this.g(true);
      this.R();
      this.u_();
      GameProfile $$0 = this.P();
      String $$1 = this.aY().g();
      this.d($$0 != null ? $$0.getName() + " - " + $$1 : $$1);
      return true;
   }

   @Override
   public boolean A() {
      return this.o;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      boolean $$1 = this.o;
      this.o = euk.N().af();
      bgc $$2 = this.aR();
      if (!$$1 && this.o) {
         $$2.a("autoSave");
         l.info("Saving and pausing game...");
         this.b(false, false, false);
         $$2.c();
      }

      boolean $$3 = euk.N().I() != null;
      if ($$3 && this.o) {
         this.a();
      } else {
         if ($$1 && !this.o) {
            this.C();
         }

         super.a($$0);
         int $$4 = Math.max(2, this.n.m.e().c());
         if ($$4 != this.ae().p()) {
            l.info("Changing view distance to {}, from {}", $$4, this.ae().p());
            this.ae().a($$4);
         }

         int $$5 = Math.max(2, this.n.m.f().c());
         if ($$5 != this.t) {
            l.info("Changing simulation distance to {}, from {}", $$5, this.t);
            this.ae().b($$5);
            this.t = $$5;
         }
      }
   }

   @Override
   public void a(long $$0) {
      this.n.aM().b($$0);
   }

   private void a() {
      for (amq $$0 : this.ae().t()) {
         $$0.a(arm.l);
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
      return this.n.p;
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
      this.n.b($$0);
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Integrated Server (map_client.txt)");
      $$0.a("Is Modded", () -> this.M().b());
      $$0.a("Launched Version", this.n::h);
      return $$0;
   }

   @Override
   public atx M() {
      return euk.e().a(super.M());
   }

   @Override
   public boolean a(@Nullable csv $$0, boolean $$1, int $$2) {
      try {
         this.n.aQ();
         this.n.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent($$0xx -> {
               fmu $$1x = this.n.I();
               if ($$1x != null) {
                  $$1x.a($$0xx);
               }
            }), this.n);
         this.af().a(null, $$2);
         l.info("Started serving on {}", $$2);
         this.p = $$2;
         this.r = new ghq(this.ac(), $$2 + "");
         this.r.start();
         this.q = $$0;
         this.ae().b($$1);
         int $$3 = this.c(this.n.s.fR());
         this.n.s.a($$3);

         for (amq $$4 : this.ae().t()) {
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
      if (this.r != null) {
         this.r.interrupt();
         this.r = null;
      }
   }

   @Override
   public void a(boolean $$0) {
      this.h(() -> {
         for (amq $$1 : Lists.newArrayList(this.ae().t())) {
            if (!$$1.cw().equals(this.s)) {
               this.ae().c($$1);
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
   public boolean p() {
      return this.p > -1;
   }

   @Override
   public int O() {
      return this.p;
   }

   @Override
   public void a(csv $$0) {
      super.a($$0);
      this.q = null;
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
      this.s = $$0;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return this.P() != null && $$0.getName().equalsIgnoreCase(this.P().getName());
   }

   @Override
   public int b(int $$0) {
      return (int)(this.n.m.g().c() * (double)$$0);
   }

   @Override
   public boolean aW() {
      return this.n.m.af;
   }

   @Nullable
   @Override
   public csv bb() {
      return this.p() ? (csv)MoreObjects.firstNonNull(this.q, this.k.m()) : null;
   }
}
