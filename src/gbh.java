import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbh implements gbf {
   private final fpn a;
   private final fpl b;
   private final fze c;
   private final boolean d;

   public gbh(fpn $$0, fpl $$1, fze $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<fpb> a(@Nullable dfj $$0, @Nullable hc $$1, asc $$2) {
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
   public fze e() {
      return this.c;
   }

   @Override
   public fpn f() {
      return this.a;
   }

   @Override
   public fpl g() {
      return this.b;
   }
}
