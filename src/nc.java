import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nc implements mn {
   private final mp d;
   private final CompletableFuture<jh.a> e;

   public nc(mp $$0, CompletableFuture<jh.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      Path $$1 = this.d.a(mp.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ej> $$3 = new ek(ek.a.a, ek.a($$2)).a();
         return mn.a($$0, ii.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
