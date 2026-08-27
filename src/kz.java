import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class kz implements kk {
   private final km d;
   private final CompletableFuture<ij.b> e;

   public kz(km $$0, CompletableFuture<ij.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ki $$0) {
      Path $$1 = this.d.a(km.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ds> $$3 = new dt(dt.a.a, dt.a($$2)).a();
         return kk.a($$0, hl.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
