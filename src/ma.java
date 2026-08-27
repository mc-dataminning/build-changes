import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ma implements lj {
   private final ll d;
   private final CompletableFuture<ix.a> e;

   public ma(ll $$0, CompletableFuture<ix.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lh $$0) {
      Path $$1 = this.d.a(ll.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ec> $$3 = new ed(ed.a.a, ed.a($$2)).a();
         return lj.a($$0, hy.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
