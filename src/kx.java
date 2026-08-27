import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class kx implements ki {
   private final kk d;
   private final CompletableFuture<ih.b> e;

   public kx(kk $$0, CompletableFuture<ih.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(kg $$0) {
      Path $$1 = this.d.a(kk.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ds> $$3 = new dt(dt.a.a, dt.a($$2)).a();
         return ki.a($$0, hj.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
