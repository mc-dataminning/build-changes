import java.util.ArrayList;
import java.util.List;

public record xw(int b, List<acb.b<?>> c) implements uo<ur> {
   public static final int a = 255;

   public xw(sf $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<acb.b<?>> $$0, sf $$1) {
      for (acb.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.writeByte(255);
   }

   private static List<acb.b<?>> b(sf $$0) {
      List<acb.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(acb.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.b);
      a(this.c, $$0);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }
}
