import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grd implements grb {
   private final gey a;
   private final gew b;
   private final gpa c;
   private final boolean d;

   public grd(gey $$0, gew $$1, gpa $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public List<gem> a(@Nullable dsd $$0, @Nullable je $$1, azh $$2) {
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
   public gpa e() {
      return this.c;
   }

   @Override
   public gey f() {
      return this.a;
   }

   @Override
   public gew g() {
      return this.b;
   }
}
