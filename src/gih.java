import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gih {
   private static final int a = 1024;
   private final ghy b;
   private final gie c;
   private final ght d;
   @Nullable
   private gid e;

   public gih(ghy $$0, gie $$1, ght $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gih a(gie $$0, UserApiService $$1) {
      ght $$2 = new ght(1024);
      ghy $$3 = ghy.a($$0, $$1);
      return new gih($$3, $$0, $$2);
   }

   public void a(fmg $$0, fvi $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gid $$4 = this.e.b();
         $$0.a(
            new fug(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wp.c("gui.abuseReport.draft.edit"),
               wp.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ghy a() {
      return this.b;
   }

   public ght b() {
      return this.d;
   }

   public boolean a(gie $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gid $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
