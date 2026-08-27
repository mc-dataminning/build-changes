import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ky implements kj {
   private final kl d;
   private final CompletableFuture<ii.b> e;

   public ky(kl $$0, CompletableFuture<ii.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(kh $$0) {
      Path $$1 = this.d.a(kl.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<du> $$3 = new dv(dv.a.a, dv.a($$2)).a();
         return kj.a($$0, hl.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
