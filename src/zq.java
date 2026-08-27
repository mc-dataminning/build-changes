import java.util.ArrayList;
import java.util.List;

public record zq(int b, List<aea.b<?>> c) implements uw<wo> {
   public static final int a = 255;

   public zq(sh $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<aea.b<?>> $$0, sh $$1) {
      for (aea.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aea.b<?>> b(sh $$0) {
      List<aea.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aea.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aea.b<?>> d() {
      return this.c;
   }
}
