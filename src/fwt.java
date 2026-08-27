import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fwt implements fwr {
   private final fld a;
   private final flb b;
   private final fuv c;
   private final boolean d;

   public fwt(fld $$0, flb $$1, fuv $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<fkr> a(@Nullable dcb $$0, @Nullable ha $$1, apf $$2) {
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
   public fuv e() {
      return this.c;
   }

   @Override
   public fld f() {
      return this.a;
   }

   @Override
   public flb g() {
      return this.b;
   }
}
