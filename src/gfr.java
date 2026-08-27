import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gfr implements gfp {
   private final ftr a;
   private final ftp b;
   private final gdo c;
   private final boolean d;

   public gfr(ftr $$0, ftp $$1, gdo $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<ftf> a(@Nullable dip $$0, @Nullable ia $$1, auf $$2) {
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
   public gdo e() {
      return this.c;
   }

   @Override
   public ftr f() {
      return this.a;
   }

   @Override
   public ftp g() {
      return this.b;
   }
}
