import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mc implements ll {
   private final ln d;
   private final CompletableFuture<iz.a> e;

   public mc(ln $$0, CompletableFuture<iz.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lj $$0) {
      Path $$1 = this.d.a(ln.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ee> $$3 = new ef(ef.a.a, ef.a($$2)).a();
         return ll.a($$0, ia.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
