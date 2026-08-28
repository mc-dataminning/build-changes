import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mu implements mf {
   private final mh d;
   private final CompletableFuture<js.a> e;

   public mu(mh $$0, CompletableFuture<js.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      Path $$1 = this.d.a(mh.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ew> $$3 = new ex(ex.a.a, ex.a($$2)).a();
         return mf.a($$0, iu.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
