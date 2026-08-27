import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ghd implements ghb {
   private final fvc a;
   private final fva b;
   private final gfb c;
   private final boolean d;

   public ghd(fvc $$0, fva $$1, gfb $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<fuq> a(@Nullable djp $$0, @Nullable ic $$1, auw $$2) {
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
      return this.d;
   }

   @Override
   public boolean d() {
      return true;
   }

   @Override
   public gfb e() {
      return this.c;
   }

   @Override
   public fvc f() {
      return this.a;
   }

   @Override
   public fva g() {
      return this.b;
   }
}
