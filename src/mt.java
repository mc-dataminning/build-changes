import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mt implements me {
   private final mg d;
   private final CompletableFuture<jr.a> e;

   public mt(mg $$0, CompletableFuture<jr.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      Path $$1 = this.d.a(mg.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ev> $$3 = new ew(ew.a.a, ew.a($$2)).a();
         return me.a($$0, it.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
