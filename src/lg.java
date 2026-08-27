import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class lg implements kp {
   private final kr d;
   private final CompletableFuture<in.a> e;

   public lg(kr $$0, CompletableFuture<in.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(kn $$0) {
      Path $$1 = this.d.a(kr.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<du> $$3 = new dv(dv.a.a, dv.a($$2)).a();
         return kp.a($$0, hp.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
