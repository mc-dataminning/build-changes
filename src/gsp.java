import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gsp implements gsm {
   private final ggi a;
   private final ggg b;
   private final gql c;
   private final boolean d;

   public gsp(ggi $$0, ggg $$1, gql $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gfw> a(@Nullable dtc $$0, @Nullable ji $$1, ayw $$2) {
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
   public gql e() {
      return this.c;
   }

   @Override
   public ggi f() {
      return this.a;
   }

   @Override
   public ggg g() {
      return this.b;
   }
}
