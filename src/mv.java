import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mv implements mg {
   private final mi d;
   private final CompletableFuture<js.a> e;

   public mv(mi $$0, CompletableFuture<js.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(me $$0) {
      Path $$1 = this.d.a(mi.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ew> $$3 = new ex(ex.a.a, ex.a($$2)).a();
         return mg.a($$0, iu.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
