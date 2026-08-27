import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fxz {
   private static final int a = 1024;
   private final fxq b;
   private final fxw c;
   private final fxl d;
   @Nullable
   private fxv e;

   public fxz(fxq $$0, fxw $$1, fxl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fxz a(fxw $$0, UserApiService $$1) {
      fxl $$2 = new fxl(1024);
      fxq $$3 = fxq.a($$0, $$1);
      return new fxz($$3, $$0, $$2);
   }

   public void a(fdz $$0, fly $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fxv $$4 = this.e.b();
         $$0.a(
            new fkq(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wx.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wx.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wx.c("gui.abuseReport.draft.edit"),
               wx.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fxq a() {
      return this.b;
   }

   public fxl b() {
      return this.d;
   }

   public boolean a(fxw $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fxv $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
