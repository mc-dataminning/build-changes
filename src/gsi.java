import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gsi implements gsg {
   private final ggc a;
   private final gga b;
   private final gqf c;
   private final boolean d;

   public gsi(ggc $$0, gga $$1, gqf $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gfq> a(@Nullable dta $$0, @Nullable ji $$1, ayv $$2) {
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
   public gqf e() {
      return this.c;
   }

   @Override
   public ggc f() {
      return this.a;
   }

   @Override
   public gga g() {
      return this.b;
   }
}
