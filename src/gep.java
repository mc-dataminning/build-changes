import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gep {
   private static final int a = 1024;
   private final geg b;
   private final gem c;
   private final geb d;
   @Nullable
   private gel e;

   public gep(geg $$0, gem $$1, geb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gep a(gem $$0, UserApiService $$1) {
      geb $$2 = new geb(1024);
      geg $$3 = geg.a($$0, $$1);
      return new gep($$3, $$0, $$2);
   }

   public void a(fke $$0, frw $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gel $$4 = this.e.b();
         $$0.a(
            new fqu(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xj.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xj.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xj.c("gui.abuseReport.draft.edit"),
               xj.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public geg a() {
      return this.b;
   }

   public geb b() {
      return this.d;
   }

   public boolean a(gem $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gel $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
