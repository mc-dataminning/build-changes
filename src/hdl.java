import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hdl implements hdi {
   private final gmy a;
   private final hbg b;
   private final boolean c;

   public hdl(gmy $$0, hbg $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public List<gmn> a(@Nullable dxo $$0, @Nullable jm $$1, bac $$2) {
      return Collections.emptyList();
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c;
   }

   @Override
   public boolean d() {
      return true;
   }

   @Override
   public hbg e() {
      return this.b;
   }

   @Override
   public gmy f() {
      return this.a;
   }
}
