import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gbj extends fwf {
   private static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("selectWorld.enterName").a(n.h);
   private static final wv c = wv.c("selectWorld.edit.resetIcon");
   private static final wv d = wv.c("selectWorld.edit.openFolder");
   private static final wv s = wv.c("selectWorld.edit.backup");
   private static final wv u = wv.c("selectWorld.edit.backupFolder");
   private static final wv v = wv.c("selectWorld.edit.optimize");
   private static final wv w = wv.c("optimizeWorld.confirm.title");
   private static final wv x = wv.c("optimizeWorld.confirm.description");
   private static final wv y = wv.c("optimizeWorld.confirm.proceed");
   private static final wv z = wv.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fuf D = fuf.d().a(5);
   private final BooleanConsumer E;
   private final ewz.c F;
   private final fqw G;

   public static gbj a(fnd $$0, ewz.c $$1, BooleanConsumer $$2) throws IOException {
      exa $$3 = $$1.a($$1.h());
      return new gbj($$0, $$1, $$3.b(), $$2);
   }

   private gbj(fnd $$0, ewz.c $$1, String $$2, BooleanConsumer $$3) {
      super(wv.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fpx $$4 = $$0.h;
      this.D.a(new fug(200, 20));
      this.D.a(new fru(b, $$4));
      this.G = this.D.a(new fqw($$4, 200, 20, b));
      this.G.a($$2);
      fuf $$5 = fuf.e().a(4);
      fqn $$6 = $$5.a(fqn.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fqn.a(wu.e, $$0x -> this.aK_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bah.h($$1x));
      this.D.a(fqn.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fqn.a(d, $$1x -> af.n().a($$1.a(ewx.l))).a(200).a());
      this.D.a(fqn.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fqn.a(u, $$1x -> {
         ewz $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         af.n().a($$3x);
      }).a(200).a());
      this.D.a(fqn.a(v, $$2x -> $$0.a(new fuz(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gbm.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fug(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aB_() {
      this.b(this.G);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      ftz.a(this.D, this.J());
   }

   @Override
   public void aK_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uh | un | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fsw.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(ewz.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wv $$4 = wv.c("selectWorld.edit.backupFailed");
         wv $$5 = wv.b($$2.getMessage());
         fnd.Q().aA().a(new fsw(fsw.a.b, $$4, $$5));
         return false;
      } else {
         wv $$6 = wv.a("selectWorld.edit.backupCreated", $$0.f());
         wv $$7 = wv.a("selectWorld.edit.backupSize", azk.c((double)$$1 / 1048576.0));
         fnd.Q().aA().a(new fsw(fsw.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
