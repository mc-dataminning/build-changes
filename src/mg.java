import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mg implements lo {
   private final lq d;
   private final CompletableFuture<jc.a> e;

   public mg(lq $$0, CompletableFuture<jc.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lm $$0) {
      Path $$1 = this.d.a(lq.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<eh> $$3 = new ei(ei.a.a, ei.a($$2)).a();
         return lo.a($$0, id.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
