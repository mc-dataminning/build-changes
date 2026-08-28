import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fyy {
   private static final int a = 1024;
   private final fyp b;
   private final fyv c;
   private final fyk d;
   @Nullable
   private fyu e;

   public fyy(fyp $$0, fyv $$1, fyk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fyy a(fyv $$0, UserApiService $$1) {
      fyk $$2 = new fyk(1024);
      fyp $$3 = fyp.a($$0, $$1);
      return new fyy($$3, $$0, $$2);
   }

   public void a(ffa $$0, fmy $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fyu $$4 = this.e.b();
         $$0.a(
            new flq(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xl.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xl.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xl.c("gui.abuseReport.draft.edit"),
               xl.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fyp a() {
      return this.b;
   }

   public fyk b() {
      return this.d;
   }

   public boolean a(fyv $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fyu $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
