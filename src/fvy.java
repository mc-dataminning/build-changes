import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.List;

public class fvy implements fwb {
   private static final int a = 10;
   private static final int b = 2;
   private final List<ProfileResult> c;

   public fvy(fvy.a $$0) {
      this.c = $$0.a();
   }

   @Override
   public int a(fnj $$0) {
      return this.c.size() * 12 + 2;
   }

   @Override
   public int b(fnj $$0) {
      int $$1 = 0;

      for (ProfileResult $$2 : this.c) {
         int $$3 = $$0.b($$2.profile().getName());
         if ($$3 > $$1) {
            $$1 = $$3;
         }
      }

      return $$1 + 10 + 6;
   }

   @Override
   public void a(fnj $$0, int $$1, int $$2, int $$3, int $$4, fnl $$5) {
      for (int $$6 = 0; $$6 < this.c.size(); $$6++) {
         ProfileResult $$7 = this.c.get($$6);
         int $$8 = $$2 + 2 + $$6 * 12;
         foy.a($$5, flz.Q().an().b($$7.profile()), $$1 + 2, $$8, 10);
         $$5.b($$0, $$7.profile().getName(), $$1 + 10 + 4, $$8 + 2, -1);
      }
   }

   public static record a(List<ProfileResult> a) implements cve {
   }
}
