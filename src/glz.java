import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class glz {
   private static final int a = 1024;
   private final glq b;
   private final glw c;
   private final gll d;
   @Nullable
   private glv e;

   public glz(glq $$0, glw $$1, gll $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static glz a(glw $$0, UserApiService $$1) {
      gll $$2 = new gll(1024);
      glq $$3 = glq.a($$0, $$1);
      return new glz($$3, $$0, $$2);
   }

   public void a(fpt $$0, fys $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         glv $$4 = this.e.b();
         $$0.a(
            new fxq(
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

   public glq a() {
      return this.b;
   }

   public gll b() {
      return this.d;
   }

   public boolean a(glw $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable glv $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
