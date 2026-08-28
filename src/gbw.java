import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gbw implements gca {
   private final GameProfile a;
   private final Supplier<hhu> b;
   private final wv c;

   public gbw(GameProfile $$0) {
      this.a = $$0;
      this.b = fnd.Q().an().a($$0);
      this.c = wv.b($$0.getName());
   }

   @Override
   public void a(gby $$0) {
      fnd.Q().L().b(new aim(this.a.getId()));
   }

   @Override
   public wv aO_() {
      return this.c;
   }

   @Override
   public void a(fpz $$0, float $$1, float $$2) {
      frm.a($$0, this.b.get(), 2, 2, 12, axu.a($$2));
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
