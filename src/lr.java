import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class lr implements la {
   private final lc d;
   private final CompletableFuture<ip.a> e;

   public lr(lc $$0, CompletableFuture<ip.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ky $$0) {
      Path $$1 = this.d.a(lc.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<dv> $$3 = new dw(dw.a.a, dw.a($$2)).a();
         return la.a($$0, hr.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
