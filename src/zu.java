import java.util.ArrayList;
import java.util.List;

public record zu(int b, List<aef.b<?>> c) implements va<ws> {
   public static final int a = 255;

   public zu(sl $$0) {
      this($$0.m(), b($$0));
   }

   private static void a(List<aef.b<?>> $$0, sl $$1) {
      for (aef.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aef.b<?>> b(sl $$0) {
      List<aef.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aef.b.a($$0, $$2));
      }

      return $$1;
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.b);
      a(this.c, $$0);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<aef.b<?>> d() {
      return this.c;
   }
}
