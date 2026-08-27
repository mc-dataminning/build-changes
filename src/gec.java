import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gec implements gea {
   private final fsi a;
   private final fsg b;
   private final gbz c;
   private final boolean d;

   public gec(fsi $$0, fsg $$1, gbz $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<frw> a(@Nullable dhn $$0, @Nullable ib $$1, atw $$2) {
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
   public gbz e() {
      return this.c;
   }

   @Override
   public fsi f() {
      return this.a;
   }

   @Override
   public fsg g() {
      return this.b;
   }
}
