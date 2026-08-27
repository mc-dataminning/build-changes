import java.util.ArrayList;
import java.util.List;

public record zr(int b, List<aec.b<?>> c) implements ux<wp> {
   public static final int a = 255;

   public zr(si $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<aec.b<?>> $$0, si $$1) {
      for (aec.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aec.b<?>> b(si $$0) {
      List<aec.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aec.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aec.b<?>> d() {
      return this.c;
   }
}
