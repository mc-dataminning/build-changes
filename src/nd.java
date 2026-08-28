import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nd implements mo {
   private final mq d;
   private final CompletableFuture<ji.a> e;

   public nd(mq $$0, CompletableFuture<ji.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      Path $$1 = this.d.a(mq.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ek> $$3 = new el(el.a.a, el.a($$2)).a();
         return mo.a($$0, ij.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
