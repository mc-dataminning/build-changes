import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ghh {
   private static final int a = 1024;
   private final ggy b;
   private final ghe c;
   private final ggt d;
   @Nullable
   private ghd e;

   public ghh(ggy $$0, ghe $$1, ggt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ghh a(ghe $$0, UserApiService $$1) {
      ggt $$2 = new ggt(1024);
      ggy $$3 = ggy.a($$0, $$1);
      return new ghh($$3, $$0, $$2);
   }

   public void a(fli $$0, fuk $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ghd $$4 = this.e.b();
         $$0.a(
            new fti(
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

   public ggy a() {
      return this.b;
   }

   public ggt b() {
      return this.d;
   }

   public boolean a(ghe $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ghd $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
