import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gnk {
   private static final int a = 1024;
   private final gnb b;
   private final gnh c;
   private final gmw d;
   @Nullable
   private gng e;

   public gnk(gnb $$0, gnh $$1, gmw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gnk a(gnh $$0, UserApiService $$1) {
      gmw $$2 = new gmw(1024);
      gnb $$3 = gnb.a($$0, $$1);
      return new gnk($$3, $$0, $$2);
   }

   public void a(frd $$0, gad $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gng $$4 = this.e.b();
         $$0.a(
            new fzb(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xa.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xa.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xa.c("gui.abuseReport.draft.edit"),
               xa.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gnb a() {
      return this.b;
   }

   public gmw b() {
      return this.d;
   }

   public boolean a(gnh $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gng $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
