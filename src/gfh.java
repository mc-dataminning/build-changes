import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gfh implements gfl {
   private final GameProfile a;
   private final Supplier<hls> b;
   private final xg c;

   public gfh(GameProfile $$0) {
      this.a = $$0;
      this.b = fqq.Q().an().a($$0);
      this.c = xg.b($$0.getName());
   }

   @Override
   public void a(gfj $$0) {
      fqq.Q().L().b(new aja(this.a.getId()));
   }

   @Override
   public xg aU_() {
      return this.c;
   }

   @Override
   public void a(ftk $$0, float $$1, float $$2) {
      fux.a($$0, this.b.get(), 2, 2, 12, ayh.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
