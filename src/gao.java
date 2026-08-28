import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gao {
   private static final int a = 1024;
   private final gaf b;
   private final gal c;
   private final gaa d;
   @Nullable
   private gak e;

   public gao(gaf $$0, gal $$1, gaa $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gao a(gal $$0, UserApiService $$1) {
      gaa $$2 = new gaa(1024);
      gaf $$3 = gaf.a($$0, $$1);
      return new gao($$3, $$0, $$2);
   }

   public void a(fgo $$0, fod $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gak $$4 = this.e.b();
         $$0.a(
            new fnb(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wz.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wz.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wz.c("gui.abuseReport.draft.edit"),
               wz.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gaf a() {
      return this.b;
   }

   public gaa b() {
      return this.d;
   }

   public boolean a(gal $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gak $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
