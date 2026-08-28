import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fzk extends fui {
   private static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("selectWorld.enterName").a(n.h);
   private static final wo c = wo.c("selectWorld.edit.resetIcon");
   private static final wo d = wo.c("selectWorld.edit.openFolder");
   private static final wo s = wo.c("selectWorld.edit.backup");
   private static final wo u = wo.c("selectWorld.edit.backupFolder");
   private static final wo v = wo.c("selectWorld.edit.optimize");
   private static final wo w = wo.c("optimizeWorld.confirm.title");
   private static final wo x = wo.c("optimizeWorld.confirm.description");
   private static final wo y = wo.c("optimizeWorld.confirm.proceed");
   private static final wo z = wo.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fsi D = fsi.d().a(5);
   private final BooleanConsumer E;
   private final evd.c F;
   private final foz G;

   public static fzk a(flh $$0, evd.c $$1, BooleanConsumer $$2) throws IOException {
      eve $$3 = $$1.a($$1.h());
      return new fzk($$0, $$1, $$3.b(), $$2);
   }

   private fzk(flh $$0, evd.c $$1, String $$2, BooleanConsumer $$3) {
      super(wo.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fnz $$4 = $$0.h;
      this.D.a(new fsj(200, 20));
      this.D.a(new fpx(b, $$4));
      this.G = this.D.a(new foz($$4, 200, 20, b));
      this.G.a($$2);
      fsi $$5 = fsi.e().a(4);
      fop $$6 = $$5.a(fop.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fop.a(wn.e, $$0x -> this.aO_()).a(98).a());
      this.G.b($$1x -> $$6.j = !azv.h($$1x));
      this.D.a(fop.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fop.a(d, $$1x -> af.m().a($$1.a(evb.l))).a(200).a());
      this.D.a(fop.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fop.a(u, $$1x -> {
         evd $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         af.m().a($$3x);
      }).a(200).a());
      this.D.a(fop.a(v, $$2x -> $$0.a(new ftc(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fzn.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fsj(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fon var10000 = this.c($$1x);
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
      fsc.a(this.D, this.J());
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
         fqz.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(evd.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wo $$4 = wo.c("selectWorld.edit.backupFailed");
         wo $$5 = wo.b($$2.getMessage());
         flh.Q().aA().a(new fqz(fqz.a.b, $$4, $$5));
         return false;
      } else {
         wo $$6 = wo.a("selectWorld.edit.backupCreated", $$0.f());
         wo $$7 = wo.a("selectWorld.edit.backupSize", ayy.c((double)$$1 / 1048576.0));
         flh.Q().aA().a(new fqz(fqz.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
