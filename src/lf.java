import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class lf implements ko {
   private final kq d;
   private final CompletableFuture<in.a> e;

   public lf(kq $$0, CompletableFuture<in.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(km $$0) {
      Path $$1 = this.d.a(kq.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<du> $$3 = new dv(dv.a.a, dv.a($$2)).a();
         return ko.a($$0, hp.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
