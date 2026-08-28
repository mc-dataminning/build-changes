import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hdo implements hdl {
   private final gnb a;
   private final hbj b;
   private final boolean c;

   public hdo(gnb $$0, hbj $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public List<gmq> a(@Nullable dxu $$0, @Nullable jm $$1, bam $$2) {
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
   public hbj e() {
      return this.b;
   }

   @Override
   public gnb f() {
      return this.a;
   }
}
