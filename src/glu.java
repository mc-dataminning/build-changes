import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class glu {
   private static final int a = 1024;
   private final gll b;
   private final glr c;
   private final glg d;
   @Nullable
   private glq e;

   public glu(gll $$0, glr $$1, glg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static glu a(glr $$0, UserApiService $$1) {
      glg $$2 = new glg(1024);
      gll $$3 = gll.a($$0, $$1);
      return new glu($$3, $$0, $$2);
   }

   public void a(fpo $$0, fyn $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         glq $$4 = this.e.b();
         $$0.a(
            new fxl(
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

   public gll a() {
      return this.b;
   }

   public glg b() {
      return this.d;
   }

   public boolean a(glr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable glq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
