import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fzn extends ful {
   private static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("selectWorld.enterName").a(n.h);
   private static final wp c = wp.c("selectWorld.edit.resetIcon");
   private static final wp d = wp.c("selectWorld.edit.openFolder");
   private static final wp s = wp.c("selectWorld.edit.backup");
   private static final wp u = wp.c("selectWorld.edit.backupFolder");
   private static final wp v = wp.c("selectWorld.edit.optimize");
   private static final wp w = wp.c("optimizeWorld.confirm.title");
   private static final wp x = wp.c("optimizeWorld.confirm.description");
   private static final wp y = wp.c("optimizeWorld.confirm.proceed");
   private static final wp z = wp.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fsl D = fsl.d().a(5);
   private final BooleanConsumer E;
   private final evf.c F;
   private final fpc G;

   public static fzn a(flj $$0, evf.c $$1, BooleanConsumer $$2) throws IOException {
      evg $$3 = $$1.a($$1.h());
      return new fzn($$0, $$1, $$3.b(), $$2);
   }

   private fzn(flj $$0, evf.c $$1, String $$2, BooleanConsumer $$3) {
      super(wp.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      foc $$4 = $$0.h;
      this.D.a(new fsm(200, 20));
      this.D.a(new fqa(b, $$4));
      this.G = this.D.a(new fpc($$4, 200, 20, b));
      this.G.a($$2);
      fsl $$5 = fsl.e().a(4);
      fot $$6 = $$5.a(fot.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fot.a(wo.e, $$0x -> this.aO_()).a(98).a());
      this.G.b($$1x -> $$6.j = !azw.h($$1x));
      this.D.a(fot.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fot.a(d, $$1x -> af.m().a($$1.a(evd.l))).a(200).a());
      this.D.a(fot.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fot.a(u, $$1x -> {
         evf $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         af.m().a($$3x);
      }).a(200).a());
      this.D.a(fot.a(v, $$2x -> $$0.a(new ftf(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fzq.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fsm(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         foq var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aF_() {
      this.b(this.G);
   }

   @Override
   protected void aR_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fsf.a(this.D, this.J());
   }

   @Override
   public void aO_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (ub | uh | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         frc.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(evf.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wp $$4 = wp.c("selectWorld.edit.backupFailed");
         wp $$5 = wp.b($$2.getMessage());
         flj.Q().aA().a(new frc(frc.a.b, $$4, $$5));
         return false;
      } else {
         wp $$6 = wp.a("selectWorld.edit.backupCreated", $$0.f());
         wp $$7 = wp.a("selectWorld.edit.backupSize", ayz.c((double)$$1 / 1048576.0));
         flj.Q().aA().a(new frc(frc.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
