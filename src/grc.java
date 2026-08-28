import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grc implements gra {
   private final gex a;
   private final gev b;
   private final goz c;
   private final boolean d;

   public grc(gex $$0, gev $$1, goz $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gel> a(@Nullable dsc $$0, @Nullable je $$1, azh $$2) {
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
   public goz e() {
      return this.c;
   }

   @Override
   public gex f() {
      return this.a;
   }

   @Override
   public gev g() {
      return this.b;
   }
}
