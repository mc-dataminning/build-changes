import com.google.common.collect.Lists;
import java.util.List;

public class gfq {
   public static final gfr a = new gfr();
   public static final String b = "animation";
   public static final int c = 1;
   public static final int d = -1;
   public static final gfq e = new gfq(Lists.newArrayList(), -1, -1, 1, false) {
      @Override
      public gfs a(int $$0, int $$1) {
         return new gfs($$0, $$1);
      }
   };
   private final List<gfp> f;
   private final int g;
   private final int h;
   private final int i;
   private final boolean j;

   public gfq(List<gfp> $$0, int $$1, int $$2, int $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
   }

   public gfs a(int $$0, int $$1) {
      if (this.g != -1) {
         return this.h != -1 ? new gfs(this.g, this.h) : new gfs(this.g, $$1);
      } else if (this.h != -1) {
         return new gfs($$0, this.h);
      } else {
         int $$2 = Math.min($$0, $$1);
         return new gfs($$2, $$2);
      }
   }

   public int a() {
      return this.i;
   }

   public boolean b() {
      return this.j;
   }

   public void a(gfq.a $$0) {
      for (gfp $$1 : this.f) {
         $$0.accept($$1.a(), $$1.a(this.i));
      }
   }

   @FunctionalInterface
   public interface a {
      void accept(int var1, int var2);
   }
}
