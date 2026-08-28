import com.google.common.collect.Lists;
import java.util.List;

public class gru {
   public static final grv a = new grv();
   public static final String b = "animation";
   public static final int c = 1;
   public static final int d = -1;
   public static final gru e = new gru(Lists.newArrayList(), -1, -1, 1, false) {
      @Override
      public grw a(int $$0, int $$1) {
         return new grw($$0, $$1);
      }
   };
   private final List<grt> f;
   private final int g;
   private final int h;
   private final int i;
   private final boolean j;

   public gru(List<grt> $$0, int $$1, int $$2, int $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
   }

   public grw a(int $$0, int $$1) {
      if (this.g != -1) {
         return this.h != -1 ? new grw(this.g, this.h) : new grw(this.g, $$1);
      } else if (this.h != -1) {
         return new grw($$0, this.h);
      } else {
         int $$2 = Math.min($$0, $$1);
         return new grw($$2, $$2);
      }
   }

   public int a() {
      return this.i;
   }

   public boolean b() {
      return this.j;
   }

   public void a(gru.a $$0) {
      for (grt $$1 : this.f) {
         $$0.accept($$1.a(), $$1.a(this.i));
      }
   }

   @FunctionalInterface
   public interface a {
      void accept(int var1, int var2);
   }
}
