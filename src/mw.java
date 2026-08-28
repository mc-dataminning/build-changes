import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mw implements mh {
   private final mj d;
   private final CompletableFuture<js.a> e;

   public mw(mj $$0, CompletableFuture<js.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      Path $$1 = this.d.a(mj.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ew> $$3 = new ex(ex.a.a, ex.a($$2)).a();
         return mh.a($$0, iu.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
