import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbc implements gba {
   private final fpi a;
   private final fpg b;
   private final fyz c;
   private final boolean d;

   public gbc(fpi $$0, fpg $$1, fyz $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<fow> a(@Nullable dfe $$0, @Nullable hc $$1, arx $$2) {
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
   public fyz e() {
      return this.c;
   }

   @Override
   public fpi f() {
      return this.a;
   }

   @Override
   public fpg g() {
      return this.b;
   }
}
