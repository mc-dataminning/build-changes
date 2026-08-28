import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fwa extends fra {
   private static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("selectWorld.enterName").a(n.h);
   private static final xi c = xi.c("selectWorld.edit.resetIcon");
   private static final xi d = xi.c("selectWorld.edit.openFolder");
   private static final xi s = xi.c("selectWorld.edit.backup");
   private static final xi u = xi.c("selectWorld.edit.backupFolder");
   private static final xi v = xi.c("selectWorld.edit.optimize");
   private static final xi w = xi.c("optimizeWorld.confirm.title");
   private static final xi x = xi.c("optimizeWorld.confirm.description");
   private static final xi y = xi.c("optimizeWorld.confirm.proceed");
   private static final xi z = xi.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fpa D = fpa.d().a(5);
   private final BooleanConsumer E;
   private final etq.c F;
   private final flq G;

   public static fwa a(fji $$0, etq.c $$1, BooleanConsumer $$2) throws IOException {
      etr $$3 = $$1.a($$1.h());
      return new fwa($$0, $$1, $$3.b(), $$2);
   }

   private fwa(fji $$0, etq.c $$1, String $$2, BooleanConsumer $$3) {
      super(xi.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fks $$4 = $$0.h;
      this.D.a(new fpb(200, 20));
      this.D.a(new fmo(b, $$4));
      this.G = this.D.a(new flq($$4, 200, 20, b));
      this.G.a($$2);
      fpa $$5 = fpa.e().a(4);
      flh $$6 = $$5.a(flh.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(flh.a(xh.e, $$0x -> this.d()).a(98).a());
      this.G.b($$1x -> $$6.j = !bah.h($$1x));
      this.D.a(flh.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(flh.a(d, $$1x -> ae.m().a($$1.a(eto.l))).a(200).a());
      this.D.a(flh.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(flh.a(u, $$1x -> {
         etq $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ae.m().a($$3x);
      }).a(200).a());
      this.D.a(flh.a(v, $$2x -> $$0.a(new fpu(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fwd.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fpb(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.G);
   }

   @Override
   protected void aR_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fou.a(this.D, this.H());
   }

   @Override
   public void d() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uv | vb | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fnq.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(etq.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xi $$4 = xi.c("selectWorld.edit.backupFailed");
         xi $$5 = xi.b($$2.getMessage());
         fji.Q().aA().a(new fnq(fnq.a.b, $$4, $$5));
         return false;
      } else {
         xi $$6 = xi.a("selectWorld.edit.backupCreated", $$0.f());
         xi $$7 = xi.a("selectWorld.edit.backupSize", azk.c((double)$$1 / 1048576.0));
         fji.Q().aA().a(new fnq(fnq.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
