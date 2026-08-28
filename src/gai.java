import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gai {
   private static final int a = 1024;
   private final fzz b;
   private final gaf c;
   private final fzu d;
   @Nullable
   private gae e;

   public gai(fzz $$0, gaf $$1, fzu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gai a(gaf $$0, UserApiService $$1) {
      fzu $$2 = new fzu(1024);
      fzz $$3 = fzz.a($$0, $$1);
      return new gai($$3, $$0, $$2);
   }

   public void a(fgi $$0, fnx $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gae $$4 = this.e.b();
         $$0.a(
            new fmv(
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

   public fzz a() {
      return this.b;
   }

   public fzu b() {
      return this.d;
   }

   public boolean a(gaf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gae $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
