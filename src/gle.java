import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gle implements glc {
   private final fzb a;
   private final fyz b;
   private final gjc c;
   private final boolean d;

   public gle(fzb $$0, fyz $$1, gjc $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<fyp> a(@Nullable dnb $$0, @Nullable ih $$1, axd $$2) {
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
   public gjc e() {
      return this.c;
   }

   @Override
   public fzb f() {
      return this.a;
   }

   @Override
   public fyz g() {
      return this.b;
   }
}
