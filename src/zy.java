import java.util.ArrayList;
import java.util.List;

public record zy(int b, List<aei.b<?>> c) implements ve<wx> {
   public static final int a = 255;

   public zy(sp $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<aei.b<?>> $$0, sp $$1) {
      for (aei.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aei.b<?>> b(sp $$0) {
      List<aei.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aei.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aei.b<?>> d() {
      return this.c;
   }
}
