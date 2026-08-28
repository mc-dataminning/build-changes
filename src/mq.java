import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mq implements mb {
   private final md d;
   private final CompletableFuture<jp.a> e;

   public mq(md $$0, CompletableFuture<jp.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      Path $$1 = this.d.a(md.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<et> $$3 = new eu(eu.a.a, eu.a($$2)).a();
         return mb.a($$0, ir.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
