import java.util.ArrayList;
import java.util.List;

public record zz(int b, List<aej.b<?>> c) implements vf<wy> {
   public static final int a = 255;

   public zz(sq $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<aej.b<?>> $$0, sq $$1) {
      for (aej.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aej.b<?>> b(sq $$0) {
      List<aej.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aej.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aej.b<?>> d() {
      return this.c;
   }
}
