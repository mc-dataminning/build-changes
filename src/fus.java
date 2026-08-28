import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fus extends fpt {
   private static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("selectWorld.enterName").a(n.h);
   private static final xd c = xd.c("selectWorld.edit.resetIcon");
   private static final xd d = xd.c("selectWorld.edit.openFolder");
   private static final xd s = xd.c("selectWorld.edit.backup");
   private static final xd u = xd.c("selectWorld.edit.backupFolder");
   private static final xd v = xd.c("selectWorld.edit.optimize");
   private static final xd w = xd.c("optimizeWorld.confirm.title");
   private static final xd x = xd.c("optimizeWorld.confirm.description");
   private static final xd y = xd.c("optimizeWorld.confirm.proceed");
   private static final xd z = xd.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fns D = fns.d().a(5);
   private final BooleanConsumer E;
   private final esh.c F;
   private final fkj G;

   public static fus a(fib $$0, esh.c $$1, BooleanConsumer $$2) throws IOException {
      esi $$3 = $$1.a($$1.h());
      return new fus($$0, $$1, $$3.b(), $$2);
   }

   private fus(fib $$0, esh.c $$1, String $$2, BooleanConsumer $$3) {
      super(xd.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fjl $$4 = $$0.h;
      this.D.a(new fnt(200, 20));
      this.D.a(new flh(b, $$4));
      this.G = this.D.a(new fkj($$4, 200, 20, b));
      this.G.a($$2);
      fns $$5 = fns.e().a(4);
      fka $$6 = $$5.a(fka.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fka.a(xc.e, $$0x -> this.d()).a(98).a());
      this.G.b($$1x -> $$6.j = !azz.h($$1x));
      this.D.a(fka.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fka.a(d, $$1x -> ad.m().a($$1.a(esf.l))).a(200).a());
      this.D.a(fka.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fka.a(u, $$1x -> {
         esh $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.m().a($$3x);
      }).a(200).a());
      this.D.a(fka.a(v, $$2x -> $$0.a(new fom(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fuu.a($$0, this.E, $$0.at(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fnt(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fjy var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aI_() {
      this.b(this.G);
   }

   @Override
   protected void aT_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fnm.a(this.D, this.H());
   }

   @Override
   public void d() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uq | uw | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fmj.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(esh.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xd $$4 = xd.c("selectWorld.edit.backupFailed");
         xd $$5 = xd.b($$2.getMessage());
         fib.Q().az().a(new fmj(fmj.a.b, $$4, $$5));
         return false;
      } else {
         xd $$6 = xd.a("selectWorld.edit.backupCreated", $$0.f());
         xd $$7 = xd.a("selectWorld.edit.backupSize", azc.c((double)$$1 / 1048576.0));
         fib.Q().az().a(new fmj(fmj.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
