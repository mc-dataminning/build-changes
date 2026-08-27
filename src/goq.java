import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class goq implements goo {
   private final gcn a;
   private final gcl b;
   private final gmo c;
   private final boolean d;

   public goq(gcn $$0, gcl $$1, gmo $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gcb> a(@Nullable dpy $$0, @Nullable ir $$1, ayd $$2) {
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
   public gmo e() {
      return this.c;
   }

   @Override
   public gcn f() {
      return this.a;
   }

   @Override
   public gcl g() {
      return this.b;
   }
}
