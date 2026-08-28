import com.google.common.collect.Lists;
import java.util.List;

public class haf {
   public static final hag a = new hag();
   public static final String b = "animation";
   public static final int c = 1;
   public static final int d = -1;
   public static final haf e = new haf(Lists.newArrayList(), -1, -1, 1, false) {
      @Override
      public hah a(int $$0, int $$1) {
         return new hah($$0, $$1);
      }
   };
   private final List<hae> f;
   private final int g;
   private final int h;
   private final int i;
   private final boolean j;

   public haf(List<hae> $$0, int $$1, int $$2, int $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
   }

   public hah a(int $$0, int $$1) {
      if (this.g != -1) {
         return this.h != -1 ? new hah(this.g, this.h) : new hah(this.g, $$1);
      } else if (this.h != -1) {
         return new hah($$0, this.h);
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hah($$2, $$2);
      }
   }

   public int a() {
      return this.i;
   }

   public boolean b() {
      return this.j;
   }

   public void a(haf.a $$0) {
      for (hae $$1 : this.f) {
         $$0.accept($$1.a(), $$1.a(this.i));
      }
   }

   @FunctionalInterface
   public interface a {
      void accept(int var1, int var2);
   }
}
