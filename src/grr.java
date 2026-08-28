import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grr implements grp {
   private final gfm a;
   private final gfk b;
   private final gpo c;
   private final boolean d;

   public grr(gfm $$0, gfk $$1, gpo $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gfa> a(@Nullable dsk $$0, @Nullable jf $$1, ayo $$2) {
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
   public gpo e() {
      return this.c;
   }

   @Override
   public gfm f() {
      return this.a;
   }

   @Override
   public gfk g() {
      return this.b;
   }
}
