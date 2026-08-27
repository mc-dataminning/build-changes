import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class xu implements uw<wo> {
   public static final xu.a a = new xu.a(0);
   public static final xu.a b = new xu.a(1);
   public static final xu.a c = new xu.a(2);
   public static final xu.a d = new xu.a(3);
   public static final xu.a e = new xu.a(4);
   public static final xu.a f = new xu.a(5);
   public static final xu.a g = new xu.a(6);
   public static final xu.a h = new xu.a(7);
   public static final xu.a i = new xu.a(8);
   public static final xu.a j = new xu.a(9);
   public static final xu.a k = new xu.a(10);
   public static final xu.a l = new xu.a(11);
   public static final int m = 0;
   public static final int n = 101;
   public static final int o = 102;
   public static final int p = 103;
   public static final int q = 104;
   private final xu.a r;
   private final float s;

   public xu(xu.a $$0, float $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public xu(sh $$0) {
      this.r = (xu.a)xu.a.a.get($$0.readUnsignedByte());
      this.s = $$0.readFloat();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.r.b);
      $$0.a(this.s);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public xu.a a() {
      return this.r;
   }

   public float d() {
      return this.s;
   }

   public static class a {
      static final Int2ObjectMap<xu.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
