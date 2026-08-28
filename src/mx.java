import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mx implements mi {
   private final mk d;
   private final CompletableFuture<jt.a> e;

   public mx(mk $$0, CompletableFuture<jt.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      Path $$1 = this.d.a(mk.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ex> $$3 = new ey(ey.a.a, ey.a($$2)).a();
         return mi.a($$0, iv.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
