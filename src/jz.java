import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jz implements jk {
   private final jm d;
   private final CompletableFuture<hi.b> e;

   public jz(jm $$0, CompletableFuture<hi.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      Path $$1 = this.d.a(jm.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<dt> $$3 = new du(du.a.a, du.a($$2)).a();
         return jk.a($$0, gk.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
