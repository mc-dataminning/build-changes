import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gdq {
   private static final int a = 1024;
   private final gdh b;
   private final gdn c;
   private final gdc d;
   @Nullable
   private gdm e;

   public gdq(gdh $$0, gdn $$1, gdc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gdq a(gdn $$0, UserApiService $$1) {
      gdc $$2 = new gdc(1024);
      gdh $$3 = gdh.a($$0, $$1);
      return new gdq($$3, $$0, $$2);
   }

   public void a(fji $$0, fra $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gdm $$4 = this.e.b();
         $$0.a(
            new fpy(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xi.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xi.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xi.c("gui.abuseReport.draft.edit"),
               xi.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gdh a() {
      return this.b;
   }

   public gdc b() {
      return this.d;
   }

   public boolean a(gdn $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gdm $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
