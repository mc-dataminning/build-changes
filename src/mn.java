import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mn implements lw {
   private final ly d;
   private final CompletableFuture<jk.a> e;

   public mn(ly $$0, CompletableFuture<jk.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      Path $$1 = this.d.a(ly.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ep> $$3 = new eq(eq.a.a, eq.a($$2)).a();
         return lw.a($$0, im.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
