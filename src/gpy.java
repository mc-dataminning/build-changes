import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gpy implements gpw {
   private final gdt a;
   private final gdr b;
   private final gnv c;
   private final boolean d;

   public gpy(gdt $$0, gdr $$1, gnv $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gdh> a(@Nullable drb $$0, @Nullable it $$1, ayk $$2) {
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
   public gnv e() {
      return this.c;
   }

   @Override
   public gdt f() {
      return this.a;
   }

   @Override
   public gdr g() {
      return this.b;
   }
}
