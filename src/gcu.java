import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gcu {
   private static final int a = 1024;
   private final gcl b;
   private final gcr c;
   private final gcg d;
   @Nullable
   private gcq e;

   public gcu(gcl $$0, gcr $$1, gcg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gcu a(gcr $$0, UserApiService $$1) {
      gcg $$2 = new gcg(1024);
      gcl $$3 = gcl.a($$0, $$1);
      return new gcu($$3, $$0, $$2);
   }

   public void a(fip $$0, fqh $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gcq $$4 = this.e.b();
         $$0.a(
            new fpf(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xe.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xe.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xe.c("gui.abuseReport.draft.edit"),
               xe.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gcl a() {
      return this.b;
   }

   public gcg b() {
      return this.d;
   }

   public boolean a(gcr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gcq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
