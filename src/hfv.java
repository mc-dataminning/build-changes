import com.google.common.collect.Lists;
import java.util.List;

public class hfv {
   public static final hfw a = new hfw();
   public static final String b = "animation";
   public static final int c = 1;
   public static final int d = -1;
   public static final hfv e = new hfv(Lists.newArrayList(), -1, -1, 1, false) {
      @Override
      public hfx a(int $$0, int $$1) {
         return new hfx($$0, $$1);
      }
   };
   private final List<hfu> f;
   private final int g;
   private final int h;
   private final int i;
   private final boolean j;

   public hfv(List<hfu> $$0, int $$1, int $$2, int $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
   }

   public hfx a(int $$0, int $$1) {
      if (this.g != -1) {
         return this.h != -1 ? new hfx(this.g, this.h) : new hfx(this.g, $$1);
      } else if (this.h != -1) {
         return new hfx($$0, this.h);
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hfx($$2, $$2);
      }
   }

   public int a() {
      return this.i;
   }

   public boolean b() {
      return this.j;
   }

   public void a(hfv.a $$0) {
      for (hfu $$1 : this.f) {
         $$0.accept($$1.a(), $$1.a(this.i));
      }
   }

   @FunctionalInterface
   public interface a {
      void accept(int var1, int var2);
   }
}
