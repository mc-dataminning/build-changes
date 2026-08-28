import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gcf {
   private static final int a = 1024;
   private final gbw b;
   private final gcc c;
   private final gbr d;
   @Nullable
   private gcb e;

   public gcf(gbw $$0, gcc $$1, gbr $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gcf a(gcc $$0, UserApiService $$1) {
      gbr $$2 = new gbr(1024);
      gbw $$3 = gbw.a($$0, $$1);
      return new gcf($$3, $$0, $$2);
   }

   public void a(fib $$0, fpt $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gcb $$4 = this.e.b();
         $$0.a(
            new foq(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xd.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xd.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xd.c("gui.abuseReport.draft.edit"),
               xd.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gbw a() {
      return this.b;
   }

   public gbr b() {
      return this.d;
   }

   public boolean a(gcc $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gcb $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
