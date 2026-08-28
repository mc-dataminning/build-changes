import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gli {
   private static final int a = 1024;
   private final gkz b;
   private final glf c;
   private final gku d;
   @Nullable
   private gle e;

   public gli(gkz $$0, glf $$1, gku $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gli a(glf $$0, UserApiService $$1) {
      gku $$2 = new gku(1024);
      gkz $$3 = gkz.a($$0, $$1);
      return new gli($$3, $$0, $$2);
   }

   public void a(foz $$0, fyb $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gle $$4 = this.e.b();
         $$0.a(
            new fwz(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wy.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wy.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wy.c("gui.abuseReport.draft.edit"),
               wy.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gkz a() {
      return this.b;
   }

   public gku b() {
      return this.d;
   }

   public boolean a(glf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gle $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
