import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mz implements mk {
   private final mm d;
   private final CompletableFuture<ju.a> e;

   public mz(mm $$0, CompletableFuture<ju.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      Path $$1 = this.d.a(mm.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ex> $$3 = new ey(ey.a.a, ey.a($$2)).a();
         return mk.a($$0, iw.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
