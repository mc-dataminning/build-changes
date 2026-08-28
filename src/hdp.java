import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class hdp implements hdm {
   private final gnc a;
   private final hbk b;
   private final boolean c;

   public hdp(gnc $$0, hbk $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public List<gmr> a(@Nullable dxu $$0, @Nullable jm $$1, bam $$2) {
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
   public hbk e() {
      return this.b;
   }

   @Override
   public gnc f() {
      return this.a;
   }
}
